/**
 */
package abstracta_relacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.Trigger#getMomentType <em>Moment Type</em>}</li>
 *   <li>{@link abstracta_relacional.Trigger#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getTrigger()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Trigger extends EObject {
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
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTrigger_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Trigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Moment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Type</em>' attribute.
	 * @see #setMomentType(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTrigger_MomentType()
	 * @model
	 * @generated
	 */
	String getMomentType();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Trigger#getMomentType <em>Moment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Type</em>' attribute.
	 * @see #getMomentType()
	 * @generated
	 */
	void setMomentType(String value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see #setActionType(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getTrigger_ActionType()
	 * @model
	 * @generated
	 */
	String getActionType();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Trigger#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(String value);

} // Trigger
