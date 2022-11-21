/**
 */
package abstracta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Composicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}</li>
 *   <li>{@link abstracta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}</li>
 *   <li>{@link abstracta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}</li>
 *   <li>{@link abstracta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}</li>
 *   <li>{@link abstracta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getTCDComposicion()
 * @model
 * @generated
 */
public interface TCDComposicion extends TCDRelacion {
	/**
	 * Returns the value of the '<em><b>Nombre Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Origen</em>' attribute.
	 * @see #setNombreOrigen(String)
	 * @see abstracta.AbstractaPackage#getTCDComposicion_NombreOrigen()
	 * @model
	 * @generated
	 */
	String getNombreOrigen();

	/**
	 * Sets the value of the '{@link abstracta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Origen</em>' attribute.
	 * @see #getNombreOrigen()
	 * @generated
	 */
	void setNombreOrigen(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Destino</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Destino</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Destino</em>' attribute.
	 * @see #setNombreDestino(String)
	 * @see abstracta.AbstractaPackage#getTCDComposicion_NombreDestino()
	 * @model
	 * @generated
	 */
	String getNombreDestino();

	/**
	 * Sets the value of the '{@link abstracta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Destino</em>' attribute.
	 * @see #getNombreDestino()
	 * @generated
	 */
	void setNombreDestino(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Origen</em>' attribute.
	 * @see abstracta.Multiplicidad
	 * @see #setMultiplicidadOrigen(Multiplicidad)
	 * @see abstracta.AbstractaPackage#getTCDComposicion_MultiplicidadOrigen()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidadOrigen();

	/**
	 * Sets the value of the '{@link abstracta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Origen</em>' attribute.
	 * @see abstracta.Multiplicidad
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 */
	void setMultiplicidadOrigen(Multiplicidad value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Destino</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Destino</em>' attribute.
	 * @see abstracta.Multiplicidad
	 * @see #setMultiplicidadDestino(Multiplicidad)
	 * @see abstracta.AbstractaPackage#getTCDComposicion_MultiplicidadDestino()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidadDestino();

	/**
	 * Sets the value of the '{@link abstracta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Destino</em>' attribute.
	 * @see abstracta.Multiplicidad
	 * @see #getMultiplicidadDestino()
	 * @generated
	 */
	void setMultiplicidadDestino(Multiplicidad value);

	/**
	 * Returns the value of the '<em><b>Navegavilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link abstracta.Navegavilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegavilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegavilidad</em>' attribute.
	 * @see abstracta.Navegavilidad
	 * @see #setNavegavilidad(Navegavilidad)
	 * @see abstracta.AbstractaPackage#getTCDComposicion_Navegavilidad()
	 * @model
	 * @generated
	 */
	Navegavilidad getNavegavilidad();

	/**
	 * Sets the value of the '{@link abstracta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegavilidad</em>' attribute.
	 * @see abstracta.Navegavilidad
	 * @see #getNavegavilidad()
	 * @generated
	 */
	void setNavegavilidad(Navegavilidad value);

} // TCDComposicion
