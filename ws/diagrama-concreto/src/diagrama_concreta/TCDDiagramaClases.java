/**
 */
package diagrama_concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TCDDiagramaClases#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link diagrama_concreta.TCDDiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link diagrama_concreta.TCDDiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link diagrama_concreta.TCDDiagramaClases#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDDiagramaClases()
 * @model
 * @generated
 */
public interface TCDDiagramaClases extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TCDClase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDDiagramaClases_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDClase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TCDRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDDiagramaClases_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDRelacion> getListaRelaciones();

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TCDPaquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDDiagramaClases_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDPaquete> getListaPaquetes();

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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDDiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // TCDDiagramaClases
