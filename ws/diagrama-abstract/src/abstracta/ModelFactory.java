/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaTodasClases <em>Lista Todas Clases</em>}</li>
 *   <li>{@link abstracta.ModelFactory#getListaTodosPaquetes <em>Lista Todos Paquetes</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
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
	 * @see abstracta.AbstractaPackage#getModelFactory_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getNombre <em>Nombre</em>}' attribute.
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
	 * @see abstracta.AbstractaPackage#getModelFactory_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactory#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.TCDPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDPaquete> getListaPaquetes();

	/**
	 * Returns the value of the '<em><b>Lista Todas Clases</b></em>' reference list.
	 * The list contents are of type {@link abstracta.TCDClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Todas Clases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Todas Clases</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaTodasClases()
	 * @model
	 * @generated
	 */
	EList<TCDClase> getListaTodasClases();

	/**
	 * Returns the value of the '<em><b>Lista Todos Paquetes</b></em>' reference list.
	 * The list contents are of type {@link abstracta.TCDPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Todos Paquetes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Todos Paquetes</em>' reference list.
	 * @see abstracta.AbstractaPackage#getModelFactory_ListaTodosPaquetes()
	 * @model
	 * @generated
	 */
	EList<TCDPaquete> getListaTodosPaquetes();

} // ModelFactory
