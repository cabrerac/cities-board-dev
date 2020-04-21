/**
 */
package mvc.impl;

import java.util.Collection;

import mvc.Controller;
import mvc.Model;
import mvc.MvcApplication;
import mvc.MvcPackage;
import mvc.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getPagelink <em>Pagelink</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link mvc.impl.MvcApplicationImpl#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MvcApplicationImpl extends MinimalEObjectImpl.Container implements MvcApplication {
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
	 * The default value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected String picture = PICTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPagelink() <em>Pagelink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagelink()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGELINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPagelink() <em>Pagelink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagelink()
	 * @generated
	 * @ordered
	 */
	protected String pagelink = PAGELINK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MvcApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.MVC_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicture() {
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(String newPicture) {
		String oldPicture = picture;
		picture = newPicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_APPLICATION__PICTURE, oldPicture, picture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_APPLICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_APPLICATION__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPagelink() {
		return pagelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPagelink(String newPagelink) {
		String oldPagelink = pagelink;
		pagelink = newPagelink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.MVC_APPLICATION__PAGELINK, oldPagelink, pagelink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, MvcPackage.MVC_APPLICATION__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, MvcPackage.MVC_APPLICATION__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<Controller>(Controller.class, this, MvcPackage.MVC_APPLICATION__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MvcPackage.MVC_APPLICATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case MvcPackage.MVC_APPLICATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case MvcPackage.MVC_APPLICATION__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
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
			case MvcPackage.MVC_APPLICATION__NAME:
				return getName();
			case MvcPackage.MVC_APPLICATION__PICTURE:
				return getPicture();
			case MvcPackage.MVC_APPLICATION__DESCRIPTION:
				return getDescription();
			case MvcPackage.MVC_APPLICATION__EMAIL:
				return getEmail();
			case MvcPackage.MVC_APPLICATION__PAGELINK:
				return getPagelink();
			case MvcPackage.MVC_APPLICATION__VIEWS:
				return getViews();
			case MvcPackage.MVC_APPLICATION__MODELS:
				return getModels();
			case MvcPackage.MVC_APPLICATION__CONTROLLERS:
				return getControllers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MvcPackage.MVC_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__PICTURE:
				setPicture((String)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__EMAIL:
				setEmail((String)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__PAGELINK:
				setPagelink((String)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case MvcPackage.MVC_APPLICATION__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends Controller>)newValue);
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
			case MvcPackage.MVC_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MvcPackage.MVC_APPLICATION__PICTURE:
				setPicture(PICTURE_EDEFAULT);
				return;
			case MvcPackage.MVC_APPLICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MvcPackage.MVC_APPLICATION__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case MvcPackage.MVC_APPLICATION__PAGELINK:
				setPagelink(PAGELINK_EDEFAULT);
				return;
			case MvcPackage.MVC_APPLICATION__VIEWS:
				getViews().clear();
				return;
			case MvcPackage.MVC_APPLICATION__MODELS:
				getModels().clear();
				return;
			case MvcPackage.MVC_APPLICATION__CONTROLLERS:
				getControllers().clear();
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
			case MvcPackage.MVC_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MvcPackage.MVC_APPLICATION__PICTURE:
				return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
			case MvcPackage.MVC_APPLICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MvcPackage.MVC_APPLICATION__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case MvcPackage.MVC_APPLICATION__PAGELINK:
				return PAGELINK_EDEFAULT == null ? pagelink != null : !PAGELINK_EDEFAULT.equals(pagelink);
			case MvcPackage.MVC_APPLICATION__VIEWS:
				return views != null && !views.isEmpty();
			case MvcPackage.MVC_APPLICATION__MODELS:
				return models != null && !models.isEmpty();
			case MvcPackage.MVC_APPLICATION__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
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
		result.append(", picture: ");
		result.append(picture);
		result.append(", description: ");
		result.append(description);
		result.append(", email: ");
		result.append(email);
		result.append(", pagelink: ");
		result.append(pagelink);
		result.append(')');
		return result.toString();
	}

} //MvcApplicationImpl
