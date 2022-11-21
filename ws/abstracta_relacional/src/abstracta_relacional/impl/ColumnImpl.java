/**
 */
package abstracta_relacional.impl;

import abstracta_relacional.Abstracta_relacionalPackage;
import abstracta_relacional.Column;
import abstracta_relacional.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#isIs_not_null <em>Is not null</em>}</li>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#isAuto_increment <em>Auto increment</em>}</li>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#getData_default <em>Data default</em>}</li>
 *   <li>{@link abstracta_relacional.impl.ColumnImpl#isIs_unique <em>Is unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.VARCHAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIs_not_null() <em>Is not null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_not_null()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_not_null() <em>Is not null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_not_null()
	 * @generated
	 * @ordered
	 */
	protected boolean is_not_null = IS_NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuto_increment() <em>Auto increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto_increment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_INCREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuto_increment() <em>Auto increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto_increment()
	 * @generated
	 * @ordered
	 */
	protected boolean auto_increment = AUTO_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_default() <em>Data default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_default()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_default() <em>Data default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_default()
	 * @generated
	 * @ordered
	 */
	protected String data_default = DATA_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_unique() <em>Is unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_unique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_unique() <em>Is unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_unique()
	 * @generated
	 * @ordered
	 */
	protected boolean is_unique = IS_UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstracta_relacionalPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_not_null() {
		return is_not_null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_not_null(boolean newIs_not_null) {
		boolean oldIs_not_null = is_not_null;
		is_not_null = newIs_not_null;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__IS_NOT_NULL, oldIs_not_null, is_not_null));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuto_increment() {
		return auto_increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuto_increment(boolean newAuto_increment) {
		boolean oldAuto_increment = auto_increment;
		auto_increment = newAuto_increment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__AUTO_INCREMENT, oldAuto_increment, auto_increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData_default() {
		return data_default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_default(String newData_default) {
		String oldData_default = data_default;
		data_default = newData_default;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__DATA_DEFAULT, oldData_default, data_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_unique() {
		return is_unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_unique(boolean newIs_unique) {
		boolean oldIs_unique = is_unique;
		is_unique = newIs_unique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.COLUMN__IS_UNIQUE, oldIs_unique, is_unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Abstracta_relacionalPackage.COLUMN__TYPE:
				return getType();
			case Abstracta_relacionalPackage.COLUMN__NAME:
				return getName();
			case Abstracta_relacionalPackage.COLUMN__IS_NOT_NULL:
				return isIs_not_null();
			case Abstracta_relacionalPackage.COLUMN__AUTO_INCREMENT:
				return isAuto_increment();
			case Abstracta_relacionalPackage.COLUMN__DATA_DEFAULT:
				return getData_default();
			case Abstracta_relacionalPackage.COLUMN__IS_UNIQUE:
				return isIs_unique();
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
			case Abstracta_relacionalPackage.COLUMN__TYPE:
				setType((Type)newValue);
				return;
			case Abstracta_relacionalPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case Abstracta_relacionalPackage.COLUMN__IS_NOT_NULL:
				setIs_not_null((Boolean)newValue);
				return;
			case Abstracta_relacionalPackage.COLUMN__AUTO_INCREMENT:
				setAuto_increment((Boolean)newValue);
				return;
			case Abstracta_relacionalPackage.COLUMN__DATA_DEFAULT:
				setData_default((String)newValue);
				return;
			case Abstracta_relacionalPackage.COLUMN__IS_UNIQUE:
				setIs_unique((Boolean)newValue);
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
			case Abstracta_relacionalPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.COLUMN__IS_NOT_NULL:
				setIs_not_null(IS_NOT_NULL_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.COLUMN__AUTO_INCREMENT:
				setAuto_increment(AUTO_INCREMENT_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.COLUMN__DATA_DEFAULT:
				setData_default(DATA_DEFAULT_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.COLUMN__IS_UNIQUE:
				setIs_unique(IS_UNIQUE_EDEFAULT);
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
			case Abstracta_relacionalPackage.COLUMN__TYPE:
				return type != TYPE_EDEFAULT;
			case Abstracta_relacionalPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Abstracta_relacionalPackage.COLUMN__IS_NOT_NULL:
				return is_not_null != IS_NOT_NULL_EDEFAULT;
			case Abstracta_relacionalPackage.COLUMN__AUTO_INCREMENT:
				return auto_increment != AUTO_INCREMENT_EDEFAULT;
			case Abstracta_relacionalPackage.COLUMN__DATA_DEFAULT:
				return DATA_DEFAULT_EDEFAULT == null ? data_default != null : !DATA_DEFAULT_EDEFAULT.equals(data_default);
			case Abstracta_relacionalPackage.COLUMN__IS_UNIQUE:
				return is_unique != IS_UNIQUE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", is_not_null: ");
		result.append(is_not_null);
		result.append(", auto_increment: ");
		result.append(auto_increment);
		result.append(", data_default: ");
		result.append(data_default);
		result.append(", is_unique: ");
		result.append(is_unique);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
