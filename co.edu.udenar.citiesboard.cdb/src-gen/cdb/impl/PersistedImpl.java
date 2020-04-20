/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.DataEntity;
import cdb.Persisted;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persisted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.PersistedImpl#getDataentitty <em>Dataentitty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistedImpl extends DataSourceImpl implements Persisted {
	/**
	 * The cached value of the '{@link #getDataentitty() <em>Dataentitty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataentitty()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEntity> dataentitty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.PERSISTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataEntity> getDataentitty() {
		if (dataentitty == null) {
			dataentitty = new EObjectContainmentEList<DataEntity>(DataEntity.class, this,
					CdbPackage.PERSISTED__DATAENTITTY);
		}
		return dataentitty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.PERSISTED__DATAENTITTY:
			return ((InternalEList<?>) getDataentitty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CdbPackage.PERSISTED__DATAENTITTY:
			return getDataentitty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CdbPackage.PERSISTED__DATAENTITTY:
			getDataentitty().clear();
			getDataentitty().addAll((Collection<? extends DataEntity>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CdbPackage.PERSISTED__DATAENTITTY:
			getDataentitty().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CdbPackage.PERSISTED__DATAENTITTY:
			return dataentitty != null && !dataentitty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersistedImpl
