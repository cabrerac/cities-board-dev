/**
 */
package cdb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pie Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.PieChart#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getPieChart()
 * @model
 * @generated
 */
public interface PieChart extends Chart {
	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(int)
	 * @see cdb.CdbPackage#getPieChart_StepSize()
	 * @model required="true"
	 * @generated
	 */
	int getStepSize();

	/**
	 * Sets the value of the '{@link cdb.PieChart#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(int value);

} // PieChart
