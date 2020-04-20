/**
 */
package mvc.impl;

import mvc.MvcPackage;
import mvc.SocialComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Social Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.SocialComponentImpl#getSocial <em>Social</em>}</li>
 *   <li>{@link mvc.impl.SocialComponentImpl#getSocialname <em>Socialname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocialComponentImpl extends ViewImpl implements SocialComponent {
	/**
	 * The default value of the '{@link #getSocial() <em>Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocial()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocial() <em>Social</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocial()
	 * @generated
	 * @ordered
	 */
	protected String social = SOCIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSocialname() <em>Socialname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialname()
	 * @generated
	 * @ordered
	 */
	protected static final String SOCIALNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSocialname() <em>Socialname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialname()
	 * @generated
	 * @ordered
	 */
	protected String socialname = SOCIALNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.SOCIAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocial() {
		return social;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocial(String newSocial) {
		String oldSocial = social;
		social = newSocial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.SOCIAL_COMPONENT__SOCIAL, oldSocial, social));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSocialname() {
		return socialname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSocialname(String newSocialname) {
		String oldSocialname = socialname;
		socialname = newSocialname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.SOCIAL_COMPONENT__SOCIALNAME, oldSocialname, socialname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.SOCIAL_COMPONENT__SOCIAL:
				return getSocial();
			case MvcPackage.SOCIAL_COMPONENT__SOCIALNAME:
				return getSocialname();
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
			case MvcPackage.SOCIAL_COMPONENT__SOCIAL:
				setSocial((String)newValue);
				return;
			case MvcPackage.SOCIAL_COMPONENT__SOCIALNAME:
				setSocialname((String)newValue);
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
			case MvcPackage.SOCIAL_COMPONENT__SOCIAL:
				setSocial(SOCIAL_EDEFAULT);
				return;
			case MvcPackage.SOCIAL_COMPONENT__SOCIALNAME:
				setSocialname(SOCIALNAME_EDEFAULT);
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
			case MvcPackage.SOCIAL_COMPONENT__SOCIAL:
				return SOCIAL_EDEFAULT == null ? social != null : !SOCIAL_EDEFAULT.equals(social);
			case MvcPackage.SOCIAL_COMPONENT__SOCIALNAME:
				return SOCIALNAME_EDEFAULT == null ? socialname != null : !SOCIALNAME_EDEFAULT.equals(socialname);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (social: ");
		result.append(social);
		result.append(", socialname: ");
		result.append(socialname);
		result.append(')');
		return result.toString();
	}

} //SocialComponentImpl
