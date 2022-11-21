/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbstractaPackage.MODEL_FACTORY: {
				ModelFactory modelFactory = (ModelFactory)theEObject;
				T result = caseModelFactory(modelFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_PAQUETE: {
				TCDPaquete tcdPaquete = (TCDPaquete)theEObject;
				T result = caseTCDPaquete(tcdPaquete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_CLASE: {
				TCDClase tcdClase = (TCDClase)theEObject;
				T result = caseTCDClase(tcdClase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_ATRIBUTO: {
				TCDAtributo tcdAtributo = (TCDAtributo)theEObject;
				T result = caseTCDAtributo(tcdAtributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_CLASS_IDENTIFIER: {
				TCDClass_identifier tcdClass_identifier = (TCDClass_identifier)theEObject;
				T result = caseTCDClass_identifier(tcdClass_identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_METODO: {
				TCDMetodo tcdMetodo = (TCDMetodo)theEObject;
				T result = caseTCDMetodo(tcdMetodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_RELACION: {
				TCDRelacion tcdRelacion = (TCDRelacion)theEObject;
				T result = caseTCDRelacion(tcdRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_ASOCIACION: {
				TCDAsociacion tcdAsociacion = (TCDAsociacion)theEObject;
				T result = caseTCDAsociacion(tcdAsociacion);
				if (result == null) result = caseTCDRelacion(tcdAsociacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_COMPOSICION: {
				TCDComposicion tcdComposicion = (TCDComposicion)theEObject;
				T result = caseTCDComposicion(tcdComposicion);
				if (result == null) result = caseTCDRelacion(tcdComposicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_DEPENDENCIA: {
				TCDDependencia tcdDependencia = (TCDDependencia)theEObject;
				T result = caseTCDDependencia(tcdDependencia);
				if (result == null) result = caseTCDRelacion(tcdDependencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_HERENCIA: {
				TCDHerencia tcdHerencia = (TCDHerencia)theEObject;
				T result = caseTCDHerencia(tcdHerencia);
				if (result == null) result = caseTCDRelacion(tcdHerencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_AGREGACION: {
				TCDAgregacion tcdAgregacion = (TCDAgregacion)theEObject;
				T result = caseTCDAgregacion(tcdAgregacion);
				if (result == null) result = caseTCDRelacion(tcdAgregacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.TCD_PARAMETRO: {
				TCDParametro tcdParametro = (TCDParametro)theEObject;
				T result = caseTCDParametro(tcdParametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactory(ModelFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Paquete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDPaquete(TCDPaquete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDClase(TCDClase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDAtributo(TCDAtributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Class identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Class identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDClass_identifier(TCDClass_identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDMetodo(TCDMetodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDRelacion(TCDRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Asociacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDAsociacion(TCDAsociacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Composicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDComposicion(TCDComposicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Dependencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDDependencia(TCDDependencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDHerencia(TCDHerencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Agregacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDAgregacion(TCDAgregacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCD Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCD Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCDParametro(TCDParametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractaSwitch
