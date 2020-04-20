/**
 */
package cdb.impl;

import cdb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdbFactoryImpl extends EFactoryImpl implements CdbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdbFactory init() {
		try {
			CdbFactory theCdbFactory = (CdbFactory) EPackage.Registry.INSTANCE.getEFactory(CdbPackage.eNS_URI);
			if (theCdbFactory != null) {
				return theCdbFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CdbPackage.DASHBOARD:
			return createDashboard();
		case CdbPackage.VISUALISATOR:
			return createVisualisator();
		case CdbPackage.DATA_SOURCE:
			return createDataSource();
		case CdbPackage.CHART:
			return createChart();
		case CdbPackage.FACEBOOK:
			return createFacebook();
		case CdbPackage.TWITTER:
			return createTwitter();
		case CdbPackage.YOUTUBE:
			return createYoutube();
		case CdbPackage.SOCIAL_MEDIA:
			return createSocialMedia();
		case CdbPackage.PIE_CHART:
			return createPieChart();
		case CdbPackage.BAR_CHART:
			return createBarChart();
		case CdbPackage.DATA_ENTITY:
			return createDataEntity();
		case CdbPackage.STREAMED:
			return createStreamed();
		case CdbPackage.PERSISTED:
			return createPersisted();
		case CdbPackage.METHOD:
			return createMethod();
		case CdbPackage.POSITION:
			return createPosition();
		case CdbPackage.MAPC:
			return createMapc();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualisator createVisualisator() {
		VisualisatorImpl visualisator = new VisualisatorImpl();
		return visualisator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facebook createFacebook() {
		FacebookImpl facebook = new FacebookImpl();
		return facebook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Twitter createTwitter() {
		TwitterImpl twitter = new TwitterImpl();
		return twitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Youtube createYoutube() {
		YoutubeImpl youtube = new YoutubeImpl();
		return youtube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialMedia createSocialMedia() {
		SocialMediaImpl socialMedia = new SocialMediaImpl();
		return socialMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PieChart createPieChart() {
		PieChartImpl pieChart = new PieChartImpl();
		return pieChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarChart createBarChart() {
		BarChartImpl barChart = new BarChartImpl();
		return barChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataEntity createDataEntity() {
		DataEntityImpl dataEntity = new DataEntityImpl();
		return dataEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streamed createStreamed() {
		StreamedImpl streamed = new StreamedImpl();
		return streamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Persisted createPersisted() {
		PersistedImpl persisted = new PersistedImpl();
		return persisted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapc createMapc() {
		MapcImpl mapc = new MapcImpl();
		return mapc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdbPackage getCdbPackage() {
		return (CdbPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdbPackage getPackage() {
		return CdbPackage.eINSTANCE;
	}

} //CdbFactoryImpl
