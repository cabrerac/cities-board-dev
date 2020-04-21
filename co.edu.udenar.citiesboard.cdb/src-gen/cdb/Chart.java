/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Chart#getLabel <em>Label</em>}</li>
 *   <li>{@link cdb.Chart#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends Visualisator {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(DataEntity)
	 * @see cdb.CdbPackage#getChart_Label()
	 * @model required="true"
	 * @generated
	 */
	DataEntity getLabel();

	/**
	 * Sets the value of the '{@link cdb.Chart#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(DataEntity value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(DataEntity)
	 * @see cdb.CdbPackage#getChart_Data()
	 * @model required="true"
	 * @generated
	 */
	DataEntity getData();

	/**
	 * Sets the value of the '{@link cdb.Chart#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataEntity value);

} // Chart
