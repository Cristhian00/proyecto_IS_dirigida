/**
 */
package abstracta.impl;

import abstracta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractaFactoryImpl extends EFactoryImpl implements AbstractaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractaFactory init() {
		try {
			AbstractaFactory theAbstractaFactory = (AbstractaFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractaPackage.eNS_URI);
			if (theAbstractaFactory != null) {
				return theAbstractaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AbstractaPackage.MODEL_FACTORY: return createModelFactory();
			case AbstractaPackage.TCD_PAQUETE: return createTCDPaquete();
			case AbstractaPackage.TCD_CLASE: return createTCDClase();
			case AbstractaPackage.TCD_ATRIBUTO: return createTCDAtributo();
			case AbstractaPackage.TCD_CLASS_IDENTIFIER: return createTCDClass_identifier();
			case AbstractaPackage.TCD_METODO: return createTCDMetodo();
			case AbstractaPackage.TCD_ASOCIACION: return createTCDAsociacion();
			case AbstractaPackage.TCD_COMPOSICION: return createTCDComposicion();
			case AbstractaPackage.TCD_DEPENDENCIA: return createTCDDependencia();
			case AbstractaPackage.TCD_HERENCIA: return createTCDHerencia();
			case AbstractaPackage.TCD_AGREGACION: return createTCDAgregacion();
			case AbstractaPackage.TCD_PARAMETRO: return createTCDParametro();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AbstractaPackage.VISIBILIDAD:
				return createVisibilidadFromString(eDataType, initialValue);
			case AbstractaPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case AbstractaPackage.MULTIPLICIDAD:
				return createMultiplicidadFromString(eDataType, initialValue);
			case AbstractaPackage.TIPO_RETORNO:
				return createTipoRetornoFromString(eDataType, initialValue);
			case AbstractaPackage.NAVEGAVILIDAD:
				return createNavegavilidadFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AbstractaPackage.VISIBILIDAD:
				return convertVisibilidadToString(eDataType, instanceValue);
			case AbstractaPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case AbstractaPackage.MULTIPLICIDAD:
				return convertMultiplicidadToString(eDataType, instanceValue);
			case AbstractaPackage.TIPO_RETORNO:
				return convertTipoRetornoToString(eDataType, instanceValue);
			case AbstractaPackage.NAVEGAVILIDAD:
				return convertNavegavilidadToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDPaquete createTCDPaquete() {
		TCDPaqueteImpl tcdPaquete = new TCDPaqueteImpl();
		return tcdPaquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClase createTCDClase() {
		TCDClaseImpl tcdClase = new TCDClaseImpl();
		return tcdClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAtributo createTCDAtributo() {
		TCDAtributoImpl tcdAtributo = new TCDAtributoImpl();
		return tcdAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClass_identifier createTCDClass_identifier() {
		TCDClass_identifierImpl tcdClass_identifier = new TCDClass_identifierImpl();
		return tcdClass_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDMetodo createTCDMetodo() {
		TCDMetodoImpl tcdMetodo = new TCDMetodoImpl();
		return tcdMetodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAsociacion createTCDAsociacion() {
		TCDAsociacionImpl tcdAsociacion = new TCDAsociacionImpl();
		return tcdAsociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDComposicion createTCDComposicion() {
		TCDComposicionImpl tcdComposicion = new TCDComposicionImpl();
		return tcdComposicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDDependencia createTCDDependencia() {
		TCDDependenciaImpl tcdDependencia = new TCDDependenciaImpl();
		return tcdDependencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDHerencia createTCDHerencia() {
		TCDHerenciaImpl tcdHerencia = new TCDHerenciaImpl();
		return tcdHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAgregacion createTCDAgregacion() {
		TCDAgregacionImpl tcdAgregacion = new TCDAgregacionImpl();
		return tcdAgregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDParametro createTCDParametro() {
		TCDParametroImpl tcdParametro = new TCDParametroImpl();
		return tcdParametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibilidad createVisibilidadFromString(EDataType eDataType, String initialValue) {
		Visibilidad result = Visibilidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad createMultiplicidadFromString(EDataType eDataType, String initialValue) {
		Multiplicidad result = Multiplicidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorno createTipoRetornoFromString(EDataType eDataType, String initialValue) {
		TipoRetorno result = TipoRetorno.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoRetornoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navegavilidad createNavegavilidadFromString(EDataType eDataType, String initialValue) {
		Navegavilidad result = Navegavilidad.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNavegavilidadToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaPackage getAbstractaPackage() {
		return (AbstractaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractaPackage getPackage() {
		return AbstractaPackage.eINSTANCE;
	}

} //AbstractaFactoryImpl
