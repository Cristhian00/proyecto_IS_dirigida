/**
 */
package diagrama_concreta.impl;

import diagrama_concreta.*;

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
public class Diagrama_concretaFactoryImpl extends EFactoryImpl implements Diagrama_concretaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Diagrama_concretaFactory init() {
		try {
			Diagrama_concretaFactory theDiagrama_concretaFactory = (Diagrama_concretaFactory)EPackage.Registry.INSTANCE.getEFactory(Diagrama_concretaPackage.eNS_URI);
			if (theDiagrama_concretaFactory != null) {
				return theDiagrama_concretaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Diagrama_concretaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaFactoryImpl() {
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
			case Diagrama_concretaPackage.TCD_DIAGRAMA_CLASES: return createTCDDiagramaClases();
			case Diagrama_concretaPackage.MODEL_FACTORY: return createModelFactory();
			case Diagrama_concretaPackage.TCD_PAQUETE: return createTCDPaquete();
			case Diagrama_concretaPackage.TCD_CLASE: return createTCDClase();
			case Diagrama_concretaPackage.TCD_AGREGACION: return createTCDAgregacion();
			case Diagrama_concretaPackage.TCD_ASOCIACION: return createTCDAsociacion();
			case Diagrama_concretaPackage.TCD_COMPOSICION: return createTCDComposicion();
			case Diagrama_concretaPackage.TCD_DEPENDENCIA: return createTCDDependencia();
			case Diagrama_concretaPackage.TCD_HERENCIA: return createTCDHerencia();
			case Diagrama_concretaPackage.TCD_ATRIBUTO: return createTCDAtributo();
			case Diagrama_concretaPackage.CLASS_IDENTIFIER: return createclass_identifier();
			case Diagrama_concretaPackage.TCD_METODO: return createTCDMetodo();
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
			case Diagrama_concretaPackage.NAVEGAVILIDAD:
				return createNavegavilidadFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.MULTIPLICIDAD:
				return createMultiplicidadFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.VISIBILIDAD:
				return createVisibilidadFromString(eDataType, initialValue);
			case Diagrama_concretaPackage.TIPO_RETORNO:
				return createTipoRetornoFromString(eDataType, initialValue);
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
			case Diagrama_concretaPackage.NAVEGAVILIDAD:
				return convertNavegavilidadToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.MULTIPLICIDAD:
				return convertMultiplicidadToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.VISIBILIDAD:
				return convertVisibilidadToString(eDataType, instanceValue);
			case Diagrama_concretaPackage.TIPO_RETORNO:
				return convertTipoRetornoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDDiagramaClases createTCDDiagramaClases() {
		TCDDiagramaClasesImpl tcdDiagramaClases = new TCDDiagramaClasesImpl();
		return tcdDiagramaClases;
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
	public TCDAgregacion createTCDAgregacion() {
		TCDAgregacionImpl tcdAgregacion = new TCDAgregacionImpl();
		return tcdAgregacion;
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
	public TCDAtributo createTCDAtributo() {
		TCDAtributoImpl tcdAtributo = new TCDAtributoImpl();
		return tcdAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class_identifier createclass_identifier() {
		class_identifierImpl class_identifier = new class_identifierImpl();
		return class_identifier;
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
	public Diagrama_concretaPackage getDiagrama_concretaPackage() {
		return (Diagrama_concretaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Diagrama_concretaPackage getPackage() {
		return Diagrama_concretaPackage.eINSTANCE;
	}

} //Diagrama_concretaFactoryImpl
