/**
 */
package cdb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualisator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Visualisator#getPresents <em>Presents</em>}</li>
 *   <li>{@link cdb.Visualisator#getName <em>Name</em>}</li>
 *   <li>{@link cdb.Visualisator#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getVisualisator()
 * @model
 * @generated
 */
public interface Visualisator extends EObject {
	/**
	 * Returns the value of the '<em><b>Presents</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link cdb.DataSource#getPresentedby <em>Presentedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presents</em>' reference.
	 * @see #setPresents(DataSource)
	 * @see cdb.CdbPackage#getVisualisator_Presents()
	 * @see cdb.DataSource#getPresentedby
	 * @model opposite="presentedby" required="true"
	 * @generated
	 */
	DataSource getPresents();

	/**
	 * Sets the value of the '{@link cdb.Visualisator#getPresents <em>Presents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presents</em>' reference.
	 * @see #getPresents()
	 * @generated
	 */
	void setPresents(DataSource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cdb.CdbPackage#getVisualisator_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cdb.Visualisator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see cdb.CdbPackage#getVisualisator_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link cdb.Visualisator#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // Visualisator
