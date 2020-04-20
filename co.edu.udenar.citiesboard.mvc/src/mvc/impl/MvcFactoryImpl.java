/**
 */
package mvc.impl;

import mvc.*;

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
public class MvcFactoryImpl extends EFactoryImpl implements MvcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MvcFactory init() {
		try {
			MvcFactory theMvcFactory = (MvcFactory)EPackage.Registry.INSTANCE.getEFactory(MvcPackage.eNS_URI);
			if (theMvcFactory != null) {
				return theMvcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MvcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcFactoryImpl() {
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
			case MvcPackage.MVC_APPLICATION: return createMvcApplication();
			case MvcPackage.CONTROLLER: return createController();
			case MvcPackage.MODEL: return createModel();
			case MvcPackage.VIEW: return createView();
			case MvcPackage.ATTRIBUTE: return createAttribute();
			case MvcPackage.METHOD: return createMethod();
			case MvcPackage.CLIENT: return createClient();
			case MvcPackage.DATA_BASE: return createDataBase();
			case MvcPackage.GRAPHIC_COMPONENT: return createGraphicComponent();
			case MvcPackage.MAP_COMPONENT: return createMapComponent();
			case MvcPackage.SOCIAL_COMPONENT: return createSocialComponent();
			case MvcPackage.POSITION: return createPosition();
			case MvcPackage.RETURN_PARAMETER: return createReturnParameter();
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
	public MvcApplication createMvcApplication() {
		MvcApplicationImpl mvcApplication = new MvcApplicationImpl();
		return mvcApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
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
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicComponent createGraphicComponent() {
		GraphicComponentImpl graphicComponent = new GraphicComponentImpl();
		return graphicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapComponent createMapComponent() {
		MapComponentImpl mapComponent = new MapComponentImpl();
		return mapComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialComponent createSocialComponent() {
		SocialComponentImpl socialComponent = new SocialComponentImpl();
		return socialComponent;
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
	public ReturnParameter createReturnParameter() {
		ReturnParameterImpl returnParameter = new ReturnParameterImpl();
		return returnParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MvcPackage getMvcPackage() {
		return (MvcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MvcPackage getPackage() {
		return MvcPackage.eINSTANCE;
	}

} //MvcFactoryImpl
