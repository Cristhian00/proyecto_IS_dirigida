/**
 */
package abstracta_relacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.Column#getType <em>Type</em>}</li>
 *   <li>{@link abstracta_relacional.Column#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.Column#isIs_not_null <em>Is not null</em>}</li>
 *   <li>{@link abstracta_relacional.Column#isAuto_increment <em>Auto increment</em>}</li>
 *   <li>{@link abstracta_relacional.Column#getData_default <em>Data default</em>}</li>
 *   <li>{@link abstracta_relacional.Column#isIs_unique <em>Is unique</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta_relacional.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see abstracta_relacional.Type
	 * @see #setType(Type)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see abstracta_relacional.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is not null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is not null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is not null</em>' attribute.
	 * @see #setIs_not_null(boolean)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Is_not_null()
	 * @model
	 * @generated
	 */
	boolean isIs_not_null();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#isIs_not_null <em>Is not null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is not null</em>' attribute.
	 * @see #isIs_not_null()
	 * @generated
	 */
	void setIs_not_null(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto increment</em>' attribute.
	 * @see #setAuto_increment(boolean)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Auto_increment()
	 * @model
	 * @generated
	 */
	boolean isAuto_increment();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#isAuto_increment <em>Auto increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto increment</em>' attribute.
	 * @see #isAuto_increment()
	 * @generated
	 */
	void setAuto_increment(boolean value);

	/**
	 * Returns the value of the '<em><b>Data default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data default</em>' attribute.
	 * @see #setData_default(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Data_default()
	 * @model
	 * @generated
	 */
	String getData_default();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#getData_default <em>Data default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data default</em>' attribute.
	 * @see #getData_default()
	 * @generated
	 */
	void setData_default(String value);

	/**
	 * Returns the value of the '<em><b>Is unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is unique</em>' attribute.
	 * @see #setIs_unique(boolean)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getColumn_Is_unique()
	 * @model
	 * @generated
	 */
	boolean isIs_unique();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Column#isIs_unique <em>Is unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is unique</em>' attribute.
	 * @see #isIs_unique()
	 * @generated
	 */
	void setIs_unique(boolean value);

} // Column
