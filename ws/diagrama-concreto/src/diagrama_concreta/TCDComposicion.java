/**
 */
package diagrama_concreta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCD Composicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link diagrama_concreta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}</li>
 *   <li>{@link diagrama_concreta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}</li>
 *   <li>{@link diagrama_concreta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}</li>
 *   <li>{@link diagrama_concreta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}</li>
 *   <li>{@link diagrama_concreta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}</li>
 * </ul>
 *
 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion()
 * @model annotation="gmf.link source='source' target='target' label='nombreDestino, multiplicidadDestino' label.pattern='{0}  {1}' style='dash' width='3' color='0,255,193' source.decoration='rhomb'"
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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion_NombreOrigen()
	 * @model
	 * @generated
	 */
	String getNombreOrigen();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDComposicion#getNombreOrigen <em>Nombre Origen</em>}' attribute.
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
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion_NombreDestino()
	 * @model
	 * @generated
	 */
	String getNombreDestino();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDComposicion#getNombreDestino <em>Nombre Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Destino</em>' attribute.
	 * @see #getNombreDestino()
	 * @generated
	 */
	void setNombreDestino(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Origen</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Origen</em>' attribute.
	 * @see diagrama_concreta.Multiplicidad
	 * @see #setMultiplicidadOrigen(Multiplicidad)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion_MultiplicidadOrigen()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidadOrigen();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDComposicion#getMultiplicidadOrigen <em>Multiplicidad Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Origen</em>' attribute.
	 * @see diagrama_concreta.Multiplicidad
	 * @see #getMultiplicidadOrigen()
	 * @generated
	 */
	void setMultiplicidadOrigen(Multiplicidad value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad Destino</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.Multiplicidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicidad Destino</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad Destino</em>' attribute.
	 * @see diagrama_concreta.Multiplicidad
	 * @see #setMultiplicidadDestino(Multiplicidad)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion_MultiplicidadDestino()
	 * @model
	 * @generated
	 */
	Multiplicidad getMultiplicidadDestino();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDComposicion#getMultiplicidadDestino <em>Multiplicidad Destino</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad Destino</em>' attribute.
	 * @see diagrama_concreta.Multiplicidad
	 * @see #getMultiplicidadDestino()
	 * @generated
	 */
	void setMultiplicidadDestino(Multiplicidad value);

	/**
	 * Returns the value of the '<em><b>Navegavilidad</b></em>' attribute.
	 * The literals are from the enumeration {@link diagrama_concreta.Navegavilidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navegavilidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navegavilidad</em>' attribute.
	 * @see diagrama_concreta.Navegavilidad
	 * @see #setNavegavilidad(Navegavilidad)
	 * @see diagrama_concreta.Diagrama_concretaPackage#getTCDComposicion_Navegavilidad()
	 * @model
	 * @generated
	 */
	Navegavilidad getNavegavilidad();

	/**
	 * Sets the value of the '{@link diagrama_concreta.TCDComposicion#getNavegavilidad <em>Navegavilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navegavilidad</em>' attribute.
	 * @see diagrama_concreta.Navegavilidad
	 * @see #getNavegavilidad()
	 * @generated
	 */
	void setNavegavilidad(Navegavilidad value);

} // TCDComposicion
