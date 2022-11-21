/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Class identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDClass_identifier#getIdentificador <em>Identificador</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDClass_identifier()
 * @model
 * @generated
 */
public interface TCDClass_identifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identificador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identificador</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identificador</em>' reference.
	 * @see #setIdentificador(TCDAtributo)
	 * @see abstracta.AbstractaPackage#getTCDClass_identifier_Identificador()
	 * @model
	 * @generated
	 */
	TCDAtributo getIdentificador();

	/**
	 * Sets the value of the '{@link abstracta.TCDClass_identifier#getIdentificador <em>Identificador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identificador</em>' reference.
	 * @see #getIdentificador()
	 * @generated
	 */
	void setIdentificador(TCDAtributo value);

} // TCDClass_identifier
