/**
 */
package cdb.impl;

import cdb.CdbPackage;
import cdb.DataSource;
import cdb.Position;
import cdb.Visualisator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualisator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cdb.impl.VisualisatorImpl#getPresents <em>Presents</em>}</li>
 *   <li>{@link cdb.impl.VisualisatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link cdb.impl.VisualisatorImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualisatorImpl extends MinimalEObjectImpl.Container implements Visualisator {
	/**
	 * The cached value of the '{@link #getPresents() <em>Presents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresents()
	 * @generated
	 * @ordered
	 */
	protected DataSource presents;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualisatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdbPackage.Literals.VISUALISATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getPresents() {
		if (presents != null && presents.eIsProxy()) {
			InternalEObject oldPresents = (InternalEObject) presents;
			presents = (DataSource) eResolveProxy(oldPresents);
			if (presents != oldPresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CdbPackage.VISUALISATOR__PRESENTS,
							oldPresents, presents));
			}
		}
		return presents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetPresents() {
		return presents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresents(DataSource newPresents, NotificationChain msgs) {
		DataSource oldPresents = presents;
		presents = newPresents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CdbPackage.VISUALISATOR__PRESENTS, oldPresents, newPresents);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresents(DataSource newPresents) {
		if (newPresents != presents) {
			NotificationChain msgs = null;
			if (presents != null)
				msgs = ((InternalEObject) presents).eInverseRemove(this, CdbPackage.DATA_SOURCE__PRESENTEDBY,
						DataSource.class, msgs);
			if (newPresents != null)
				msgs = ((InternalEObject) newPresents).eInverseAdd(this, CdbPackage.DATA_SOURCE__PRESENTEDBY,
						DataSource.class, msgs);
			msgs = basicSetPresents(newPresents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.VISUALISATOR__PRESENTS, newPresents,
					newPresents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.VISUALISATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CdbPackage.VISUALISATOR__POSITION, oldPosition, newPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CdbPackage.VISUALISATOR__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CdbPackage.VISUALISATOR__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdbPackage.VISUALISATOR__POSITION, newPosition,
					newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.VISUALISATOR__PRESENTS:
			if (presents != null)
				msgs = ((InternalEObject) presents).eInverseRemove(this, CdbPackage.DATA_SOURCE__PRESENTEDBY,
						DataSource.class, msgs);
			return basicSetPresents((DataSource) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CdbPackage.VISUALISATOR__PRESENTS:
			return basicSetPresents(null, msgs);
		case CdbPackage.VISUALISATOR__POSITION:
			return basicSetPosition(null, msgs);
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
		case CdbPackage.VISUALISATOR__PRESENTS:
			if (resolve)
				return getPresents();
			return basicGetPresents();
		case CdbPackage.VISUALISATOR__NAME:
			return getName();
		case CdbPackage.VISUALISATOR__POSITION:
			return getPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CdbPackage.VISUALISATOR__PRESENTS:
			setPresents((DataSource) newValue);
			return;
		case CdbPackage.VISUALISATOR__NAME:
			setName((String) newValue);
			return;
		case CdbPackage.VISUALISATOR__POSITION:
			setPosition((Position) newValue);
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
		case CdbPackage.VISUALISATOR__PRESENTS:
			setPresents((DataSource) null);
			return;
		case CdbPackage.VISUALISATOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CdbPackage.VISUALISATOR__POSITION:
			setPosition((Position) null);
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
		case CdbPackage.VISUALISATOR__PRESENTS:
			return presents != null;
		case CdbPackage.VISUALISATOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CdbPackage.VISUALISATOR__POSITION:
			return position != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VisualisatorImpl
