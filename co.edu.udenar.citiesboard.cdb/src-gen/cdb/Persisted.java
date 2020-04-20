/**
 */
package cdb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persisted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cdb.Persisted#getDataentitty <em>Dataentitty</em>}</li>
 * </ul>
 *
 * @see cdb.CdbPackage#getPersisted()
 * @model
 * @generated
 */
public interface Persisted extends DataSource {
	/**
	 * Returns the value of the '<em><b>Dataentitty</b></em>' containment reference list.
	 * The list contents are of type {@link cdb.DataEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataentitty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataentitty</em>' containment reference list.
	 * @see cdb.CdbPackage#getPersisted_Dataentitty()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataEntity> getDataentitty();

} // Persisted
