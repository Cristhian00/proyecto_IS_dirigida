/**
 */
package abstracta_relacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.PrimaryKey#getColumna <em>Columna</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Columna</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columna</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columna</em>' reference.
	 * @see #setColumna(Column)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getPrimaryKey_Columna()
	 * @model
	 * @generated
	 */
	Column getColumna();

	/**
	 * Sets the value of the '{@link abstracta_relacional.PrimaryKey#getColumna <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columna</em>' reference.
	 * @see #getColumna()
	 * @generated
	 */
	void setColumna(Column value);

} // PrimaryKey
