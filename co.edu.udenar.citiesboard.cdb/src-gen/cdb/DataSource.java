/**
 */
package cdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.DataSource#getName <em>Name</em>}</li>
 *   <li>{@link cdb.DataSource#getProvider <em>Provider</em>}</li>
 *   <li>{@link cdb.DataSource#isState <em>State</em>}</li>
 *   <li>{@link cdb.DataSource#getPresentedby <em>Presentedby</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cdb.CdbPackage#getDataSource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cdb.DataSource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see cdb.CdbPackage#getDataSource_Provider()
	 * @model required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link cdb.DataSource#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(boolean)
	 * @see cdb.CdbPackage#getDataSource_State()
	 * @model required="true"
	 * @generated
	 */
	boolean isState();

	/**
	 * Sets the value of the '{@link cdb.DataSource#isState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #isState()
	 * @generated
	 */
	void setState(boolean value);

	/**
	 * Returns the value of the '<em><b>Presentedby</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdb.Visualisator#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentedby</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentedby</em>' reference.
	 * @see #setPresentedby(Visualisator)
	 * @see cdb.CdbPackage#getDataSource_Presentedby()
	 * @see cdb.Visualisator#getPresents
	 * @model opposite="presents" required="true"
	 * @generated
	 */
	Visualisator getPresentedby();

	/**
	 * Sets the value of the '{@link cdb.DataSource#getPresentedby <em>Presentedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentedby</em>' reference.
	 * @see #getPresentedby()
	 * @generated
	 */
	void setPresentedby(Visualisator value);

} // DataSource
