/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.Mapc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.MapcImpl#isMarker <em>Marker</em>}</li>
 *   <li>{@link cdb.impl.MapcImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link cdb.impl.MapcImpl#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapcImpl extends VisualisatorImpl implements Mapc {
	/**
	 * The default value of the '{@link #isMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarker()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARKER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarker()
	 * @generated
	 * @ordered
	 */
	protected boolean marker = MARKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.MAPC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMarker() {
		return marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarker(boolean newMarker) {
		boolean oldMarker = marker;
		marker = newMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.MAPC__MARKER, oldMarker, marker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.MAPC__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.MAPC__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CdbPackage.MAPC__MARKER:
			return isMarker();
		case CdbPackage.MAPC__LATITUDE:
			return getLatitude();
		case CdbPackage.MAPC__LONGITUDE:
			return getLongitude();
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
		case CdbPackage.MAPC__MARKER:
			setMarker((Boolean) newValue);
			return;
		case CdbPackage.MAPC__LATITUDE:
			setLatitude((Float) newValue);
			return;
		case CdbPackage.MAPC__LONGITUDE:
			setLongitude((Float) newValue);
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
		case CdbPackage.MAPC__MARKER:
			setMarker(MARKER_EDEFAULT);
			return;
		case CdbPackage.MAPC__LATITUDE:
			setLatitude(LATITUDE_EDEFAULT);
			return;
		case CdbPackage.MAPC__LONGITUDE:
			setLongitude(LONGITUDE_EDEFAULT);
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
		case CdbPackage.MAPC__MARKER:
			return marker != MARKER_EDEFAULT;
		case CdbPackage.MAPC__LATITUDE:
			return latitude != LATITUDE_EDEFAULT;
		case CdbPackage.MAPC__LONGITUDE:
			return longitude != LONGITUDE_EDEFAULT;
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
		result.append(" (marker: ");
		result.append(marker);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(')');
		return result.toString();
	}

} //MapcImpl
