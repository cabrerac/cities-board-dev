/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.Youtube;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Youtube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.YoutubeImpl#getUrlList <em>Url List</em>}</li>
 *   <li>{@link cdb.impl.YoutubeImpl#getChannelname <em>Channelname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YoutubeImpl extends SocialMediaImpl implements Youtube {
	/**
	 * The default value of the '{@link #getUrlList() <em>Url List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlList()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlList() <em>Url List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlList()
	 * @generated
	 * @ordered
	 */
	protected String urlList = URL_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelname() <em>Channelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelname()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNELNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelname() <em>Channelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelname()
	 * @generated
	 * @ordered
	 */
	protected String channelname = CHANNELNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YoutubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.YOUTUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrlList() {
		return urlList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrlList(String newUrlList) {
		String oldUrlList = urlList;
		urlList = newUrlList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.YOUTUBE__URL_LIST, oldUrlList, urlList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannelname() {
		return channelname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelname(String newChannelname) {
		String oldChannelname = channelname;
		channelname = newChannelname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.YOUTUBE__CHANNELNAME, oldChannelname,
					channelname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CdbPackage.YOUTUBE__URL_LIST:
			return getUrlList();
		case CdbPackage.YOUTUBE__CHANNELNAME:
			return getChannelname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CdbPackage.YOUTUBE__URL_LIST:
			setUrlList((String) newValue);
			return;
		case CdbPackage.YOUTUBE__CHANNELNAME:
			setChannelname((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CdbPackage.YOUTUBE__URL_LIST:
			setUrlList(URL_LIST_EDEFAULT);
			return;
		case CdbPackage.YOUTUBE__CHANNELNAME:
			setChannelname(CHANNELNAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CdbPackage.YOUTUBE__URL_LIST:
			return URL_LIST_EDEFAULT == null ? urlList != null : !URL_LIST_EDEFAULT.equals(urlList);
		case CdbPackage.YOUTUBE__CHANNELNAME:
			return CHANNELNAME_EDEFAULT == null ? channelname != null : !CHANNELNAME_EDEFAULT.equals(channelname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (urlList: ");
		result.append(urlList);
		result.append(", channelname: ");
		result.append(channelname);
		result.append(')');
		return result.toString();
	}

} //YoutubeImpl
