/**
 */
package cdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Streamed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Streamed#getMethod <em>Method</em>}</li>
 *   <li>{@link cdb.Streamed#getURL_service <em>URL service</em>}</li>
 *   <li>{@link cdb.Streamed#getReturnparameter <em>Returnparameter</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getStreamed()
 * @model
 * @generated
 */
public interface Streamed extends DataSource {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see cdb.CdbPackage#getStreamed_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link cdb.Streamed#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

	/**
	 * Returns the value of the '<em><b>URL service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URL service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL service</em>' attribute.
	 * @see #setURL_service(String)
	 * @see cdb.CdbPackage#getStreamed_URL_service()
	 * @model required="true"
	 * @generated
	 */
	String getURL_service();

	/**
	 * Sets the value of the '{@link cdb.Streamed#getURL_service <em>URL service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL service</em>' attribute.
	 * @see #getURL_service()
	 * @generated
	 */
	void setURL_service(String value);

	/**
	 * Returns the value of the '<em><b>Returnparameter</b></em>' reference list.
	 * The list contents are of type {@link cdb.DataEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returnparameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnparameter</em>' reference list.
	 * @see cdb.CdbPackage#getStreamed_Returnparameter()
	 * @model
	 * @generated
	 */
	EList<DataEntity> getReturnparameter();

} // Streamed
