/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.Dashboard;
import cdb.DataSource;
import cdb.Visualisator;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.DashboardImpl#getName <em>Name</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getPagelink <em>Pagelink</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getVisualisator <em>Visualisator</em>}</li>
 *   <li>{@link cdb.impl.DashboardImpl#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashboardImpl extends MinimalEObjectImpl.Container implements Dashboard {
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
	 * The cached value of the '{@link #getVisualisator() <em>Visualisator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualisator()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualisator> visualisator;

	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> datasource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.DASHBOARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DASHBOARD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DASHBOARD__PICTURE, oldPicture, picture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DASHBOARD__DESCRIPTION, oldDescription,
					description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DASHBOARD__EMAIL, oldEmail, email));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DASHBOARD__PAGELINK, oldPagelink,
					pagelink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Visualisator> getVisualisator() {
		if (visualisator == null) {
			visualisator = new EObjectContainmentEList<Visualisator>(Visualisator.class, this,
					CdbPackage.DASHBOARD__VISUALISATOR);
		}
		return visualisator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataSource> getDatasource() {
		if (datasource == null) {
			datasource = new EObjectContainmentEList<DataSource>(DataSource.class, this,
					CdbPackage.DASHBOARD__DATASOURCE);
		}
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.DASHBOARD__VISUALISATOR:
			return ((InternalEList<?>) getVisualisator()).basicRemove(otherEnd, msgs);
		case CdbPackage.DASHBOARD__DATASOURCE:
			return ((InternalEList<?>) getDatasource()).basicRemove(otherEnd, msgs);
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
		case CdbPackage.DASHBOARD__NAME:
			return getName();
		case CdbPackage.DASHBOARD__PICTURE:
			return getPicture();
		case CdbPackage.DASHBOARD__DESCRIPTION:
			return getDescription();
		case CdbPackage.DASHBOARD__EMAIL:
			return getEmail();
		case CdbPackage.DASHBOARD__PAGELINK:
			return getPagelink();
		case CdbPackage.DASHBOARD__VISUALISATOR:
			return getVisualisator();
		case CdbPackage.DASHBOARD__DATASOURCE:
			return getDatasource();
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
		case CdbPackage.DASHBOARD__NAME:
			setName((String) newValue);
			return;
		case CdbPackage.DASHBOARD__PICTURE:
			setPicture((String) newValue);
			return;
		case CdbPackage.DASHBOARD__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CdbPackage.DASHBOARD__EMAIL:
			setEmail((String) newValue);
			return;
		case CdbPackage.DASHBOARD__PAGELINK:
			setPagelink((String) newValue);
			return;
		case CdbPackage.DASHBOARD__VISUALISATOR:
			getVisualisator().clear();
			getVisualisator().addAll((Collection<? extends Visualisator>) newValue);
			return;
		case CdbPackage.DASHBOARD__DATASOURCE:
			getDatasource().clear();
			getDatasource().addAll((Collection<? extends DataSource>) newValue);
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
		case CdbPackage.DASHBOARD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CdbPackage.DASHBOARD__PICTURE:
			setPicture(PICTURE_EDEFAULT);
			return;
		case CdbPackage.DASHBOARD__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CdbPackage.DASHBOARD__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case CdbPackage.DASHBOARD__PAGELINK:
			setPagelink(PAGELINK_EDEFAULT);
			return;
		case CdbPackage.DASHBOARD__VISUALISATOR:
			getVisualisator().clear();
			return;
		case CdbPackage.DASHBOARD__DATASOURCE:
			getDatasource().clear();
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
		case CdbPackage.DASHBOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CdbPackage.DASHBOARD__PICTURE:
			return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
		case CdbPackage.DASHBOARD__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CdbPackage.DASHBOARD__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case CdbPackage.DASHBOARD__PAGELINK:
			return PAGELINK_EDEFAULT == null ? pagelink != null : !PAGELINK_EDEFAULT.equals(pagelink);
		case CdbPackage.DASHBOARD__VISUALISATOR:
			return visualisator != null && !visualisator.isEmpty();
		case CdbPackage.DASHBOARD__DATASOURCE:
			return datasource != null && !datasource.isEmpty();
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

} //DashboardImpl
