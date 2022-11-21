/**
 */
package diagrama_concreta;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link diagrama_concreta.TCDAtributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link diagrama_concreta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagrama_concreta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link diagrama_concreta.TCDAtributo#getIdentificadores <em>Identificadores</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo()
 * @model annotation="gmf.node label='nombre, tipoDato' color='215,255,242' label.pattern='{0}: {1}' size='150,16' border='null'"
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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDAtributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see diagrama_concreta.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDAtributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see diagrama_concreta.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.Visibilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilidad</em>' attribute.
	 * @see diagrama_concreta.Visibilidad
	 * @see #setVisibilidad(Visibilidad)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo_Visibilidad()
	 * @model
	 * @generated
	 */
	Visibilidad getVisibilidad();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDAtributo#getVisibilidad <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilidad</em>' attribute.
	 * @see diagrama_concreta.Visibilidad
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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo_ValorDefecto()
	 * @model
	 * @generated
	 */
	String getValorDefecto();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDAtributo#getValorDefecto <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Defecto</em>' attribute.
	 * @see #getValorDefecto()
	 * @generated
	 */
	void setValorDefecto(String value);

	/**
	 * Returns the value of the '<em><b>Identificadores</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.class_identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identificadores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identificadores</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDAtributo_Identificadores()
	 * @model containment="true"
	 * @generated
	 */
	EList<class_identifier> getIdentificadores();

} // TCDAtributo
