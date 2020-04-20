/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.DataSource;
import cdb.Visualisator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.DataSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cdb.impl.DataSourceImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link cdb.impl.DataSourceImpl#isState <em>State</em>}</li>
 *   <li>{@link cdb.impl.DataSourceImpl#getPresentedby <em>Presentedby</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSourceImpl extends MinimalEObjectImpl.Container implements DataSource {
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
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isState()
	 * @generated
	 * @ordered
	 */
	protected boolean state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentedby() <em>Presentedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentedby()
	 * @generated
	 * @ordered
	 */
	protected Visualisator presentedby;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.DATA_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DATA_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DATA_SOURCE__PROVIDER, oldProvider,
					provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(boolean newState) {
		boolean oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DATA_SOURCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualisator getPresentedby() {
		if (presentedby != null && presentedby.eIsProxy()) {
			InternalEObject oldPresentedby = (InternalEObject) presentedby;
			presentedby = (Visualisator) eResolveProxy(oldPresentedby);
			if (presentedby != oldPresentedby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdbPackage.DATA_SOURCE__PRESENTEDBY,
							oldPresentedby, presentedby));
			}
		}
		return presentedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualisator basicGetPresentedby() {
		return presentedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentedby(Visualisator newPresentedby, NotificationChain msgs) {
		Visualisator oldPresentedby = presentedby;
		presentedby = newPresentedby;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CdbPackage.DATA_SOURCE__PRESENTEDBY, oldPresentedby, newPresentedby);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentedby(Visualisator newPresentedby) {
		if (newPresentedby != presentedby) {
			NotificationChain msgs = null;
			if (presentedby != null)
				msgs = ((InternalEObject) presentedby).eInverseRemove(this, CdbPackage.VISUALISATOR__PRESENTS,
						Visualisator.class, msgs);
			if (newPresentedby != null)
				msgs = ((InternalEObject) newPresentedby).eInverseAdd(this, CdbPackage.VISUALISATOR__PRESENTS,
						Visualisator.class, msgs);
			msgs = basicSetPresentedby(newPresentedby, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.DATA_SOURCE__PRESENTEDBY, newPresentedby,
					newPresentedby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			if (presentedby != null)
				msgs = ((InternalEObject) presentedby).eInverseRemove(this, CdbPackage.VISUALISATOR__PRESENTS,
						Visualisator.class, msgs);
			return basicSetPresentedby((Visualisator) otherEnd, msgs);
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
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			return basicSetPresentedby(null, msgs);
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
		case CdbPackage.DATA_SOURCE__NAME:
			return getName();
		case CdbPackage.DATA_SOURCE__PROVIDER:
			return getProvider();
		case CdbPackage.DATA_SOURCE__STATE:
			return isState();
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			if (resolve)
				return getPresentedby();
			return basicGetPresentedby();
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
		case CdbPackage.DATA_SOURCE__NAME:
			setName((String) newValue);
			return;
		case CdbPackage.DATA_SOURCE__PROVIDER:
			setProvider((String) newValue);
			return;
		case CdbPackage.DATA_SOURCE__STATE:
			setState((Boolean) newValue);
			return;
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			setPresentedby((Visualisator) newValue);
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
		case CdbPackage.DATA_SOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CdbPackage.DATA_SOURCE__PROVIDER:
			setProvider(PROVIDER_EDEFAULT);
			return;
		case CdbPackage.DATA_SOURCE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			setPresentedby((Visualisator) null);
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
		case CdbPackage.DATA_SOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CdbPackage.DATA_SOURCE__PROVIDER:
			return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
		case CdbPackage.DATA_SOURCE__STATE:
			return state != STATE_EDEFAULT;
		case CdbPackage.DATA_SOURCE__PRESENTEDBY:
			return presentedby != null;
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
		result.append(", provider: ");
		result.append(provider);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
