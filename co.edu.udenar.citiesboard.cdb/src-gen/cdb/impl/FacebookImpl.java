/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.Facebook;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facebook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.FacebookImpl#getNamepage <em>Namepage</em>}</li>
 *   <li>{@link cdb.impl.FacebookImpl#getTittlepage <em>Tittlepage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacebookImpl extends SocialMediaImpl implements Facebook {
	/**
	 * The default value of the '{@link #getNamepage() <em>Namepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamepage()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamepage() <em>Namepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamepage()
	 * @generated
	 * @ordered
	 */
	protected String namepage = NAMEPAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTittlepage() <em>Tittlepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittlepage()
	 * @generated
	 * @ordered
	 */
	protected static final String TITTLEPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTittlepage() <em>Tittlepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittlepage()
	 * @generated
	 * @ordered
	 */
	protected String tittlepage = TITTLEPAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacebookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.FACEBOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamepage() {
		return namepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamepage(String newNamepage) {
		String oldNamepage = namepage;
		namepage = newNamepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.FACEBOOK__NAMEPAGE, oldNamepage,
					namepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTittlepage() {
		return tittlepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTittlepage(String newTittlepage) {
		String oldTittlepage = tittlepage;
		tittlepage = newTittlepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.FACEBOOK__TITTLEPAGE, oldTittlepage,
					tittlepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CdbPackage.FACEBOOK__NAMEPAGE:
			return getNamepage();
		case CdbPackage.FACEBOOK__TITTLEPAGE:
			return getTittlepage();
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
		case CdbPackage.FACEBOOK__NAMEPAGE:
			setNamepage((String) newValue);
			return;
		case CdbPackage.FACEBOOK__TITTLEPAGE:
			setTittlepage((String) newValue);
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
		case CdbPackage.FACEBOOK__NAMEPAGE:
			setNamepage(NAMEPAGE_EDEFAULT);
			return;
		case CdbPackage.FACEBOOK__TITTLEPAGE:
			setTittlepage(TITTLEPAGE_EDEFAULT);
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
		case CdbPackage.FACEBOOK__NAMEPAGE:
			return NAMEPAGE_EDEFAULT == null ? namepage != null : !NAMEPAGE_EDEFAULT.equals(namepage);
		case CdbPackage.FACEBOOK__TITTLEPAGE:
			return TITTLEPAGE_EDEFAULT == null ? tittlepage != null : !TITTLEPAGE_EDEFAULT.equals(tittlepage);
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
		result.append(" (namepage: ");
		result.append(namepage);
		result.append(", tittlepage: ");
		result.append(tittlepage);
		result.append(')');
		return result.toString();
	}

} //FacebookImpl
