/**
 */
package mvc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.Position#getAbove <em>Above</em>}</li>
 *   <li>{@link mvc.Position#getAlign_left <em>Align left</em>}</li>
 *   <li>{@link mvc.Position#getWide <em>Wide</em>}</li>
 *   <li>{@link mvc.Position#getLong <em>Long</em>}</li>
 *   <li>{@link mvc.Position#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Above</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Above</em>' attribute.
	 * @see #setAbove(int)
	 * @see mvc.MvcPackage#getPosition_Above()
	 * @model required="true"
	 * @generated
	 */
	int getAbove();

	/**
	 * Sets the value of the '{@link mvc.Position#getAbove <em>Above</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Above</em>' attribute.
	 * @see #getAbove()
	 * @generated
	 */
	void setAbove(int value);

	/**
	 * Returns the value of the '<em><b>Align left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align left</em>' attribute.
	 * @see #setAlign_left(int)
	 * @see mvc.MvcPackage#getPosition_Align_left()
	 * @model required="true"
	 * @generated
	 */
	int getAlign_left();

	/**
	 * Sets the value of the '{@link mvc.Position#getAlign_left <em>Align left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align left</em>' attribute.
	 * @see #getAlign_left()
	 * @generated
	 */
	void setAlign_left(int value);

	/**
	 * Returns the value of the '<em><b>Wide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wide</em>' attribute.
	 * @see #setWide(int)
	 * @see mvc.MvcPackage#getPosition_Wide()
	 * @model required="true"
	 * @generated
	 */
	int getWide();

	/**
	 * Sets the value of the '{@link mvc.Position#getWide <em>Wide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wide</em>' attribute.
	 * @see #getWide()
	 * @generated
	 */
	void setWide(int value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(int)
	 * @see mvc.MvcPackage#getPosition_Long()
	 * @model required="true"
	 * @generated
	 */
	int getLong();

	/**
	 * Sets the value of the '{@link mvc.Position#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mvc.MvcPackage#getPosition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mvc.Position#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Position
