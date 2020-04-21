/**
 */
package mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Controller#getModel <em>Model</em>}</li>
 *   <li>{@link mvc.Controller#getView <em>View</em>}</li>
 *   <li>{@link mvc.Controller#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mvc.Model#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see mvc.MvcPackage#getController_Model()
	 * @see mvc.Model#getController
	 * @model opposite="controller" required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link mvc.Controller#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mvc.View#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see mvc.MvcPackage#getController_View()
	 * @see mvc.View#getController
	 * @model opposite="controller" required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link mvc.Controller#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvc.MvcPackage#getController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Controller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Controller
