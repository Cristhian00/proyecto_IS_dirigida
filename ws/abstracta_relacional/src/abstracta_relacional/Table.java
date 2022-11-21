/**
 */
package abstracta_relacional;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.Table#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link abstracta_relacional.Table#getListRelations <em>List Relations</em>}</li>
 *   <li>{@link abstracta_relacional.Table#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link abstracta_relacional.Table#getListTriggers <em>List Triggers</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta_relacional.PrimaryKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference list.
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimaryKey> getPrimaryKey();

	/**
	 * Returns the value of the '<em><b>List Relations</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta_relacional.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Relations</em>' containment reference list.
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable_ListRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getListRelations();

	/**
	 * Returns the value of the '<em><b>List Columns</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta_relacional.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Columns</em>' containment reference list.
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable_ListColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getListColumns();

	/**
	 * Returns the value of the '<em><b>List Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta_relacional.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Triggers</em>' containment reference list.
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTable_ListTriggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getListTriggers();

} // Table
