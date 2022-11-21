/**
 */
package abstracta_relacional.impl;

import abstracta_relacional.Abstracta_relacionalPackage;
import abstracta_relacional.Relation;
import abstracta_relacional.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getNameSource <em>Name Source</em>}</li>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getNameTarget <em>Name Target</em>}</li>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getMultiplicidadSource <em>Multiplicidad Source</em>}</li>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getMultiplicidadTarget <em>Multiplicidad Target</em>}</li>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link abstracta_relacional.impl.RelationImpl#getTableTarget <em>Table Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends EObjectImpl implements Relation {
	/**
	 * The default value of the '{@link #getNameSource() <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSource()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSource() <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSource()
	 * @generated
	 * @ordered
	 */
	protected String nameSource = NAME_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameTarget() <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTarget() <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTarget()
	 * @generated
	 * @ordered
	 */
	protected String nameTarget = NAME_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadSource() <em>Multiplicidad Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadSource()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadSource() <em>Multiplicidad Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadSource()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadSource = MULTIPLICIDAD_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadTarget() <em>Multiplicidad Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadTarget() <em>Multiplicidad Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadTarget()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadTarget = MULTIPLICIDAD_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableSource() <em>Table Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSource()
	 * @generated
	 * @ordered
	 */
	protected Table tableSource;

	/**
	 * The cached value of the '{@link #getTableTarget() <em>Table Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableTarget()
	 * @generated
	 * @ordered
	 */
	protected Table tableTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstracta_relacionalPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSource() {
		return nameSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSource(String newNameSource) {
		String oldNameSource = nameSource;
		nameSource = newNameSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__NAME_SOURCE, oldNameSource, nameSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTarget() {
		return nameTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTarget(String newNameTarget) {
		String oldNameTarget = nameTarget;
		nameTarget = newNameTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__NAME_TARGET, oldNameTarget, nameTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadSource() {
		return multiplicidadSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadSource(String newMultiplicidadSource) {
		String oldMultiplicidadSource = multiplicidadSource;
		multiplicidadSource = newMultiplicidadSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_SOURCE, oldMultiplicidadSource, multiplicidadSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadTarget() {
		return multiplicidadTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadTarget(String newMultiplicidadTarget) {
		String oldMultiplicidadTarget = multiplicidadTarget;
		multiplicidadTarget = newMultiplicidadTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_TARGET, oldMultiplicidadTarget, multiplicidadTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableSource() {
		if (tableSource != null && tableSource.eIsProxy()) {
			InternalEObject oldTableSource = (InternalEObject)tableSource;
			tableSource = (Table)eResolveProxy(oldTableSource);
			if (tableSource != oldTableSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Abstracta_relacionalPackage.RELATION__TABLE_SOURCE, oldTableSource, tableSource));
			}
		}
		return tableSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableSource() {
		return tableSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableSource(Table newTableSource) {
		Table oldTableSource = tableSource;
		tableSource = newTableSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__TABLE_SOURCE, oldTableSource, tableSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableTarget() {
		if (tableTarget != null && tableTarget.eIsProxy()) {
			InternalEObject oldTableTarget = (InternalEObject)tableTarget;
			tableTarget = (Table)eResolveProxy(oldTableTarget);
			if (tableTarget != oldTableTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Abstracta_relacionalPackage.RELATION__TABLE_TARGET, oldTableTarget, tableTarget));
			}
		}
		return tableTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTableTarget() {
		return tableTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableTarget(Table newTableTarget) {
		Table oldTableTarget = tableTarget;
		tableTarget = newTableTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.RELATION__TABLE_TARGET, oldTableTarget, tableTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Abstracta_relacionalPackage.RELATION__NAME_SOURCE:
				return getNameSource();
			case Abstracta_relacionalPackage.RELATION__NAME_TARGET:
				return getNameTarget();
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_SOURCE:
				return getMultiplicidadSource();
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_TARGET:
				return getMultiplicidadTarget();
			case Abstracta_relacionalPackage.RELATION__TABLE_SOURCE:
				if (resolve) return getTableSource();
				return basicGetTableSource();
			case Abstracta_relacionalPackage.RELATION__TABLE_TARGET:
				if (resolve) return getTableTarget();
				return basicGetTableTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Abstracta_relacionalPackage.RELATION__NAME_SOURCE:
				setNameSource((String)newValue);
				return;
			case Abstracta_relacionalPackage.RELATION__NAME_TARGET:
				setNameTarget((String)newValue);
				return;
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_SOURCE:
				setMultiplicidadSource((String)newValue);
				return;
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_TARGET:
				setMultiplicidadTarget((String)newValue);
				return;
			case Abstracta_relacionalPackage.RELATION__TABLE_SOURCE:
				setTableSource((Table)newValue);
				return;
			case Abstracta_relacionalPackage.RELATION__TABLE_TARGET:
				setTableTarget((Table)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Abstracta_relacionalPackage.RELATION__NAME_SOURCE:
				setNameSource(NAME_SOURCE_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.RELATION__NAME_TARGET:
				setNameTarget(NAME_TARGET_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_SOURCE:
				setMultiplicidadSource(MULTIPLICIDAD_SOURCE_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_TARGET:
				setMultiplicidadTarget(MULTIPLICIDAD_TARGET_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.RELATION__TABLE_SOURCE:
				setTableSource((Table)null);
				return;
			case Abstracta_relacionalPackage.RELATION__TABLE_TARGET:
				setTableTarget((Table)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Abstracta_relacionalPackage.RELATION__NAME_SOURCE:
				return NAME_SOURCE_EDEFAULT == null ? nameSource != null : !NAME_SOURCE_EDEFAULT.equals(nameSource);
			case Abstracta_relacionalPackage.RELATION__NAME_TARGET:
				return NAME_TARGET_EDEFAULT == null ? nameTarget != null : !NAME_TARGET_EDEFAULT.equals(nameTarget);
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_SOURCE:
				return MULTIPLICIDAD_SOURCE_EDEFAULT == null ? multiplicidadSource != null : !MULTIPLICIDAD_SOURCE_EDEFAULT.equals(multiplicidadSource);
			case Abstracta_relacionalPackage.RELATION__MULTIPLICIDAD_TARGET:
				return MULTIPLICIDAD_TARGET_EDEFAULT == null ? multiplicidadTarget != null : !MULTIPLICIDAD_TARGET_EDEFAULT.equals(multiplicidadTarget);
			case Abstracta_relacionalPackage.RELATION__TABLE_SOURCE:
				return tableSource != null;
			case Abstracta_relacionalPackage.RELATION__TABLE_TARGET:
				return tableTarget != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameSource: ");
		result.append(nameSource);
		result.append(", nameTarget: ");
		result.append(nameTarget);
		result.append(", multiplicidadSource: ");
		result.append(multiplicidadSource);
		result.append(", multiplicidadTarget: ");
		result.append(multiplicidadTarget);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
