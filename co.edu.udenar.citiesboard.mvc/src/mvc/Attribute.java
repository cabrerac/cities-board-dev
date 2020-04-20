/**
 */
package mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Attribute#getNameattribute <em>Nameattribute</em>}</li>
 *   <li>{@link mvc.Attribute#getTypeattribute <em>Typeattribute</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Nameattribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameattribute</em>' attribute.
	 * @see #setNameattribute(String)
	 * @see mvc.MvcPackage#getAttribute_Nameattribute()
	 * @model required="true"
	 * @generated
	 */
	String getNameattribute();

	/**
	 * Sets the value of the '{@link mvc.Attribute#getNameattribute <em>Nameattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameattribute</em>' attribute.
	 * @see #getNameattribute()
	 * @generated
	 */
	void setNameattribute(String value);

	/**
	 * Returns the value of the '<em><b>Typeattribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typeattribute</em>' attribute.
	 * @see #setTypeattribute(String)
	 * @see mvc.MvcPackage#getAttribute_Typeattribute()
	 * @model required="true"
	 * @generated
	 */
	String getTypeattribute();

	/**
	 * Sets the value of the '{@link mvc.Attribute#getTypeattribute <em>Typeattribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeattribute</em>' attribute.
	 * @see #getTypeattribute()
	 * @generated
	 */
	void setTypeattribute(String value);

} // Attribute
