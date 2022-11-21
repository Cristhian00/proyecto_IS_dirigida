/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.Multiplicidad;
import abstracta.Navegavilidad;
import abstracta.TCDAsociacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCD Asociacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.TCDAsociacionImpl#getNombreOrigen <em>Nombre Origen</em>}</li>
 *   <li>{@link abstracta.impl.TCDAsociacionImpl#getNombreDestino <em>Nombre Destino</em>}</li>
 *   <li>{@link abstracta.impl.TCDAsociacionImpl#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}</li>
 *   <li>{@link abstracta.impl.TCDAsociacionImpl#getMultiplicidadDestino <em>Multiplicidad Destino</em>}</li>
 *   <li>{@link abstracta.impl.TCDAsociacionImpl#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDAsociacionImpl extends TCDRelacionImpl implements TCDAsociacion {
	/**
	 * The default value of the '{@link #getNombreOrigen() <em>Nombre Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreOrigen() <em>Nombre Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOrigen()
	 * @generated
	 * @ordered
	 */
	protected String nombreOrigen = NOMBRE_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreDestino() <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDestino()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_DESTINO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreDestino() <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDestino()
	 * @generated
	 * @ordered
	 */
	protected String nombreDestino = NOMBRE_DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadOrigen() <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_ORIGEN_EDEFAULT = Multiplicidad._1;

	/**
	 * The cached value of the '{@link #getMultiplicidadOrigen() <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidadOrigen = MULTIPLICIDAD_ORIGEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadDestino() <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadDestino()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_DESTINO_EDEFAULT = Multiplicidad._1;

	/**
	 * The cached value of the '{@link #getMultiplicidadDestino() <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadDestino()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidadDestino = MULTIPLICIDAD_DESTINO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected static final Navegavilidad NAVEGAVILIDAD_EDEFAULT = Navegavilidad.BIDIRECCIONAL;

	/**
	 * The cached value of the '{@link #getNavegavilidad() <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavegavilidad()
	 * @generated
	 * @ordered
	 */
	protected Navegavilidad navegavilidad = NAVEGAVILIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDAsociacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.TCD_ASOCIACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreOrigen() {
		return nombreOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreOrigen(String newNombreOrigen) {
		String oldNombreOrigen = nombreOrigen;
		nombreOrigen = newNombreOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ASOCIACION__NOMBRE_ORIGEN, oldNombreOrigen, nombreOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreDestino() {
		return nombreDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreDestino(String newNombreDestino) {
		String oldNombreDestino = nombreDestino;
		nombreDestino = newNombreDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ASOCIACION__NOMBRE_DESTINO, oldNombreDestino, nombreDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad getMultiplicidadOrigen() {
		return multiplicidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadOrigen(Multiplicidad newMultiplicidadOrigen) {
		Multiplicidad oldMultiplicidadOrigen = multiplicidadOrigen;
		multiplicidadOrigen = newMultiplicidadOrigen == null ? MULTIPLICIDAD_ORIGEN_EDEFAULT : newMultiplicidadOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN, oldMultiplicidadOrigen, multiplicidadOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad getMultiplicidadDestino() {
		return multiplicidadDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadDestino(Multiplicidad newMultiplicidadDestino) {
		Multiplicidad oldMultiplicidadDestino = multiplicidadDestino;
		multiplicidadDestino = newMultiplicidadDestino == null ? MULTIPLICIDAD_DESTINO_EDEFAULT : newMultiplicidadDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_DESTINO, oldMultiplicidadDestino, multiplicidadDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navegavilidad getNavegavilidad() {
		return navegavilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavegavilidad(Navegavilidad newNavegavilidad) {
		Navegavilidad oldNavegavilidad = navegavilidad;
		navegavilidad = newNavegavilidad == null ? NAVEGAVILIDAD_EDEFAULT : newNavegavilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.TCD_ASOCIACION__NAVEGAVILIDAD, oldNavegavilidad, navegavilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_ORIGEN:
				return getNombreOrigen();
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_DESTINO:
				return getNombreDestino();
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN:
				return getMultiplicidadOrigen();
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_DESTINO:
				return getMultiplicidadDestino();
			case AbstractaPackage.TCD_ASOCIACION__NAVEGAVILIDAD:
				return getNavegavilidad();
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
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_ORIGEN:
				setNombreOrigen((String)newValue);
				return;
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_DESTINO:
				setNombreDestino((String)newValue);
				return;
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN:
				setMultiplicidadOrigen((Multiplicidad)newValue);
				return;
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_DESTINO:
				setMultiplicidadDestino((Multiplicidad)newValue);
				return;
			case AbstractaPackage.TCD_ASOCIACION__NAVEGAVILIDAD:
				setNavegavilidad((Navegavilidad)newValue);
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
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_ORIGEN:
				setNombreOrigen(NOMBRE_ORIGEN_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_DESTINO:
				setNombreDestino(NOMBRE_DESTINO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN:
				setMultiplicidadOrigen(MULTIPLICIDAD_ORIGEN_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_DESTINO:
				setMultiplicidadDestino(MULTIPLICIDAD_DESTINO_EDEFAULT);
				return;
			case AbstractaPackage.TCD_ASOCIACION__NAVEGAVILIDAD:
				setNavegavilidad(NAVEGAVILIDAD_EDEFAULT);
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
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_ORIGEN:
				return NOMBRE_ORIGEN_EDEFAULT == null ? nombreOrigen != null : !NOMBRE_ORIGEN_EDEFAULT.equals(nombreOrigen);
			case AbstractaPackage.TCD_ASOCIACION__NOMBRE_DESTINO:
				return NOMBRE_DESTINO_EDEFAULT == null ? nombreDestino != null : !NOMBRE_DESTINO_EDEFAULT.equals(nombreDestino);
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_ORIGEN:
				return multiplicidadOrigen != MULTIPLICIDAD_ORIGEN_EDEFAULT;
			case AbstractaPackage.TCD_ASOCIACION__MULTIPLICIDAD_DESTINO:
				return multiplicidadDestino != MULTIPLICIDAD_DESTINO_EDEFAULT;
			case AbstractaPackage.TCD_ASOCIACION__NAVEGAVILIDAD:
				return navegavilidad != NAVEGAVILIDAD_EDEFAULT;
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
		result.append(" (nombreOrigen: ");
		result.append(nombreOrigen);
		result.append(", nombreDestino: ");
		result.append(nombreDestino);
		result.append(", multiplicidadOrigen: ");
		result.append(multiplicidadOrigen);
		result.append(", multiplicidadDestino: ");
		result.append(multiplicidadDestino);
		result.append(", navegavilidad: ");
		result.append(navegavilidad);
		result.append(')');
		return result.toString();
	}

} //TCDAsociacionImpl
