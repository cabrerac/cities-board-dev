/**
 */
package cdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Dashboard#getName <em>Name</em>}</li>
 *   <li>{@link cdb.Dashboard#getPicture <em>Picture</em>}</li>
 *   <li>{@link cdb.Dashboard#getDescription <em>Description</em>}</li>
 *   <li>{@link cdb.Dashboard#getEmail <em>Email</em>}</li>
 *   <li>{@link cdb.Dashboard#getPagelink <em>Pagelink</em>}</li>
 *   <li>{@link cdb.Dashboard#getVisualisator <em>Visualisator</em>}</li>
 *   <li>{@link cdb.Dashboard#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
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
	 * @see cdb.CdbPackage#getDashboard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cdb.Dashboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see cdb.CdbPackage#getDashboard_Picture()
	 * @model required="true"
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link cdb.Dashboard#getPicture <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture</em>' attribute.
	 * @see #getPicture()
	 * @generated
	 */
	void setPicture(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cdb.CdbPackage#getDashboard_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cdb.Dashboard#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see cdb.CdbPackage#getDashboard_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link cdb.Dashboard#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Pagelink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagelink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagelink</em>' attribute.
	 * @see #setPagelink(String)
	 * @see cdb.CdbPackage#getDashboard_Pagelink()
	 * @model required="true"
	 * @generated
	 */
	String getPagelink();

	/**
	 * Sets the value of the '{@link cdb.Dashboard#getPagelink <em>Pagelink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagelink</em>' attribute.
	 * @see #getPagelink()
	 * @generated
	 */
	void setPagelink(String value);

	/**
	 * Returns the value of the '<em><b>Visualisator</b></em>' containment reference list.
	 * The list contents are of type {@link cdb.Visualisator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualisator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualisator</em>' containment reference list.
	 * @see cdb.CdbPackage#getDashboard_Visualisator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Visualisator> getVisualisator();

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' containment reference list.
	 * The list contents are of type {@link cdb.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' containment reference list.
	 * @see cdb.CdbPackage#getDashboard_Datasource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataSource> getDatasource();

} // Dashboard
