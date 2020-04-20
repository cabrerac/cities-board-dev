/**
 */
package mvc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mvc.GraphicComponent#getDatoA <em>Dato A</em>}</li>
 *   <li>{@link mvc.GraphicComponent#getDatoB <em>Dato B</em>}</li>
 *   <li>{@link mvc.GraphicComponent#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @see mvc.MvcPackage#getGraphicComponent()
 * @model
 * @generated
 */
public interface GraphicComponent extends View {
	/**
	 * Returns the value of the '<em><b>Dato A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dato A</em>' reference.
	 * @see #setDatoA(Attribute)
	 * @see mvc.MvcPackage#getGraphicComponent_DatoA()
	 * @model
	 * @generated
	 */
	Attribute getDatoA();

	/**
	 * Sets the value of the '{@link mvc.GraphicComponent#getDatoA <em>Dato A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dato A</em>' reference.
	 * @see #getDatoA()
	 * @generated
	 */
	void setDatoA(Attribute value);

	/**
	 * Returns the value of the '<em><b>Dato B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dato B</em>' reference.
	 * @see #setDatoB(Attribute)
	 * @see mvc.MvcPackage#getGraphicComponent_DatoB()
	 * @model
	 * @generated
	 */
	Attribute getDatoB();

	/**
	 * Sets the value of the '{@link mvc.GraphicComponent#getDatoB <em>Dato B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dato B</em>' reference.
	 * @see #getDatoB()
	 * @generated
	 */
	void setDatoB(Attribute value);

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(int)
	 * @see mvc.MvcPackage#getGraphicComponent_StepSize()
	 * @model
	 * @generated
	 */
	int getStepSize();

	/**
	 * Sets the value of the '{@link mvc.GraphicComponent#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(int value);

} // GraphicComponent
