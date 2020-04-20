/**
 */
package mvc.impl;

import mvc.MvcPackage;
import mvc.Position;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.PositionImpl#getAbove <em>Above</em>}</li>
 *   <li>{@link mvc.impl.PositionImpl#getAlign_left <em>Align left</em>}</li>
 *   <li>{@link mvc.impl.PositionImpl#getWide <em>Wide</em>}</li>
 *   <li>{@link mvc.impl.PositionImpl#getLong <em>Long</em>}</li>
 *   <li>{@link mvc.impl.PositionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getAbove() <em>Above</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbove()
	 * @generated
	 * @ordered
	 */
	protected static final int ABOVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAbove() <em>Above</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbove()
	 * @generated
	 * @ordered
	 */
	protected int above = ABOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign_left() <em>Align left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign_left()
	 * @generated
	 * @ordered
	 */
	protected static final int ALIGN_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlign_left() <em>Align left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign_left()
	 * @generated
	 * @ordered
	 */
	protected int align_left = ALIGN_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWide() <em>Wide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWide()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWide() <em>Wide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWide()
	 * @generated
	 * @ordered
	 */
	protected int wide = WIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final int LONG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected int long_ = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAbove() {
		return above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbove(int newAbove) {
		int oldAbove = above;
		above = newAbove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.POSITION__ABOVE, oldAbove, above));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAlign_left() {
		return align_left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign_left(int newAlign_left) {
		int oldAlign_left = align_left;
		align_left = newAlign_left;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.POSITION__ALIGN_LEFT, oldAlign_left, align_left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWide() {
		return wide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWide(int newWide) {
		int oldWide = wide;
		wide = newWide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.POSITION__WIDE, oldWide, wide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLong(int newLong) {
		int oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.POSITION__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.POSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.POSITION__ABOVE:
				return getAbove();
			case MvcPackage.POSITION__ALIGN_LEFT:
				return getAlign_left();
			case MvcPackage.POSITION__WIDE:
				return getWide();
			case MvcPackage.POSITION__LONG:
				return getLong();
			case MvcPackage.POSITION__NAME:
				return getName();
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
			case MvcPackage.POSITION__ABOVE:
				setAbove((Integer)newValue);
				return;
			case MvcPackage.POSITION__ALIGN_LEFT:
				setAlign_left((Integer)newValue);
				return;
			case MvcPackage.POSITION__WIDE:
				setWide((Integer)newValue);
				return;
			case MvcPackage.POSITION__LONG:
				setLong((Integer)newValue);
				return;
			case MvcPackage.POSITION__NAME:
				setName((String)newValue);
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
			case MvcPackage.POSITION__ABOVE:
				setAbove(ABOVE_EDEFAULT);
				return;
			case MvcPackage.POSITION__ALIGN_LEFT:
				setAlign_left(ALIGN_LEFT_EDEFAULT);
				return;
			case MvcPackage.POSITION__WIDE:
				setWide(WIDE_EDEFAULT);
				return;
			case MvcPackage.POSITION__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case MvcPackage.POSITION__NAME:
				setName(NAME_EDEFAULT);
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
			case MvcPackage.POSITION__ABOVE:
				return above != ABOVE_EDEFAULT;
			case MvcPackage.POSITION__ALIGN_LEFT:
				return align_left != ALIGN_LEFT_EDEFAULT;
			case MvcPackage.POSITION__WIDE:
				return wide != WIDE_EDEFAULT;
			case MvcPackage.POSITION__LONG:
				return long_ != LONG_EDEFAULT;
			case MvcPackage.POSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (above: ");
		result.append(above);
		result.append(", align_left: ");
		result.append(align_left);
		result.append(", wide: ");
		result.append(wide);
		result.append(", long: ");
		result.append(long_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
