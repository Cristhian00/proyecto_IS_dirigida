/**
 */
package abstracta_relacional;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.Relation#getNameSource <em>Name Source</em>}</li>
 *   <li>{@link abstracta_relacional.Relation#getNameTarget <em>Name Target</em>}</li>
 *   <li>{@link abstracta_relacional.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}</li>
 *   <li>{@link abstracta_relacional.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}</li>
 *   <li>{@link abstracta_relacional.Relation#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link abstracta_relacional.Relation#getTableTarget <em>Table Target</em>}</li>
 * </ul>
 *
 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation()
 * @model annotation="gmf.node label='nameTarget'"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Source</em>' attribute.
	 * @see #setNameSource(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_NameSource()
	 * @model
	 * @generated
	 */
	String getNameSource();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getNameSource <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Source</em>' attribute.
	 * @see #getNameSource()
	 * @generated
	 */
	void setNameSource(String value);

	/**
	 * Returns the value of the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Target</em>' attribute.
	 * @see #setNameTarget(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_NameTarget()
	 * @model
	 * @generated
	 */
	String getNameTarget();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getNameTarget <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Target</em>' attribute.
	 * @see #getNameTarget()
	 * @generated
	 */
	void setNameTarget(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Source</em>' attribute.
	 * @see #setMultiplicidadSource(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_MultiplicidadSource()
	 * @model
	 * @generated
	 */
	String getMultiplicidadSource();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getMultiplicidadSource <em>Multiplicidad Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Source</em>' attribute.
	 * @see #getMultiplicidadSource()
	 * @generated
	 */
	void setMultiplicidadSource(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Target</em>' attribute.
	 * @see #setMultiplicidadTarget(String)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_MultiplicidadTarget()
	 * @model
	 * @generated
	 */
	String getMultiplicidadTarget();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getMultiplicidadTarget <em>Multiplicidad Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Target</em>' attribute.
	 * @see #getMultiplicidadTarget()
	 * @generated
	 */
	void setMultiplicidadTarget(String value);

	/**
	 * Returns the value of the '<em><b>Table Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Source</em>' reference.
	 * @see #setTableSource(Table)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_TableSource()
	 * @model
	 * @generated
	 */
	Table getTableSource();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getTableSource <em>Table Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Source</em>' reference.
	 * @see #getTableSource()
	 * @generated
	 */
	void setTableSource(Table value);

	/**
	 * Returns the value of the '<em><b>Table Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Target</em>' reference.
	 * @see #setTableTarget(Table)
	 * @see abstracta_relacional.Abstracta_relacionalPackage#getRelation_TableTarget()
	 * @model
	 * @generated
	 */
	Table getTableTarget();

	/**
	 * Sets the value of the '{@link abstracta_relacional.Relation#getTableTarget <em>Table Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Target</em>' reference.
	 * @see #getTableTarget()
	 * @generated
	 */
	void setTableTarget(Table value);

} // Relation
