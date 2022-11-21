/**
 */
package diagrama_concreta.tests;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.TCDAgregacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCD Agregacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDAgregacionTest extends TCDRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCDAgregacionTest.class);
	}

	/**
	 * Constructs a new TCD Agregacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAgregacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TCD Agregacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TCDAgregacion getFixture() {
		return (TCDAgregacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Diagrama_concretaFactory.eINSTANCE.createTCDAgregacion());
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

} //TCDAgregacionTest
