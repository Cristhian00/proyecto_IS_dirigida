package diagrama.model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import abstracta.ModelFactory;
import abstracta.Multiplicidad;
import abstracta.TCDAgregacion;
import abstracta.TCDAsociacion;
import abstracta.TCDAtributo;
import abstracta.TCDClase;
import abstracta.TCDComposicion;
import abstracta.TCDDependencia;
import abstracta.TCDHerencia;
import abstracta.TCDMetodo;
import abstracta.TCDRelacion;
import abstracta.TipoRetorno;

public class TransformacionM2T {

	private abstracta.ModelFactory modelFactoryAbstracta;
	private String pathRaiz;
	private String pathModels;
	private String pathControllers;
	private String pathRoutes;
	private String pathDatabase;
	private String pathPublic;

	public TransformacionM2T(ModelFactory modelFactoryAbstracta) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.pathRaiz = "";
		this.pathModels = "";
		this.pathControllers = "";
		this.pathRoutes = "";
		this.pathDatabase = "";
		this.pathPublic = "";
	}

	public String transformarM2T() {

		StringBuilder txtCodigo = new StringBuilder();

		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generacion de codigo");
		pathRaiz = fd.open();
		pathModels = pathRaiz + "/models";
		pathControllers = pathRaiz + "/controllers";
		pathRoutes = pathRaiz + "/routes";
		pathDatabase = pathRaiz + "/database";
		pathPublic = pathRaiz + "/public";

		crearCarpeta(pathControllers);
		crearCarpeta(pathRoutes);
		crearCarpeta(pathDatabase);
		crearCarpeta(pathPublic);

		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			// crear las clases
			txtCodigo = new StringBuilder();
			generarClase(tcdClase, txtCodigo);
			guardarArchivo(txtCodigo.toString(), pathRaiz + "/" + tcdClase.getRuta(), tcdClase.getNombre() + ".ts");
			tcdClase = null;
		}

		generarArchivosAdicionales();
		return "Se ha generado el código de su proyecto";
	}

	private void generarArchivosAdicionales() {

		generarArchivoEnv();
		generarArchivoTslint();
		generarArchivoTsconfig();
		generarArchivoApp();
		generarArchivoConnect();
		generarArchivoServer();
		generarArchivosRoutes();
		generarArchivosControllers();
		generarArchivoIndex();
		generarREADME();
		generarScript();
	}

	private void generarScript() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("npm init -y\n" + "npm i tslint --save -dev\n" + "npm i typescript --save -dev\n"
				+ "./node_modules/.bin/tslint --init\n" + "npm i express cors dotenv nodemon\n"
				+ "npm i @types/express --save -dev\n" + "npm i @types/cors --save -dev\n"
				+ "npm install --save sequelize\n" + "npm install --save mysql2\n" + "tsc\n"
				+ "nodemon compiled/app.js");
		guardarArchivo(txtCodigo.toString(), pathRaiz + "/", "script.bat");
	}

	private void generarArchivoIndex() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n"
				+ "\t<meta charset=\"UTF-8\">\n\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
				+ "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">" + "\n\t<title>"
				+ modelFactoryAbstracta.getNombre().toUpperCase() + "</title>\n"
				+ "</head>\n<body>\n\t<h1>PAGINA DE INICIO</h1>\n</body>\n</html>");
		guardarArchivo(txtCodigo.toString(), pathPublic + "/", "index.html");
	}

	private void generarREADME() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append(
				"# Configuración del entorno\n\n   0. `npm init -y`" + "   1. `npm i tslint --save -dev` (node_modules)\n"
						+ "   2. `npm i typescript --save -dev` (crea la configuración de tslint)\n"
						+ "   3. `./node_modules/.bin/tslint --init` (tslint.json)\n"
						+ "   4. `npm i express cors dotenv nodemon`\n" + "   5. `npm i @types/express --save -dev`\n"
						+ "   6. `npm i @types/cors --save -dev`\n" + "   7. `npm install --save sequelize`\n"
						+ "   8. `npm install --save mysql2`\n" + "   9. `tsc` -> compilar a javascript\n"
						+ "   10. `nodemon compiled/app.js` -> ejecutar y ver posibles errores");
		guardarArchivo(txtCodigo.toString(), pathRaiz + "/", "README.md");
	}

	private void generarArchivosControllers() {
		StringBuilder txtCodigo = new StringBuilder();

		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			txtCodigo = new StringBuilder();
			generarClassController(tcdClase, txtCodigo);
			guardarArchivo(txtCodigo.toString(), pathControllers + "/",
					tcdClase.getNombre().toLowerCase() + ".controllers.ts");
			tcdClase = null;
		}

	}

	private void generarClassController(TCDClase tcdClase, StringBuilder txtCodigo) {

		String nameClase = tcdClase.getNombre();
		String gets = "get" + nameClase + "All";
		String get = "get" + nameClase;
		String post = "post" + nameClase;
		String put = "put" + nameClase;
		String delete = "delete" + nameClase;

		txtCodigo.append("import { Request, Response } from 'express';\n" + "import " + nameClase + " from '../"
				+ tcdClase.getRuta() + "/" + nameClase + "';\n\n");

		txtCodigo.append("export const " + gets + " = async (req: Request, res: Response) => {\n" + "\tconst "
				+ nameClase.toLowerCase() + " = await " + nameClase + ".findAll();\n" + "\tres.json("
				+ nameClase.toLowerCase() + ");\n}\n\n");

		txtCodigo.append("export const " + get + " = async (req: Request, res: Response) => {\n"
				+ "\tconst { id } = req.params;\n" + "\tconst " + nameClase.toLowerCase() + " = await " + nameClase
				+ ".findByPk(id);\n\n" + "\tif (" + nameClase.toLowerCase() + ") {\n" + "\t\tres.json("
				+ nameClase.toLowerCase() + ");\n" + "\t} else {\n" + "\t\tres.status(404).json({\n"
				+ "\t\t\tmessage: `No existe un registro con el id ${id}`\n\t\t})\n\t}\n}\n\n");

		txtCodigo.append("export const " + post + " = async (req: Request, res: Response) => {\n"
				+ "\tconst { body } = req;\n" + "\ttry {\n");
		generarRestriccionesAtributosUnicos(tcdClase, txtCodigo);
		generarRegistro(tcdClase, nameClase, txtCodigo);
		txtCodigo.append("\t\tawait (" + nameClase.toLowerCase() + ").save();\n\n" + "\t\tres.status(201).json({\n"
				+ "\t\t\tmessage: 'El registro se realizo corretamente'\n\t\t});\n" + "\t} catch (error) {\n"
				+ "\t\tres.status(500).json({\n"
				+ "\t\t\tmessage: 'Error interno en el servidor'\n\t\t});\n\t}\n}\n\n");

		txtCodigo.append("export const " + put + " = async (req: Request, res: Response) => {\n"
				+ "\tconst { body } = req;\n\tconst { id } = req.params;\n" + "\ttry {\n" + "\t\tconst "
				+ nameClase.toLowerCase() + " = await " + nameClase + ".findByPk(id);\n" + "\t\tif ("
				+ nameClase.toLowerCase() + ") {\n" + "\t\t\tawait " + nameClase.toLowerCase() + ".update(body);\n"
				+ "\t\t\tres.status(200).json({\n"
				+ "\t\t\t\tmessage: 'Se ha realizado la modificación correctamente'\n\t\t\t});\n\t\t} else {\n"
				+ "\t\t\tres.status(404).json({\n"
				+ "\t\t\t\tmessage: `No existe un registro con el id ${id}`\n\t\t\t})\n\t\t}\n"
				+ "\t} catch (error) {\n" + "\t\tres.status(500).json({\n"
				+ "\t\t\tmessage: 'Error interno en el servidor'\n\t\t});\n\t}\n}\n\n");

		txtCodigo.append("export const " + delete + " = async (req: Request, res: Response) => {\n"
				+ "\tconst { id } = req.params;\n" + "\ttry {\n" + "\t\tconst " + nameClase.toLowerCase() + " = await "
				+ nameClase + ".findByPk(id);\n" + "\t\tif (" + nameClase.toLowerCase() + ") {\n" + "\t\t\tawait "
				+ nameClase.toLowerCase() + ".destroy();\n" + "\t\t\tres.status(200).json({\n"
				+ "\t\t\t\tmessage: 'Se ha eliminado correctamente'\n\t\t\t});\n\t\t} else {\n"
				+ "\t\t\tres.status(404).json({\n"
				+ "\t\t\t\tmessage: `No existe un registro con el id ${id}`\n\t\t\t})\n\t\t}\n"
				+ "\t} catch (error) {\n" + "\t\tres.status(500).json({\n"
				+ "\t\t\tmessage: 'Error interno en el servidor'\n\t\t});\n\t}\n}");
	}

	private void generarRegistro(TCDClase tcdClase, String nameClase, StringBuilder txtCodigo) {

		TCDAtributo atributo;
		ArrayList<TCDAtributo> allAtributos = new ArrayList<>();
		TCDClase claseSuper = clasePadre(tcdClase);

		if (claseSuper != null) {
			allAtributos.addAll(claseSuper.getListaAtributos());
			allAtributos.addAll(tcdClase.getListaAtributos());
		} else {
			allAtributos.addAll(tcdClase.getListaAtributos());
		}

		txtCodigo.append("\t\tconst " + nameClase.toLowerCase() + " = await " + nameClase + ".create({\n");
		for (int i = 0; i < allAtributos.size(); i++) {
			atributo = allAtributos.get(i);
			if (i == allAtributos.size() - 1) {
				txtCodigo.append("\t\t\t" + atributo.getNombre() + ": body." + atributo.getNombre() + "\n\t\t});\n\n");
			} else {
				txtCodigo.append("\t\t\t" + atributo.getNombre() + ": body." + atributo.getNombre() + ",\n");
			}
		}
		if (allAtributos.size() == 0) {
			txtCodigo.append("\t\t});\n");
		}
	}

	private void generarRestriccionesAtributosUnicos(TCDClase tcdClase, StringBuilder txtCodigo) {

		String name = "";
		ArrayList<TCDAtributo> allAtributos = new ArrayList<>();
		TCDClase claseSuper = clasePadre(tcdClase);

		if (claseSuper != null) {
			allAtributos.addAll(claseSuper.getListaAtributos());
			allAtributos.addAll(tcdClase.getListaAtributos());
		} else {
			allAtributos.addAll(tcdClase.getListaAtributos());
		}

		for (TCDAtributo atributo : allAtributos) {
			name = atributo.getNombre();
			if (atributo.isIsUnique()) {
				txtCodigo.append("\t\tconst existe_" + name + " = await " + tcdClase.getNombre() + ".findOne({\n"
						+ "\t\t\twhere: {\n\t\t\t\t" + name + ": body." + name + "\n\t\t\t}\n\t\t});\n"
						+ "\t\tif (existe_" + name + ") {\n" + "\t\t\treturn res.status(400).json({\n"
						+ "\t\t\t\tmesage: 'El atributo \"" + atributo.getNombre()
						+ "\" que esta intentando registrar ya esta en uso'\n\t\t\t});\n\t\t}\n\n");
			}
		}
	}

	private void generarArchivosRoutes() {
		StringBuilder txtCodigo = new StringBuilder();

		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			txtCodigo = new StringBuilder();
			generarClassRouter(tcdClase.getNombre(), txtCodigo);
			guardarArchivo(txtCodigo.toString(), pathRoutes + "/", tcdClase.getNombre().toLowerCase() + ".routes.ts");
			tcdClase = null;
		}
	}

	private void generarClassRouter(String nameClass, StringBuilder txtCodigo) {

		String delete = "delete" + nameClass;
		String get = "get" + nameClass;
		String gets = "get" + nameClass + "All";
		String post = "post" + nameClass;
		String put = "put" + nameClass;

		txtCodigo.append("import { Router } from 'express';\n" + "import { " + delete + ", " + get + ", " + gets + ", "
				+ post + ", " + put + " } from " + "'../controllers/" + nameClass.toLowerCase() + ".controllers';\n\n"
				+ "const router = Router();\n\n" + "router.delete('/:id', " + delete + ");\n" + "router.get('/', "
				+ gets + ");\n" + "router.get('/:id', " + get + ");\n" + "router.post('/', " + post + ");\n"
				+ "router.put('/:id', " + put + ");\n\n" + "export default router;");

	}

	private void generarArchivoServer() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("import Express, { Application } from 'express';\n" + "import cors from 'cors';\n"
				+ "import db from '../database/connect';\n");
		generarImportsRoutes(txtCodigo);
		txtCodigo.append("\n\nexport class Server {\n\n" + "\tprivate app: Application;\n" + "\tprivate port: string;\n"
				+ "\tprivate apiRoutes = {\n");
		generarApiRoutes(txtCodigo);
		txtCodigo.append("\t}\n\n" + "\tconstructor() {\n\n" + "\t\tthis.app = Express();\n"
				+ "\t\tthis.port = process.env.PORT || '8000';\n" + "\t\tthis.dbConnect();\n"
				+ "\t\tthis.middlewares();\n" + "\t\tthis.routes();\n\t}\n\n" + "\tasync dbConnect() {\n"
				+ "\t\ttry {\n" + "\t\t\tawait db.authenticate();\n" + "\t\t\tconsole.log('Database online');\n"
				+ "\t\t} catch (error: any) {\n" + "\t\t\tthrow new Error(error);\n\t\t}\n\t}\n\n"
				+ "\tmiddlewares() {\n" + "\t\tthis.app.use(cors());\n" + "\t\tthis.app.use(Express.json());\n"
				+ "\t\tthis.app.use(Express.static('public'));\n\t}\n\n");
		generarRoutes(txtCodigo);
		txtCodigo.append("\tlisten() {\n" + "\t\tthis.app.listen(this.port, () => {\n"
				+ "\t\t\tconsole.log('El servidor esta corriendo en el puerto', this.port)\n" + "\t\t})\n\t}\n}");
		guardarArchivo(txtCodigo.toString(), pathModels + "/", "server.ts");
	}

	private void generarRoutes(StringBuilder txtCodigo) {
		txtCodigo.append("\troutes() {\n");
		for (TCDClase clase : modelFactoryAbstracta.getListaTodasClases()) {
			txtCodigo.append("\t\tthis.app.use(this.apiRoutes." + clase.getNombre().toLowerCase() + ", "
					+ clase.getNombre().toLowerCase() + "Routes);\n");
		}
		txtCodigo.append("\t}\n\n");
	}

	private void generarApiRoutes(StringBuilder txtCodigo) {

		TCDClase clase;
		for (int i = 0; i < modelFactoryAbstracta.getListaTodasClases().size(); i++) {
			clase = modelFactoryAbstracta.getListaTodasClases().get(i);
			txtCodigo.append("\t\t" + clase.getNombre().toLowerCase() + ": '/" + clase.getNombre().toLowerCase() + "'");
			if (i == modelFactoryAbstracta.getListaTodasClases().size() - 1) {
				txtCodigo.append("\n");
			} else {
				txtCodigo.append(",\n");
			}
		}
	}

	private void generarImportsRoutes(StringBuilder txtCodigo) {

		for (TCDClase clase : modelFactoryAbstracta.getListaTodasClases()) {
			txtCodigo.append("import " + clase.getNombre().toLowerCase() + "Routes from '../routes/"
					+ clase.getNombre().toLowerCase() + ".routes';\n");
		}
	}

	private void generarArchivoConnect() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("import { Sequelize } from 'sequelize';\n\n" + "const db = new Sequelize('"
				+ modelFactoryAbstracta.getNombre() + "', 'root', 'admin', {\n" + "\thost: 'localhost',\n"
				+ "\tdialect: 'mysql'\n" + "});\n\n" + "export default db;");
		guardarArchivo(txtCodigo.toString(), pathDatabase + "/", "connect.ts");
	}

	private void generarArchivoApp() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("import dotenv from 'dotenv';\n" + "import { Server } from './models/server';\n\n"
				+ "dotenv.config();\n" + "const server = new Server();\n" + "server.listen();");
		guardarArchivo(txtCodigo.toString(), pathRaiz + "/", "app.ts");
	}

	private void generarArchivoTsconfig() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("{\n" + "\t\"compilerOptions\": {\n" + "\t\t\"target\": \"es2016\",\n"
				+ "\t\t\"module\": \"commonjs\",\n" + "\t\t\"moduleResolution\": \"node\", \n"
				+ "\t\t\"sourceMap\": true,\n" + "\t\t\"outDir\": \"./compiled\",\n"
				+ "\t\t\"esModuleInterop\": true,\n" + "\t\t\"forceConsistentCasingInFileNames\": true,\n"
				+ "\t\t\"strict\": true,\n" + "\t\t\"skipLibCheck\": true\n" + "\t}\n" + "}");
		guardarArchivo(txtCodigo.toString(), pathRaiz + "/", "tsconfig.json");
	}

	private void generarArchivoTslint() {
		StringBuilder txtCodigo = new StringBuilder();
		txtCodigo.append("{\n" + "\t\"defaultSeverity\": \"error\",\n" + "\t\"extends\": [\n"
				+ "\t\t\"tslint:recommended\"\n" + "\t],\n" + "\t\"jsRules\": {},\n" + "\t\"rules\": {\n"
				+ "\t\t\"no-console.log\": false\n" + "\t},\n" + "\t\"rulesDirectory\": []\n" + "}");
		guardarArchivo(txtCodigo.toString(), pathRaiz + "/", "tslint.json");
	}

	private void generarArchivoEnv() {
		guardarArchivo("PORT = 8000", pathRaiz + "/", ".env");

	}

	private void generarClase(TCDClase tcdClase, StringBuilder txtCodigo) {

		agregarImport(tcdClase, txtCodigo);
		agregarEncabezado(tcdClase, txtCodigo);
		agregarAllAtributos(tcdClase, txtCodigo);
		txtCodigo.append("\nexport default " + tcdClase.getNombre() + ";");
	}

	private void agregarAllAtributos(TCDClase tcdClase, StringBuilder txtCodigo) {

		TCDAtributo atributo;
		ArrayList<TCDAtributo> allAtributos = new ArrayList<>();
		TCDClase claseSuper = clasePadre(tcdClase);

		// Pregunta si la clase hereda de otra para agregar los atributos de la clase
		// padre en los parametros de la clase hija
		if (claseSuper != null) {
			allAtributos.addAll(claseSuper.getListaAtributos());
			allAtributos.addAll(tcdClase.getListaAtributos());
		} else {
			allAtributos.addAll(tcdClase.getListaAtributos());
		}

		// Agrega en los parametros todos los atributos que necesita la clase
		for (int i = 0; i < allAtributos.size(); i++) {
			atributo = allAtributos.get(i);
			if (i == allAtributos.size() - 1) {
				txtCodigo.append("\t" + atributo.getNombre() + ": {\n" + "\t\ttype: DataTypes."
						+ atributo.getTipoDato().getName().toUpperCase() + "\n" + "\t}");
			} else {
				txtCodigo.append("\t" + atributo.getNombre() + ": {\n" + "\t\ttype: DataTypes."
						+ atributo.getTipoDato().getName().toUpperCase() + "\n" + "\t},\n");
			}
		}

		String multiplicidad;
		boolean ban = false;
		int cont = 0;
		// Lista Todas las relaciones que tiene la clase, exceptuando la de herencia, y
		// las agrega
		ArrayList<TCDRelacion> relaciones = obtenerRelaciones(tcdClase);
		for (TCDRelacion relacion : relaciones) {
			multiplicidad = "";
			if (relacion instanceof TCDAgregacion) {
				if (((TCDAgregacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					if ((allAtributos.size() != 0 && ban == false)) {
						ban = true;
						txtCodigo.append(",\n");
					}
					multiplicidad = ((TCDAgregacion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (cont != 0) {
							txtCodigo.append(",\n");
						}
						txtCodigo.append("\t" + ((TCDAgregacion) relacion).getNombreDestino() + ": {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
						cont++;
					}
				}
			} else if (relacion instanceof TCDAsociacion) {
				if (((TCDAsociacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					if ((allAtributos.size() != 0 && ban == false)) {
						ban = true;
						txtCodigo.append(",\n");
					}
					multiplicidad = ((TCDAsociacion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (cont != 0) {
							txtCodigo.append(",\n");
						}
						txtCodigo.append("\t" + ((TCDAsociacion) relacion).getNombreDestino() + ": {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
						cont++;
					}
				}
			} else if (relacion instanceof TCDComposicion) {
				if (((TCDComposicion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					if ((allAtributos.size() != 0 && ban == false)) {
						ban = true;
						txtCodigo.append(",\n");
					}
					multiplicidad = ((TCDComposicion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (cont != 0) {
							txtCodigo.append(",\n");
						}
						txtCodigo.append("\t" + ((TCDComposicion) relacion).getNombreDestino() + ": {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
						cont++;
					}
				}
			} else if (relacion instanceof TCDDependencia) {
				if (((TCDDependencia) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					if ((allAtributos.size() != 0 && ban == false)) {
						ban = true;
						txtCodigo.append(",\n");
					}
					multiplicidad = ((TCDDependencia) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (cont != 0) {
							txtCodigo.append(",\n");
						}
						txtCodigo.append("\t" + ((TCDDependencia) relacion).getNombreDestino() + ": {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
						cont++;
					}
				}
			}
		}
		txtCodigo.append("\n});\n");
	}

	private void agregarImport(TCDClase tcdClase, StringBuilder txtCodigo) {

		txtCodigo.append("import { DataTypes } from 'sequelize';\n");
		agregarImportDatabase(tcdClase, txtCodigo);
		txtCodigo.append("\n");
	}

	private void agregarImportDatabase(TCDClase tcdClase, StringBuilder txtCodigo) {

		int nivel = 0;
		txtCodigo.append("import db from '");
		nivel = calcularDiferenciaDB(tcdClase);

		if (nivel == 0) {
			txtCodigo.append("../database/connect';\n");
		} else if (nivel > 0) {
			String[] rutaNew = tcdClase.getRuta().split("/");
			while (nivel != 0) {
				txtCodigo.append("../");
				rutaNew = Arrays.copyOf(rutaNew, rutaNew.length - 1);
				nivel--;
			}
			txtCodigo.append("../database/connect';\n");
		}

	}

	private int calcularDiferenciaDB(TCDClase tcdClase) {

		String[] rutaClase1 = tcdClase.getRuta().split("/");
		String[] rutaClase2 = "database/".split("/");
		int diferencia = rutaClase1.length - rutaClase2.length;
		if (diferencia < 0) {
			System.out.println("------ Import Database ------");
			System.out.println(tcdClase.getNombre() + "<--->" + "Database");
			System.out.println(tcdClase.getNombre() + "-> ruta1: " + tcdClase.getRuta());
			System.out.println("Diferencia de nivel: " + diferencia + "\n");
		}
		return diferencia;
	}

	private int calcularDiferencia(TCDClase tcdClase, TCDClase claseRelacion) {

		String[] rutaClase1 = tcdClase.getRuta().split("/");
		String[] rutaClase2 = claseRelacion.getRuta().split("/");
		int diferencia = rutaClase1.length - rutaClase2.length;
		if (diferencia < 0) {
			System.out.println("---Relaciones para imports---");
			System.out.println(tcdClase.getNombre() + "<--->" + claseRelacion.getNombre());
			System.out.println(tcdClase.getNombre() + "-> ruta1: " + tcdClase.getRuta());
			System.out.println(claseRelacion.getNombre() + "-> ruta2: " + claseRelacion.getRuta());
			System.out.println("Diferencia de nivel: " + diferencia + "\n");
		}
		return diferencia;
	}

	private void rutasSinDiferencia(TCDClase tcdClase, TCDClase claseRelacion, String[] rutaClase1, String[] rutaClase2,
			StringBuilder txtCodigo, boolean mismoNivel) {

		if (rutasIguales(rutaClase1, rutaClase2)) {
			if (mismoNivel) {
				txtCodigo.append("./");
			}
			txtCodigo.append(claseRelacion.getNombre() + "\";\n");
		} else {
			String finRuta = rutaClase2[rutaClase2.length - 1];
			txtCodigo.append("../" + finRuta + "/" + claseRelacion.getNombre() + "\";\n");
		}
	}

	private boolean rutasIguales(String[] rutaClase1, String[] rutaClase2) {
		for (int i = 0; i < rutaClase1.length; i++) {
			if (!rutaClase1[i].equals(rutaClase2[i])) {
				return false;
			}
		}
		return true;
	}

	private void agregarEncabezado(TCDClase tcdClase, StringBuilder txtCodigo) {

		txtCodigo.append(
				"const " + tcdClase.getNombre() + " = db.define('" + tcdClase.getNombre().toLowerCase() + "', {\n");
	}

	private void agregarAtributos(TCDClase tcdClase, StringBuilder txtCodigo) {

		// Lista todos los atriutos de cada clase y los agrega
		String multiplicidad;
		TCDAtributo atributo;
		agregarAllAtributos(tcdClase, txtCodigo);

		for (int i = 0; i < tcdClase.getListaAtributos().size(); i++) {
			atributo = tcdClase.getListaAtributos().get(i);
			if (i == tcdClase.getListaAtributos().size() - 1) {
				txtCodigo.append("\t" + atributo.getNombre() + ": {\n" + "\t\ttype: DataTypes."
						+ atributo.getTipoDato().getName().toLowerCase() + "\n" + "\t}");
			} else {
				txtCodigo.append("\t" + atributo.getNombre() + " {\n" + "\t\ttype: DataTypes."
						+ atributo.getTipoDato().getName().toLowerCase() + "\n" + "\t},\n");
			}
		}

		// Lista Todas las relaciones que tiene la clase, exceptuando la de herencia, y
		// las agrega
		ArrayList<TCDRelacion> relaciones = obtenerRelaciones(tcdClase);
		for (TCDRelacion relacion : relaciones) {
			multiplicidad = "";
			if (relacion instanceof TCDAgregacion) {
				if (((TCDAgregacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDAgregacion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						txtCodigo.append(",\n\t" + ((TCDAgregacion) relacion).getNombreDestino() + " {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
					}
				}
			} else if (relacion instanceof TCDAsociacion) {
				if (((TCDAsociacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDAsociacion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						txtCodigo.append(",\n\t" + ((TCDAsociacion) relacion).getNombreDestino() + " {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
					}
				}
			} else if (relacion instanceof TCDComposicion) {
				if (((TCDComposicion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDComposicion) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						txtCodigo.append(",\n\t" + ((TCDComposicion) relacion).getNombreDestino() + " {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
					}
				}
			} else if (relacion instanceof TCDDependencia) {
				if (((TCDDependencia) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDDependencia) relacion).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						txtCodigo.append(",\n\t" + ((TCDDependencia) relacion).getNombreDestino() + " {\n"
								+ "\t\ttype: DataTypes.STRING" + "\n" + "\t}");
					}
				}
			}
		}
		txtCodigo.append("\n});\n");
	}

	private void agregarConstructor(TCDClase tcdClase, StringBuilder txtCodigo) {

		TCDAtributo atributo;
		ArrayList<TCDAtributo> allAtributos = new ArrayList<>();
		TCDClase claseSuper = clasePadre(tcdClase);
		txtCodigo.append("\tconstructor (");

		// Pregunta si la clase hereda de otra para agregar los atributos de la clase
		// padre en los parametros de la clase hija
		if (claseSuper != null) {
			allAtributos.addAll(claseSuper.getListaAtributos());
			allAtributos.addAll(tcdClase.getListaAtributos());
		} else {
			allAtributos.addAll(tcdClase.getListaAtributos());
		}

		// Agrega en los parametros todos los atributos que necesita la clase
		for (int i = 0; i < allAtributos.size(); i++) {
			atributo = allAtributos.get(i);
			if (i == allAtributos.size() - 1) {
				txtCodigo.append(atributo.getNombre() + ": " + atributo.getTipoDato());
			} else {
				txtCodigo.append(atributo.getNombre() + ": " + atributo.getTipoDato() + ", ");
			}
		}

		ArrayList<TCDRelacion> relacionesPadre = null;
		if (claseSuper != null) {
			relacionesPadre = obtenerRelacionesSimples(claseSuper);
			for (TCDRelacion tcdRelacion : relacionesPadre) {
				txtCodigo.append(", " + tcdRelacion.getTarget().getNombre().toLowerCase() + ": "
						+ tcdRelacion.getTarget().getNombre());
			}
		}

		// Obtiene las relaciones que tenga la clase para saber si las agrega como
		// parametros del construtor
		ArrayList<TCDRelacion> relaciones = obtenerRelaciones(tcdClase);
		TCDRelacion relacionAux;
		String multiplicidad;
		char ultimoCaracter = txtCodigo.charAt(txtCodigo.length() - 1);
		for (int i = 0; i < relaciones.size(); i++) {
			relacionAux = relaciones.get(i);
			if (relacionAux instanceof TCDAgregacion) {
				if (((TCDAgregacion) relacionAux).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDAgregacion) relacionAux).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (ultimoCaracter != '(') {
							txtCodigo.append(", ");
						}
						txtCodigo.append(((TCDAgregacion) relacionAux).getNombreDestino() + ": ");
						txtCodigo.append(((TCDAgregacion) relacionAux).getTarget().getNombre());
					}
				}
			} else if (relacionAux instanceof TCDAsociacion) {
				if (((TCDAsociacion) relacionAux).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDAsociacion) relacionAux).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (ultimoCaracter != '(') {
							txtCodigo.append(", ");
						}
						txtCodigo.append(((TCDAsociacion) relacionAux).getNombreDestino() + ": ");
						txtCodigo.append(((TCDAsociacion) relacionAux).getTarget().getNombre());
					}
				}
			} else if (relacionAux instanceof TCDComposicion) {
				if (((TCDComposicion) relacionAux).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDComposicion) relacionAux).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (ultimoCaracter != '(') {
							txtCodigo.append(", ");
						}
						txtCodigo.append(((TCDComposicion) relacionAux).getNombreDestino() + ": ");
						txtCodigo.append(((TCDComposicion) relacionAux).getTarget().getNombre());
					}
				}
			} else if (relacionAux instanceof TCDDependencia) {
				if (((TCDDependencia) relacionAux).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				} else {
					multiplicidad = ((TCDDependencia) relacionAux).getMultiplicidadDestino().getName();
					if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
						if (ultimoCaracter != '(') {
							txtCodigo.append(", ");
						}
						txtCodigo.append(((TCDDependencia) relacionAux).getNombreDestino() + ": ");
						txtCodigo.append(((TCDDependencia) relacionAux).getTarget().getNombre());
					}
				}
			}
		}
		txtCodigo.append(") {\n");

		// Si la clase heredo de otra agregar el metodo super con los parametros de la
		// clase padre
		if (claseSuper != null) {
			txtCodigo.append("\t\tsuper(");
			TCDAtributo atributoSuper;

			for (int i = 0; i < claseSuper.getListaAtributos().size(); i++) {
				atributoSuper = claseSuper.getListaAtributos().get(i);
				if (i == claseSuper.getListaAtributos().size() - 1) {
					txtCodigo.append(atributoSuper.getNombre());
				} else {
					txtCodigo.append(atributoSuper.getNombre() + ", ");
				}
			}
			for (TCDRelacion tcdRelacion : relacionesPadre) {
				txtCodigo.append(", " + tcdRelacion.getTarget().getNombre().toLowerCase());
			}
			txtCodigo.append(");\n");
		}

		// Agrega los atributos propios de la clase y los inicializa en el construtor
		TCDAtributo atributoAUx;
		for (int i = 0; i < tcdClase.getListaAtributos().size(); i++) {
			atributoAUx = tcdClase.getListaAtributos().get(i);
			txtCodigo.append("\t\tthis." + atributoAUx.getNombre() + " = " + atributoAUx.getNombre() + ";\n");
		}

		// Agrega las relaciones que tiene la clase e inicializa con las que vienen por
		// parametro y las listas las inicializa con []
		for (TCDRelacion relacion : tcdClase.getListaRelaciones()) {
			if (!(relacion instanceof TCDHerencia)) {
				multiplicidad = "";
				if (relacion instanceof TCDAgregacion) {
					if (((TCDAgregacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					} else {
						txtCodigo.append("\t\tthis.");
						txtCodigo.append(((TCDAgregacion) relacion).getNombreDestino() + " = ");
						multiplicidad = ((TCDAgregacion) relacion).getMultiplicidadDestino().getName();
						if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
							txtCodigo.append(((TCDAgregacion) relacion).getNombreDestino() + ";\n");
						}
					}
				} else if (relacion instanceof TCDAsociacion) {
					if (((TCDAsociacion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					} else {
						txtCodigo.append("\t\tthis.");
						txtCodigo.append(((TCDAsociacion) relacion).getNombreDestino() + " = ");
						multiplicidad = ((TCDAsociacion) relacion).getMultiplicidadDestino().getName();
						if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
							txtCodigo.append(((TCDAsociacion) relacion).getNombreDestino() + ";\n");
						}
					}
				} else if (relacion instanceof TCDComposicion) {
					if (((TCDComposicion) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					} else {
						txtCodigo.append("\t\tthis.");
						txtCodigo.append(((TCDComposicion) relacion).getNombreDestino() + " = ");
						multiplicidad = ((TCDComposicion) relacion).getMultiplicidadDestino().getName();
						if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
							txtCodigo.append(((TCDComposicion) relacion).getNombreDestino() + ";\n");
						}
					}
				} else if (relacion instanceof TCDDependencia) {
					if (((TCDDependencia) relacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					} else {
						txtCodigo.append("\t\tthis.");
						txtCodigo.append(((TCDDependencia) relacion).getNombreDestino() + " = ");
						multiplicidad = ((TCDDependencia) relacion).getMultiplicidadDestino().getName();
						if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
							txtCodigo.append(((TCDDependencia) relacion).getNombreDestino() + ";\n");
						}
					}
				}
				if (multiplicidad.equalsIgnoreCase("_0_n") || multiplicidad.equalsIgnoreCase("_1_n")) {
					txtCodigo.append("[];\n");
				}
			}
		}
		txtCodigo.append("\t}\n\n");
	}

	private ArrayList<TCDRelacion> obtenerRelaciones(TCDClase tcdClase) {
		ArrayList<TCDRelacion> relaciones = new ArrayList<>();

		for (TCDRelacion relacion3 : tcdClase.getListaRelaciones()) {
			if (!(relacion3 instanceof TCDHerencia)) {
				relaciones.add(relacion3);
			}
		}
		return relaciones;
	}

	private ArrayList<TCDRelacion> obtenerRelacionesSimples(TCDClase tcdClase) {
		ArrayList<TCDRelacion> relaciones = new ArrayList<>();

		for (TCDRelacion relacion3 : tcdClase.getListaRelaciones()) {
			if (!(relacion3 instanceof TCDHerencia)) {
				if (relacion3 instanceof TCDAgregacion) {
					if (((TCDAgregacion) relacion3).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					}
					if (((TCDAgregacion) relacion3).getMultiplicidadDestino() == Multiplicidad._1
							|| ((TCDAgregacion) relacion3).getMultiplicidadDestino() == Multiplicidad._01) {
						relaciones.add(relacion3);
					}
				} else if (relacion3 instanceof TCDAsociacion) {
					if (((TCDAsociacion) relacion3).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					}
					if (((TCDAsociacion) relacion3).getMultiplicidadDestino() == Multiplicidad._1
							|| ((TCDAsociacion) relacion3).getMultiplicidadDestino() == Multiplicidad._01) {
						relaciones.add(relacion3);
					}
				} else if (relacion3 instanceof TCDComposicion) {
					if (((TCDComposicion) relacion3).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					}
					if (((TCDComposicion) relacion3).getMultiplicidadDestino() == Multiplicidad._1
							|| ((TCDComposicion) relacion3).getMultiplicidadDestino() == Multiplicidad._01) {
						relaciones.add(relacion3);
					}
				} else if (relacion3 instanceof TCDDependencia) {
					if (((TCDDependencia) relacion3).getNavegavilidad().getName().equalsIgnoreCase("none")) {
						continue;
					}
					if (((TCDDependencia) relacion3).getMultiplicidadDestino() == Multiplicidad._1
							|| ((TCDDependencia) relacion3).getMultiplicidadDestino() == Multiplicidad._01) {
						relaciones.add(relacion3);
					}
				}
			}
		}
		return relaciones;
	}

	private TCDClase clasePadre(TCDClase tcdClase) {
		for (TCDRelacion relacion2 : tcdClase.getListaRelaciones()) {
			if (relacion2 instanceof TCDHerencia) {
				if (!relacion2.getSource().getNombre().equals(tcdClase.getNombre())) {
					return relacion2.getSource();
				}
			}
		}
		return null;
	}

	private void agregarGetAndSet(TCDClase tcdClase, StringBuilder txtCodigo) {
		/*
		 * public get Name() : string { return this.name; }
		 * 
		 * public set Name(name : string) { this.name = name; }
		 */
		String nombre;
		for (TCDAtributo atributo : tcdClase.getListaAtributos()) {
			nombre = atributo.getNombre().toUpperCase().charAt(0)
					+ atributo.getNombre().substring(1, atributo.getNombre().length());
			txtCodigo.append("\tpublic get" + nombre + "() : " + atributo.getTipoDato() + " { return this."
					+ atributo.getNombre() + "; }\n\n");
			txtCodigo.append("\tpublic set" + nombre + "(" + atributo.getNombre() + " : " + atributo.getTipoDato()
					+ ") { this." + atributo.getNombre() + " = " + atributo.getNombre() + "; }\n\n");
		}

		ArrayList<TCDRelacion> relaAux = obtenerRelaciones(tcdClase);

		String multiplicidad;
		for (TCDRelacion tcdRelacion : relaAux) {
			if (tcdRelacion instanceof TCDAgregacion) {
				if (((TCDAgregacion) tcdRelacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				}
				multiplicidad = ((TCDAgregacion) tcdRelacion).getMultiplicidadDestino().getName();
				nombre = ((TCDAgregacion) tcdRelacion).getNombreDestino().toUpperCase().charAt(0)
						+ ((TCDAgregacion) tcdRelacion).getNombreDestino().substring(1,
								((TCDAgregacion) tcdRelacion).getNombreDestino().length());
				if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ " { return this." + ((TCDAgregacion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDAgregacion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + ") { this."
							+ ((TCDAgregacion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDAgregacion) tcdRelacion).getNombreDestino() + "; }\n\n");
				} else {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ "[] { return this." + ((TCDAgregacion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDAgregacion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + "[]) { this."
							+ ((TCDAgregacion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDAgregacion) tcdRelacion).getNombreDestino() + "; }\n\n");
				}
			} else if (tcdRelacion instanceof TCDAsociacion) {
				if (((TCDAsociacion) tcdRelacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				}
				multiplicidad = ((TCDAsociacion) tcdRelacion).getMultiplicidadDestino().getName();
				nombre = ((TCDAsociacion) tcdRelacion).getNombreDestino().toUpperCase().charAt(0)
						+ ((TCDAsociacion) tcdRelacion).getNombreDestino().substring(1,
								((TCDAsociacion) tcdRelacion).getNombreDestino().length());
				if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ " { return this." + ((TCDAsociacion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDAsociacion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + ") { this."
							+ ((TCDAsociacion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDAsociacion) tcdRelacion).getNombreDestino() + "; }\n\n");
				} else {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ "[] { return this." + ((TCDAsociacion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDAsociacion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + "[]) { this."
							+ ((TCDAsociacion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDAsociacion) tcdRelacion).getNombreDestino() + "; }\n\n");
				}
			} else if (tcdRelacion instanceof TCDComposicion) {
				if (((TCDComposicion) tcdRelacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				}
				multiplicidad = ((TCDComposicion) tcdRelacion).getMultiplicidadDestino().getName();
				nombre = ((TCDComposicion) tcdRelacion).getNombreDestino().toUpperCase().charAt(0)
						+ ((TCDComposicion) tcdRelacion).getNombreDestino().substring(1,
								((TCDComposicion) tcdRelacion).getNombreDestino().length());
				if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ " { return this." + ((TCDComposicion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDComposicion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + ") { this."
							+ ((TCDComposicion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDComposicion) tcdRelacion).getNombreDestino() + "; }\n\n");
				} else {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ "[] { return this." + ((TCDComposicion) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDComposicion) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + "[]) { this."
							+ ((TCDComposicion) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDComposicion) tcdRelacion).getNombreDestino() + "; }\n\n");
				}
			} else if (tcdRelacion instanceof TCDDependencia) {
				if (((TCDDependencia) tcdRelacion).getNavegavilidad().getName().equalsIgnoreCase("none")) {
					continue;
				}
				multiplicidad = ((TCDDependencia) tcdRelacion).getMultiplicidadDestino().getName();
				nombre = ((TCDDependencia) tcdRelacion).getNombreDestino().toUpperCase().charAt(0)
						+ ((TCDDependencia) tcdRelacion).getNombreDestino().substring(1,
								((TCDDependencia) tcdRelacion).getNombreDestino().length());
				if (multiplicidad.equalsIgnoreCase("_1") || multiplicidad.equalsIgnoreCase("_0_1")) {

					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ " { return this." + ((TCDDependencia) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDDependencia) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + ") { this."
							+ ((TCDDependencia) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDDependencia) tcdRelacion).getNombreDestino() + "; }\n\n");
				} else {
					txtCodigo.append("\tpublic get" + nombre + "() : " + tcdRelacion.getTarget().getNombre()
							+ "[] { return this." + ((TCDDependencia) tcdRelacion).getNombreDestino() + "; }\n\n");
					txtCodigo.append("\tpublic set" + nombre + "(" + ((TCDDependencia) tcdRelacion).getNombreDestino()
							+ " : " + tcdRelacion.getTarget().getNombre() + "[]) { this."
							+ ((TCDDependencia) tcdRelacion).getNombreDestino() + " = "
							+ ((TCDDependencia) tcdRelacion).getNombreDestino() + "; }\n\n");
				}
			}
		}
	}

	private void agregarMetodos(TCDClase tcdClase, StringBuilder txtCodigo) {
		for (TCDMetodo metodo : tcdClase.getListaMetodos()) {
			txtCodigo.append(
					"\t" + metodo.getModificadorAcceso().getName().toLowerCase() + " " + metodo.getNombre() + "(");
			for (int i = 0; i < metodo.getListaParametros().size(); i++) {
				if (i == metodo.getListaParametros().size() - 1) {
					txtCodigo.append(metodo.getListaParametros().get(i) + ": any");
				} else {
					txtCodigo.append(metodo.getListaParametros().get(i) + ": any, ");
				}
			}
			txtCodigo.append("): " + metodo.getTipoRetorno().getName() + " {\n");
			if (metodo.getSemantica() == null) {
				txtCodigo.append("\t\treturn");
				if (metodo.getTipoRetorno() == TipoRetorno.UNDEFINED || metodo.getTipoRetorno() == TipoRetorno.VOID) {
					txtCodigo.append(";");
				} else if (metodo.getTipoRetorno() == TipoRetorno.STRING) {
					txtCodigo.append(" '';");
				} else if (metodo.getTipoRetorno() == TipoRetorno.NUMBER) {
					txtCodigo.append(" 0;");
				} else if (metodo.getTipoRetorno() == TipoRetorno.BOOLEAN) {
					txtCodigo.append(" false;");
				}
				txtCodigo.append("\n\t}\n\n");
			} else {
				txtCodigo.append("\t\t" + metodo.getSemantica());
			}
		}

	}

	private void guardarArchivo(String cadena, String ruta, String nombre) {
		try {
			File archivo = new File(ruta);
			System.out.println("");
			if (archivo.exists() == false) {
				archivo.mkdirs();
			}
			FileWriter escribir = new FileWriter(archivo + "/" + nombre, true);
			escribir.write(cadena);
			escribir.close();
		} catch (Exception e) {
			System.out.println("Error al Guardar");
		}
	}

	private void crearCarpeta(String ruta) {
		try {
			File archivo = new File(ruta);
			System.out.println("");
			if (archivo.exists() == false) {
				archivo.mkdirs();
			}
		} catch (Exception e) {
			System.out.println("Error al Guardar");
		}
	}
}
