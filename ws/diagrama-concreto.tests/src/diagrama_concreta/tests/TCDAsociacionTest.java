/**
 */
package diagrama_concreta.tests;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.TCDAsociacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCD Asociacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDAsociacionTest extends TCDRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCDAsociacionTest.class);
	}

	/**
	 * Constructs a new TCD Asociacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAsociacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TCD Asociacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TCDAsociacion getFixture() {
		return (TCDAsociacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Diagrama_concretaFactory.eINSTANCE.createTCDAsociacion());
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

} //TCDAsociacionTest
