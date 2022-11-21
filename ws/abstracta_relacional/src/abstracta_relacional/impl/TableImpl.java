/**
 */
package abstracta_relacional.impl;

import abstracta_relacional.Abstracta_relacionalPackage;
import abstracta_relacional.Column;
import abstracta_relacional.PrimaryKey;
import abstracta_relacional.Relation;
import abstracta_relacional.Table;
import abstracta_relacional.Trigger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TableImpl#getListRelations <em>List Relations</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TableImpl#getListColumns <em>List Columns</em>}</li>
 *   <li>{@link abstracta_relacional.impl.TableImpl#getListTriggers <em>List Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
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
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKey> primaryKey;

	/**
	 * The cached value of the '{@link #getListRelations() <em>List Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> listRelations;

	/**
	 * The cached value of the '{@link #getListColumns() <em>List Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> listColumns;

	/**
	 * The cached value of the '{@link #getListTriggers() <em>List Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> listTriggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstracta_relacionalPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKey> getPrimaryKey() {
		if (primaryKey == null) {
			primaryKey = new EObjectContainmentEList<PrimaryKey>(PrimaryKey.class, this, Abstracta_relacionalPackage.TABLE__PRIMARY_KEY);
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getListRelations() {
		if (listRelations == null) {
			listRelations = new EObjectContainmentEList<Relation>(Relation.class, this, Abstracta_relacionalPackage.TABLE__LIST_RELATIONS);
		}
		return listRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getListColumns() {
		if (listColumns == null) {
			listColumns = new EObjectContainmentEList<Column>(Column.class, this, Abstracta_relacionalPackage.TABLE__LIST_COLUMNS);
		}
		return listColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getListTriggers() {
		if (listTriggers == null) {
			listTriggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS);
		}
		return listTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Abstracta_relacionalPackage.TABLE__PRIMARY_KEY:
				return ((InternalEList<?>)getPrimaryKey()).basicRemove(otherEnd, msgs);
			case Abstracta_relacionalPackage.TABLE__LIST_RELATIONS:
				return ((InternalEList<?>)getListRelations()).basicRemove(otherEnd, msgs);
			case Abstracta_relacionalPackage.TABLE__LIST_COLUMNS:
				return ((InternalEList<?>)getListColumns()).basicRemove(otherEnd, msgs);
			case Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS:
				return ((InternalEList<?>)getListTriggers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Abstracta_relacionalPackage.TABLE__NAME:
				return getName();
			case Abstracta_relacionalPackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey();
			case Abstracta_relacionalPackage.TABLE__LIST_RELATIONS:
				return getListRelations();
			case Abstracta_relacionalPackage.TABLE__LIST_COLUMNS:
				return getListColumns();
			case Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS:
				return getListTriggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Abstracta_relacionalPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case Abstracta_relacionalPackage.TABLE__PRIMARY_KEY:
				getPrimaryKey().clear();
				getPrimaryKey().addAll((Collection<? extends PrimaryKey>)newValue);
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
				getListRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				getListColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS:
				getListTriggers().clear();
				getListTriggers().addAll((Collection<? extends Trigger>)newValue);
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
			case Abstracta_relacionalPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Abstracta_relacionalPackage.TABLE__PRIMARY_KEY:
				getPrimaryKey().clear();
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_RELATIONS:
				getListRelations().clear();
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_COLUMNS:
				getListColumns().clear();
				return;
			case Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS:
				getListTriggers().clear();
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
			case Abstracta_relacionalPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Abstracta_relacionalPackage.TABLE__PRIMARY_KEY:
				return primaryKey != null && !primaryKey.isEmpty();
			case Abstracta_relacionalPackage.TABLE__LIST_RELATIONS:
				return listRelations != null && !listRelations.isEmpty();
			case Abstracta_relacionalPackage.TABLE__LIST_COLUMNS:
				return listColumns != null && !listColumns.isEmpty();
			case Abstracta_relacionalPackage.TABLE__LIST_TRIGGERS:
				return listTriggers != null && !listTriggers.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TableImpl
