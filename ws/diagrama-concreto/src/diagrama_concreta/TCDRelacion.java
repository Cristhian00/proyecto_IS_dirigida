/**
 */
package diagrama_concreta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TCDRelacion#getSource <em>Source</em>}</li>
 *   <li>{@link diagrama_concreta.TCDRelacion#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDRelacion()
 * @model abstract="true"
 * @generated
 */
public interface TCDRelacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TCDClase)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDRelacion_Source()
	 * @model
	 * @generated
	 */
	TCDClase getSource();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDRelacion#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TCDClase value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TCDClase)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDRelacion_Target()
	 * @model
	 * @generated
	 */
	TCDClase getTarget();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDRelacion#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TCDClase value);

} // TCDRelacion
