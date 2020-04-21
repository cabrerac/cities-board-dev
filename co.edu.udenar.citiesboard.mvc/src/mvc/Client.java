/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Client#getMethod <em>Method</em>}</li>
 *   <li>{@link mvc.Client#getNameservice <em>Nameservice</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Model {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see mvc.MvcPackage#getClient_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link mvc.Client#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>Nameservice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameservice</em>' attribute.
	 * @see #setNameservice(String)
	 * @see mvc.MvcPackage#getClient_Nameservice()
	 * @model required="true"
	 * @generated
	 */
	String getNameservice();

	/**
	 * Sets the value of the '{@link mvc.Client#getNameservice <em>Nameservice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameservice</em>' attribute.
	 * @see #getNameservice()
	 * @generated
	 */
	void setNameservice(String value);

} // Client
