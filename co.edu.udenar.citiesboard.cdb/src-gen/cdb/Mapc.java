/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Mapc#isMarker <em>Marker</em>}</li>
 *   <li>{@link cdb.Mapc#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link cdb.Mapc#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getMapc()
 * @model
 * @generated
 */
public interface Mapc extends Visualisator {
	/**
	 * Returns the value of the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' attribute.
	 * @see #setMarker(boolean)
	 * @see cdb.CdbPackage#getMapc_Marker()
	 * @model required="true"
	 * @generated
	 */
	boolean isMarker();

	/**
	 * Sets the value of the '{@link cdb.Mapc#isMarker <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' attribute.
	 * @see #isMarker()
	 * @generated
	 */
	void setMarker(boolean value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(float)
	 * @see cdb.CdbPackage#getMapc_Latitude()
	 * @model required="true"
	 * @generated
	 */
	float getLatitude();

	/**
	 * Sets the value of the '{@link cdb.Mapc#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(float value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(float)
	 * @see cdb.CdbPackage#getMapc_Longitude()
	 * @model required="true"
	 * @generated
	 */
	float getLongitude();

	/**
	 * Sets the value of the '{@link cdb.Mapc#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(float value);

} // Mapc
