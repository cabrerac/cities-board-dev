/**
 */
package mvc.impl;

import mvc.Attribute;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.AttributeImpl#getNameattribute <em>Nameattribute</em>}</li>
 *   <li>{@link mvc.impl.AttributeImpl#getTypeattribute <em>Typeattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getNameattribute() <em>Nameattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameattribute()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameattribute() <em>Nameattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameattribute()
	 * @generated
	 * @ordered
	 */
	protected String nameattribute = NAMEATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeattribute() <em>Typeattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeattribute()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPEATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeattribute() <em>Typeattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeattribute()
	 * @generated
	 * @ordered
	 */
	protected String typeattribute = TYPEATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameattribute() {
		return nameattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameattribute(String newNameattribute) {
		String oldNameattribute = nameattribute;
		nameattribute = newNameattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.ATTRIBUTE__NAMEATTRIBUTE, oldNameattribute, nameattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeattribute() {
		return typeattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeattribute(String newTypeattribute) {
		String oldTypeattribute = typeattribute;
		typeattribute = newTypeattribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.ATTRIBUTE__TYPEATTRIBUTE, oldTypeattribute, typeattribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.ATTRIBUTE__NAMEATTRIBUTE:
				return getNameattribute();
			case MvcPackage.ATTRIBUTE__TYPEATTRIBUTE:
				return getTypeattribute();
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
			case MvcPackage.ATTRIBUTE__NAMEATTRIBUTE:
				setNameattribute((String)newValue);
				return;
			case MvcPackage.ATTRIBUTE__TYPEATTRIBUTE:
				setTypeattribute((String)newValue);
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
			case MvcPackage.ATTRIBUTE__NAMEATTRIBUTE:
				setNameattribute(NAMEATTRIBUTE_EDEFAULT);
				return;
			case MvcPackage.ATTRIBUTE__TYPEATTRIBUTE:
				setTypeattribute(TYPEATTRIBUTE_EDEFAULT);
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
			case MvcPackage.ATTRIBUTE__NAMEATTRIBUTE:
				return NAMEATTRIBUTE_EDEFAULT == null ? nameattribute != null : !NAMEATTRIBUTE_EDEFAULT.equals(nameattribute);
			case MvcPackage.ATTRIBUTE__TYPEATTRIBUTE:
				return TYPEATTRIBUTE_EDEFAULT == null ? typeattribute != null : !TYPEATTRIBUTE_EDEFAULT.equals(typeattribute);
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
		result.append(" (nameattribute: ");
		result.append(nameattribute);
		result.append(", typeattribute: ");
		result.append(typeattribute);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
