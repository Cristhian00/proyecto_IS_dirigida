/**
 */
package diagrama_concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TCDClase#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#getListaMetodos <em>Lista Metodos</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link diagrama_concreta.TCDClase#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase()
 * @model annotation="gmf.node label='nombre' color='227,255,248'"
 * @generated
 */
public interface TCDClase extends EObject {
	/**
	 * Returns the value of the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TCDAtributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Atributos</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_ListaAtributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDAtributo> getListaAtributos();

	/**
	 * Returns the value of the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link diagrama_concreta.TCDMetodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Metodos</em>' containment reference list.
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_ListaMetodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCDMetodo> getListaMetodos();

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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDClase#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Estereotipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estereotipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estereotipo</em>' attribute.
	 * @see #setEstereotipo(String)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_Estereotipo()
	 * @model
	 * @generated
	 */
	String getEstereotipo();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDClase#getEstereotipo <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estereotipo</em>' attribute.
	 * @see #getEstereotipo()
	 * @generated
	 */
	void setEstereotipo(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDClase#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Documentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentacion</em>' attribute.
	 * @see #setDocumentacion(String)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_Documentacion()
	 * @model
	 * @generated
	 */
	String getDocumentacion();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDClase#getDocumentacion <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentacion</em>' attribute.
	 * @see #getDocumentacion()
	 * @generated
	 */
	void setDocumentacion(String value);

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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDClase_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDClase#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

} // TCDClase
