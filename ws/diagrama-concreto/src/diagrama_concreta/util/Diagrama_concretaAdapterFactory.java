/**
 */
package diagrama_concreta.util;

import diagrama_concreta.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diagrama_concreta.Diagrama_concretaPackage
 * @generated
 */
public class Diagrama_concretaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Diagrama_concretaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama_concretaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Diagrama_concretaPackage.eINSTANCE;
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
	protected Diagrama_concretaSwitch<Adapter> modelSwitch =
		new Diagrama_concretaSwitch<Adapter>() {
			@Override
			public Adapter caseTCDDiagramaClases(TCDDiagramaClases object) {
				return createTCDDiagramaClasesAdapter();
			}
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
			public Adapter caseTCDRelacion(TCDRelacion object) {
				return createTCDRelacionAdapter();
			}
			@Override
			public Adapter caseTCDAgregacion(TCDAgregacion object) {
				return createTCDAgregacionAdapter();
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
			public Adapter caseTCDAtributo(TCDAtributo object) {
				return createTCDAtributoAdapter();
			}
			@Override
			public Adapter caseclass_identifier(class_identifier object) {
				return createclass_identifierAdapter();
			}
			@Override
			public Adapter caseTCDMetodo(TCDMetodo object) {
				return createTCDMetodoAdapter();
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
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDDiagramaClases <em>TCD Diagrama Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDDiagramaClases
	 * @generated
	 */
	public Adapter createTCDDiagramaClasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.ModelFactory
	 * @generated
	 */
	public Adapter createModelFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDPaquete <em>TCD Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDPaquete
	 * @generated
	 */
	public Adapter createTCDPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDClase <em>TCD Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDClase
	 * @generated
	 */
	public Adapter createTCDClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDRelacion <em>TCD Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDRelacion
	 * @generated
	 */
	public Adapter createTCDRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDAgregacion <em>TCD Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDAgregacion
	 * @generated
	 */
	public Adapter createTCDAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDAsociacion <em>TCD Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDAsociacion
	 * @generated
	 */
	public Adapter createTCDAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDComposicion <em>TCD Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDComposicion
	 * @generated
	 */
	public Adapter createTCDComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDDependencia <em>TCD Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDDependencia
	 * @generated
	 */
	public Adapter createTCDDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDHerencia <em>TCD Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDHerencia
	 * @generated
	 */
	public Adapter createTCDHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDAtributo <em>TCD Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDAtributo
	 * @generated
	 */
	public Adapter createTCDAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.class_identifier <em>class identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.class_identifier
	 * @generated
	 */
	public Adapter createclass_identifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diagrama_concreta.TCDMetodo <em>TCD Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diagrama_concreta.TCDMetodo
	 * @generated
	 */
	public Adapter createTCDMetodoAdapter() {
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

} //Diagrama_concretaAdapterFactory
