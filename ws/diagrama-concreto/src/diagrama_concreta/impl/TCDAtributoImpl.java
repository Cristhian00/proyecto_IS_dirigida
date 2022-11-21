/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.ModificadorAcceso;
import diagrama_concreta.TCDAtributo;
import diagrama_concreta.TipoDato;
import diagrama_concreta.TipoVariable;
import diagrama_concreta.Visibilidad;

import diagrama_concreta.class_identifier;
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
 * An implementation of the model object '<em><b>TCD Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.impl.TCDAtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDAtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDAtributoImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDAtributoImpl#getValorDefecto <em>Valor Defecto</em>}</li>
 *   <li>{@link diagrama_concreta.impl.TCDAtributoImpl#getIdentificadores <em>Identificadores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDAtributoImpl extends EObjectImpl implements TCDAtributo {
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
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.STRING;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final Visibilidad VISIBILIDAD_EDEFAULT = Visibilidad.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected Visibilidad visibilidad = VISIBILIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_DEFECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorDefecto() <em>Valor Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorDefecto()
	 * @generated
	 * @ordered
	 */
	protected String valorDefecto = VALOR_DEFECTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentificadores() <em>Identificadores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificadores()
	 * @generated
	 * @ordered
	 */
	protected EList<class_identifier> identificadores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDAtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Diagrama_concretaPackage.Literals.TCD_ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_ATRIBUTO__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad getVisibilidad() {
		return visibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilidad(Visibilidad newVisibilidad) {
		Visibilidad oldVisibilidad = visibilidad;
		visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_ATRIBUTO__VISIBILIDAD, oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorDefecto() {
		return valorDefecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorDefecto(String newValorDefecto) {
		String oldValorDefecto = valorDefecto;
		valorDefecto = newValorDefecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Diagrama_concretaPackage.TCD_ATRIBUTO__VALOR_DEFECTO, oldValorDefecto, valorDefecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<class_identifier> getIdentificadores() {
		if (identificadores == null) {
			identificadores = new EObjectContainmentEList<class_identifier>(class_identifier.class, this, Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES);
		}
		return identificadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES:
				return ((InternalEList<?>)getIdentificadores()).basicRemove(otherEnd, msgs);
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
			case Diagrama_concretaPackage.TCD_ATRIBUTO__NOMBRE:
				return getNombre();
			case Diagrama_concretaPackage.TCD_ATRIBUTO__TIPO_DATO:
				return getTipoDato();
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				return getVisibilidad();
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				return getValorDefecto();
			case Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES:
				return getIdentificadores();
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
			case Diagrama_concretaPackage.TCD_ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__TIPO_DATO:
				setTipoDato((TipoDato)newValue);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				setVisibilidad((Visibilidad)newValue);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto((String)newValue);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES:
				getIdentificadores().clear();
				getIdentificadores().addAll((Collection<? extends class_identifier>)newValue);
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
			case Diagrama_concretaPackage.TCD_ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				setVisibilidad(VISIBILIDAD_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				setValorDefecto(VALOR_DEFECTO_EDEFAULT);
				return;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES:
				getIdentificadores().clear();
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
			case Diagrama_concretaPackage.TCD_ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Diagrama_concretaPackage.TCD_ATRIBUTO__TIPO_DATO:
				return tipoDato != TIPO_DATO_EDEFAULT;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VISIBILIDAD:
				return visibilidad != VISIBILIDAD_EDEFAULT;
			case Diagrama_concretaPackage.TCD_ATRIBUTO__VALOR_DEFECTO:
				return VALOR_DEFECTO_EDEFAULT == null ? valorDefecto != null : !VALOR_DEFECTO_EDEFAULT.equals(valorDefecto);
			case Diagrama_concretaPackage.TCD_ATRIBUTO__IDENTIFICADORES:
				return identificadores != null && !identificadores.isEmpty();
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
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(", valorDefecto: ");
		result.append(valorDefecto);
		result.append(')');
		return result.toString();
	}

} //TCDAtributoImpl
