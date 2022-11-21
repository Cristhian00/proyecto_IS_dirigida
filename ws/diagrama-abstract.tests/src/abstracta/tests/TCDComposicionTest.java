/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.TCDComposicion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCD Composicion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDComposicionTest extends TCDRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCDComposicionTest.class);
	}

	/**
	 * Constructs a new TCD Composicion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDComposicionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TCD Composicion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TCDComposicion getFixture() {
		return (TCDComposicion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createTCDComposicion());
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

} //TCDComposicionTest
