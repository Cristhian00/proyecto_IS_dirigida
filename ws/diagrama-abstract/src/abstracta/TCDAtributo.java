/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link abstracta.TCDAtributo#isIsUnique <em>Is Unique</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDAtributo()
 * @model
 * @generated
 */
public interface TCDAtributo extends EObject {
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
	 * @see abstracta.AbstractaPackage#getTCDAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getNombre <em>Nombre</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getTCDAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see abstracta.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #setVisibilidad(Visibilidad)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_Visibilidad()
	 * @model
	 * @generated
	 */
	Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see abstracta.Visibilidad
	 * @see #getVisibilidad()
	 * @generated
	 */
	void setVisibilidad(Visibilidad value);

	/**
	 * Returns the value of the '<em><b>Valor Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Defecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Defecto</em>' attribute.
	 * @see #setValorDefecto(String)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Defecto</em>' attribute.
	 * @see #getValorDefecto()
	 * @generated
	 */
	void setValorDefecto(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see abstracta.AbstractaPackage#getTCDAtributo_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link abstracta.TCDAtributo#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

} // TCDAtributo
