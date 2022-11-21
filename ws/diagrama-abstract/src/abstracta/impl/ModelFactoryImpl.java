/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ModelFactory;
import abstracta.TCDClase;
import abstracta.TCDPaquete;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaTodasClases <em>Lista Todas Clases</em>}</li>
 *   <li>{@link abstracta.impl.ModelFactoryImpl#getListaTodosPaquetes <em>Lista Todos Paquetes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelFactoryImpl extends EObjectImpl implements ModelFactory {
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
	 * The cached value of the '{@link #getListaPaquetes() <em>Lista Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDPaquete> listaPaquetes;

	/**
	 * The cached value of the '{@link #getListaTodasClases() <em>Lista Todas Clases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaTodasClases()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDClase> listaTodasClases;

	/**
	 * The cached value of the '{@link #getListaTodosPaquetes() <em>Lista Todos Paquetes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaTodosPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDPaquete> listaTodosPaquetes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.MODEL_FACTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY__NOMBRE, oldNombre, nombre));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.MODEL_FACTORY__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDPaquete> getListaPaquetes() {
		if (listaPaquetes == null) {
			listaPaquetes = new EObjectContainmentEList<TCDPaquete>(TCDPaquete.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES);
		}
		return listaPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDClase> getListaTodasClases() {
		if (listaTodasClases == null) {
			listaTodasClases = new EObjectResolvingEList<TCDClase>(TCDClase.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_CLASES);
		}
		return listaTodasClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDPaquete> getListaTodosPaquetes() {
		if (listaTodosPaquetes == null) {
			listaTodosPaquetes = new EObjectResolvingEList<TCDPaquete>(TCDPaquete.class, this, AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_PAQUETES);
		}
		return listaTodosPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES:
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				return getNombre();
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				return getRuta();
			case AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES:
				return getListaPaquetes();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_CLASES:
				return getListaTodasClases();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_PAQUETES:
				return getListaTodosPaquetes();
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				setRuta((String)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends TCDPaquete>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_CLASES:
				getListaTodasClases().clear();
				getListaTodasClases().addAll((Collection<? extends TCDClase>)newValue);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_PAQUETES:
				getListaTodosPaquetes().clear();
				getListaTodosPaquetes().addAll((Collection<? extends TCDPaquete>)newValue);
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES:
				getListaPaquetes().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_CLASES:
				getListaTodasClases().clear();
				return;
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_PAQUETES:
				getListaTodosPaquetes().clear();
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
			case AbstractaPackage.MODEL_FACTORY__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.MODEL_FACTORY__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case AbstractaPackage.MODEL_FACTORY__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODAS_CLASES:
				return listaTodasClases != null && !listaTodasClases.isEmpty();
			case AbstractaPackage.MODEL_FACTORY__LISTA_TODOS_PAQUETES:
				return listaTodosPaquetes != null && !listaTodosPaquetes.isEmpty();
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

} //ModelFactoryImpl
