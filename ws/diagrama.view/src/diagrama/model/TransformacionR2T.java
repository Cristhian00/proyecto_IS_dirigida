package diagrama.model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;

import abstracta_relacional.Column;
import abstracta_relacional.ModelFactory;
import abstracta_relacional.PrimaryKey;
import abstracta_relacional.Relation;
import abstracta_relacional.Table;
import abstracta_relacional.Type;

public class TransformacionR2T {

	private ModelFactory modelFactoryRelacional;

	public TransformacionR2T(ModelFactory modelFactoryRelacional) {
		super();
		this.modelFactoryRelacional = modelFactoryRelacional;
	}

	public String transformarR2T() {

		String pathRaiz = "";
		StringBuilder txtCodigo = new StringBuilder();
		String msj = "ERROR";

		DirectoryDialog fd = new DirectoryDialog(new Shell(), SWT.SELECTED);
		fd.setText("Generacion de codigo");
		pathRaiz = fd.open();
		if (pathRaiz != null) {
			if (modelFactoryRelacional.getLstSchema().size() < 1) {
				return "No hay esquemas creados";
			} else {
				txtCodigo = new StringBuilder();
				txtCodigo.append("CREATE DATABASE IF NOT EXISTS "
						+ modelFactoryRelacional.getLstSchema().get(0).getName() + ";\n\n");
				txtCodigo.append("USE " + modelFactoryRelacional.getLstSchema().get(0).getName() + ";\n\n");
				for (Table table : modelFactoryRelacional.getLstSchema().get(0).getListTables()) {
					generarTabla(table, txtCodigo);
				}
				for (Table table : modelFactoryRelacional.getLstSchema().get(0).getListTables()) {
					generarRelaciones(table, txtCodigo);
				}
				guardarArchivo(txtCodigo.toString(), pathRaiz + "/",
						modelFactoryRelacional.getLstSchema().get(0).getName() + ".sql");
			}
			msj = "Se ha generado el código SQL";
		} else {
			msj = "Se cancelo la transformación. No se creo ningún archivo SQL";
		}
		return msj;
	}

	private void generarRelaciones(Table table, StringBuilder txtCodigo) {

		Table tableTarget;

		for (Relation relacion : table.getListRelations()) {
			tableTarget = relacion.getTableTarget();

			System.out.println();
			txtCodigo.append("ALTER TABLE " + table.getName() + "s ADD FOREIGN KEY("
					+ relacion.getNameTarget().toLowerCase() + "_id) REFERENCES " + tableTarget.getName() + "s("
					+ tableTarget.getPrimaryKey().get(0).getColumna().getName() + ");\n\n");
		}
	}

	private void generarTabla(Table table, StringBuilder txtCodigo) {
		txtCodigo.append("CREATE TABLE " + table.getName() + "s(\n");
		generarColumnas(table, txtCodigo);
	}

	private void generarColumnas(Table table, StringBuilder txtCodigo) {

		String foranea;
		String foreign_key = "";
		boolean ban = false;

		for (Column column : table.getListColumns()) {
			if (column.getName().length() > 8) {
				foranea = column.getName().substring(0, 8);
				if (foranea.equals("foreign_")) {
					foreign_key = column.getName();
				}
			}
			txtCodigo.append("\t" + column.getName() + " " + column.getType().getName().toUpperCase());
			if (column.getType() == Type.VARCHAR) {
				txtCodigo.append("(255)");
			} else if (column.getType() == Type.NUMBER || column.getType() == Type.FLOAT
					|| column.getType() == Type.INT) {
				if (column.isAuto_increment() && ban == false) {
					txtCodigo.append(" AUTO_INCREMENT");
					ban = true;
				}
			}
			if (column.isIs_not_null()) {
				txtCodigo.append(" NOT NULL");
			}
			if (column.isIs_unique()) {
				txtCodigo.append(" UNIQUE");
			}
			if (column.getData_default() != null) {
				if (!column.getData_default().isEmpty()) {
					if (column.getType() == Type.NUMBER || column.getType() == Type.FLOAT
							|| column.getType() == Type.INT) {
						txtCodigo.append(" DEFAULT " + column.getData_default());
					} else {
						txtCodigo.append(" DEFAULT '" + column.getData_default() + "'");
					}
				}
			}
			txtCodigo.append(",\n");
		}
		PrimaryKey primaryKey;
		for (int i = 0; i < table.getPrimaryKey().size(); i++) {
			primaryKey = table.getPrimaryKey().get(0);
			if (i == table.getPrimaryKey().size() - 1) {
				txtCodigo.append("\tPRIMARY KEY (" + primaryKey.getColumna().getName() + ")");
			} else {
				txtCodigo.append("\tPRIMARY KEY (" + primaryKey.getColumna().getName() + "),\n");
			}
		}
		if (!foreign_key.isEmpty()) {
			String[] aux = foreign_key.split("_");
			txtCodigo.append(",\n");
			if (aux.length > 3) {
				String name_column = "";
				for (int i = 1; i < aux.length - 1; i++) {
					if (i == aux.length - 2) {
						name_column += aux[i];
					} else {
						name_column += aux[i] + "_";
					}
				}
				txtCodigo.append("\tFOREIGN KEY (" + foreign_key + ") REFERENCES " + aux[aux.length - 1] + "s ("
						+ name_column + ")");
			}
			txtCodigo.append("\tFOREIGN KEY (" + foreign_key + ") REFERENCES " + aux[2] + "s (" + aux[1] + ")");
		}
		txtCodigo.append("\n);\n\n");
		
		txtCodigo.append("ALTER TABLE " + table.getName() + "s ADD createdAt TIMESTAMP NOT NULL;\n"
				+ "ALTER TABLE " + table.getName() + "s ADD updatedAt TIMESTAMP NOT NULL;\n\n");
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
}
