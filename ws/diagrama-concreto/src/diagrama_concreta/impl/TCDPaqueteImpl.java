/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.TCDPaquete;

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
 * An implementation of the model object '<em><b>TCD Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TCDPaqueteImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDPaqueteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDPaqueteImpl#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDPaqueteImpl extends EObjectImpl implements TCDPaquete {
	/**
	 * The cached value of the '{@link #getListaPaquetes() <em>Lista Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDPaquete> listaPaquetes;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDPaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_PAQUETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDPaquete> getListaPaquetes() {
		if (listaPaquetes == null) {
			listaPaquetes = new EObjectContainmentEList<TCDPaquete>(TCDPaquete.class, this, Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES);
		}
		return listaPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_PAQUETE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_PAQUETE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES:
				return ((InternalEList<?>)getListaPaquetes()).basicRemove(otherEnd, msgs);
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
			case Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES:
				return getListaPaquetes();
			case Diagrama_concretaPackage.TCD_PAQUETE__NOMBRE:
				return getNombre();
			case Diagrama_concretaPackage.TCD_PAQUETE__RUTA:
				return getRuta();
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
			case Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends TCDPaquete>)newValue);
				return;
			case Diagrama_concretaPackage.TCD_PAQUETE__NOMBRE:
				setNombre((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_PAQUETE__RUTA:
				setRuta((String)newValue);
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
			case Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES:
				getListaPaquetes().clear();
				return;
			case Diagrama_concretaPackage.TCD_PAQUETE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_PAQUETE__RUTA:
				setRuta(RUTA_EDEFAULT);
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
			case Diagrama_concretaPackage.TCD_PAQUETE__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
			case Diagrama_concretaPackage.TCD_PAQUETE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Diagrama_concretaPackage.TCD_PAQUETE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //TCDPaqueteImpl
