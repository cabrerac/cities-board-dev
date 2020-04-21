/**
 */
package mvc.impl;

import mvc.Controller;
import mvc.Model;
import mvc.MvcPackage;
import mvc.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.ControllerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link mvc.impl.ControllerImpl#getView <em>View</em>}</li>
 *   <li>{@link mvc.impl.ControllerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected View view;

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
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.CONTROLLER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__MODEL, oldModel, newModel);
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
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, MvcPackage.MODEL__CONTROLLER, Model.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, MvcPackage.MODEL__CONTROLLER, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getView() {
		if (view != null && view.eIsProxy()) {
			InternalEObject oldView = (InternalEObject)view;
			view = (View)eResolveProxy(oldView);
			if (view != oldView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.CONTROLLER__VIEW, oldView, view));
			}
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetView(View newView, NotificationChain msgs) {
		View oldView = view;
		view = newView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__VIEW, oldView, newView);
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
	public void setView(View newView) {
		if (newView != view) {
			NotificationChain msgs = null;
			if (view != null)
				msgs = ((InternalEObject)view).eInverseRemove(this, MvcPackage.VIEW__CONTROLLER, View.class, msgs);
			if (newView != null)
				msgs = ((InternalEObject)newView).eInverseAdd(this, MvcPackage.VIEW__CONTROLLER, View.class, msgs);
			msgs = basicSetView(newView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__VIEW, newView, newView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.CONTROLLER__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, MvcPackage.MODEL__CONTROLLER, Model.class, msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case MvcPackage.CONTROLLER__VIEW:
				if (view != null)
					msgs = ((InternalEObject)view).eInverseRemove(this, MvcPackage.VIEW__CONTROLLER, View.class, msgs);
				return basicSetView((View)otherEnd, msgs);
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
			case MvcPackage.CONTROLLER__MODEL:
				return basicSetModel(null, msgs);
			case MvcPackage.CONTROLLER__VIEW:
				return basicSetView(null, msgs);
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
			case MvcPackage.CONTROLLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case MvcPackage.CONTROLLER__VIEW:
				if (resolve) return getView();
				return basicGetView();
			case MvcPackage.CONTROLLER__NAME:
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
			case MvcPackage.CONTROLLER__MODEL:
				setModel((Model)newValue);
				return;
			case MvcPackage.CONTROLLER__VIEW:
				setView((View)newValue);
				return;
			case MvcPackage.CONTROLLER__NAME:
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
			case MvcPackage.CONTROLLER__MODEL:
				setModel((Model)null);
				return;
			case MvcPackage.CONTROLLER__VIEW:
				setView((View)null);
				return;
			case MvcPackage.CONTROLLER__NAME:
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
			case MvcPackage.CONTROLLER__MODEL:
				return model != null;
			case MvcPackage.CONTROLLER__VIEW:
				return view != null;
			case MvcPackage.CONTROLLER__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
