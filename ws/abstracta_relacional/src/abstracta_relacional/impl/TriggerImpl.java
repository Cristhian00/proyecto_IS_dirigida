/**
 */
package abstracta_relacional.impl;

import abstracta_relacional.Abstracta_relacionalPackage;
import abstracta_relacional.Trigger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TriggerImpl#getMomentType <em>Moment Type</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TriggerImpl#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends EObjectImpl implements Trigger {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentType() <em>Moment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentType()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentType() <em>Moment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentType()
	 * @generated
	 * @ordered
	 */
	protected String momentType = MOMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected String actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstracta_relacionalPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentType() {
		return momentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentType(String newMomentType) {
		String oldMomentType = momentType;
		momentType = newMomentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.TRIGGER__MOMENT_TYPE, oldMomentType, momentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionType(String newActionType) {
		String oldActionType = actionType;
		actionType = newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.TRIGGER__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Abstracta_relacionalPackage.TRIGGER__NAME:
				return getName();
			case Abstracta_relacionalPackage.TRIGGER__MOMENT_TYPE:
				return getMomentType();
			case Abstracta_relacionalPackage.TRIGGER__ACTION_TYPE:
				return getActionType();
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
			case Abstracta_relacionalPackage.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case Abstracta_relacionalPackage.TRIGGER__MOMENT_TYPE:
				setMomentType((String)newValue);
				return;
			case Abstracta_relacionalPackage.TRIGGER__ACTION_TYPE:
				setActionType((String)newValue);
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
			case Abstracta_relacionalPackage.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.TRIGGER__MOMENT_TYPE:
				setMomentType(MOMENT_TYPE_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.TRIGGER__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
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
			case Abstracta_relacionalPackage.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Abstracta_relacionalPackage.TRIGGER__MOMENT_TYPE:
				return MOMENT_TYPE_EDEFAULT == null ? momentType != null : !MOMENT_TYPE_EDEFAULT.equals(momentType);
			case Abstracta_relacionalPackage.TRIGGER__ACTION_TYPE:
				return ACTION_TYPE_EDEFAULT == null ? actionType != null : !ACTION_TYPE_EDEFAULT.equals(actionType);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", momentType: ");
		result.append(momentType);
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
