/**
 */
package mvc;

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
 * @see mvc.MvcFactory
 * @model kind="package"
 * @generated
 */
public interface MvcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mvc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://citiesboard.sistemas.udenar.edu.co/mvc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mvc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MvcPackage eINSTANCE = mvc.impl.MvcPackageImpl.init();

	/**
	 * The meta object id for the '{@link mvc.impl.MvcApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.MvcApplicationImpl
	 * @see mvc.impl.MvcPackageImpl#getMvcApplication()
	 * @generated
	 */
	int MVC_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__PICTURE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Pagelink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__PAGELINK = 4;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__VIEWS = 5;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__MODELS = 6;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION__CONTROLLERS = 7;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ControllerImpl
	 * @see mvc.impl.MvcPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__MODEL = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__VIEW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ModelImpl
	 * @see mvc.impl.MvcPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Nameclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAMECLASS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTROLLER = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvc.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ViewImpl
	 * @see mvc.impl.MvcPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 3;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__TYPE = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvc.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.AttributeImpl
	 * @see mvc.impl.MvcPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Nameattribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAMEATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Typeattribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPEATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mvc.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.MethodImpl
	 * @see mvc.impl.MvcPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Namemethod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAMEMETHOD = 1;

	/**
	 * The feature id for the '<em><b>Attrib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ATTRIB = 2;

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
	 * The meta object id for the '{@link mvc.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ClientImpl
	 * @see mvc.impl.MvcPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 6;

	/**
	 * The feature id for the '<em><b>Nameclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAMECLASS = MODEL__NAMECLASS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__TYPE = MODEL__TYPE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONTROLLER = MODEL__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__METHOD = MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nameservice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAMESERVICE = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.DataBaseImpl
	 * @see mvc.impl.MvcPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 7;

	/**
	 * The feature id for the '<em><b>Nameclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAMECLASS = MODEL__NAMECLASS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__TYPE = MODEL__TYPE;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__CONTROLLER = MODEL__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__ATTRIBUTE = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.GraphicComponentImpl <em>Graphic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.GraphicComponentImpl
	 * @see mvc.impl.MvcPackageImpl#getGraphicComponent()
	 * @generated
	 */
	int GRAPHIC_COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__CONTROLLER = VIEW__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__POSITION = VIEW__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Dato A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__DATO_A = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dato B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__DATO_B = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT__STEP_SIZE = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Graphic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Graphic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_COMPONENT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.MapComponentImpl <em>Map Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.MapComponentImpl
	 * @see mvc.impl.MvcPackageImpl#getMapComponent()
	 * @generated
	 */
	int MAP_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__CONTROLLER = VIEW__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__POSITION = VIEW__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__MARKER = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__LATITUDE = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT__LONGITUDE = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Map Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_COMPONENT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.SocialComponentImpl <em>Social Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.SocialComponentImpl
	 * @see mvc.impl.MvcPackageImpl#getSocialComponent()
	 * @generated
	 */
	int SOCIAL_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__CONTROLLER = VIEW__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__POSITION = VIEW__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__TYPE = VIEW__TYPE;

	/**
	 * The feature id for the '<em><b>Social</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__SOCIAL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Socialname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT__SOCIALNAME = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Social Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Social Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_COMPONENT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mvc.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.PositionImpl
	 * @see mvc.impl.MvcPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 11;

	/**
	 * The feature id for the '<em><b>Above</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ABOVE = 0;

	/**
	 * The feature id for the '<em><b>Align left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ALIGN_LEFT = 1;

	/**
	 * The feature id for the '<em><b>Wide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__WIDE = 2;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LONG = 3;

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
	 * The meta object id for the '{@link mvc.impl.ReturnParameterImpl <em>Return Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mvc.impl.ReturnParameterImpl
	 * @see mvc.impl.MvcPackageImpl#getReturnParameter()
	 * @generated
	 */
	int RETURN_PARAMETER = 12;

	/**
	 * The number of structural features of the '<em>Return Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Return Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mvc.MvcApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see mvc.MvcApplication
	 * @generated
	 */
	EClass getMvcApplication();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MvcApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.MvcApplication#getName()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EAttribute getMvcApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MvcApplication#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see mvc.MvcApplication#getPicture()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EAttribute getMvcApplication_Picture();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MvcApplication#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mvc.MvcApplication#getDescription()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EAttribute getMvcApplication_Description();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MvcApplication#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see mvc.MvcApplication#getEmail()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EAttribute getMvcApplication_Email();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MvcApplication#getPagelink <em>Pagelink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pagelink</em>'.
	 * @see mvc.MvcApplication#getPagelink()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EAttribute getMvcApplication_Pagelink();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MvcApplication#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see mvc.MvcApplication#getViews()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EReference getMvcApplication_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MvcApplication#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see mvc.MvcApplication#getModels()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EReference getMvcApplication_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.MvcApplication#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see mvc.MvcApplication#getControllers()
	 * @see #getMvcApplication()
	 * @generated
	 */
	EReference getMvcApplication_Controllers();

	/**
	 * Returns the meta object for class '{@link mvc.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see mvc.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link mvc.Controller#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see mvc.Controller#getModel()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Model();

	/**
	 * Returns the meta object for the reference '{@link mvc.Controller#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see mvc.Controller#getView()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_View();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for class '{@link mvc.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mvc.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Model#getNameclass <em>Nameclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nameclass</em>'.
	 * @see mvc.Model#getNameclass()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Nameclass();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Model#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.Model#getType()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Type();

	/**
	 * Returns the meta object for the reference '{@link mvc.Model#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see mvc.Model#getController()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Controller();

	/**
	 * Returns the meta object for class '{@link mvc.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see mvc.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link mvc.View#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see mvc.View#getController()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Controller();

	/**
	 * Returns the meta object for the containment reference '{@link mvc.View#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see mvc.View#getPosition()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Position();

	/**
	 * Returns the meta object for the attribute '{@link mvc.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link mvc.View#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.View#getType()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Type();

	/**
	 * Returns the meta object for class '{@link mvc.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see mvc.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Attribute#getNameattribute <em>Nameattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nameattribute</em>'.
	 * @see mvc.Attribute#getNameattribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Nameattribute();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Attribute#getTypeattribute <em>Typeattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeattribute</em>'.
	 * @see mvc.Attribute#getTypeattribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Typeattribute();

	/**
	 * Returns the meta object for class '{@link mvc.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see mvc.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mvc.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Method#getNamemethod <em>Namemethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namemethod</em>'.
	 * @see mvc.Method#getNamemethod()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Namemethod();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.Method#getAttrib <em>Attrib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attrib</em>'.
	 * @see mvc.Method#getAttrib()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Attrib();

	/**
	 * Returns the meta object for class '{@link mvc.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see mvc.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the containment reference '{@link mvc.Client#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see mvc.Client#getMethod()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Method();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Client#getNameservice <em>Nameservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nameservice</em>'.
	 * @see mvc.Client#getNameservice()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Nameservice();

	/**
	 * Returns the meta object for class '{@link mvc.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see mvc.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the containment reference list '{@link mvc.DataBase#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see mvc.DataBase#getAttribute()
	 * @see #getDataBase()
	 * @generated
	 */
	EReference getDataBase_Attribute();

	/**
	 * Returns the meta object for class '{@link mvc.GraphicComponent <em>Graphic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic Component</em>'.
	 * @see mvc.GraphicComponent
	 * @generated
	 */
	EClass getGraphicComponent();

	/**
	 * Returns the meta object for the reference '{@link mvc.GraphicComponent#getDatoA <em>Dato A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dato A</em>'.
	 * @see mvc.GraphicComponent#getDatoA()
	 * @see #getGraphicComponent()
	 * @generated
	 */
	EReference getGraphicComponent_DatoA();

	/**
	 * Returns the meta object for the reference '{@link mvc.GraphicComponent#getDatoB <em>Dato B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dato B</em>'.
	 * @see mvc.GraphicComponent#getDatoB()
	 * @see #getGraphicComponent()
	 * @generated
	 */
	EReference getGraphicComponent_DatoB();

	/**
	 * Returns the meta object for the attribute '{@link mvc.GraphicComponent#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see mvc.GraphicComponent#getStepSize()
	 * @see #getGraphicComponent()
	 * @generated
	 */
	EAttribute getGraphicComponent_StepSize();

	/**
	 * Returns the meta object for class '{@link mvc.MapComponent <em>Map Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Component</em>'.
	 * @see mvc.MapComponent
	 * @generated
	 */
	EClass getMapComponent();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MapComponent#isMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker</em>'.
	 * @see mvc.MapComponent#isMarker()
	 * @see #getMapComponent()
	 * @generated
	 */
	EAttribute getMapComponent_Marker();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MapComponent#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see mvc.MapComponent#getLatitude()
	 * @see #getMapComponent()
	 * @generated
	 */
	EAttribute getMapComponent_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link mvc.MapComponent#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see mvc.MapComponent#getLongitude()
	 * @see #getMapComponent()
	 * @generated
	 */
	EAttribute getMapComponent_Longitude();

	/**
	 * Returns the meta object for class '{@link mvc.SocialComponent <em>Social Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Component</em>'.
	 * @see mvc.SocialComponent
	 * @generated
	 */
	EClass getSocialComponent();

	/**
	 * Returns the meta object for the attribute '{@link mvc.SocialComponent#getSocial <em>Social</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social</em>'.
	 * @see mvc.SocialComponent#getSocial()
	 * @see #getSocialComponent()
	 * @generated
	 */
	EAttribute getSocialComponent_Social();

	/**
	 * Returns the meta object for the attribute '{@link mvc.SocialComponent#getSocialname <em>Socialname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socialname</em>'.
	 * @see mvc.SocialComponent#getSocialname()
	 * @see #getSocialComponent()
	 * @generated
	 */
	EAttribute getSocialComponent_Socialname();

	/**
	 * Returns the meta object for class '{@link mvc.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see mvc.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Position#getAbove <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Above</em>'.
	 * @see mvc.Position#getAbove()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Above();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Position#getAlign_left <em>Align left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align left</em>'.
	 * @see mvc.Position#getAlign_left()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Align_left();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Position#getWide <em>Wide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wide</em>'.
	 * @see mvc.Position#getWide()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Wide();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Position#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see mvc.Position#getLong()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Long();

	/**
	 * Returns the meta object for the attribute '{@link mvc.Position#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mvc.Position#getName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Name();

	/**
	 * Returns the meta object for class '{@link mvc.ReturnParameter <em>Return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Parameter</em>'.
	 * @see mvc.ReturnParameter
	 * @generated
	 */
	EClass getReturnParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MvcFactory getMvcFactory();

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
		 * The meta object literal for the '{@link mvc.impl.MvcApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.MvcApplicationImpl
		 * @see mvc.impl.MvcPackageImpl#getMvcApplication()
		 * @generated
		 */
		EClass MVC_APPLICATION = eINSTANCE.getMvcApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_APPLICATION__NAME = eINSTANCE.getMvcApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_APPLICATION__PICTURE = eINSTANCE.getMvcApplication_Picture();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_APPLICATION__DESCRIPTION = eINSTANCE.getMvcApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_APPLICATION__EMAIL = eINSTANCE.getMvcApplication_Email();

		/**
		 * The meta object literal for the '<em><b>Pagelink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MVC_APPLICATION__PAGELINK = eINSTANCE.getMvcApplication_Pagelink();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_APPLICATION__VIEWS = eINSTANCE.getMvcApplication_Views();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_APPLICATION__MODELS = eINSTANCE.getMvcApplication_Models();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_APPLICATION__CONTROLLERS = eINSTANCE.getMvcApplication_Controllers();

		/**
		 * The meta object literal for the '{@link mvc.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ControllerImpl
		 * @see mvc.impl.MvcPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__MODEL = eINSTANCE.getController_Model();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__VIEW = eINSTANCE.getController_View();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '{@link mvc.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ModelImpl
		 * @see mvc.impl.MvcPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Nameclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAMECLASS = eINSTANCE.getModel_Nameclass();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TYPE = eINSTANCE.getModel_Type();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTROLLER = eINSTANCE.getModel_Controller();

		/**
		 * The meta object literal for the '{@link mvc.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ViewImpl
		 * @see mvc.impl.MvcPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__CONTROLLER = eINSTANCE.getView_Controller();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__POSITION = eINSTANCE.getView_Position();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__TYPE = eINSTANCE.getView_Type();

		/**
		 * The meta object literal for the '{@link mvc.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.AttributeImpl
		 * @see mvc.impl.MvcPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Nameattribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAMEATTRIBUTE = eINSTANCE.getAttribute_Nameattribute();

		/**
		 * The meta object literal for the '<em><b>Typeattribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPEATTRIBUTE = eINSTANCE.getAttribute_Typeattribute();

		/**
		 * The meta object literal for the '{@link mvc.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.MethodImpl
		 * @see mvc.impl.MvcPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Namemethod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAMEMETHOD = eINSTANCE.getMethod_Namemethod();

		/**
		 * The meta object literal for the '<em><b>Attrib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ATTRIB = eINSTANCE.getMethod_Attrib();

		/**
		 * The meta object literal for the '{@link mvc.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ClientImpl
		 * @see mvc.impl.MvcPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__METHOD = eINSTANCE.getClient_Method();

		/**
		 * The meta object literal for the '<em><b>Nameservice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAMESERVICE = eINSTANCE.getClient_Nameservice();

		/**
		 * The meta object literal for the '{@link mvc.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.DataBaseImpl
		 * @see mvc.impl.MvcPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BASE__ATTRIBUTE = eINSTANCE.getDataBase_Attribute();

		/**
		 * The meta object literal for the '{@link mvc.impl.GraphicComponentImpl <em>Graphic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.GraphicComponentImpl
		 * @see mvc.impl.MvcPackageImpl#getGraphicComponent()
		 * @generated
		 */
		EClass GRAPHIC_COMPONENT = eINSTANCE.getGraphicComponent();

		/**
		 * The meta object literal for the '<em><b>Dato A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_COMPONENT__DATO_A = eINSTANCE.getGraphicComponent_DatoA();

		/**
		 * The meta object literal for the '<em><b>Dato B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC_COMPONENT__DATO_B = eINSTANCE.getGraphicComponent_DatoB();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC_COMPONENT__STEP_SIZE = eINSTANCE.getGraphicComponent_StepSize();

		/**
		 * The meta object literal for the '{@link mvc.impl.MapComponentImpl <em>Map Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.MapComponentImpl
		 * @see mvc.impl.MvcPackageImpl#getMapComponent()
		 * @generated
		 */
		EClass MAP_COMPONENT = eINSTANCE.getMapComponent();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_COMPONENT__MARKER = eINSTANCE.getMapComponent_Marker();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_COMPONENT__LATITUDE = eINSTANCE.getMapComponent_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_COMPONENT__LONGITUDE = eINSTANCE.getMapComponent_Longitude();

		/**
		 * The meta object literal for the '{@link mvc.impl.SocialComponentImpl <em>Social Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.SocialComponentImpl
		 * @see mvc.impl.MvcPackageImpl#getSocialComponent()
		 * @generated
		 */
		EClass SOCIAL_COMPONENT = eINSTANCE.getSocialComponent();

		/**
		 * The meta object literal for the '<em><b>Social</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_COMPONENT__SOCIAL = eINSTANCE.getSocialComponent_Social();

		/**
		 * The meta object literal for the '<em><b>Socialname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_COMPONENT__SOCIALNAME = eINSTANCE.getSocialComponent_Socialname();

		/**
		 * The meta object literal for the '{@link mvc.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.PositionImpl
		 * @see mvc.impl.MvcPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Above</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ABOVE = eINSTANCE.getPosition_Above();

		/**
		 * The meta object literal for the '<em><b>Align left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ALIGN_LEFT = eINSTANCE.getPosition_Align_left();

		/**
		 * The meta object literal for the '<em><b>Wide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__WIDE = eINSTANCE.getPosition_Wide();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LONG = eINSTANCE.getPosition_Long();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

		/**
		 * The meta object literal for the '{@link mvc.impl.ReturnParameterImpl <em>Return Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mvc.impl.ReturnParameterImpl
		 * @see mvc.impl.MvcPackageImpl#getReturnParameter()
		 * @generated
		 */
		EClass RETURN_PARAMETER = eINSTANCE.getReturnParameter();

	}

} //MvcPackage
