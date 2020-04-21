/**
 */
package mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.MvcApplication#getName <em>Name</em>}</li>
 *   <li>{@link mvc.MvcApplication#getPicture <em>Picture</em>}</li>
 *   <li>{@link mvc.MvcApplication#getDescription <em>Description</em>}</li>
 *   <li>{@link mvc.MvcApplication#getEmail <em>Email</em>}</li>
 *   <li>{@link mvc.MvcApplication#getPagelink <em>Pagelink</em>}</li>
 *   <li>{@link mvc.MvcApplication#getViews <em>Views</em>}</li>
 *   <li>{@link mvc.MvcApplication#getModels <em>Models</em>}</li>
 *   <li>{@link mvc.MvcApplication#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getMvcApplication()
 * @model
 * @generated
 */
public interface MvcApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvc.MvcPackage#getMvcApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.MvcApplication#getName <em>Name</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture</em>' attribute.
	 * @see #setPicture(String)
	 * @see mvc.MvcPackage#getMvcApplication_Picture()
	 * @model
	 * @generated
	 */
	String getPicture();

	/**
	 * Sets the value of the '{@link mvc.MvcApplication#getPicture <em>Picture</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mvc.MvcPackage#getMvcApplication_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mvc.MvcApplication#getDescription <em>Description</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see mvc.MvcPackage#getMvcApplication_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link mvc.MvcApplication#getEmail <em>Email</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagelink</em>' attribute.
	 * @see #setPagelink(String)
	 * @see mvc.MvcPackage#getMvcApplication_Pagelink()
	 * @model
	 * @generated
	 */
	String getPagelink();

	/**
	 * Sets the value of the '{@link mvc.MvcApplication#getPagelink <em>Pagelink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagelink</em>' attribute.
	 * @see #getPagelink()
	 * @generated
	 */
	void setPagelink(String value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see mvc.MvcPackage#getMvcApplication_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see mvc.MvcPackage#getMvcApplication_Models()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see mvc.MvcPackage#getMvcApplication_Controllers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Controller> getControllers();

} // MvcApplication
