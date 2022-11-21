/**
 */
package abstracta.impl;

import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.ModelFactory;
import abstracta.Multiplicidad;
import abstracta.Navegavilidad;
import abstracta.TCDAgregacion;
import abstracta.TCDAsociacion;
import abstracta.TCDAtributo;
import abstracta.TCDClase;
import abstracta.TCDClass_identifier;
import abstracta.TCDComposicion;
import abstracta.TCDDependencia;
import abstracta.TCDHerencia;
import abstracta.TCDMetodo;
import abstracta.TCDPaquete;
import abstracta.TCDParametro;
import abstracta.TCDRelacion;
import abstracta.TipoDato;
import abstracta.TipoRetorno;
import abstracta.Visibilidad;

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
public class AbstractaPackageImpl extends EPackageImpl implements AbstractaPackage {
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
	private EClass tcdAtributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdClass_identifierEClass = null;

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
	private EClass tcdRelacionEClass = null;

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
	private EClass tcdAgregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcdParametroEClass = null;

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
	private EEnum tipoDatoEEnum = null;

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
	private EEnum tipoRetornoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum navegavilidadEEnum = null;

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
	 * @see abstracta.AbstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractaPackageImpl() {
		super(eNS_URI, AbstractaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AbstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractaPackage init() {
		if (isInited) return (AbstractaPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractaPackage.eNS_URI);

		// Obtain or create and register package
		AbstractaPackageImpl theAbstractaPackage = (AbstractaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAbstractaPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractaPackage.eNS_URI, theAbstractaPackage);
		return theAbstractaPackage;
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
	public EReference getModelFactory_ListaPaquetes() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaTodasClases() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_ListaTodosPaquetes() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(4);
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
	public EReference getTCDPaquete_ListaClases() {
		return (EReference)tcdPaqueteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDPaquete_Listapaquetes() {
		return (EReference)tcdPaqueteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDPaquete_Nombre() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDPaquete_Ruta() {
		return (EAttribute)tcdPaqueteEClass.getEStructuralFeatures().get(3);
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
	public EReference getTCDClase_ListaRelaciones() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDClase_Identificadores() {
		return (EReference)tcdClaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Nombre() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Estereotipo() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_IsAbstract() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Documentacion() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDClase_Ruta() {
		return (EAttribute)tcdClaseEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getTCDAtributo_IsUnique() {
		return (EAttribute)tcdAtributoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCDClass_identifier() {
		return tcdClass_identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCDClass_identifier_Identificador() {
		return (EReference)tcdClass_identifierEClass.getEStructuralFeatures().get(0);
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
	public EClass getTCDParametro() {
		return tcdParametroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDParametro_Nombre() {
		return (EAttribute)tcdParametroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCDParametro_TipoDato() {
		return (EAttribute)tcdParametroEClass.getEStructuralFeatures().get(1);
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
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
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
	public EEnum getTipoRetorno() {
		return tipoRetornoEEnum;
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
	public AbstractaFactory getAbstractaFactory() {
		return (AbstractaFactory)getEFactoryInstance();
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
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_PAQUETES);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_TODAS_CLASES);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LISTA_TODOS_PAQUETES);

		tcdPaqueteEClass = createEClass(TCD_PAQUETE);
		createEReference(tcdPaqueteEClass, TCD_PAQUETE__LISTA_CLASES);
		createEReference(tcdPaqueteEClass, TCD_PAQUETE__LISTAPAQUETES);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__NOMBRE);
		createEAttribute(tcdPaqueteEClass, TCD_PAQUETE__RUTA);

		tcdClaseEClass = createEClass(TCD_CLASE);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_ATRIBUTOS);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_METODOS);
		createEReference(tcdClaseEClass, TCD_CLASE__LISTA_RELACIONES);
		createEReference(tcdClaseEClass, TCD_CLASE__IDENTIFICADORES);
		createEAttribute(tcdClaseEClass, TCD_CLASE__NOMBRE);
		createEAttribute(tcdClaseEClass, TCD_CLASE__ESTEREOTIPO);
		createEAttribute(tcdClaseEClass, TCD_CLASE__IS_ABSTRACT);
		createEAttribute(tcdClaseEClass, TCD_CLASE__DOCUMENTACION);
		createEAttribute(tcdClaseEClass, TCD_CLASE__RUTA);

		tcdAtributoEClass = createEClass(TCD_ATRIBUTO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__NOMBRE);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__TIPO_DATO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__VISIBILIDAD);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__VALOR_DEFECTO);
		createEAttribute(tcdAtributoEClass, TCD_ATRIBUTO__IS_UNIQUE);

		tcdClass_identifierEClass = createEClass(TCD_CLASS_IDENTIFIER);
		createEReference(tcdClass_identifierEClass, TCD_CLASS_IDENTIFIER__IDENTIFICADOR);

		tcdMetodoEClass = createEClass(TCD_METODO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__LISTA_PARAMETROS);
		createEAttribute(tcdMetodoEClass, TCD_METODO__NOMBRE);
		createEAttribute(tcdMetodoEClass, TCD_METODO__MODIFICADOR_ACCESO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__TIPO_RETORNO);
		createEAttribute(tcdMetodoEClass, TCD_METODO__SEMANTICA);

		tcdRelacionEClass = createEClass(TCD_RELACION);
		createEReference(tcdRelacionEClass, TCD_RELACION__SOURCE);
		createEReference(tcdRelacionEClass, TCD_RELACION__TARGET);

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

		tcdAgregacionEClass = createEClass(TCD_AGREGACION);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NOMBRE_DESTINO);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_ORIGEN);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__MULTIPLICIDAD_DESTINO);
		createEAttribute(tcdAgregacionEClass, TCD_AGREGACION__NAVEGAVILIDAD);

		tcdParametroEClass = createEClass(TCD_PARAMETRO);
		createEAttribute(tcdParametroEClass, TCD_PARAMETRO__NOMBRE);
		createEAttribute(tcdParametroEClass, TCD_PARAMETRO__TIPO_DATO);

		// Create enums
		visibilidadEEnum = createEEnum(VISIBILIDAD);
		tipoDatoEEnum = createEEnum(TIPO_DATO);
		multiplicidadEEnum = createEEnum(MULTIPLICIDAD);
		tipoRetornoEEnum = createEEnum(TIPO_RETORNO);
		navegavilidadEEnum = createEEnum(NAVEGAVILIDAD);
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
		tcdAsociacionEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdComposicionEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdDependenciaEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdHerenciaEClass.getESuperTypes().add(this.getTCDRelacion());
		tcdAgregacionEClass.getESuperTypes().add(this.getTCDRelacion());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaPaquetes(), this.getTCDPaquete(), null, "listaPaquetes", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaTodasClases(), this.getTCDClase(), null, "listaTodasClases", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_ListaTodosPaquetes(), this.getTCDPaquete(), null, "listaTodosPaquetes", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdPaqueteEClass, TCDPaquete.class, "TCDPaquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDPaquete_ListaClases(), this.getTCDClase(), null, "listaClases", null, 0, -1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDPaquete_Listapaquetes(), this.getTCDPaquete(), null, "listapaquetes", null, 0, -1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDPaquete_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDPaquete_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, TCDPaquete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdClaseEClass, TCDClase.class, "TCDClase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDClase_ListaAtributos(), this.getTCDAtributo(), null, "listaAtributos", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDClase_ListaMetodos(), this.getTCDMetodo(), null, "listaMetodos", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDClase_ListaRelaciones(), this.getTCDRelacion(), null, "listaRelaciones", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDClase_Identificadores(), this.getTCDClass_identifier(), null, "identificadores", null, 0, -1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Estereotipo(), ecorePackage.getEString(), "estereotipo", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Documentacion(), ecorePackage.getEString(), "documentacion", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDClase_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, TCDClase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdAtributoEClass, TCDAtributo.class, "TCDAtributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_Visibilidad(), this.getVisibilidad(), "visibilidad", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_ValorDefecto(), ecorePackage.getEString(), "valorDefecto", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAtributo_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, TCDAtributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdClass_identifierEClass, TCDClass_identifier.class, "TCDClass_identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDClass_identifier_Identificador(), this.getTCDAtributo(), null, "identificador", null, 0, 1, TCDClass_identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdMetodoEClass, TCDMetodo.class, "TCDMetodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDMetodo_ListaParametros(), ecorePackage.getEString(), "listaParametros", null, 0, -1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_ModificadorAcceso(), this.getVisibilidad(), "modificadorAcceso", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_TipoRetorno(), this.getTipoRetorno(), "tipoRetorno", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDMetodo_Semantica(), ecorePackage.getEString(), "semantica", null, 0, 1, TCDMetodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdRelacionEClass, TCDRelacion.class, "TCDRelacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCDRelacion_Source(), this.getTCDClase(), null, "source", null, 0, 1, TCDRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCDRelacion_Target(), this.getTCDClase(), null, "target", null, 0, 1, TCDRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(tcdAgregacionEClass, TCDAgregacion.class, "TCDAgregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDAgregacion_NombreOrigen(), ecorePackage.getEString(), "nombreOrigen", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_NombreDestino(), ecorePackage.getEString(), "nombreDestino", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_MultiplicidadOrigen(), this.getMultiplicidad(), "multiplicidadOrigen", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_MultiplicidadDestino(), this.getMultiplicidad(), "multiplicidadDestino", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDAgregacion_Navegavilidad(), this.getNavegavilidad(), "navegavilidad", null, 0, 1, TCDAgregacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcdParametroEClass, TCDParametro.class, "TCDParametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCDParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, TCDParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCDParametro_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, TCDParametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilidadEEnum, Visibilidad.class, "Visibilidad");
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PUBLIC);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PRIVATE);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.PROTECTED);
		addEEnumLiteral(visibilidadEEnum, Visibilidad.READONLY);

		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.STRING);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.NUMBER);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);

		initEEnum(multiplicidadEEnum, Multiplicidad.class, "Multiplicidad");
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._1);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._01);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._0N);
		addEEnumLiteral(multiplicidadEEnum, Multiplicidad._1N);

		initEEnum(tipoRetornoEEnum, TipoRetorno.class, "TipoRetorno");
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.UNDEFINED);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.STRING);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.NUMBER);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.BOOLEAN);
		addEEnumLiteral(tipoRetornoEEnum, TipoRetorno.VOID);

		initEEnum(navegavilidadEEnum, Navegavilidad.class, "Navegavilidad");
		addEEnumLiteral(navegavilidadEEnum, Navegavilidad.BIDIRECCIONAL);
		addEEnumLiteral(navegavilidadEEnum, Navegavilidad.UNIDIRECCIONAL);
		addEEnumLiteral(navegavilidadEEnum, Navegavilidad.NONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
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
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (tcdClass_identifierEClass, 
		   source, 
		   new String[] {
		   });
	}

} //AbstractaPackageImpl
