/**
 */
package mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Model#getNameclass <em>Nameclass</em>}</li>
 *   <li>{@link mvc.Model#getType <em>Type</em>}</li>
 *   <li>{@link mvc.Model#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Nameclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameclass</em>' attribute.
	 * @see #setNameclass(String)
	 * @see mvc.MvcPackage#getModel_Nameclass()
	 * @model required="true"
	 * @generated
	 */
	String getNameclass();

	/**
	 * Sets the value of the '{@link mvc.Model#getNameclass <em>Nameclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameclass</em>' attribute.
	 * @see #getNameclass()
	 * @generated
	 */
	void setNameclass(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mvc.MvcPackage#getModel_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mvc.Model#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mvc.Controller#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see mvc.MvcPackage#getModel_Controller()
	 * @see mvc.Controller#getModel
	 * @model opposite="model" resolveProxies="false" required="true"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link mvc.Model#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Model
