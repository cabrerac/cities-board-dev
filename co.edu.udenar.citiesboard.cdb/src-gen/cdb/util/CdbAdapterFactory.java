/**
 */
package cdb.util;

import cdb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cdb.CdbPackage
 * @generated
 */
public class CdbAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdbPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdbAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CdbPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdbSwitch<Adapter> modelSwitch = new CdbSwitch<Adapter>() {
		@Override
		public Adapter caseDashboard(Dashboard object) {
			return createDashboardAdapter();
		}

		@Override
		public Adapter caseVisualisator(Visualisator object) {
			return createVisualisatorAdapter();
		}

		@Override
		public Adapter caseDataSource(DataSource object) {
			return createDataSourceAdapter();
		}

		@Override
		public Adapter caseChart(Chart object) {
			return createChartAdapter();
		}

		@Override
		public Adapter caseFacebook(Facebook object) {
			return createFacebookAdapter();
		}

		@Override
		public Adapter caseTwitter(Twitter object) {
			return createTwitterAdapter();
		}

		@Override
		public Adapter caseYoutube(Youtube object) {
			return createYoutubeAdapter();
		}

		@Override
		public Adapter caseSocialMedia(SocialMedia object) {
			return createSocialMediaAdapter();
		}

		@Override
		public Adapter casePieChart(PieChart object) {
			return createPieChartAdapter();
		}

		@Override
		public Adapter caseBarChart(BarChart object) {
			return createBarChartAdapter();
		}

		@Override
		public Adapter caseDataEntity(DataEntity object) {
			return createDataEntityAdapter();
		}

		@Override
		public Adapter caseStreamed(Streamed object) {
			return createStreamedAdapter();
		}

		@Override
		public Adapter casePersisted(Persisted object) {
			return createPersistedAdapter();
		}

		@Override
		public Adapter caseMethod(Method object) {
			return createMethodAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseMapc(Mapc object) {
			return createMapcAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Dashboard
	 * @generated
	 */
	public Adapter createDashboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Visualisator <em>Visualisator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Visualisator
	 * @generated
	 */
	public Adapter createVisualisatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Chart
	 * @generated
	 */
	public Adapter createChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Facebook
	 * @generated
	 */
	public Adapter createFacebookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Twitter
	 * @generated
	 */
	public Adapter createTwitterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Youtube <em>Youtube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Youtube
	 * @generated
	 */
	public Adapter createYoutubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.SocialMedia <em>Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.SocialMedia
	 * @generated
	 */
	public Adapter createSocialMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.PieChart <em>Pie Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.PieChart
	 * @generated
	 */
	public Adapter createPieChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.BarChart <em>Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.BarChart
	 * @generated
	 */
	public Adapter createBarChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.DataEntity <em>Data Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.DataEntity
	 * @generated
	 */
	public Adapter createDataEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Streamed <em>Streamed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Streamed
	 * @generated
	 */
	public Adapter createStreamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Persisted <em>Persisted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Persisted
	 * @generated
	 */
	public Adapter createPersistedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cdb.Mapc <em>Mapc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cdb.Mapc
	 * @generated
	 */
	public Adapter createMapcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CdbAdapterFactory
