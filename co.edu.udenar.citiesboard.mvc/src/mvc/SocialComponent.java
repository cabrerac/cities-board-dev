/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.SocialComponent#getSocial <em>Social</em>}</li>
 *   <li>{@link mvc.SocialComponent#getSocialname <em>Socialname</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getSocialComponent()
 * @model
 * @generated
 */
public interface SocialComponent extends View {
	/**
	 * Returns the value of the '<em><b>Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Social</em>' attribute.
	 * @see #setSocial(String)
	 * @see mvc.MvcPackage#getSocialComponent_Social()
	 * @model required="true"
	 * @generated
	 */
	String getSocial();

	/**
	 * Sets the value of the '{@link mvc.SocialComponent#getSocial <em>Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Social</em>' attribute.
	 * @see #getSocial()
	 * @generated
	 */
	void setSocial(String value);

	/**
	 * Returns the value of the '<em><b>Socialname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socialname</em>' attribute.
	 * @see #setSocialname(String)
	 * @see mvc.MvcPackage#getSocialComponent_Socialname()
	 * @model required="true"
	 * @generated
	 */
	String getSocialname();

	/**
	 * Sets the value of the '{@link mvc.SocialComponent#getSocialname <em>Socialname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socialname</em>' attribute.
	 * @see #getSocialname()
	 * @generated
	 */
	void setSocialname(String value);

} // SocialComponent
