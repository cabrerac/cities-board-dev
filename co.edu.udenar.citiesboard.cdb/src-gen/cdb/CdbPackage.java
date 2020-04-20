/**
 */
package cdb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cdb.CdbFactory
 * @model kind="package"
 * @generated
 */
public interface CdbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://citiesboard.sistemas.udenar.edu.co/cdb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdbPackage eINSTANCE = cdb.impl.CdbPackageImpl.init();

	/**
	 * The meta object id for the '{@link cdb.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.DashboardImpl
	 * @see cdb.impl.CdbPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__PICTURE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Pagelink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__PAGELINK = 4;

	/**
	 * The feature id for the '<em><b>Visualisator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__VISUALISATOR = 5;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__DATASOURCE = 6;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.VisualisatorImpl <em>Visualisator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.VisualisatorImpl
	 * @see cdb.impl.CdbPackageImpl#getVisualisator()
	 * @generated
	 */
	int VISUALISATOR = 1;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALISATOR__PRESENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALISATOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALISATOR__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Visualisator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALISATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visualisator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALISATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.DataSourceImpl
	 * @see cdb.impl.CdbPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__STATE = 2;

	/**
	 * The feature id for the '<em><b>Presentedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PRESENTEDBY = 3;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.ChartImpl
	 * @see cdb.impl.CdbPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 3;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PRESENTS = VISUALISATOR__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = VISUALISATOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__POSITION = VISUALISATOR__POSITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__LABEL = VISUALISATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DATA = VISUALISATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = VISUALISATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = VISUALISATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.SocialMediaImpl <em>Social Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.SocialMediaImpl
	 * @see cdb.impl.CdbPackageImpl#getSocialMedia()
	 * @generated
	 */
	int SOCIAL_MEDIA = 7;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__PRESENTS = VISUALISATOR__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__NAME = VISUALISATOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA__POSITION = VISUALISATOR__POSITION;

	/**
	 * The number of structural features of the '<em>Social Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_FEATURE_COUNT = VISUALISATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_MEDIA_OPERATION_COUNT = VISUALISATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.FacebookImpl <em>Facebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.FacebookImpl
	 * @see cdb.impl.CdbPackageImpl#getFacebook()
	 * @generated
	 */
	int FACEBOOK = 4;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__PRESENTS = SOCIAL_MEDIA__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__NAME = SOCIAL_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__POSITION = SOCIAL_MEDIA__POSITION;

	/**
	 * The feature id for the '<em><b>Namepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__NAMEPAGE = SOCIAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tittlepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK__TITTLEPAGE = SOCIAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Facebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_FEATURE_COUNT = SOCIAL_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Facebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_OPERATION_COUNT = SOCIAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.TwitterImpl <em>Twitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.TwitterImpl
	 * @see cdb.impl.CdbPackageImpl#getTwitter()
	 * @generated
	 */
	int TWITTER = 5;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__PRESENTS = SOCIAL_MEDIA__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__NAME = SOCIAL_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__POSITION = SOCIAL_MEDIA__POSITION;

	/**
	 * The feature id for the '<em><b>Accountuser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__ACCOUNTUSER = SOCIAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER__LISTNAME = SOCIAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_FEATURE_COUNT = SOCIAL_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Twitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_OPERATION_COUNT = SOCIAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.YoutubeImpl <em>Youtube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.YoutubeImpl
	 * @see cdb.impl.CdbPackageImpl#getYoutube()
	 * @generated
	 */
	int YOUTUBE = 6;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE__PRESENTS = SOCIAL_MEDIA__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE__NAME = SOCIAL_MEDIA__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE__POSITION = SOCIAL_MEDIA__POSITION;

	/**
	 * The feature id for the '<em><b>Url List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE__URL_LIST = SOCIAL_MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE__CHANNELNAME = SOCIAL_MEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Youtube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE_FEATURE_COUNT = SOCIAL_MEDIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Youtube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTUBE_OPERATION_COUNT = SOCIAL_MEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.PieChartImpl <em>Pie Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.PieChartImpl
	 * @see cdb.impl.CdbPackageImpl#getPieChart()
	 * @generated
	 */
	int PIE_CHART = 8;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__PRESENTS = CHART__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__NAME = CHART__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__POSITION = CHART__POSITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__LABEL = CHART__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__DATA = CHART__DATA;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART__STEP_SIZE = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_FEATURE_COUNT = CHART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_CHART_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.BarChartImpl <em>Bar Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.BarChartImpl
	 * @see cdb.impl.CdbPackageImpl#getBarChart()
	 * @generated
	 */
	int BAR_CHART = 9;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__PRESENTS = CHART__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__NAME = CHART__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__POSITION = CHART__POSITION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__LABEL = CHART__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART__DATA = CHART__DATA;

	/**
	 * The number of structural features of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_FEATURE_COUNT = CHART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_CHART_OPERATION_COUNT = CHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.DataEntityImpl <em>Data Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.DataEntityImpl
	 * @see cdb.impl.CdbPackageImpl#getDataEntity()
	 * @generated
	 */
	int DATA_ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.StreamedImpl <em>Streamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.StreamedImpl
	 * @see cdb.impl.CdbPackageImpl#getStreamed()
	 * @generated
	 */
	int STREAMED = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__PROVIDER = DATA_SOURCE__PROVIDER;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__STATE = DATA_SOURCE__STATE;

	/**
	 * The feature id for the '<em><b>Presentedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__PRESENTEDBY = DATA_SOURCE__PRESENTEDBY;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__METHOD = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URL service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__URL_SERVICE = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returnparameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED__RETURNPARAMETER = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Streamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Streamed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAMED_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.PersistedImpl <em>Persisted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.PersistedImpl
	 * @see cdb.impl.CdbPackageImpl#getPersisted()
	 * @generated
	 */
	int PERSISTED = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED__PROVIDER = DATA_SOURCE__PROVIDER;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED__STATE = DATA_SOURCE__STATE;

	/**
	 * The feature id for the '<em><b>Presentedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED__PRESENTEDBY = DATA_SOURCE__PRESENTEDBY;

	/**
	 * The feature id for the '<em><b>Dataentitty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED__DATAENTITTY = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persisted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persisted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cdb.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.MethodImpl
	 * @see cdb.impl.CdbPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dataentitty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DATAENTITTY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.PositionImpl
	 * @see cdb.impl.CdbPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 14;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__TOP = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__HEIGTH = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cdb.impl.MapcImpl <em>Mapc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cdb.impl.MapcImpl
	 * @see cdb.impl.CdbPackageImpl#getMapc()
	 * @generated
	 */
	int MAPC = 15;

	/**
	 * The feature id for the '<em><b>Presents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__PRESENTS = VISUALISATOR__PRESENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__NAME = VISUALISATOR__NAME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__POSITION = VISUALISATOR__POSITION;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__MARKER = VISUALISATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__LATITUDE = VISUALISATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC__LONGITUDE = VISUALISATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC_FEATURE_COUNT = VISUALISATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPC_OPERATION_COUNT = VISUALISATOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link cdb.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see cdb.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Dashboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.Dashboard#getName()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Name();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Dashboard#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see cdb.Dashboard#getPicture()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Picture();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Dashboard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cdb.Dashboard#getDescription()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Description();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Dashboard#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see cdb.Dashboard#getEmail()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Email();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Dashboard#getPagelink <em>Pagelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagelink</em>'.
	 * @see cdb.Dashboard#getPagelink()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Pagelink();

	/**
	 * Returns the meta object for the containment reference list '{@link cdb.Dashboard#getVisualisator <em>Visualisator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualisator</em>'.
	 * @see cdb.Dashboard#getVisualisator()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Visualisator();

	/**
	 * Returns the meta object for the containment reference list '{@link cdb.Dashboard#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datasource</em>'.
	 * @see cdb.Dashboard#getDatasource()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Datasource();

	/**
	 * Returns the meta object for class '{@link cdb.Visualisator <em>Visualisator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualisator</em>'.
	 * @see cdb.Visualisator
	 * @generated
	 */
	EClass getVisualisator();

	/**
	 * Returns the meta object for the reference '{@link cdb.Visualisator#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presents</em>'.
	 * @see cdb.Visualisator#getPresents()
	 * @see #getVisualisator()
	 * @generated
	 */
	EReference getVisualisator_Presents();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Visualisator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.Visualisator#getName()
	 * @see #getVisualisator()
	 * @generated
	 */
	EAttribute getVisualisator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link cdb.Visualisator#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see cdb.Visualisator#getPosition()
	 * @see #getVisualisator()
	 * @generated
	 */
	EReference getVisualisator_Position();

	/**
	 * Returns the meta object for class '{@link cdb.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see cdb.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link cdb.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link cdb.DataSource#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see cdb.DataSource#getProvider()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Provider();

	/**
	 * Returns the meta object for the attribute '{@link cdb.DataSource#isState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see cdb.DataSource#isState()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_State();

	/**
	 * Returns the meta object for the reference '{@link cdb.DataSource#getPresentedby <em>Presentedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presentedby</em>'.
	 * @see cdb.DataSource#getPresentedby()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_Presentedby();

	/**
	 * Returns the meta object for class '{@link cdb.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see cdb.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the reference '{@link cdb.Chart#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see cdb.Chart#getLabel()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Label();

	/**
	 * Returns the meta object for the reference '{@link cdb.Chart#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see cdb.Chart#getData()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Data();

	/**
	 * Returns the meta object for class '{@link cdb.Facebook <em>Facebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook</em>'.
	 * @see cdb.Facebook
	 * @generated
	 */
	EClass getFacebook();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Facebook#getNamepage <em>Namepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namepage</em>'.
	 * @see cdb.Facebook#getNamepage()
	 * @see #getFacebook()
	 * @generated
	 */
	EAttribute getFacebook_Namepage();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Facebook#getTittlepage <em>Tittlepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tittlepage</em>'.
	 * @see cdb.Facebook#getTittlepage()
	 * @see #getFacebook()
	 * @generated
	 */
	EAttribute getFacebook_Tittlepage();

	/**
	 * Returns the meta object for class '{@link cdb.Twitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter</em>'.
	 * @see cdb.Twitter
	 * @generated
	 */
	EClass getTwitter();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Twitter#getAccountuser <em>Accountuser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accountuser</em>'.
	 * @see cdb.Twitter#getAccountuser()
	 * @see #getTwitter()
	 * @generated
	 */
	EAttribute getTwitter_Accountuser();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Twitter#getListname <em>Listname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listname</em>'.
	 * @see cdb.Twitter#getListname()
	 * @see #getTwitter()
	 * @generated
	 */
	EAttribute getTwitter_Listname();

	/**
	 * Returns the meta object for class '{@link cdb.Youtube <em>Youtube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Youtube</em>'.
	 * @see cdb.Youtube
	 * @generated
	 */
	EClass getYoutube();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Youtube#getUrlList <em>Url List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url List</em>'.
	 * @see cdb.Youtube#getUrlList()
	 * @see #getYoutube()
	 * @generated
	 */
	EAttribute getYoutube_UrlList();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Youtube#getChannelname <em>Channelname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channelname</em>'.
	 * @see cdb.Youtube#getChannelname()
	 * @see #getYoutube()
	 * @generated
	 */
	EAttribute getYoutube_Channelname();

	/**
	 * Returns the meta object for class '{@link cdb.SocialMedia <em>Social Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Media</em>'.
	 * @see cdb.SocialMedia
	 * @generated
	 */
	EClass getSocialMedia();

	/**
	 * Returns the meta object for class '{@link cdb.PieChart <em>Pie Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Chart</em>'.
	 * @see cdb.PieChart
	 * @generated
	 */
	EClass getPieChart();

	/**
	 * Returns the meta object for the attribute '{@link cdb.PieChart#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see cdb.PieChart#getStepSize()
	 * @see #getPieChart()
	 * @generated
	 */
	EAttribute getPieChart_StepSize();

	/**
	 * Returns the meta object for class '{@link cdb.BarChart <em>Bar Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Chart</em>'.
	 * @see cdb.BarChart
	 * @generated
	 */
	EClass getBarChart();

	/**
	 * Returns the meta object for class '{@link cdb.DataEntity <em>Data Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Entity</em>'.
	 * @see cdb.DataEntity
	 * @generated
	 */
	EClass getDataEntity();

	/**
	 * Returns the meta object for the attribute '{@link cdb.DataEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.DataEntity#getName()
	 * @see #getDataEntity()
	 * @generated
	 */
	EAttribute getDataEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link cdb.DataEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cdb.DataEntity#getType()
	 * @see #getDataEntity()
	 * @generated
	 */
	EAttribute getDataEntity_Type();

	/**
	 * Returns the meta object for class '{@link cdb.Streamed <em>Streamed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Streamed</em>'.
	 * @see cdb.Streamed
	 * @generated
	 */
	EClass getStreamed();

	/**
	 * Returns the meta object for the containment reference '{@link cdb.Streamed#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see cdb.Streamed#getMethod()
	 * @see #getStreamed()
	 * @generated
	 */
	EReference getStreamed_Method();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Streamed#getURL_service <em>URL service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL service</em>'.
	 * @see cdb.Streamed#getURL_service()
	 * @see #getStreamed()
	 * @generated
	 */
	EAttribute getStreamed_URL_service();

	/**
	 * Returns the meta object for the reference list '{@link cdb.Streamed#getReturnparameter <em>Returnparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Returnparameter</em>'.
	 * @see cdb.Streamed#getReturnparameter()
	 * @see #getStreamed()
	 * @generated
	 */
	EReference getStreamed_Returnparameter();

	/**
	 * Returns the meta object for class '{@link cdb.Persisted <em>Persisted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persisted</em>'.
	 * @see cdb.Persisted
	 * @generated
	 */
	EClass getPersisted();

	/**
	 * Returns the meta object for the containment reference list '{@link cdb.Persisted#getDataentitty <em>Dataentitty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataentitty</em>'.
	 * @see cdb.Persisted#getDataentitty()
	 * @see #getPersisted()
	 * @generated
	 */
	EReference getPersisted_Dataentitty();

	/**
	 * Returns the meta object for class '{@link cdb.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see cdb.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cdb.Method#getDataentitty <em>Dataentitty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataentitty</em>'.
	 * @see cdb.Method#getDataentitty()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Dataentitty();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cdb.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Type();

	/**
	 * Returns the meta object for class '{@link cdb.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see cdb.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Position#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see cdb.Position#getTop()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Top();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Position#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see cdb.Position#getLeft()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Left();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Position#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see cdb.Position#getHeigth()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Position#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see cdb.Position#getWidth()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Width();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Position#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cdb.Position#getName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Name();

	/**
	 * Returns the meta object for class '{@link cdb.Mapc <em>Mapc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapc</em>'.
	 * @see cdb.Mapc
	 * @generated
	 */
	EClass getMapc();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Mapc#isMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker</em>'.
	 * @see cdb.Mapc#isMarker()
	 * @see #getMapc()
	 * @generated
	 */
	EAttribute getMapc_Marker();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Mapc#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see cdb.Mapc#getLatitude()
	 * @see #getMapc()
	 * @generated
	 */
	EAttribute getMapc_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link cdb.Mapc#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see cdb.Mapc#getLongitude()
	 * @see #getMapc()
	 * @generated
	 */
	EAttribute getMapc_Longitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdbFactory getCdbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cdb.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.DashboardImpl
		 * @see cdb.impl.CdbPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__NAME = eINSTANCE.getDashboard_Name();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__PICTURE = eINSTANCE.getDashboard_Picture();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__DESCRIPTION = eINSTANCE.getDashboard_Description();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__EMAIL = eINSTANCE.getDashboard_Email();

		/**
		 * The meta object literal for the '<em><b>Pagelink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__PAGELINK = eINSTANCE.getDashboard_Pagelink();

		/**
		 * The meta object literal for the '<em><b>Visualisator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__VISUALISATOR = eINSTANCE.getDashboard_Visualisator();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__DATASOURCE = eINSTANCE.getDashboard_Datasource();

		/**
		 * The meta object literal for the '{@link cdb.impl.VisualisatorImpl <em>Visualisator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.VisualisatorImpl
		 * @see cdb.impl.CdbPackageImpl#getVisualisator()
		 * @generated
		 */
		EClass VISUALISATOR = eINSTANCE.getVisualisator();

		/**
		 * The meta object literal for the '<em><b>Presents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALISATOR__PRESENTS = eINSTANCE.getVisualisator_Presents();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALISATOR__NAME = eINSTANCE.getVisualisator_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALISATOR__POSITION = eINSTANCE.getVisualisator_Position();

		/**
		 * The meta object literal for the '{@link cdb.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.DataSourceImpl
		 * @see cdb.impl.CdbPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__PROVIDER = eINSTANCE.getDataSource_Provider();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__STATE = eINSTANCE.getDataSource_State();

		/**
		 * The meta object literal for the '<em><b>Presentedby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__PRESENTEDBY = eINSTANCE.getDataSource_Presentedby();

		/**
		 * The meta object literal for the '{@link cdb.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.ChartImpl
		 * @see cdb.impl.CdbPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__LABEL = eINSTANCE.getChart_Label();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__DATA = eINSTANCE.getChart_Data();

		/**
		 * The meta object literal for the '{@link cdb.impl.FacebookImpl <em>Facebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.FacebookImpl
		 * @see cdb.impl.CdbPackageImpl#getFacebook()
		 * @generated
		 */
		EClass FACEBOOK = eINSTANCE.getFacebook();

		/**
		 * The meta object literal for the '<em><b>Namepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK__NAMEPAGE = eINSTANCE.getFacebook_Namepage();

		/**
		 * The meta object literal for the '<em><b>Tittlepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK__TITTLEPAGE = eINSTANCE.getFacebook_Tittlepage();

		/**
		 * The meta object literal for the '{@link cdb.impl.TwitterImpl <em>Twitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.TwitterImpl
		 * @see cdb.impl.CdbPackageImpl#getTwitter()
		 * @generated
		 */
		EClass TWITTER = eINSTANCE.getTwitter();

		/**
		 * The meta object literal for the '<em><b>Accountuser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER__ACCOUNTUSER = eINSTANCE.getTwitter_Accountuser();

		/**
		 * The meta object literal for the '<em><b>Listname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER__LISTNAME = eINSTANCE.getTwitter_Listname();

		/**
		 * The meta object literal for the '{@link cdb.impl.YoutubeImpl <em>Youtube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.YoutubeImpl
		 * @see cdb.impl.CdbPackageImpl#getYoutube()
		 * @generated
		 */
		EClass YOUTUBE = eINSTANCE.getYoutube();

		/**
		 * The meta object literal for the '<em><b>Url List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOUTUBE__URL_LIST = eINSTANCE.getYoutube_UrlList();

		/**
		 * The meta object literal for the '<em><b>Channelname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOUTUBE__CHANNELNAME = eINSTANCE.getYoutube_Channelname();

		/**
		 * The meta object literal for the '{@link cdb.impl.SocialMediaImpl <em>Social Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.SocialMediaImpl
		 * @see cdb.impl.CdbPackageImpl#getSocialMedia()
		 * @generated
		 */
		EClass SOCIAL_MEDIA = eINSTANCE.getSocialMedia();

		/**
		 * The meta object literal for the '{@link cdb.impl.PieChartImpl <em>Pie Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.PieChartImpl
		 * @see cdb.impl.CdbPackageImpl#getPieChart()
		 * @generated
		 */
		EClass PIE_CHART = eINSTANCE.getPieChart();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIE_CHART__STEP_SIZE = eINSTANCE.getPieChart_StepSize();

		/**
		 * The meta object literal for the '{@link cdb.impl.BarChartImpl <em>Bar Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.BarChartImpl
		 * @see cdb.impl.CdbPackageImpl#getBarChart()
		 * @generated
		 */
		EClass BAR_CHART = eINSTANCE.getBarChart();

		/**
		 * The meta object literal for the '{@link cdb.impl.DataEntityImpl <em>Data Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.DataEntityImpl
		 * @see cdb.impl.CdbPackageImpl#getDataEntity()
		 * @generated
		 */
		EClass DATA_ENTITY = eINSTANCE.getDataEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTITY__NAME = eINSTANCE.getDataEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ENTITY__TYPE = eINSTANCE.getDataEntity_Type();

		/**
		 * The meta object literal for the '{@link cdb.impl.StreamedImpl <em>Streamed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.StreamedImpl
		 * @see cdb.impl.CdbPackageImpl#getStreamed()
		 * @generated
		 */
		EClass STREAMED = eINSTANCE.getStreamed();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED__METHOD = eINSTANCE.getStreamed_Method();

		/**
		 * The meta object literal for the '<em><b>URL service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAMED__URL_SERVICE = eINSTANCE.getStreamed_URL_service();

		/**
		 * The meta object literal for the '<em><b>Returnparameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAMED__RETURNPARAMETER = eINSTANCE.getStreamed_Returnparameter();

		/**
		 * The meta object literal for the '{@link cdb.impl.PersistedImpl <em>Persisted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.PersistedImpl
		 * @see cdb.impl.CdbPackageImpl#getPersisted()
		 * @generated
		 */
		EClass PERSISTED = eINSTANCE.getPersisted();

		/**
		 * The meta object literal for the '<em><b>Dataentitty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTED__DATAENTITTY = eINSTANCE.getPersisted_Dataentitty();

		/**
		 * The meta object literal for the '{@link cdb.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.MethodImpl
		 * @see cdb.impl.CdbPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Dataentitty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__DATAENTITTY = eINSTANCE.getMethod_Dataentitty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '{@link cdb.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.PositionImpl
		 * @see cdb.impl.CdbPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__TOP = eINSTANCE.getPosition_Top();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LEFT = eINSTANCE.getPosition_Left();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__HEIGTH = eINSTANCE.getPosition_Heigth();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__WIDTH = eINSTANCE.getPosition_Width();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

		/**
		 * The meta object literal for the '{@link cdb.impl.MapcImpl <em>Mapc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cdb.impl.MapcImpl
		 * @see cdb.impl.CdbPackageImpl#getMapc()
		 * @generated
		 */
		EClass MAPC = eINSTANCE.getMapc();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPC__MARKER = eINSTANCE.getMapc_Marker();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPC__LATITUDE = eINSTANCE.getMapc_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPC__LONGITUDE = eINSTANCE.getMapc_Longitude();

	}

} //CdbPackage
