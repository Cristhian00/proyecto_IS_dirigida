/**
 */
package abstracta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicidad</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage#getMultiplicidad()
 * @model
 * @generated
 */
public enum Multiplicidad implements Enumerator {
	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(0, "_1", "_1"),

	/**
	 * The '<em><b>01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_01_VALUE
	 * @generated
	 * @ordered
	 */
	_01(1, "_0_1", "_0_1"),

	/**
	 * The '<em><b>0n</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_0N_VALUE
	 * @generated
	 * @ordered
	 */
	_0N(2, "_0_n", "_0_n"),

	/**
	 * The '<em><b>1n</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1N_VALUE
	 * @generated
	 * @ordered
	 */
	_1N(3, "_1_n", "_1_n");

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 0;

	/**
	 * The '<em><b>01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_01
	 * @model name="_0_1"
	 * @generated
	 * @ordered
	 */
	public static final int _01_VALUE = 1;

	/**
	 * The '<em><b>0n</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>0n</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_0N
	 * @model name="_0_n"
	 * @generated
	 * @ordered
	 */
	public static final int _0N_VALUE = 2;

	/**
	 * The '<em><b>1n</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>1n</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_1N
	 * @model name="_1_n"
	 * @generated
	 * @ordered
	 */
	public static final int _1N_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Multiplicidad[] VALUES_ARRAY =
		new Multiplicidad[] {
			_1,
			_01,
			_0N,
			_1N,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicidad</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Multiplicidad> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Multiplicidad result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicidad</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Multiplicidad get(int value) {
		switch (value) {
			case _1_VALUE: return _1;
			case _01_VALUE: return _01;
			case _0N_VALUE: return _0N;
			case _1N_VALUE: return _1N;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Multiplicidad(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Multiplicidad
