/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.Twitter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.TwitterImpl#getAccountuser <em>Accountuser</em>}</li>
 *   <li>{@link cdb.impl.TwitterImpl#getListname <em>Listname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwitterImpl extends SocialMediaImpl implements Twitter {
	/**
	 * The default value of the '{@link #getAccountuser() <em>Accountuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountuser()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNTUSER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountuser() <em>Accountuser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountuser()
	 * @generated
	 * @ordered
	 */
	protected String accountuser = ACCOUNTUSER_EDEFAULT;

	/**
	 * The default value of the '{@link #getListname() <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListname()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListname() <em>Listname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListname()
	 * @generated
	 * @ordered
	 */
	protected String listname = LISTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.TWITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountuser() {
		return accountuser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountuser(String newAccountuser) {
		String oldAccountuser = accountuser;
		accountuser = newAccountuser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.TWITTER__ACCOUNTUSER, oldAccountuser,
					accountuser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListname() {
		return listname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListname(String newListname) {
		String oldListname = listname;
		listname = newListname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.TWITTER__LISTNAME, oldListname, listname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CdbPackage.TWITTER__ACCOUNTUSER:
			return getAccountuser();
		case CdbPackage.TWITTER__LISTNAME:
			return getListname();
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
		case CdbPackage.TWITTER__ACCOUNTUSER:
			setAccountuser((String) newValue);
			return;
		case CdbPackage.TWITTER__LISTNAME:
			setListname((String) newValue);
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
		case CdbPackage.TWITTER__ACCOUNTUSER:
			setAccountuser(ACCOUNTUSER_EDEFAULT);
			return;
		case CdbPackage.TWITTER__LISTNAME:
			setListname(LISTNAME_EDEFAULT);
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
		case CdbPackage.TWITTER__ACCOUNTUSER:
			return ACCOUNTUSER_EDEFAULT == null ? accountuser != null : !ACCOUNTUSER_EDEFAULT.equals(accountuser);
		case CdbPackage.TWITTER__LISTNAME:
			return LISTNAME_EDEFAULT == null ? listname != null : !LISTNAME_EDEFAULT.equals(listname);
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
		result.append(" (accountuser: ");
		result.append(accountuser);
		result.append(", listname: ");
		result.append(listname);
		result.append(')');
		return result.toString();
	}

} //TwitterImpl
