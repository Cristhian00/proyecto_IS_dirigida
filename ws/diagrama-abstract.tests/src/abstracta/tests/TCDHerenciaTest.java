/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.TCDHerencia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCD Herencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDHerenciaTest extends TCDRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCDHerenciaTest.class);
	}

	/**
	 * Constructs a new TCD Herencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDHerenciaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TCD Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TCDHerencia getFixture() {
		return (TCDHerencia)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createTCDHerencia());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TCDHerenciaTest
