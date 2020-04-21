/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Youtube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Youtube#getUrlList <em>Url List</em>}</li>
 *   <li>{@link cdb.Youtube#getChannelname <em>Channelname</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getYoutube()
 * @model
 * @generated
 */
public interface Youtube extends SocialMedia {
	/**
	 * Returns the value of the '<em><b>Url List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url List</em>' attribute.
	 * @see #setUrlList(String)
	 * @see cdb.CdbPackage#getYoutube_UrlList()
	 * @model required="true"
	 * @generated
	 */
	String getUrlList();

	/**
	 * Sets the value of the '{@link cdb.Youtube#getUrlList <em>Url List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url List</em>' attribute.
	 * @see #getUrlList()
	 * @generated
	 */
	void setUrlList(String value);

	/**
	 * Returns the value of the '<em><b>Channelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channelname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channelname</em>' attribute.
	 * @see #setChannelname(String)
	 * @see cdb.CdbPackage#getYoutube_Channelname()
	 * @model required="true"
	 * @generated
	 */
	String getChannelname();

	/**
	 * Sets the value of the '{@link cdb.Youtube#getChannelname <em>Channelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channelname</em>' attribute.
	 * @see #getChannelname()
	 * @generated
	 */
	void setChannelname(String value);

} // Youtube
