/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.ModelFactory;
import diagrama_concreta.ModificadorAcceso;
import diagrama_concreta.Multiplicidad;
import diagrama_concreta.Navegavilidad;
import diagrama_concreta.TCDAgregacion;
import diagrama_concreta.TCDAsociacion;
import diagrama_concreta.TCDAtributo;
import diagrama_concreta.TCDClase;
import diagrama_concreta.TCDComposicion;
import diagrama_concreta.TCDDependencia;
import diagrama_concreta.TCDDiagramaClases;
import diagrama_concreta.TCDHerencia;
import diagrama_concreta.TCDMetodo;
import diagrama_concreta.TCDPaquete;
import diagrama_concreta.TCDRelacion;
import diagrama_concreta.TipoDato;
import diagrama_concreta.TipoRetorno;
import diagrama_concreta.TipoVariable;
import diagrama_concreta.Visibilidad;

import diagrama_concreta.class_identifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Diagrama_concretaPackageImpl extends EPackageImpl implements Diagrama_concretaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdDiagramaClasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdPaqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdClaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAgregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAsociacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdComposicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdDependenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdHerenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdAtributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class_identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdMetodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum navegavilidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilidadEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoRetornoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diagrama_concreta.Diagrama_concretaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Diagrama_concretaPackageImpl() {
		super(eNS_URI, Diagrama_concretaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Diagrama_concretaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Diagrama_concretaPackage init() {
		if (isInited) return (Diagrama_concretaPackage)EPackage.Registry.INSTANCE.getEPackage(Diagrama_concretaPackage.eNS_URI);

		// Obtain or create and register package
		Diagrama_concretaPackageImpl theDiagrama_concretaPackage = (Diagrama_concretaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Diagrama_concretaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Diagrama_concretaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiagrama_concretaPackage.createPackageContents();

		// Initialize created meta-data
		theDiagrama_concretaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiagrama_concretaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Diagrama_concretaPackage.eNS_URI, theDiagrama_concretaPackage);
		return theDiagrama_concretaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDDiagramaClases() {
		return tcdDiagramaClasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDDiagramaClases_ListaClases() {
		return (EReference)tcdDiagramaClasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDDiagramaClases_ListaRelaciones() {
		return (EReference)tcdDiagramaClasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDDiagramaClases_ListaPaquetes() {
		return (EReference)tcdDiagramaClasesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDiagramaClases_Nombre() {
		return (EAttribute)tcdDiagramaClasesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaDiagramas() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDPaquete() {
		return tcdPaqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDPaquete_ListaPaquetes() {
		return (EReference)tcdPaqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDPaquete_Nombre() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDPaquete_Ruta() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDClase() {
		return tcdClaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDClase_ListaAtributos() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDClase_ListaMetodos() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Nombre() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Estereotipo() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_IsAbstract() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Documentacion() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Ruta() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDRelacion() {
		return tcdRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDRelacion_Source() {
		return (EReference)tcdRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDRelacion_Target() {
		return (EReference)tcdRelacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDAgregacion() {
		return tcdAgregacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAgregacion_NombreOrigen() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAgregacion_NombreDestino() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAgregacion_MultiplicidadOrigen() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAgregacion_MultiplicidadDestino() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAgregacion_Navegavilidad() {
		return (EAttribute)tcdAgregacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDAsociacion() {
		return tcdAsociacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAsociacion_NombreOrigen() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAsociacion_NombreDestino() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAsociacion_MultiplicidadOrigen() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAsociacion_MultiplicidadDestino() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAsociacion_Navegavilidad() {
		return (EAttribute)tcdAsociacionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDComposicion() {
		return tcdComposicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDComposicion_NombreOrigen() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDComposicion_NombreDestino() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDComposicion_MultiplicidadOrigen() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDComposicion_MultiplicidadDestino() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDComposicion_Navegavilidad() {
		return (EAttribute)tcdComposicionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDDependencia() {
		return tcdDependenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDependencia_NombreOrigen() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDependencia_NombreDestino() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDependencia_MultiplicidadOrigen() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDependencia_MultiplicidadDestino() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDDependencia_Navegavilidad() {
		return (EAttribute)tcdDependenciaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDHerencia() {
		return tcdHerenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDAtributo() {
		return tcdAtributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAtributo_Nombre() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAtributo_TipoDato() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAtributo_Visibilidad() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDAtributo_ValorDefecto() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDAtributo_Identificadores() {
		return (EReference)tcdAtributoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclass_identifier() {
		return class_identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclass_identifier_Identificador() {
		return (EReference)class_identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDMetodo() {
		return tcdMetodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDMetodo_ListaParametros() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDMetodo_Nombre() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDMetodo_ModificadorAcceso() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDMetodo_TipoRetorno() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDMetodo_Semantica() {
		return (EAttribute)tcdMetodoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNavegavilidad() {
		return navegavilidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicidad() {
		return multiplicidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilidad() {
		return visibilidadEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoRetorno() {
		return tipoRetornoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaFactory getDiagrama_concretaFactory() {
		return (Diagrama_concretaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tcdDiagramaClasesEClass = createEClass(TCD_DIAGRAMA_CLASES);
		createEReference(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__LISTA_CLASES);
		createEReference(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__LISTA_RELACIONES);
		createEReference(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__LISTA_PAQUETES);
		createEAttribute(tcdDiagramaClasesEClass, TCD_DIAGRAMA_CLASES__NOMBRE);

		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_DIAGRAMAS);

		tcdPaqueteEClass = createEClass(TCD_PAQUETE);
		createEReference(tcdPaqueteEClass, TCD_PAQUETE__LISTA_PAQUETES);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__NOMBRE);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__RUTA);

		tcdClaseEClass = createEClass(TCD_CLASE);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_ATRIBUTOS);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_METODOS);
		createEAttribute(tcdClaseEClass, TCD_CLASE__NOMBRE);
		createEAttribute(tcdClaseEClass, TCD_CLASE__ESTEREOTIPO);
		createEAttribute(tcdClaseEClass, TCD_CLASE__IS_ABSTRACT);
		createEAttribute(tcdClaseEClass, TCD_CLASE__DOCUMENTACION);
		createEAttribute(tcdClaseEClass, TCD_CLASE__RUTA);

		tcdRelacionEClass = createEClass(TCD_RELACION);
		createEReference(tcdRelacionEClass, TCD_RELACION__SOURCE);
		createEReference(tcdRelacionEClass, TCD_RELACION__TARGET);

		tcdAgregacionEClass = createEClass(TCD_AGREGACION);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_DESTINO);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_DESTINO);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NAVEGAVILIDAD);

		tcdAsociacionEClass = createEClass(TCD_ASOCIACION);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__NOMBRE_ORIGEN);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__NOMBRE_DESTINO);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__MULTIPLICIDAD_DESTINO);
		createEAttribute(tcdAsociacionEClass, TCD_ASOCIACION__NAVEGAVILIDAD);

		tcdComposicionEClass = createEClass(TCD_COMPOSICION);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__NOMBRE_ORIGEN);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__NOMBRE_DESTINO);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__MULTIPLICIDAD_DESTINO);
		createEAttribute(tcdComposicionEClass, TCD_COMPOSICION__NAVEGAVILIDAD);

		tcdDependenciaEClass = createEClass(TCD_DEPENDENCIA);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__NOMBRE_ORIGEN);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__NOMBRE_DESTINO);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO);
		createEAttribute(tcdDependenciaEClass, TCD_DEPENDENCIA__NAVEGAVILIDAD);

		tcdHerenciaEClass = createEClass(TCD_HERENCIA);

		tcdAtributoEClass = createEClass(TCD_ATRIBUTO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__NOMBRE);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__TIPO_DATO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__VISIBILIDAD);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__VALOR_DEFECTO);
		createEReference(tcdAtributoEClass, TCD_ATRIBUTO__IDENTIFICADORES);

		class_identifierEClass = createEClass(CLASS_IDENTIFIER);
		createEReference(class_identifierEClass, CLASS_IDENTIFIER__IDENTIFICADOR);

		tcdMetodoEClass = createEClass(TCD_METODO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__LISTA_PARAMETROS);
		createEAttribute(tcdMetodoEClass, TCD_METODO__NOMBRE);
		createEAttribute(tcdMetodoEClass, TCD_METODO__MODIFICADOR_ACCESO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__TIPO_RETORNO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__SEMANTICA);

		// Create enums
		navegavilidadEEnum = createEEnum(NAVEGAVILIDAD);
		multiplicidadEEnum = createEEnum(MULTIPLICIDAD);
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		visibilidadEEnum = createEEnum(VISIBILIDAD);
		tipoRetornoEEnum = createEEnum(TIPO_RETORNO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tcdAgregacionEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdAsociacionEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdComposicionEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdDependenciaEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdHerenciaEClass.getESuperTypes().add(this.getTCDRelacion());

		// Initialize classes and features; add operations and parameters
		initEClass(tcdDiagramaClasesEClass, TCDDiagramaClases.class, "TCDDiagramaClases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDDiagramaClases_ListaClases(), this.getTCDClase(), null, "listaClases", null, 0, -1, TCDDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDDiagramaClases_ListaRelaciones(), this.getTCDRelacion(), null, "listaRelaciones", null, 0, -1, TCDDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDDiagramaClases_ListaPaquetes(), this.getTCDPaquete(), null, "listaPaquetes", null, 0, -1, TCDDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDDiagramaClases_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDDiagramaClases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaDiagramas(), this.getTCDDiagramaClases(), null, "listaDiagramas", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdPaqueteEClass, TCDPaquete.class, "TCDPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDPaquete_ListaPaquetes(), this.getTCDPaquete(), null, "listaPaquetes", null, 0, -1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdClaseEClass, TCDClase.class, "TCDClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDClase_ListaAtributos(), this.getTCDAtributo(), null, "listaAtributos", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDClase_ListaMetodos(), this.getTCDMetodo(), null, "listaMetodos", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Documentacion(), ecorePackage.getEString(), "documentacion", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdRelacionEClass, TCDRelacion.class, "TCDRelacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDRelacion_Source(), this.getTCDClase(), null, "source", null, 0, 1, TCDRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDRelacion_Target(), this.getTCDClase(), null, "target", null, 0, 1, TCDRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdAgregacionEClass, TCDAgregacion.class, "TCDAgregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDAgregacion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_Navegavilidad(), this.getNavegavilidad(), "navegavilidad", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdAsociacionEClass, TCDAsociacion.class, "TCDAsociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDAsociacion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TCDAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAsociacion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TCDAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAsociacion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TCDAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAsociacion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TCDAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAsociacion_Navegavilidad(), this.getNavegavilidad(), "navegavilidad", null, 0, 1, TCDAsociacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdComposicionEClass, TCDComposicion.class, "TCDComposicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDComposicion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TCDComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDComposicion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TCDComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDComposicion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TCDComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDComposicion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TCDComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDComposicion_Navegavilidad(), this.getNavegavilidad(), "navegavilidad", null, 0, 1, TCDComposicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdDependenciaEClass, TCDDependencia.class, "TCDDependencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDDependencia_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TCDDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDDependencia_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TCDDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDDependencia_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TCDDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDDependencia_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TCDDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDDependencia_Navegavilidad(), this.getNavegavilidad(), "navegavilidad", null, 0, 1, TCDDependencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdHerenciaEClass, TCDHerencia.class, "TCDHerencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcdAtributoEClass, TCDAtributo.class, "TCDAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_Visibilidad(), this.getVisibilidad(), "visibilidad", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_ValorDefecto(), ecorePackage.getEString(), "valorDefecto", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDAtributo_Identificadores(), this.getclass_identifier(), null, "identificadores", null, 0, -1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(class_identifierEClass, class_identifier.class, "class_identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getclass_identifier_Identificador(), this.getTCDAtributo(), null, "identificador", null, 0, 1, class_identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdMetodoEClass, TCDMetodo.class, "TCDMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDMetodo_ListaParametros(), ecorePackage.getEString(), "listaParametros", null, 0, -1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_ModificadorAcceso(), this.getVisibilidad(), "modificadorAcceso", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_TipoRetorno(), this.getTipoRetorno(), "tipoRetorno", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_Semantica(), ecorePackage.getEString(), "semantica", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(navegavilidadEEnum, Navegavilidad.class, "Navegavilidad");
		addEEnumLiteral(navegavilidadEEnum, Navegavilidad.BIDIRECCIONAL);
		addEEnumLiteral(navegavilidadEEnum, Navegavilidad.UNIDIRECCIONAL);

		initEEnum(multiplicidadEEnum, Multiplicidad.class, "Multiplicidad");
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._1);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._01);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._0N);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._1N);

		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.NUMBER);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);

		initEEnum(visibilidadEEnum, Visibilidad.class, "Visibilidad");
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PUBLIC);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PRIVATE);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PROTECTED);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.READONLY);

		initEEnum(tipoRetornoEEnum, TipoRetorno.class, "TipoRetorno");
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.UNDEFINED);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.STRING);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.NUMBER);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.BOOLEAN);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.VOID);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
		// gmf.comparment
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (tcdDiagramaClasesEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (tcdPaqueteEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "color", "255,252,142"
		   });	
		addAnnotation
		  (tcdClaseEClass, 
		   source, 
		   new String[] {
			 "label", "nombre",
			 "color", "227,255,248"
		   });	
		addAnnotation
		  (tcdAtributoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre, tipoDato",
			 "color", "215,255,242",
			 "label.pattern", "{0}: {1}",
			 "size", "150,16",
			 "border", "null"
		   });	
		addAnnotation
		  (class_identifierEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tcdMetodoEClass, 
		   source, 
		   new String[] {
			 "label", "nombre, tipoRetorno",
			 "label.pattern", "{0}: {1}",
			 "border.style", "dot",
			 "color", "255,253,188",
			 "size", "150,16",
			 "size.maximum", "200,16"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getTCDClase_ListaAtributos(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTCDClase_ListaMetodos(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (tcdRelacionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (tcdAgregacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "3",
			 "color", "39,174,96",
			 "source.decoration", "rhomb",
			 "label", "nombreDestino, multiplicidadDestino",
			 "label.pattern", "{0}  {1}"
		   });	
		addAnnotation
		  (tcdAsociacionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "3",
			 "color", "0,62,255",
			 "label", "nombreDestino, multiplicidadDestino",
			 "label.pattern", "{0}  {1}"
		   });	
		addAnnotation
		  (tcdComposicionEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "label", "nombreDestino, multiplicidadDestino",
			 "label.pattern", "{0}  {1}",
			 "style", "dash",
			 "width", "3",
			 "color", "0,255,193",
			 "source.decoration", "rhomb"
		   });	
		addAnnotation
		  (tcdDependenciaEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "label", "nombreDestino, multiplicidadDestino",
			 "style", "solid",
			 "width", "3",
			 "label.pattern", "{0}  {1}",
			 "color", "255,15,15",
			 "source.decoration", "filledrhomb"
		   });	
		addAnnotation
		  (tcdHerenciaEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "3",
			 "color", "4,255,0",
			 "source.decoration", "closedarrow"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.comparment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.comparment";	
		addAnnotation
		  (getTCDMetodo_ListaParametros(), 
		   source, 
		   new String[] {
		   });
	}

} //Diagrama_concretaPackageImpl
