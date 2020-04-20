/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Twitter#getAccountuser <em>Accountuser</em>}</li>
 *   <li>{@link cdb.Twitter#getListname <em>Listname</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getTwitter()
 * @model
 * @generated
 */
public interface Twitter extends SocialMedia {
	/**
	 * Returns the value of the '<em><b>Accountuser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountuser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountuser</em>' attribute.
	 * @see #setAccountuser(String)
	 * @see cdb.CdbPackage#getTwitter_Accountuser()
	 * @model required="true"
	 * @generated
	 */
	String getAccountuser();

	/**
	 * Sets the value of the '{@link cdb.Twitter#getAccountuser <em>Accountuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountuser</em>' attribute.
	 * @see #getAccountuser()
	 * @generated
	 */
	void setAccountuser(String value);

	/**
	 * Returns the value of the '<em><b>Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listname</em>' attribute.
	 * @see #setListname(String)
	 * @see cdb.CdbPackage#getTwitter_Listname()
	 * @model required="true"
	 * @generated
	 */
	String getListname();

	/**
	 * Sets the value of the '{@link cdb.Twitter#getListname <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listname</em>' attribute.
	 * @see #getListname()
	 * @generated
	 */
	void setListname(String value);

} // Twitter
