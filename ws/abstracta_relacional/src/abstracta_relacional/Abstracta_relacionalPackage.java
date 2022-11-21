/**
 */
package abstracta_relacional;

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
 * @see abstracta_relacional.Abstracta_relacionalFactory
 * @model kind="package"
 * @generated
 */
public interface Abstracta_relacionalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta_relacional";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://abstracta_relacional";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta_relacional";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Abstracta_relacionalPackage eINSTANCE = abstracta_relacional.impl.Abstracta_relacionalPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.ModelFactoryImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_SCHEMA = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.SchemaImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__USER = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>List Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LIST_TABLES = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.TableImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PRIMARY_KEY = 1;

	/**
	 * The feature id for the '<em><b>List Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>List Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_COLUMNS = 3;

	/**
	 * The feature id for the '<em><b>List Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LIST_TRIGGERS = 4;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.ColumnImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is not null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NOT_NULL = 2;

	/**
	 * The feature id for the '<em><b>Auto increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__AUTO_INCREMENT = 3;

	/**
	 * The feature id for the '<em><b>Data default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Is unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_UNIQUE = 5;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.RelationImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICIDAD_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Table Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TABLE_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Table Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TABLE_TARGET = 5;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.TriggerImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Moment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MOMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracta_relacional.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.impl.PrimaryKeyImpl
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMNA = 0;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta_relacional.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta_relacional.Type
	 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;


	/**
	 * Returns the meta object for class '{@link abstracta_relacional.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see abstracta_relacional.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.ModelFactory#getLstSchema <em>Lst Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Schema</em>'.
	 * @see abstracta_relacional.ModelFactory#getLstSchema()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstSchema();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see abstracta_relacional.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta_relacional.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Schema#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see abstracta_relacional.Schema#getUser()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_User();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Schema#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see abstracta_relacional.Schema#getPassword()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.Schema#getListTables <em>List Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Tables</em>'.
	 * @see abstracta_relacional.Schema#getListTables()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ListTables();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see abstracta_relacional.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta_relacional.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.Table#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key</em>'.
	 * @see abstracta_relacional.Table#getPrimaryKey()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_PrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.Table#getListRelations <em>List Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Relations</em>'.
	 * @see abstracta_relacional.Table#getListRelations()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.Table#getListColumns <em>List Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Columns</em>'.
	 * @see abstracta_relacional.Table#getListColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListColumns();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta_relacional.Table#getListTriggers <em>List Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Triggers</em>'.
	 * @see abstracta_relacional.Table#getListTriggers()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ListTriggers();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see abstracta_relacional.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstracta_relacional.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta_relacional.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#isIs_not_null <em>Is not null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is not null</em>'.
	 * @see abstracta_relacional.Column#isIs_not_null()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Is_not_null();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#isAuto_increment <em>Auto increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto increment</em>'.
	 * @see abstracta_relacional.Column#isAuto_increment()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Auto_increment();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#getData_default <em>Data default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data default</em>'.
	 * @see abstracta_relacional.Column#getData_default()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Data_default();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Column#isIs_unique <em>Is unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is unique</em>'.
	 * @see abstracta_relacional.Column#isIs_unique()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Is_unique();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see abstracta_relacional.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Relation#getNameSource <em>Name Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Source</em>'.
	 * @see abstracta_relacional.Relation#getNameSource()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NameSource();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Relation#getNameTarget <em>Name Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Target</em>'.
	 * @see abstracta_relacional.Relation#getNameTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_NameTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Source</em>'.
	 * @see abstracta_relacional.Relation#getMultiplicidadSource()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadSource();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad Target</em>'.
	 * @see abstracta_relacional.Relation#getMultiplicidadTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_MultiplicidadTarget();

	/**
	 * Returns the meta object for the reference '{@link abstracta_relacional.Relation#getTableSource <em>Table Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Source</em>'.
	 * @see abstracta_relacional.Relation#getTableSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TableSource();

	/**
	 * Returns the meta object for the reference '{@link abstracta_relacional.Relation#getTableTarget <em>Table Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Target</em>'.
	 * @see abstracta_relacional.Relation#getTableTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_TableTarget();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see abstracta_relacional.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracta_relacional.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Trigger#getMomentType <em>Moment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moment Type</em>'.
	 * @see abstracta_relacional.Trigger#getMomentType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_MomentType();

	/**
	 * Returns the meta object for the attribute '{@link abstracta_relacional.Trigger#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see abstracta_relacional.Trigger#getActionType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ActionType();

	/**
	 * Returns the meta object for class '{@link abstracta_relacional.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see abstracta_relacional.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link abstracta_relacional.PrimaryKey#getColumna <em>Columna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Columna</em>'.
	 * @see abstracta_relacional.PrimaryKey#getColumna()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Columna();

	/**
	 * Returns the meta object for enum '{@link abstracta_relacional.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see abstracta_relacional.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Abstracta_relacionalFactory getAbstracta_relacionalFactory();

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
		 * The meta object literal for the '{@link abstracta_relacional.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.ModelFactoryImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_SCHEMA = eINSTANCE.getModelFactory_LstSchema();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.SchemaImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__USER = eINSTANCE.getSchema_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__PASSWORD = eINSTANCE.getSchema_Password();

		/**
		 * The meta object literal for the '<em><b>List Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LIST_TABLES = eINSTANCE.getSchema_ListTables();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.TableImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>List Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_RELATIONS = eINSTANCE.getTable_ListRelations();

		/**
		 * The meta object literal for the '<em><b>List Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_COLUMNS = eINSTANCE.getTable_ListColumns();

		/**
		 * The meta object literal for the '<em><b>List Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LIST_TRIGGERS = eINSTANCE.getTable_ListTriggers();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.ColumnImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Is not null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NOT_NULL = eINSTANCE.getColumn_Is_not_null();

		/**
		 * The meta object literal for the '<em><b>Auto increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__AUTO_INCREMENT = eINSTANCE.getColumn_Auto_increment();

		/**
		 * The meta object literal for the '<em><b>Data default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATA_DEFAULT = eINSTANCE.getColumn_Data_default();

		/**
		 * The meta object literal for the '<em><b>Is unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_UNIQUE = eINSTANCE.getColumn_Is_unique();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.RelationImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME_SOURCE = eINSTANCE.getRelation_NameSource();

		/**
		 * The meta object literal for the '<em><b>Name Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME_TARGET = eINSTANCE.getRelation_NameTarget();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_SOURCE = eINSTANCE.getRelation_MultiplicidadSource();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__MULTIPLICIDAD_TARGET = eINSTANCE.getRelation_MultiplicidadTarget();

		/**
		 * The meta object literal for the '<em><b>Table Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TABLE_SOURCE = eINSTANCE.getRelation_TableSource();

		/**
		 * The meta object literal for the '<em><b>Table Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TABLE_TARGET = eINSTANCE.getRelation_TableTarget();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.TriggerImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Moment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__MOMENT_TYPE = eINSTANCE.getTrigger_MomentType();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION_TYPE = eINSTANCE.getTrigger_ActionType();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.impl.PrimaryKeyImpl
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Columna</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__COLUMNA = eINSTANCE.getPrimaryKey_Columna();

		/**
		 * The meta object literal for the '{@link abstracta_relacional.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta_relacional.Type
		 * @see abstracta_relacional.impl.Abstracta_relacionalPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //Abstracta_relacionalPackage
