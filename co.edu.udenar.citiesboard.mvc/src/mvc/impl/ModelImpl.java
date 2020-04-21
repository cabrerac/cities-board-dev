/**
 */
package mvc.impl;

import mvc.Controller;
import mvc.Model;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.ModelImpl#getNameclass <em>Nameclass</em>}</li>
 *   <li>{@link mvc.impl.ModelImpl#getType <em>Type</em>}</li>
 *   <li>{@link mvc.impl.ModelImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getNameclass() <em>Nameclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameclass()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMECLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameclass() <em>Nameclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameclass()
	 * @generated
	 * @ordered
	 */
	protected String nameclass = NAMECLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameclass() {
		return nameclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameclass(String newNameclass) {
		String oldNameclass = nameclass;
		nameclass = newNameclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MODEL__NAMECLASS, oldNameclass, nameclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MODEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcPackage.MODEL__CONTROLLER, oldController, newController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(Controller newController) {
		if (newController != controller) {
			NotificationChain msgs = null;
			if (controller != null)
				msgs = ((InternalEObject)controller).eInverseRemove(this, MvcPackage.CONTROLLER__MODEL, Controller.class, msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, MvcPackage.CONTROLLER__MODEL, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MODEL__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.MODEL__CONTROLLER:
				if (controller != null)
					msgs = ((InternalEObject)controller).eInverseRemove(this, MvcPackage.CONTROLLER__MODEL, Controller.class, msgs);
				return basicSetController((Controller)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.MODEL__CONTROLLER:
				return basicSetController(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.MODEL__NAMECLASS:
				return getNameclass();
			case MvcPackage.MODEL__TYPE:
				return getType();
			case MvcPackage.MODEL__CONTROLLER:
				return getController();
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
			case MvcPackage.MODEL__NAMECLASS:
				setNameclass((String)newValue);
				return;
			case MvcPackage.MODEL__TYPE:
				setType((String)newValue);
				return;
			case MvcPackage.MODEL__CONTROLLER:
				setController((Controller)newValue);
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
			case MvcPackage.MODEL__NAMECLASS:
				setNameclass(NAMECLASS_EDEFAULT);
				return;
			case MvcPackage.MODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case MvcPackage.MODEL__CONTROLLER:
				setController((Controller)null);
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
			case MvcPackage.MODEL__NAMECLASS:
				return NAMECLASS_EDEFAULT == null ? nameclass != null : !NAMECLASS_EDEFAULT.equals(nameclass);
			case MvcPackage.MODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case MvcPackage.MODEL__CONTROLLER:
				return controller != null;
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
		result.append(" (nameclass: ");
		result.append(nameclass);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
