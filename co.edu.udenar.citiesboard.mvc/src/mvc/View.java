/**
 */
package mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.View#getController <em>Controller</em>}</li>
 *   <li>{@link mvc.View#getPosition <em>Position</em>}</li>
 *   <li>{@link mvc.View#getName <em>Name</em>}</li>
 *   <li>{@link mvc.View#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mvc.Controller#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see mvc.MvcPackage#getView_Controller()
	 * @see mvc.Controller#getView
	 * @model opposite="view" resolveProxies="false" required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link mvc.View#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see mvc.MvcPackage#getView_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link mvc.View#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvc.MvcPackage#getView_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.View#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mvc.MvcPackage#getView_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mvc.View#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // View
