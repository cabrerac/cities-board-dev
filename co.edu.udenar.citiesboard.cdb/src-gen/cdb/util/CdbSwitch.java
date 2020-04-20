/**
 */
package cdb.util;

import cdb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cdb.CdbPackage
 * @generated
 */
public class CdbSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdbPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdbSwitch() {
		if (modelPackage == null) {
			modelPackage = CdbPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CdbPackage.DASHBOARD: {
			Dashboard dashboard = (Dashboard) theEObject;
			T result = caseDashboard(dashboard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.VISUALISATOR: {
			Visualisator visualisator = (Visualisator) theEObject;
			T result = caseVisualisator(visualisator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.DATA_SOURCE: {
			DataSource dataSource = (DataSource) theEObject;
			T result = caseDataSource(dataSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.CHART: {
			Chart chart = (Chart) theEObject;
			T result = caseChart(chart);
			if (result == null)
				result = caseVisualisator(chart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.FACEBOOK: {
			Facebook facebook = (Facebook) theEObject;
			T result = caseFacebook(facebook);
			if (result == null)
				result = caseSocialMedia(facebook);
			if (result == null)
				result = caseVisualisator(facebook);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.TWITTER: {
			Twitter twitter = (Twitter) theEObject;
			T result = caseTwitter(twitter);
			if (result == null)
				result = caseSocialMedia(twitter);
			if (result == null)
				result = caseVisualisator(twitter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.YOUTUBE: {
			Youtube youtube = (Youtube) theEObject;
			T result = caseYoutube(youtube);
			if (result == null)
				result = caseSocialMedia(youtube);
			if (result == null)
				result = caseVisualisator(youtube);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.SOCIAL_MEDIA: {
			SocialMedia socialMedia = (SocialMedia) theEObject;
			T result = caseSocialMedia(socialMedia);
			if (result == null)
				result = caseVisualisator(socialMedia);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.PIE_CHART: {
			PieChart pieChart = (PieChart) theEObject;
			T result = casePieChart(pieChart);
			if (result == null)
				result = caseChart(pieChart);
			if (result == null)
				result = caseVisualisator(pieChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.BAR_CHART: {
			BarChart barChart = (BarChart) theEObject;
			T result = caseBarChart(barChart);
			if (result == null)
				result = caseChart(barChart);
			if (result == null)
				result = caseVisualisator(barChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.DATA_ENTITY: {
			DataEntity dataEntity = (DataEntity) theEObject;
			T result = caseDataEntity(dataEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.STREAMED: {
			Streamed streamed = (Streamed) theEObject;
			T result = caseStreamed(streamed);
			if (result == null)
				result = caseDataSource(streamed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.PERSISTED: {
			Persisted persisted = (Persisted) theEObject;
			T result = casePersisted(persisted);
			if (result == null)
				result = caseDataSource(persisted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.METHOD: {
			Method method = (Method) theEObject;
			T result = caseMethod(method);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.POSITION: {
			Position position = (Position) theEObject;
			T result = casePosition(position);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CdbPackage.MAPC: {
			Mapc mapc = (Mapc) theEObject;
			T result = caseMapc(mapc);
			if (result == null)
				result = caseVisualisator(mapc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashboard(Dashboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualisator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualisator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualisator(Visualisator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebook(Facebook object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twitter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwitter(Twitter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Youtube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Youtube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYoutube(Youtube object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialMedia(SocialMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pie Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pie Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePieChart(PieChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarChart(BarChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEntity(DataEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Streamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Streamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamed(Streamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persisted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persisted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersisted(Persisted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapc(Mapc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CdbSwitch
