/**
 */
package mvc.impl;

import mvc.Attribute;
import mvc.GraphicComponent;
import mvc.MvcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mvc.impl.GraphicComponentImpl#getDatoA <em>Dato A</em>}</li>
 *   <li>{@link mvc.impl.GraphicComponentImpl#getDatoB <em>Dato B</em>}</li>
 *   <li>{@link mvc.impl.GraphicComponentImpl#getStepSize <em>Step Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicComponentImpl extends ViewImpl implements GraphicComponent {
	/**
	 * The cached value of the '{@link #getDatoA() <em>Dato A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatoA()
	 * @generated
	 * @ordered
	 */
	protected Attribute datoA;

	/**
	 * The cached value of the '{@link #getDatoB() <em>Dato B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatoB()
	 * @generated
	 * @ordered
	 */
	protected Attribute datoB;

	/**
	 * The default value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepSize() <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepSize()
	 * @generated
	 * @ordered
	 */
	protected int stepSize = STEP_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MvcPackage.Literals.GRAPHIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getDatoA() {
		if (datoA != null && datoA.eIsProxy()) {
			InternalEObject oldDatoA = (InternalEObject)datoA;
			datoA = (Attribute)eResolveProxy(oldDatoA);
			if (datoA != oldDatoA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.GRAPHIC_COMPONENT__DATO_A, oldDatoA, datoA));
			}
		}
		return datoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetDatoA() {
		return datoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatoA(Attribute newDatoA) {
		Attribute oldDatoA = datoA;
		datoA = newDatoA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.GRAPHIC_COMPONENT__DATO_A, oldDatoA, datoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getDatoB() {
		if (datoB != null && datoB.eIsProxy()) {
			InternalEObject oldDatoB = (InternalEObject)datoB;
			datoB = (Attribute)eResolveProxy(oldDatoB);
			if (datoB != oldDatoB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MvcPackage.GRAPHIC_COMPONENT__DATO_B, oldDatoB, datoB));
			}
		}
		return datoB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetDatoB() {
		return datoB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatoB(Attribute newDatoB) {
		Attribute oldDatoB = datoB;
		datoB = newDatoB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.GRAPHIC_COMPONENT__DATO_B, oldDatoB, datoB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStepSize() {
		return stepSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepSize(int newStepSize) {
		int oldStepSize = stepSize;
		stepSize = newStepSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MvcPackage.GRAPHIC_COMPONENT__STEP_SIZE, oldStepSize, stepSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MvcPackage.GRAPHIC_COMPONENT__DATO_A:
				if (resolve) return getDatoA();
				return basicGetDatoA();
			case MvcPackage.GRAPHIC_COMPONENT__DATO_B:
				if (resolve) return getDatoB();
				return basicGetDatoB();
			case MvcPackage.GRAPHIC_COMPONENT__STEP_SIZE:
				return getStepSize();
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
			case MvcPackage.GRAPHIC_COMPONENT__DATO_A:
				setDatoA((Attribute)newValue);
				return;
			case MvcPackage.GRAPHIC_COMPONENT__DATO_B:
				setDatoB((Attribute)newValue);
				return;
			case MvcPackage.GRAPHIC_COMPONENT__STEP_SIZE:
				setStepSize((Integer)newValue);
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
			case MvcPackage.GRAPHIC_COMPONENT__DATO_A:
				setDatoA((Attribute)null);
				return;
			case MvcPackage.GRAPHIC_COMPONENT__DATO_B:
				setDatoB((Attribute)null);
				return;
			case MvcPackage.GRAPHIC_COMPONENT__STEP_SIZE:
				setStepSize(STEP_SIZE_EDEFAULT);
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
			case MvcPackage.GRAPHIC_COMPONENT__DATO_A:
				return datoA != null;
			case MvcPackage.GRAPHIC_COMPONENT__DATO_B:
				return datoB != null;
			case MvcPackage.GRAPHIC_COMPONENT__STEP_SIZE:
				return stepSize != STEP_SIZE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stepSize: ");
		result.append(stepSize);
		result.append(')');
		return result.toString();
	}

} //GraphicComponentImpl
