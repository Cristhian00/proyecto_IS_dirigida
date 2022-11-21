/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDPaquete#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link abstracta.TCDPaquete#getListapaquetes <em>Listapaquetes</em>}</li>
 *   <li>{@link abstracta.TCDPaquete#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.TCDPaquete#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDPaquete()
 * @model
 * @generated
 */
public interface TCDPaquete extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TCDClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getTCDPaquete_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDClase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Listapaquetes</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TCDPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listapaquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listapaquetes</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getTCDPaquete_Listapaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDPaquete> getListapaquetes();

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
	 * @see abstracta.AbstractaPackage#getTCDPaquete_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.TCDPaquete#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see abstracta.AbstractaPackage#getTCDPaquete_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.TCDPaquete#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

} // TCDPaquete
