/**
 */
package diagrama_concreta;

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
 * @see diagrama_concreta.Diagrama_concretaFactory
 * @model kind="package"
 * @generated
 */
public interface Diagrama_concretaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagrama_concreta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "diagrama_concreta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagrama_concreta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Diagrama_concretaPackage eINSTANCE = diagrama_concreta.impl.Diagrama_concretaPackageImpl.init();

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDDiagramaClasesImpl <em>TCD Diagrama Clases</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDDiagramaClasesImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDDiagramaClases()
	 * @generated
	 */
	int TCD_DIAGRAMA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__LISTA_CLASES = 0;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__LISTA_RELACIONES = 1;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__LISTA_PAQUETES = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES__NOMBRE = 3;

	/**
	 * The number of structural features of the '<em>TCD Diagrama Clases</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_DIAGRAMA_CLASES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.ModelFactoryImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 1;

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
	 * The feature id for the '<em><b>Lista Diagramas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LISTA_DIAGRAMAS = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDPaqueteImpl <em>TCD Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDPaqueteImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDPaquete()
	 * @generated
	 */
	int TCD_PAQUETE = 2;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__LISTA_PAQUETES = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE__RUTA = 2;

	/**
	 * The number of structural features of the '<em>TCD Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_PAQUETE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDClaseImpl <em>TCD Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDClaseImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDClase()
	 * @generated
	 */
	int TCD_CLASE = 3;

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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__NOMBRE = 2;

	/**
	 * The feature id for the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__ESTEREOTIPO = 3;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__IS_ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__DOCUMENTACION = 5;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE__RUTA = 6;

	/**
	 * The number of structural features of the '<em>TCD Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_CLASE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDRelacionImpl <em>TCD Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDRelacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDRelacion()
	 * @generated
	 */
	int TCD_RELACION = 4;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDAgregacionImpl <em>TCD Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDAgregacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAgregacion()
	 * @generated
	 */
	int TCD_AGREGACION = 5;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDAsociacionImpl <em>TCD Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDAsociacionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAsociacion()
	 * @generated
	 */
	int TCD_ASOCIACION = 6;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDComposicionImpl <em>TCD Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDComposicionImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDComposicion()
	 * @generated
	 */
	int TCD_COMPOSICION = 7;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDDependenciaImpl <em>TCD Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDDependenciaImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDDependencia()
	 * @generated
	 */
	int TCD_DEPENDENCIA = 8;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDHerenciaImpl <em>TCD Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDHerenciaImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDHerencia()
	 * @generated
	 */
	int TCD_HERENCIA = 9;

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
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDAtributoImpl <em>TCD Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDAtributoImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAtributo()
	 * @generated
	 */
	int TCD_ATRIBUTO = 10;

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
	 * The feature id for the '<em><b>Identificadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO__IDENTIFICADORES = 4;

	/**
	 * The number of structural features of the '<em>TCD Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCD_ATRIBUTO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.class_identifierImpl <em>class identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.class_identifierImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getclass_identifier()
	 * @generated
	 */
	int CLASS_IDENTIFIER = 11;

	/**
	 * The feature id for the '<em><b>Identificador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IDENTIFIER__IDENTIFICADOR = 0;

	/**
	 * The number of structural features of the '<em>class identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link diagrama_concreta.impl.TCDMetodoImpl <em>TCD Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.impl.TCDMetodoImpl
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDMetodo()
	 * @generated
	 */
	int TCD_METODO = 12;

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
	 * The meta object id for the '{@link diagrama_concreta.Navegavilidad <em>Navegavilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.Navegavilidad
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getNavegavilidad()
	 * @generated
	 */
	int NAVEGAVILIDAD = 13;

	/**
	 * The meta object id for the '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.Multiplicidad
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getMultiplicidad()
	 * @generated
	 */
	int MULTIPLICIDAD = 14;

	/**
	 * The meta object id for the '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.TipoDato
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 15;

	/**
	 * The meta object id for the '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.Visibilidad
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getVisibilidad()
	 * @generated
	 */
	int VISIBILIDAD = 16;

	/**
	 * The meta object id for the '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see diagrama_concreta.TipoRetorno
	 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoRetorno()
	 * @generated
	 */
	int TIPO_RETORNO = 17;


	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDDiagramaClases <em>TCD Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Diagrama Clases</em>'.
	 * @see diagrama_concreta.TCDDiagramaClases
	 * @generated
	 */
	EClass getTCDDiagramaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDDiagramaClases#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see diagrama_concreta.TCDDiagramaClases#getListaClases()
	 * @see #getTCDDiagramaClases()
	 * @generated
	 */
	EReference getTCDDiagramaClases_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see diagrama_concreta.TCDDiagramaClases#getListaRelaciones()
	 * @see #getTCDDiagramaClases()
	 * @generated
	 */
	EReference getTCDDiagramaClases_ListaRelaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see diagrama_concreta.TCDDiagramaClases#getListaPaquetes()
	 * @see #getTCDDiagramaClases()
	 * @generated
	 */
	EReference getTCDDiagramaClases_ListaPaquetes();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDiagramaClases#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TCDDiagramaClases#getNombre()
	 * @see #getTCDDiagramaClases()
	 * @generated
	 */
	EAttribute getTCDDiagramaClases_Nombre();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see diagrama_concreta.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagrama_concreta.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.ModelFactory#getListaDiagramas <em>Lista Diagramas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Diagramas</em>'.
	 * @see diagrama_concreta.ModelFactory#getListaDiagramas()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_ListaDiagramas();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDPaquete <em>TCD Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Paquete</em>'.
	 * @see diagrama_concreta.TCDPaquete
	 * @generated
	 */
	EClass getTCDPaquete();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDPaquete#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see diagrama_concreta.TCDPaquete#getListaPaquetes()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EReference getTCDPaquete_ListaPaquetes();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDPaquete#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TCDPaquete#getNombre()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EAttribute getTCDPaquete_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDPaquete#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagrama_concreta.TCDPaquete#getRuta()
	 * @see #getTCDPaquete()
	 * @generated
	 */
	EAttribute getTCDPaquete_Ruta();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDClase <em>TCD Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Clase</em>'.
	 * @see diagrama_concreta.TCDClase
	 * @generated
	 */
	EClass getTCDClase();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDClase#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see diagrama_concreta.TCDClase#getListaAtributos()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_ListaAtributos();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDClase#getListaMetodos <em>Lista Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Metodos</em>'.
	 * @see diagrama_concreta.TCDClase#getListaMetodos()
	 * @see #getTCDClase()
	 * @generated
	 */
	EReference getTCDClase_ListaMetodos();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDClase#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TCDClase#getNombre()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDClase#getEstereotipo <em>Estereotipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estereotipo</em>'.
	 * @see diagrama_concreta.TCDClase#getEstereotipo()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Estereotipo();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDClase#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see diagrama_concreta.TCDClase#isIsAbstract()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDClase#getDocumentacion <em>Documentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentacion</em>'.
	 * @see diagrama_concreta.TCDClase#getDocumentacion()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Documentacion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDClase#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see diagrama_concreta.TCDClase#getRuta()
	 * @see #getTCDClase()
	 * @generated
	 */
	EAttribute getTCDClase_Ruta();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDRelacion <em>TCD Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Relacion</em>'.
	 * @see diagrama_concreta.TCDRelacion
	 * @generated
	 */
	EClass getTCDRelacion();

	/**
	 * Returns the meta object for the reference '{@link diagrama_concreta.TCDRelacion#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see diagrama_concreta.TCDRelacion#getSource()
	 * @see #getTCDRelacion()
	 * @generated
	 */
	EReference getTCDRelacion_Source();

	/**
	 * Returns the meta object for the reference '{@link diagrama_concreta.TCDRelacion#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see diagrama_concreta.TCDRelacion#getTarget()
	 * @see #getTCDRelacion()
	 * @generated
	 */
	EReference getTCDRelacion_Target();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDAgregacion <em>TCD Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Agregacion</em>'.
	 * @see diagrama_concreta.TCDAgregacion
	 * @generated
	 */
	EClass getTCDAgregacion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAgregacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TCDAgregacion#getNombreOrigen()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAgregacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TCDAgregacion#getNombreDestino()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAgregacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TCDAgregacion#getMultiplicidadOrigen()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAgregacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TCDAgregacion#getMultiplicidadDestino()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAgregacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.TCDAgregacion#getNavegavilidad()
	 * @see #getTCDAgregacion()
	 * @generated
	 */
	EAttribute getTCDAgregacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDAsociacion <em>TCD Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Asociacion</em>'.
	 * @see diagrama_concreta.TCDAsociacion
	 * @generated
	 */
	EClass getTCDAsociacion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAsociacion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TCDAsociacion#getNombreOrigen()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAsociacion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TCDAsociacion#getNombreDestino()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAsociacion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TCDAsociacion#getMultiplicidadOrigen()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAsociacion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TCDAsociacion#getMultiplicidadDestino()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAsociacion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.TCDAsociacion#getNavegavilidad()
	 * @see #getTCDAsociacion()
	 * @generated
	 */
	EAttribute getTCDAsociacion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDComposicion <em>TCD Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Composicion</em>'.
	 * @see diagrama_concreta.TCDComposicion
	 * @generated
	 */
	EClass getTCDComposicion();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TCDComposicion#getNombreOrigen()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TCDComposicion#getNombreDestino()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TCDComposicion#getMultiplicidadOrigen()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TCDComposicion#getMultiplicidadDestino()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.TCDComposicion#getNavegavilidad()
	 * @see #getTCDComposicion()
	 * @generated
	 */
	EAttribute getTCDComposicion_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDDependencia <em>TCD Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Dependencia</em>'.
	 * @see diagrama_concreta.TCDDependencia
	 * @generated
	 */
	EClass getTCDDependencia();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDependencia#getNombreOrigen <em>Nombre Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Origen</em>'.
	 * @see diagrama_concreta.TCDDependencia#getNombreOrigen()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_NombreOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDependencia#getNombreDestino <em>Nombre Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Destino</em>'.
	 * @see diagrama_concreta.TCDDependencia#getNombreDestino()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_NombreDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDependencia#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Origen</em>'.
	 * @see diagrama_concreta.TCDDependencia#getMultiplicidadOrigen()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_MultiplicidadOrigen();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDependencia#getMultiplicidadDestino <em>Multiplicidad Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Destino</em>'.
	 * @see diagrama_concreta.TCDDependencia#getMultiplicidadDestino()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_MultiplicidadDestino();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDDependencia#getNavegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.TCDDependencia#getNavegavilidad()
	 * @see #getTCDDependencia()
	 * @generated
	 */
	EAttribute getTCDDependencia_Navegavilidad();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDHerencia <em>TCD Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Herencia</em>'.
	 * @see diagrama_concreta.TCDHerencia
	 * @generated
	 */
	EClass getTCDHerencia();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDAtributo <em>TCD Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Atributo</em>'.
	 * @see diagrama_concreta.TCDAtributo
	 * @generated
	 */
	EClass getTCDAtributo();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAtributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TCDAtributo#getNombre()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see diagrama_concreta.TCDAtributo#getTipoDato()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibilidad</em>'.
	 * @see diagrama_concreta.TCDAtributo#getVisibilidad()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_Visibilidad();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Defecto</em>'.
	 * @see diagrama_concreta.TCDAtributo#getValorDefecto()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EAttribute getTCDAtributo_ValorDefecto();

	/**
	 * Returns the meta object for the containment reference list '{@link diagrama_concreta.TCDAtributo#getIdentificadores <em>Identificadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identificadores</em>'.
	 * @see diagrama_concreta.TCDAtributo#getIdentificadores()
	 * @see #getTCDAtributo()
	 * @generated
	 */
	EReference getTCDAtributo_Identificadores();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.class_identifier <em>class identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>class identifier</em>'.
	 * @see diagrama_concreta.class_identifier
	 * @generated
	 */
	EClass getclass_identifier();

	/**
	 * Returns the meta object for the reference '{@link diagrama_concreta.class_identifier#getIdentificador <em>Identificador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identificador</em>'.
	 * @see diagrama_concreta.class_identifier#getIdentificador()
	 * @see #getclass_identifier()
	 * @generated
	 */
	EReference getclass_identifier_Identificador();

	/**
	 * Returns the meta object for class '{@link diagrama_concreta.TCDMetodo <em>TCD Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCD Metodo</em>'.
	 * @see diagrama_concreta.TCDMetodo
	 * @generated
	 */
	EClass getTCDMetodo();

	/**
	 * Returns the meta object for the attribute list '{@link diagrama_concreta.TCDMetodo#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lista Parametros</em>'.
	 * @see diagrama_concreta.TCDMetodo#getListaParametros()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_ListaParametros();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDMetodo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see diagrama_concreta.TCDMetodo#getNombre()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDMetodo#getModificadorAcceso <em>Modificador Acceso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modificador Acceso</em>'.
	 * @see diagrama_concreta.TCDMetodo#getModificadorAcceso()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_ModificadorAcceso();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDMetodo#getTipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
	 * @see diagrama_concreta.TCDMetodo#getTipoRetorno()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_TipoRetorno();

	/**
	 * Returns the meta object for the attribute '{@link diagrama_concreta.TCDMetodo#getSemantica <em>Semantica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantica</em>'.
	 * @see diagrama_concreta.TCDMetodo#getSemantica()
	 * @see #getTCDMetodo()
	 * @generated
	 */
	EAttribute getTCDMetodo_Semantica();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.Navegavilidad <em>Navegavilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Navegavilidad</em>'.
	 * @see diagrama_concreta.Navegavilidad
	 * @generated
	 */
	EEnum getNavegavilidad();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicidad</em>'.
	 * @see diagrama_concreta.Multiplicidad
	 * @generated
	 */
	EEnum getMultiplicidad();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see diagrama_concreta.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibilidad</em>'.
	 * @see diagrama_concreta.Visibilidad
	 * @generated
	 */
	EEnum getVisibilidad();

	/**
	 * Returns the meta object for enum '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Retorno</em>'.
	 * @see diagrama_concreta.TipoRetorno
	 * @generated
	 */
	EEnum getTipoRetorno();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Diagrama_concretaFactory getDiagrama_concretaFactory();

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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDDiagramaClasesImpl <em>TCD Diagrama Clases</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDDiagramaClasesImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDDiagramaClases()
		 * @generated
		 */
		EClass TCD_DIAGRAMA_CLASES = eINSTANCE.getTCDDiagramaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_DIAGRAMA_CLASES__LISTA_CLASES = eINSTANCE.getTCDDiagramaClases_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_DIAGRAMA_CLASES__LISTA_RELACIONES = eINSTANCE.getTCDDiagramaClases_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_DIAGRAMA_CLASES__LISTA_PAQUETES = eINSTANCE.getTCDDiagramaClases_ListaPaquetes();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCD_DIAGRAMA_CLASES__NOMBRE = eINSTANCE.getTCDDiagramaClases_Nombre();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.ModelFactoryImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getModelFactory()
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
		 * The meta object literal for the '<em><b>Lista Diagramas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LISTA_DIAGRAMAS = eINSTANCE.getModelFactory_ListaDiagramas();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDPaqueteImpl <em>TCD Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDPaqueteImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDPaquete()
		 * @generated
		 */
		EClass TCD_PAQUETE = eINSTANCE.getTCDPaquete();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_PAQUETE__LISTA_PAQUETES = eINSTANCE.getTCDPaquete_ListaPaquetes();

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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDClaseImpl <em>TCD Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDClaseImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDClase()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDRelacionImpl <em>TCD Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDRelacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDRelacion()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDAgregacionImpl <em>TCD Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDAgregacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAgregacion()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDAsociacionImpl <em>TCD Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDAsociacionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAsociacion()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDComposicionImpl <em>TCD Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDComposicionImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDComposicion()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDDependenciaImpl <em>TCD Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDDependenciaImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDDependencia()
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
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDHerenciaImpl <em>TCD Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDHerenciaImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDHerencia()
		 * @generated
		 */
		EClass TCD_HERENCIA = eINSTANCE.getTCDHerencia();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDAtributoImpl <em>TCD Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDAtributoImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDAtributo()
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
		 * The meta object literal for the '<em><b>Identificadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCD_ATRIBUTO__IDENTIFICADORES = eINSTANCE.getTCDAtributo_Identificadores();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.class_identifierImpl <em>class identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.class_identifierImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getclass_identifier()
		 * @generated
		 */
		EClass CLASS_IDENTIFIER = eINSTANCE.getclass_identifier();

		/**
		 * The meta object literal for the '<em><b>Identificador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_IDENTIFIER__IDENTIFICADOR = eINSTANCE.getclass_identifier_Identificador();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.impl.TCDMetodoImpl <em>TCD Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.impl.TCDMetodoImpl
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTCDMetodo()
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
		 * The meta object literal for the '{@link diagrama_concreta.Navegavilidad <em>Navegavilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.Navegavilidad
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getNavegavilidad()
		 * @generated
		 */
		EEnum NAVEGAVILIDAD = eINSTANCE.getNavegavilidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.Multiplicidad <em>Multiplicidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.Multiplicidad
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getMultiplicidad()
		 * @generated
		 */
		EEnum MULTIPLICIDAD = eINSTANCE.getMultiplicidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.TipoDato
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.Visibilidad <em>Visibilidad</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.Visibilidad
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getVisibilidad()
		 * @generated
		 */
		EEnum VISIBILIDAD = eINSTANCE.getVisibilidad();

		/**
		 * The meta object literal for the '{@link diagrama_concreta.TipoRetorno <em>Tipo Retorno</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see diagrama_concreta.TipoRetorno
		 * @see diagrama_concreta.impl.Diagrama_concretaPackageImpl#getTipoRetorno()
		 * @generated
		 */
		EEnum TIPO_RETORNO = eINSTANCE.getTipoRetorno();

	}

} //Diagrama_concretaPackage
