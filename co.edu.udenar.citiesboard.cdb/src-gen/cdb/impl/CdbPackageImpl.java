/**
 */
package cdb.impl;

import cdb.BarChart;
import cdb.CdbFactory;
import cdb.CdbPackage;
import cdb.Chart;
import cdb.Dashboard;
import cdb.DataEntity;
import cdb.DataSource;
import cdb.Facebook;
import cdb.Mapc;
import cdb.Method;
import cdb.Persisted;
import cdb.PieChart;
import cdb.Position;
import cdb.SocialMedia;
import cdb.Streamed;
import cdb.Twitter;
import cdb.Visualisator;
import cdb.Youtube;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdbPackageImpl extends EPackageImpl implements CdbPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualisatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facebookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass youtubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialMediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapcEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cdb.CdbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdbPackageImpl() {
		super(eNS_URI, CdbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CdbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdbPackage init() {
		if (isInited)
			return (CdbPackage) EPackage.Registry.INSTANCE.getEPackage(CdbPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCdbPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CdbPackageImpl theCdbPackage = registeredCdbPackage instanceof CdbPackageImpl
				? (CdbPackageImpl) registeredCdbPackage
				: new CdbPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCdbPackage.createPackageContents();

		// Initialize created meta-data
		theCdbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdbPackage.eNS_URI, theCdbPackage);
		return theCdbPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDashboard() {
		return dashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashboard_Name() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashboard_Picture() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashboard_Description() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashboard_Email() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashboard_Pagelink() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDashboard_Visualisator() {
		return (EReference) dashboardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDashboard_Datasource() {
		return (EReference) dashboardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualisator() {
		return visualisatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVisualisator_Presents() {
		return (EReference) visualisatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVisualisator_Name() {
		return (EAttribute) visualisatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVisualisator_Position() {
		return (EReference) visualisatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Name() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Provider() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_State() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataSource_Presentedby() {
		return (EReference) dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChart() {
		return chartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChart_Label() {
		return (EReference) chartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChart_Data() {
		return (EReference) chartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacebook() {
		return facebookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacebook_Namepage() {
		return (EAttribute) facebookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFacebook_Tittlepage() {
		return (EAttribute) facebookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwitter() {
		return twitterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitter_Accountuser() {
		return (EAttribute) twitterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitter_Listname() {
		return (EAttribute) twitterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getYoutube() {
		return youtubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYoutube_UrlList() {
		return (EAttribute) youtubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getYoutube_Channelname() {
		return (EAttribute) youtubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialMedia() {
		return socialMediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPieChart() {
		return pieChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieChart_StepSize() {
		return (EAttribute) pieChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarChart() {
		return barChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataEntity() {
		return dataEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntity_Name() {
		return (EAttribute) dataEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataEntity_Type() {
		return (EAttribute) dataEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStreamed() {
		return streamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamed_Method() {
		return (EReference) streamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStreamed_URL_service() {
		return (EAttribute) streamedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStreamed_Returnparameter() {
		return (EReference) streamedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersisted() {
		return persistedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersisted_Dataentitty() {
		return (EReference) persistedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_Name() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethod_Dataentitty() {
		return (EReference) methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethod_Type() {
		return (EAttribute) methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Top() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Left() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Heigth() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Width() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Name() {
		return (EAttribute) positionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapc() {
		return mapcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapc_Marker() {
		return (EAttribute) mapcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapc_Latitude() {
		return (EAttribute) mapcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapc_Longitude() {
		return (EAttribute) mapcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdbFactory getCdbFactory() {
		return (CdbFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dashboardEClass = createEClass(DASHBOARD);
		createEAttribute(dashboardEClass, DASHBOARD__NAME);
		createEAttribute(dashboardEClass, DASHBOARD__PICTURE);
		createEAttribute(dashboardEClass, DASHBOARD__DESCRIPTION);
		createEAttribute(dashboardEClass, DASHBOARD__EMAIL);
		createEAttribute(dashboardEClass, DASHBOARD__PAGELINK);
		createEReference(dashboardEClass, DASHBOARD__VISUALISATOR);
		createEReference(dashboardEClass, DASHBOARD__DATASOURCE);

		visualisatorEClass = createEClass(VISUALISATOR);
		createEReference(visualisatorEClass, VISUALISATOR__PRESENTS);
		createEAttribute(visualisatorEClass, VISUALISATOR__NAME);
		createEReference(visualisatorEClass, VISUALISATOR__POSITION);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);
		createEAttribute(dataSourceEClass, DATA_SOURCE__PROVIDER);
		createEAttribute(dataSourceEClass, DATA_SOURCE__STATE);
		createEReference(dataSourceEClass, DATA_SOURCE__PRESENTEDBY);

		chartEClass = createEClass(CHART);
		createEReference(chartEClass, CHART__LABEL);
		createEReference(chartEClass, CHART__DATA);

		facebookEClass = createEClass(FACEBOOK);
		createEAttribute(facebookEClass, FACEBOOK__NAMEPAGE);
		createEAttribute(facebookEClass, FACEBOOK__TITTLEPAGE);

		twitterEClass = createEClass(TWITTER);
		createEAttribute(twitterEClass, TWITTER__ACCOUNTUSER);
		createEAttribute(twitterEClass, TWITTER__LISTNAME);

		youtubeEClass = createEClass(YOUTUBE);
		createEAttribute(youtubeEClass, YOUTUBE__URL_LIST);
		createEAttribute(youtubeEClass, YOUTUBE__CHANNELNAME);

		socialMediaEClass = createEClass(SOCIAL_MEDIA);

		pieChartEClass = createEClass(PIE_CHART);
		createEAttribute(pieChartEClass, PIE_CHART__STEP_SIZE);

		barChartEClass = createEClass(BAR_CHART);

		dataEntityEClass = createEClass(DATA_ENTITY);
		createEAttribute(dataEntityEClass, DATA_ENTITY__NAME);
		createEAttribute(dataEntityEClass, DATA_ENTITY__TYPE);

		streamedEClass = createEClass(STREAMED);
		createEReference(streamedEClass, STREAMED__METHOD);
		createEAttribute(streamedEClass, STREAMED__URL_SERVICE);
		createEReference(streamedEClass, STREAMED__RETURNPARAMETER);

		persistedEClass = createEClass(PERSISTED);
		createEReference(persistedEClass, PERSISTED__DATAENTITTY);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEReference(methodEClass, METHOD__DATAENTITTY);
		createEAttribute(methodEClass, METHOD__TYPE);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__TOP);
		createEAttribute(positionEClass, POSITION__LEFT);
		createEAttribute(positionEClass, POSITION__HEIGTH);
		createEAttribute(positionEClass, POSITION__WIDTH);
		createEAttribute(positionEClass, POSITION__NAME);

		mapcEClass = createEClass(MAPC);
		createEAttribute(mapcEClass, MAPC__MARKER);
		createEAttribute(mapcEClass, MAPC__LATITUDE);
		createEAttribute(mapcEClass, MAPC__LONGITUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		chartEClass.getESuperTypes().add(this.getVisualisator());
		facebookEClass.getESuperTypes().add(this.getSocialMedia());
		twitterEClass.getESuperTypes().add(this.getSocialMedia());
		youtubeEClass.getESuperTypes().add(this.getSocialMedia());
		socialMediaEClass.getESuperTypes().add(this.getVisualisator());
		pieChartEClass.getESuperTypes().add(this.getChart());
		barChartEClass.getESuperTypes().add(this.getChart());
		streamedEClass.getESuperTypes().add(this.getDataSource());
		persistedEClass.getESuperTypes().add(this.getDataSource());
		mapcEClass.getESuperTypes().add(this.getVisualisator());

		// Initialize classes, features, and operations; add parameters
		initEClass(dashboardEClass, Dashboard.class, "Dashboard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDashboard_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Picture(), ecorePackage.getEString(), "picture", null, 1, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Email(), ecorePackage.getEString(), "email", null, 1, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Pagelink(), ecorePackage.getEString(), "pagelink", null, 1, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Visualisator(), this.getVisualisator(), null, "visualisator", null, 1, -1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Datasource(), this.getDataSource(), null, "datasource", null, 1, -1,
				Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualisatorEClass, Visualisator.class, "Visualisator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisualisator_Presents(), this.getDataSource(), this.getDataSource_Presentedby(), "presents",
				null, 1, 1, Visualisator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisualisator_Name(), ecorePackage.getEString(), "name", "", 1, 1, Visualisator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualisator_Position(), this.getPosition(), null, "position", null, 1, 1, Visualisator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Provider(), ecorePackage.getEString(), "provider", null, 1, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_State(), ecorePackage.getEBoolean(), "state", null, 1, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSource_Presentedby(), this.getVisualisator(), this.getVisualisator_Presents(),
				"presentedby", null, 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chartEClass, Chart.class, "Chart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChart_Label(), this.getDataEntity(), null, "label", null, 1, 1, Chart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChart_Data(), this.getDataEntity(), null, "data", null, 1, 1, Chart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(facebookEClass, Facebook.class, "Facebook", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacebook_Namepage(), ecorePackage.getEString(), "namepage", null, 1, 1, Facebook.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacebook_Tittlepage(), ecorePackage.getEString(), "tittlepage", null, 1, 1, Facebook.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterEClass, Twitter.class, "Twitter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitter_Accountuser(), ecorePackage.getEString(), "accountuser", null, 1, 1, Twitter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitter_Listname(), ecorePackage.getEString(), "listname", null, 1, 1, Twitter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(youtubeEClass, Youtube.class, "Youtube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYoutube_UrlList(), ecorePackage.getEString(), "urlList", null, 1, 1, Youtube.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYoutube_Channelname(), ecorePackage.getEString(), "channelname", null, 1, 1, Youtube.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialMediaEClass, SocialMedia.class, "SocialMedia", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pieChartEClass, PieChart.class, "PieChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPieChart_StepSize(), ecorePackage.getEInt(), "stepSize", null, 1, 1, PieChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barChartEClass, BarChart.class, "BarChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataEntityEClass, DataEntity.class, "DataEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, DataEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataEntity_Type(), ecorePackage.getEString(), "type", null, 1, 1, DataEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamedEClass, Streamed.class, "Streamed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamed_Method(), this.getMethod(), null, "method", null, 1, 1, Streamed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamed_URL_service(), ecorePackage.getEString(), "URL_service", null, 1, 1, Streamed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamed_Returnparameter(), this.getDataEntity(), null, "returnparameter", null, 0, -1,
				Streamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistedEClass, Persisted.class, "Persisted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersisted_Dataentitty(), this.getDataEntity(), null, "dataentitty", null, 0, -1,
				Persisted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, Method.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Dataentitty(), this.getDataEntity(), null, "dataentitty", null, 0, -1, Method.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Type(), ecorePackage.getEString(), "type", null, 1, 1, Method.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Top(), ecorePackage.getEInt(), "top", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Left(), ecorePackage.getEInt(), "left", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Heigth(), ecorePackage.getEInt(), "heigth", null, 1, 1, Position.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Name(), ecorePackage.getEString(), "name", null, 1, 1, Position.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapcEClass, Mapc.class, "Mapc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapc_Marker(), ecorePackage.getEBoolean(), "marker", null, 1, 1, Mapc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapc_Latitude(), ecorePackage.getEFloat(), "latitude", null, 1, 1, Mapc.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapc_Longitude(), ecorePackage.getEFloat(), "longitude", null, 1, 1, Mapc.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CdbPackageImpl
