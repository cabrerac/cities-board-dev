/**
 */
package cdb.provider;

import cdb.CdbFactory;
import cdb.CdbPackage;
import cdb.Dashboard;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link cdb.Dashboard} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DashboardItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DashboardItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addPicturePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addPagelinkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dashboard_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dashboard_name_feature",
								"_UI_Dashboard_type"),
						CdbPackage.Literals.DASHBOARD__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Picture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPicturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dashboard_picture_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dashboard_picture_feature",
								"_UI_Dashboard_type"),
						CdbPackage.Literals.DASHBOARD__PICTURE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dashboard_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dashboard_description_feature",
								"_UI_Dashboard_type"),
						CdbPackage.Literals.DASHBOARD__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dashboard_email_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dashboard_email_feature",
								"_UI_Dashboard_type"),
						CdbPackage.Literals.DASHBOARD__EMAIL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pagelink feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagelinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Dashboard_pagelink_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Dashboard_pagelink_feature",
								"_UI_Dashboard_type"),
						CdbPackage.Literals.DASHBOARD__PAGELINK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CdbPackage.Literals.DASHBOARD__VISUALISATOR);
			childrenFeatures.add(CdbPackage.Literals.DASHBOARD__DATASOURCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Dashboard.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dashboard"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dashboard) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Dashboard_type")
				: getString("_UI_Dashboard_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Dashboard.class)) {
		case CdbPackage.DASHBOARD__NAME:
		case CdbPackage.DASHBOARD__PICTURE:
		case CdbPackage.DASHBOARD__DESCRIPTION:
		case CdbPackage.DASHBOARD__EMAIL:
		case CdbPackage.DASHBOARD__PAGELINK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CdbPackage.DASHBOARD__VISUALISATOR:
		case CdbPackage.DASHBOARD__DATASOURCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createVisualisator()));

		newChildDescriptors.add(
				createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR, CdbFactory.eINSTANCE.createChart()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createSocialMedia()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createFacebook()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createTwitter()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createYoutube()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createPieChart()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR,
				CdbFactory.eINSTANCE.createBarChart()));

		newChildDescriptors.add(
				createChildParameter(CdbPackage.Literals.DASHBOARD__VISUALISATOR, CdbFactory.eINSTANCE.createMapc()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__DATASOURCE,
				CdbFactory.eINSTANCE.createDataSource()));

		newChildDescriptors.add(
				createChildParameter(CdbPackage.Literals.DASHBOARD__DATASOURCE, CdbFactory.eINSTANCE.createStreamed()));

		newChildDescriptors.add(createChildParameter(CdbPackage.Literals.DASHBOARD__DATASOURCE,
				CdbFactory.eINSTANCE.createPersisted()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CdbEditPlugin.INSTANCE;
	}

}
