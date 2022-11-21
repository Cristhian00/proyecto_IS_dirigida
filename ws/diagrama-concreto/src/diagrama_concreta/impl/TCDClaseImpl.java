/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.TCDAtributo;
import diagrama_concreta.TCDClase;
import diagrama_concreta.TCDMetodo;

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
 * An implementation of the model object '<em><b>TCD Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getListaMetodos <em>Lista Metodos</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getEstereotipo <em>Estereotipo</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getDocumentacion <em>Documentacion</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDClaseImpl#getRuta <em>Ruta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDClaseImpl extends EObjectImpl implements TCDClase {
	/**
	 * The cached value of the '{@link #getListaAtributos() <em>Lista Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDAtributo> listaAtributos;

	/**
	 * The cached value of the '{@link #getListaMetodos() <em>Lista Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<TCDMetodo> listaMetodos;

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
	 * The default value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTEREOTIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstereotipo() <em>Estereotipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstereotipo()
	 * @generated
	 * @ordered
	 */
	protected String estereotipo = ESTEREOTIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentacion() <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentacion() <em>Documentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentacion()
	 * @generated
	 * @ordered
	 */
	protected String documentacion = DOCUMENTACION_EDEFAULT;

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
	protected TCDClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDAtributo> getListaAtributos() {
		if (listaAtributos == null) {
			listaAtributos = new EObjectContainmentEList<TCDAtributo>(TCDAtributo.class, this, Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS);
		}
		return listaAtributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCDMetodo> getListaMetodos() {
		if (listaMetodos == null) {
			listaMetodos = new EObjectContainmentEList<TCDMetodo>(TCDMetodo.class, this, Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS);
		}
		return listaMetodos;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstereotipo() {
		return estereotipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstereotipo(String newEstereotipo) {
		String oldEstereotipo = estereotipo;
		estereotipo = newEstereotipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_CLASE__ESTEREOTIPO, oldEstereotipo, estereotipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_CLASE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentacion() {
		return documentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentacion(String newDocumentacion) {
		String oldDocumentacion = documentacion;
		documentacion = newDocumentacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_CLASE__DOCUMENTACION, oldDocumentacion, documentacion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_CLASE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return ((InternalEList<?>)getListaAtributos()).basicRemove(otherEnd, msgs);
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS:
				return ((InternalEList<?>)getListaMetodos()).basicRemove(otherEnd, msgs);
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
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return getListaAtributos();
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS:
				return getListaMetodos();
			case Diagrama_concretaPackage.TCD_CLASE__NOMBRE:
				return getNombre();
			case Diagrama_concretaPackage.TCD_CLASE__ESTEREOTIPO:
				return getEstereotipo();
			case Diagrama_concretaPackage.TCD_CLASE__IS_ABSTRACT:
				return isIsAbstract();
			case Diagrama_concretaPackage.TCD_CLASE__DOCUMENTACION:
				return getDocumentacion();
			case Diagrama_concretaPackage.TCD_CLASE__RUTA:
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
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				getListaAtributos().addAll((Collection<? extends TCDAtributo>)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS:
				getListaMetodos().clear();
				getListaMetodos().addAll((Collection<? extends TCDMetodo>)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__ESTEREOTIPO:
				setEstereotipo((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__DOCUMENTACION:
				setDocumentacion((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__RUTA:
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
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				return;
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS:
				getListaMetodos().clear();
				return;
			case Diagrama_concretaPackage.TCD_CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__ESTEREOTIPO:
				setEstereotipo(ESTEREOTIPO_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__DOCUMENTACION:
				setDocumentacion(DOCUMENTACION_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_CLASE__RUTA:
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
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
				return listaAtributos != null && !listaAtributos.isEmpty();
			case Diagrama_concretaPackage.TCD_CLASE__LISTA_METODOS:
				return listaMetodos != null && !listaMetodos.isEmpty();
			case Diagrama_concretaPackage.TCD_CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Diagrama_concretaPackage.TCD_CLASE__ESTEREOTIPO:
				return ESTEREOTIPO_EDEFAULT == null ? estereotipo != null : !ESTEREOTIPO_EDEFAULT.equals(estereotipo);
			case Diagrama_concretaPackage.TCD_CLASE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case Diagrama_concretaPackage.TCD_CLASE__DOCUMENTACION:
				return DOCUMENTACION_EDEFAULT == null ? documentacion != null : !DOCUMENTACION_EDEFAULT.equals(documentacion);
			case Diagrama_concretaPackage.TCD_CLASE__RUTA:
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
		result.append(", estereotipo: ");
		result.append(estereotipo);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", documentacion: ");
		result.append(documentacion);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //TCDClaseImpl
