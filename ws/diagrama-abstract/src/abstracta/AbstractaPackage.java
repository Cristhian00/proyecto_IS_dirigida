/**
 */
package abstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_PAQUETES = 2;

	/**
	 * The feature id for the '<em><b>Lista Todas Clases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_TODAS_CLASES = 3;

	/**
	 * The feature id for the '<em><b>Lista Todos Paquetes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_TODOS_PAQUETES = 4;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDPaqueteImpl <em>TCD Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDPaqueteImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDPaquete()
	 * @generated
	 */
	int TCD_PAQUETE = 1;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Listapaquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTAPAQUETES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__RUTA = 3;

	/**
	 * The number of structural features of the '<em>TCD Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDClaseImpl <em>TCD Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDClaseImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDClase()
	 * @generated
	 */
	int TCD_CLASE = 2;

	/**
	 * The feature id for the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_METODOS = 1;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__LISTA_RELACIONES = 2;

	/**
	 * The feature id for the '<em><b>Identificadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__IDENTIFICADORES = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__NOMBRE = 4;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__ESTEREOTIPO = 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__IS_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__DOCUMENTACION = 7;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__RUTA = 8;

	/**
	 * The number of structural features of the '<em>TCD Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDAtributoImpl <em>TCD Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDAtributoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDAtributo()
	 * @generated
	 */
	int TCD_ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__TIPO_DATO = 1;

	/**
	 * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__VISIBILIDAD = 2;

	/**
	 * The feature id for the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__VALOR_DEFECTO = 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__IS_UNIQUE = 4;

	/**
	 * The number of structural features of the '<em>TCD Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDClass_identifierImpl <em>TCD Class identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDClass_identifierImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDClass_identifier()
	 * @generated
	 */
	int TCD_CLASS_IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Identificador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASS_IDENTIFIER__IDENTIFICADOR = 0;

	/**
	 * The number of structural features of the '<em>TCD Class identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASS_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDMetodoImpl <em>TCD Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDMetodoImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDMetodo()
	 * @generated
	 */
	int TCD_METODO = 5;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__LISTA_PARAMETROS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Modificador Acceso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__MODIFICADOR_ACCESO = 2;

	/**
	 * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__TIPO_RETORNO = 3;

	/**
	 * The feature id for the '<em><b>Semantica</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO__SEMANTICA = 4;

	/**
	 * The number of structural features of the '<em>TCD Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_METODO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDRelacionImpl <em>TCD Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDRelacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDRelacion()
	 * @generated
	 */
	int TCD_RELACION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>TCD Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_RELACION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDAsociacionImpl <em>TCD Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDAsociacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDAsociacion()
	 * @generated
	 */
	int TCD_ASOCIACION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION__NAVEGAVILIDAD = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCD Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ASOCIACION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDComposicionImpl <em>TCD Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDComposicionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDComposicion()
	 * @generated
	 */
	int TCD_COMPOSICION = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION__NAVEGAVILIDAD = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCD Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_COMPOSICION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDDependenciaImpl <em>TCD Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDDependenciaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDDependencia()
	 * @generated
	 */
	int TCD_DEPENDENCIA = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA__NAVEGAVILIDAD = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCD Dependencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DEPENDENCIA_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDHerenciaImpl <em>TCD Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDHerenciaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDHerencia()
	 * @generated
	 */
	int TCD_HERENCIA = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA__TARGET = TCD_RELACION__TARGET;

	/**
	 * The number of structural features of the '<em>TCD Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_HERENCIA_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDAgregacionImpl <em>TCD Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDAgregacionImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDAgregacion()
	 * @generated
	 */
	int TCD_AGREGACION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__SOURCE = TCD_RELACION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__TARGET = TCD_RELACION__TARGET;

	/**
	 * The feature id for the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NOMBRE_ORIGEN = TCD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NOMBRE_DESTINO = TCD_RELACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__MULTIPLICIDAD_ORIGEN = TCD_RELACION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__MULTIPLICIDAD_DESTINO = TCD_RELACION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navegavilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION__NAVEGAVILIDAD = TCD_RELACION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCD Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_AGREGACION_FEATURE_COUNT = TCD_RELACION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.TCDParametroImpl <em>TCD Parametro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.TCDParametroImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getTCDParametro()
	 * @generated
	 */
	int TCD_PARAMETRO = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO__TIPO_DATO = 1;

	/**
	 * The number of structural features of the '<em>TCD Parametro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PARAMETRO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.Visibilidad
	 * @see abstracta.impl.AbstractaPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 13;

	/**
	 * The meta object id for the '{@link abstracta.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.TipoDato
	 * @see abstracta.impl.AbstractaPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 14;

	/**
	 * The meta object id for the '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.Multiplicidad
	 * @see abstracta.impl.AbstractaPackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 15;

	/**
	 * The meta object id for the '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.TipoRetorno
	 * @see abstracta.impl.AbstractaPackageImpl#getTipoRetorno()
	 * @generated
	 */
	int TIPO_RETORNO = 16;

	/**
	 * The meta object id for the '{@link abstracta.Navegavilidad <em>Navegavilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.Navegavilidad
	 * @see abstracta.impl.AbstractaPackageImpl#getNavegavilidad()
	 * @generated
	 */
	int NAVEGAVILIDAD = 17;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see abstracta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactory#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see abstracta.ModelFactory#getListaPaquetes()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaPaquetes();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaTodasClases <em>Lista Todas Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Todas Clases</em>'.
	 * @see abstracta.ModelFactory#getListaTodasClases()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaTodasClases();

	/**
	 * Returns the meta object for the reference list '{@link abstracta.ModelFactory#getListaTodosPaquetes <em>Lista Todos Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lista Todos Paquetes</em>'.
	 * @see abstracta.ModelFactory#getListaTodosPaquetes()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaTodosPaquetes();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDPaquete <em>TCD Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Paquete</em>'.
	 * @see abstracta.TCDPaquete
	 * @generated
	 */
	EClass getTCDPaquete();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDPaquete#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see abstracta.TCDPaquete#getListaClases()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EReference getTCDPaquete_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDPaquete#getListapaquetes <em>Listapaquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listapaquetes</em>'.
	 * @see abstracta.TCDPaquete#getListapaquetes()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EReference getTCDPaquete_Listapaquetes();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TCDPaquete#getNombre()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EAttribute getTCDPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.TCDPaquete#getRuta()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EAttribute getTCDPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDClase <em>TCD Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Clase</em>'.
	 * @see abstracta.TCDClase
	 * @generated
	 */
	EClass getTCDClase();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDClase#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see abstracta.TCDClase#getListaAtributos()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_ListaAtributos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDClase#getListaMetodos <em>Lista Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Metodos</em>'.
	 * @see abstracta.TCDClase#getListaMetodos()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_ListaMetodos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDClase#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see abstracta.TCDClase#getListaRelaciones()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_ListaRelaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.TCDClase#getIdentificadores <em>Identificadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identificadores</em>'.
	 * @see abstracta.TCDClase#getIdentificadores()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_Identificadores();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TCDClase#getNombre()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see abstracta.TCDClase#getEstereotipo()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDClase#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see abstracta.TCDClase#isIsAbstract()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDClase#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentacion</em>'.
	 * @see abstracta.TCDClase#getDocumentacion()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Documentacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDClase#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.TCDClase#getRuta()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Ruta();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDAtributo <em>TCD Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Atributo</em>'.
	 * @see abstracta.TCDAtributo
	 * @generated
	 */
	EClass getTCDAtributo();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TCDAtributo#getNombre()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see abstracta.TCDAtributo#getTipoDato()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see abstracta.TCDAtributo#getVisibilidad()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Defecto</em>'.
	 * @see abstracta.TCDAtributo#getValorDefecto()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_ValorDefecto();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAtributo#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see abstracta.TCDAtributo#isIsUnique()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_IsUnique();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDClass_identifier <em>TCD Class identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Class identifier</em>'.
	 * @see abstracta.TCDClass_identifier
	 * @generated
	 */
	EClass getTCDClass_identifier();

	/**
	 * Returns the meta object for the reference '{@link abstracta.TCDClass_identifier#getIdentificador <em>Identificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identificador</em>'.
	 * @see abstracta.TCDClass_identifier#getIdentificador()
	 * @see #getTCDClass_identifier()
	 * @generated
	 */
	EReference getTCDClass_identifier_Identificador();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDMetodo <em>TCD Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Metodo</em>'.
	 * @see abstracta.TCDMetodo
	 * @generated
	 */
	EClass getTCDMetodo();

	/**
	 * Returns the meta object for the attribute list '{@link abstracta.TCDMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lista Parametros</em>'.
	 * @see abstracta.TCDMetodo#getListaParametros()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_ListaParametros();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TCDMetodo#getNombre()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see abstracta.TCDMetodo#getModificadorAcceso()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see abstracta.TCDMetodo#getTipoRetorno()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDMetodo#getSemantica <em>Semantica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantica</em>'.
	 * @see abstracta.TCDMetodo#getSemantica()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_Semantica();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDRelacion <em>TCD Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Relacion</em>'.
	 * @see abstracta.TCDRelacion
	 * @generated
	 */
	EClass getTCDRelacion();

	/**
	 * Returns the meta object for the reference '{@link abstracta.TCDRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.TCDRelacion#getSource()
	 * @see #getTCDRelacion()
	 * @generated
	 */
	EReference getTCDRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.TCDRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.TCDRelacion#getTarget()
	 * @see #getTCDRelacion()
	 * @generated
	 */
	EReference getTCDRelacion_Target();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDAsociacion <em>TCD Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Asociacion</em>'.
	 * @see abstracta.TCDAsociacion
	 * @generated
	 */
	EClass getTCDAsociacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAsociacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TCDAsociacion#getNombreOrigen()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAsociacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TCDAsociacion#getNombreDestino()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAsociacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TCDAsociacion#getMultiplicidadOrigen()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAsociacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TCDAsociacion#getMultiplicidadDestino()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAsociacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see abstracta.TCDAsociacion#getNavegavilidad()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDComposicion <em>TCD Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Composicion</em>'.
	 * @see abstracta.TCDComposicion
	 * @generated
	 */
	EClass getTCDComposicion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TCDComposicion#getNombreOrigen()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TCDComposicion#getNombreDestino()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TCDComposicion#getMultiplicidadOrigen()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TCDComposicion#getMultiplicidadDestino()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see abstracta.TCDComposicion#getNavegavilidad()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDDependencia <em>TCD Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Dependencia</em>'.
	 * @see abstracta.TCDDependencia
	 * @generated
	 */
	EClass getTCDDependencia();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDDependencia#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TCDDependencia#getNombreOrigen()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDDependencia#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TCDDependencia#getNombreDestino()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDDependencia#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TCDDependencia#getMultiplicidadOrigen()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDDependencia#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TCDDependencia#getMultiplicidadDestino()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDDependencia#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see abstracta.TCDDependencia#getNavegavilidad()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDHerencia <em>TCD Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Herencia</em>'.
	 * @see abstracta.TCDHerencia
	 * @generated
	 */
	EClass getTCDHerencia();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDAgregacion <em>TCD Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Agregacion</em>'.
	 * @see abstracta.TCDAgregacion
	 * @generated
	 */
	EClass getTCDAgregacion();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAgregacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see abstracta.TCDAgregacion#getNombreOrigen()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAgregacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see abstracta.TCDAgregacion#getNombreDestino()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAgregacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see abstracta.TCDAgregacion#getMultiplicidadOrigen()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAgregacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see abstracta.TCDAgregacion#getMultiplicidadDestino()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDAgregacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see abstracta.TCDAgregacion#getNavegavilidad()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link abstracta.TCDParametro <em>TCD Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Parametro</em>'.
	 * @see abstracta.TCDParametro
	 * @generated
	 */
	EClass getTCDParametro();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDParametro#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.TCDParametro#getNombre()
	 * @see #getTCDParametro()
	 * @generated
	 */
	EAttribute getTCDParametro_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.TCDParametro#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see abstracta.TCDParametro#getTipoDato()
	 * @see #getTCDParametro()
	 * @generated
	 */
	EAttribute getTCDParametro_TipoDato();

	/**
	 * Returns the meta object for enum '{@link abstracta.Visibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibilidad</em>'.
	 * @see abstracta.Visibilidad
	 * @generated
	 */
	EEnum getVisibilidad();

	/**
	 * Returns the meta object for enum '{@link abstracta.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see abstracta.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see abstracta.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the meta object for enum '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorno</em>'.
	 * @see abstracta.TipoRetorno
	 * @generated
	 */
	EEnum getTipoRetorno();

	/**
	 * Returns the meta object for enum '{@link abstracta.Navegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Navegavilidad</em>'.
	 * @see abstracta.Navegavilidad
	 * @generated
	 */
	EEnum getNavegavilidad();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_PAQUETES = eINSTANCE.getModelFactory_ListaPaquetes();

		/**
		 * The meta object literal for the '<em><b>Lista Todas Clases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_TODAS_CLASES = eINSTANCE.getModelFactory_ListaTodasClases();

		/**
		 * The meta object literal for the '<em><b>Lista Todos Paquetes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_TODOS_PAQUETES = eINSTANCE.getModelFactory_ListaTodosPaquetes();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDPaqueteImpl <em>TCD Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDPaqueteImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDPaquete()
		 * @generated
		 */
		EClass TCD_PAQUETE = eINSTANCE.getTCDPaquete();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTA_CLASES = eINSTANCE.getTCDPaquete_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Listapaquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTAPAQUETES = eINSTANCE.getTCDPaquete_Listapaquetes();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PAQUETE__NOMBRE = eINSTANCE.getTCDPaquete_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PAQUETE__RUTA = eINSTANCE.getTCDPaquete_Ruta();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDClaseImpl <em>TCD Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDClaseImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDClase()
		 * @generated
		 */
		EClass TCD_CLASE = eINSTANCE.getTCDClase();

		/**
		 * The meta object literal for the '<em><b>Lista Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_ATRIBUTOS = eINSTANCE.getTCDClase_ListaAtributos();

		/**
		 * The meta object literal for the '<em><b>Lista Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_METODOS = eINSTANCE.getTCDClase_ListaMetodos();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__LISTA_RELACIONES = eINSTANCE.getTCDClase_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Identificadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASE__IDENTIFICADORES = eINSTANCE.getTCDClase_Identificadores();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__NOMBRE = eINSTANCE.getTCDClase_Nombre();

		/**
		 * The meta object literal for the '<em><b>Estereotipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__ESTEREOTIPO = eINSTANCE.getTCDClase_Estereotipo();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__IS_ABSTRACT = eINSTANCE.getTCDClase_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Documentacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__DOCUMENTACION = eINSTANCE.getTCDClase_Documentacion();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_CLASE__RUTA = eINSTANCE.getTCDClase_Ruta();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDAtributoImpl <em>TCD Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDAtributoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDAtributo()
		 * @generated
		 */
		EClass TCD_ATRIBUTO = eINSTANCE.getTCDAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__NOMBRE = eINSTANCE.getTCDAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__TIPO_DATO = eINSTANCE.getTCDAtributo_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__VISIBILIDAD = eINSTANCE.getTCDAtributo_Visibilidad();

		/**
		 * The meta object literal for the '<em><b>Valor Defecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__VALOR_DEFECTO = eINSTANCE.getTCDAtributo_ValorDefecto();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ATRIBUTO__IS_UNIQUE = eINSTANCE.getTCDAtributo_IsUnique();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDClass_identifierImpl <em>TCD Class identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDClass_identifierImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDClass_identifier()
		 * @generated
		 */
		EClass TCD_CLASS_IDENTIFIER = eINSTANCE.getTCDClass_identifier();

		/**
		 * The meta object literal for the '<em><b>Identificador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_CLASS_IDENTIFIER__IDENTIFICADOR = eINSTANCE.getTCDClass_identifier_Identificador();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDMetodoImpl <em>TCD Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDMetodoImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDMetodo()
		 * @generated
		 */
		EClass TCD_METODO = eINSTANCE.getTCDMetodo();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__LISTA_PARAMETROS = eINSTANCE.getTCDMetodo_ListaParametros();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__NOMBRE = eINSTANCE.getTCDMetodo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Modificador Acceso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__MODIFICADOR_ACCESO = eINSTANCE.getTCDMetodo_ModificadorAcceso();

		/**
		 * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__TIPO_RETORNO = eINSTANCE.getTCDMetodo_TipoRetorno();

		/**
		 * The meta object literal for the '<em><b>Semantica</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_METODO__SEMANTICA = eINSTANCE.getTCDMetodo_Semantica();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDRelacionImpl <em>TCD Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDRelacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDRelacion()
		 * @generated
		 */
		EClass TCD_RELACION = eINSTANCE.getTCDRelacion();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_RELACION__SOURCE = eINSTANCE.getTCDRelacion_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_RELACION__TARGET = eINSTANCE.getTCDRelacion_Target();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDAsociacionImpl <em>TCD Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDAsociacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDAsociacion()
		 * @generated
		 */
		EClass TCD_ASOCIACION = eINSTANCE.getTCDAsociacion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__NOMBRE_ORIGEN = eINSTANCE.getTCDAsociacion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__NOMBRE_DESTINO = eINSTANCE.getTCDAsociacion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTCDAsociacion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTCDAsociacion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '<em><b>Navegavilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_ASOCIACION__NAVEGAVILIDAD = eINSTANCE.getTCDAsociacion_Navegavilidad();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDComposicionImpl <em>TCD Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDComposicionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDComposicion()
		 * @generated
		 */
		EClass TCD_COMPOSICION = eINSTANCE.getTCDComposicion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__NOMBRE_ORIGEN = eINSTANCE.getTCDComposicion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__NOMBRE_DESTINO = eINSTANCE.getTCDComposicion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTCDComposicion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTCDComposicion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '<em><b>Navegavilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_COMPOSICION__NAVEGAVILIDAD = eINSTANCE.getTCDComposicion_Navegavilidad();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDDependenciaImpl <em>TCD Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDDependenciaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDDependencia()
		 * @generated
		 */
		EClass TCD_DEPENDENCIA = eINSTANCE.getTCDDependencia();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__NOMBRE_ORIGEN = eINSTANCE.getTCDDependencia_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__NOMBRE_DESTINO = eINSTANCE.getTCDDependencia_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTCDDependencia_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__MULTIPLICIDAD_DESTINO = eINSTANCE.getTCDDependencia_MultiplicidadDestino();

		/**
		 * The meta object literal for the '<em><b>Navegavilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DEPENDENCIA__NAVEGAVILIDAD = eINSTANCE.getTCDDependencia_Navegavilidad();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDHerenciaImpl <em>TCD Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDHerenciaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDHerencia()
		 * @generated
		 */
		EClass TCD_HERENCIA = eINSTANCE.getTCDHerencia();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDAgregacionImpl <em>TCD Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDAgregacionImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDAgregacion()
		 * @generated
		 */
		EClass TCD_AGREGACION = eINSTANCE.getTCDAgregacion();

		/**
		 * The meta object literal for the '<em><b>Nombre Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__NOMBRE_ORIGEN = eINSTANCE.getTCDAgregacion_NombreOrigen();

		/**
		 * The meta object literal for the '<em><b>Nombre Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__NOMBRE_DESTINO = eINSTANCE.getTCDAgregacion_NombreDestino();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__MULTIPLICIDAD_ORIGEN = eINSTANCE.getTCDAgregacion_MultiplicidadOrigen();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Destino</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__MULTIPLICIDAD_DESTINO = eINSTANCE.getTCDAgregacion_MultiplicidadDestino();

		/**
		 * The meta object literal for the '<em><b>Navegavilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_AGREGACION__NAVEGAVILIDAD = eINSTANCE.getTCDAgregacion_Navegavilidad();

		/**
		 * The meta object literal for the '{@link abstracta.impl.TCDParametroImpl <em>TCD Parametro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.TCDParametroImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getTCDParametro()
		 * @generated
		 */
		EClass TCD_PARAMETRO = eINSTANCE.getTCDParametro();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PARAMETRO__NOMBRE = eINSTANCE.getTCDParametro_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_PARAMETRO__TIPO_DATO = eINSTANCE.getTCDParametro_TipoDato();

		/**
		 * The meta object literal for the '{@link abstracta.Visibilidad <em>Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.Visibilidad
		 * @see abstracta.impl.AbstractaPackageImpl#getVisibilidad()
		 * @generated
		 */
		EEnum VISIBILIDAD = eINSTANCE.getVisibilidad();

		/**
		 * The meta object literal for the '{@link abstracta.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.TipoDato
		 * @see abstracta.impl.AbstractaPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link abstracta.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.Multiplicidad
		 * @see abstracta.impl.AbstractaPackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

		/**
		 * The meta object literal for the '{@link abstracta.TipoRetorno <em>Tipo Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.TipoRetorno
		 * @see abstracta.impl.AbstractaPackageImpl#getTipoRetorno()
		 * @generated
		 */
		EEnum TIPO_RETORNO = eINSTANCE.getTipoRetorno();

		/**
		 * The meta object literal for the '{@link abstracta.Navegavilidad <em>Navegavilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.Navegavilidad
		 * @see abstracta.impl.AbstractaPackageImpl#getNavegavilidad()
		 * @generated
		 */
		EEnum NAVEGAVILIDAD = eINSTANCE.getNavegavilidad();

	}

} //AbstractaPackage
