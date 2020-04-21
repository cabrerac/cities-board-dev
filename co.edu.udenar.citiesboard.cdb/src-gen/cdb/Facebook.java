/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facebook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Facebook#getNamepage <em>Namepage</em>}</li>
 *   <li>{@link cdb.Facebook#getTittlepage <em>Tittlepage</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getFacebook()
 * @model
 * @generated
 */
public interface Facebook extends SocialMedia {
	/**
	 * Returns the value of the '<em><b>Namepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namepage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namepage</em>' attribute.
	 * @see #setNamepage(String)
	 * @see cdb.CdbPackage#getFacebook_Namepage()
	 * @model required="true"
	 * @generated
	 */
	String getNamepage();

	/**
	 * Sets the value of the '{@link cdb.Facebook#getNamepage <em>Namepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namepage</em>' attribute.
	 * @see #getNamepage()
	 * @generated
	 */
	void setNamepage(String value);

	/**
	 * Returns the value of the '<em><b>Tittlepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tittlepage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tittlepage</em>' attribute.
	 * @see #setTittlepage(String)
	 * @see cdb.CdbPackage#getFacebook_Tittlepage()
	 * @model required="true"
	 * @generated
	 */
	String getTittlepage();

	/**
	 * Sets the value of the '{@link cdb.Facebook#getTittlepage <em>Tittlepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tittlepage</em>' attribute.
	 * @see #getTittlepage()
	 * @generated
	 */
	void setTittlepage(String value);

} // Facebook
