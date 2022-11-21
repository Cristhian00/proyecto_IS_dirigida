/**
 */
package abstracta_relacional;

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
 *   <li>{@link abstracta_relacional.ModelFactory#getLstSchema <em>Lst Schema</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Lst Schema</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta_relacional.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Schema</em>' containment reference list.
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getModelFactory_LstSchema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getLstSchema();

} // ModelFactory
