/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.DataEntity;
import cdb.Method;
import cdb.Streamed;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streamed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.StreamedImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link cdb.impl.StreamedImpl#getURL_service <em>URL service</em>}</li>
 *   <li>{@link cdb.impl.StreamedImpl#getReturnparameter <em>Returnparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamedImpl extends DataSourceImpl implements Streamed {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

	/**
	 * The default value of the '{@link #getURL_service() <em>URL service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL_service()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL_service() <em>URL service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL_service()
	 * @generated
	 * @ordered
	 */
	protected String urL_service = URL_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnparameter() <em>Returnparameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> returnparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.STREAMED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CdbPackage.STREAMED__METHOD,
					oldMethod, newMethod);
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
	public void setMethod(Method newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CdbPackage.STREAMED__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CdbPackage.STREAMED__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.STREAMED__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURL_service() {
		return urL_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURL_service(String newURL_service) {
		String oldURL_service = urL_service;
		urL_service = newURL_service;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.STREAMED__URL_SERVICE, oldURL_service,
					urL_service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataEntity> getReturnparameter() {
		if (returnparameter == null) {
			returnparameter = new EObjectResolvingEList<DataEntity>(DataEntity.class, this,
					CdbPackage.STREAMED__RETURNPARAMETER);
		}
		return returnparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.STREAMED__METHOD:
			return basicSetMethod(null, msgs);
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
		case CdbPackage.STREAMED__METHOD:
			return getMethod();
		case CdbPackage.STREAMED__URL_SERVICE:
			return getURL_service();
		case CdbPackage.STREAMED__RETURNPARAMETER:
			return getReturnparameter();
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
		case CdbPackage.STREAMED__METHOD:
			setMethod((Method) newValue);
			return;
		case CdbPackage.STREAMED__URL_SERVICE:
			setURL_service((String) newValue);
			return;
		case CdbPackage.STREAMED__RETURNPARAMETER:
			getReturnparameter().clear();
			getReturnparameter().addAll((Collection<? extends DataEntity>) newValue);
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
		case CdbPackage.STREAMED__METHOD:
			setMethod((Method) null);
			return;
		case CdbPackage.STREAMED__URL_SERVICE:
			setURL_service(URL_SERVICE_EDEFAULT);
			return;
		case CdbPackage.STREAMED__RETURNPARAMETER:
			getReturnparameter().clear();
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
		case CdbPackage.STREAMED__METHOD:
			return method != null;
		case CdbPackage.STREAMED__URL_SERVICE:
			return URL_SERVICE_EDEFAULT == null ? urL_service != null : !URL_SERVICE_EDEFAULT.equals(urL_service);
		case CdbPackage.STREAMED__RETURNPARAMETER:
			return returnparameter != null && !returnparameter.isEmpty();
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
		result.append(" (URL_service: ");
		result.append(urL_service);
		result.append(')');
		return result.toString();
	}

} //StreamedImpl
