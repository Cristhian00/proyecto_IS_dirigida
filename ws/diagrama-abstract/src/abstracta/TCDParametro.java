/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDParametro#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.TCDParametro#getTipoDato <em>Tipo Dato</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDParametro()
 * @model
 * @generated
 */
public interface TCDParametro extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see abstracta.AbstractaPackage#getTCDParametro_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.TCDParametro#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see abstracta.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see abstracta.AbstractaPackage#getTCDParametro_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link abstracta.TCDParametro#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see abstracta.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

} // TCDParametro
