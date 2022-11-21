/**
 */
package abstracta_relacional.impl;

import abstracta_relacional.Abstracta_relacionalPackage;
import abstracta_relacional.Column;
import abstracta_relacional.PrimaryKey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta_relacional.impl.PrimaryKeyImpl#getColumna <em>Columna</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends EObjectImpl implements PrimaryKey {
	/**
	 * The cached value of the '{@link #getColumna() <em>Columna</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumna()
	 * @generated
	 * @ordered
	 */
	protected Column columna;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Abstracta_relacionalPackage.Literals.PRIMARY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumna() {
		if (columna != null && columna.eIsProxy()) {
			InternalEObject oldColumna = (InternalEObject)columna;
			columna = (Column)eResolveProxy(oldColumna);
			if (columna != oldColumna) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA, oldColumna, columna));
			}
		}
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumna() {
		return columna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumna(Column newColumna) {
		Column oldColumna = columna;
		columna = newColumna;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA, oldColumna, columna));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA:
				if (resolve) return getColumna();
				return basicGetColumna();
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
			case Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA:
				setColumna((Column)newValue);
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
			case Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA:
				setColumna((Column)null);
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
			case Abstracta_relacionalPackage.PRIMARY_KEY__COLUMNA:
				return columna != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
