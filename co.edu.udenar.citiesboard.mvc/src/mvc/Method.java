/**
 */
package mvc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Method#getType <em>Type</em>}</li>
 *   <li>{@link mvc.Method#getNamemethod <em>Namemethod</em>}</li>
 *   <li>{@link mvc.Method#getAttrib <em>Attrib</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mvc.MvcPackage#getMethod_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mvc.Method#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Namemethod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namemethod</em>' attribute.
	 * @see #setNamemethod(String)
	 * @see mvc.MvcPackage#getMethod_Namemethod()
	 * @model required="true"
	 * @generated
	 */
	String getNamemethod();

	/**
	 * Sets the value of the '{@link mvc.Method#getNamemethod <em>Namemethod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namemethod</em>' attribute.
	 * @see #getNamemethod()
	 * @generated
	 */
	void setNamemethod(String value);

	/**
	 * Returns the value of the '<em><b>Attrib</b></em>' containment reference list.
	 * The list contents are of type {@link mvc.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attrib</em>' containment reference list.
	 * @see mvc.MvcPackage#getMethod_Attrib()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttrib();

} // Method
