/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractaSwitch<Adapter> modelSwitch =
		new AbstractaSwitch<Adapter>() {
			@Override
			public Adapter caseModelFactory(ModelFactory object) {
				return createModelFactoryAdapter();
			}
			@Override
			public Adapter caseTCDPaquete(TCDPaquete object) {
				return createTCDPaqueteAdapter();
			}
			@Override
			public Adapter caseTCDClase(TCDClase object) {
				return createTCDClaseAdapter();
			}
			@Override
			public Adapter caseTCDAtributo(TCDAtributo object) {
				return createTCDAtributoAdapter();
			}
			@Override
			public Adapter caseTCDClass_identifier(TCDClass_identifier object) {
				return createTCDClass_identifierAdapter();
			}
			@Override
			public Adapter caseTCDMetodo(TCDMetodo object) {
				return createTCDMetodoAdapter();
			}
			@Override
			public Adapter caseTCDRelacion(TCDRelacion object) {
				return createTCDRelacionAdapter();
			}
			@Override
			public Adapter caseTCDAsociacion(TCDAsociacion object) {
				return createTCDAsociacionAdapter();
			}
			@Override
			public Adapter caseTCDComposicion(TCDComposicion object) {
				return createTCDComposicionAdapter();
			}
			@Override
			public Adapter caseTCDDependencia(TCDDependencia object) {
				return createTCDDependenciaAdapter();
			}
			@Override
			public Adapter caseTCDHerencia(TCDHerencia object) {
				return createTCDHerenciaAdapter();
			}
			@Override
			public Adapter caseTCDAgregacion(TCDAgregacion object) {
				return createTCDAgregacionAdapter();
			}
			@Override
			public Adapter caseTCDParametro(TCDParametro object) {
				return createTCDParametroAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link abstracta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDPaquete <em>TCD Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDPaquete
	 * @generated
	 */
	public Adapter createTCDPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDClase <em>TCD Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDClase
	 * @generated
	 */
	public Adapter createTCDClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDAtributo <em>TCD Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDAtributo
	 * @generated
	 */
	public Adapter createTCDAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDClass_identifier <em>TCD Class identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDClass_identifier
	 * @generated
	 */
	public Adapter createTCDClass_identifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDMetodo <em>TCD Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDMetodo
	 * @generated
	 */
	public Adapter createTCDMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDRelacion <em>TCD Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDRelacion
	 * @generated
	 */
	public Adapter createTCDRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDAsociacion <em>TCD Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDAsociacion
	 * @generated
	 */
	public Adapter createTCDAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDComposicion <em>TCD Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDComposicion
	 * @generated
	 */
	public Adapter createTCDComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDDependencia <em>TCD Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDDependencia
	 * @generated
	 */
	public Adapter createTCDDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDHerencia <em>TCD Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDHerencia
	 * @generated
	 */
	public Adapter createTCDHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDAgregacion <em>TCD Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDAgregacion
	 * @generated
	 */
	public Adapter createTCDAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abstracta.TCDParametro <em>TCD Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abstracta.TCDParametro
	 * @generated
	 */
	public Adapter createTCDParametroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AbstractaAdapterFactory
