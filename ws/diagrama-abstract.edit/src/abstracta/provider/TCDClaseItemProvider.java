/**
 */
package abstracta.provider;


import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.TCDClase;

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
 * This is the item provider adapter for a {@link abstracta.TCDClase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDClaseItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDClaseItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
			addEstereotipoPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addDocumentacionPropertyDescriptor(object);
			addRutaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDClase_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDClase_nombre_feature", "_UI_TCDClase_type"),
				 AbstractaPackage.Literals.TCD_CLASE__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Estereotipo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEstereotipoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDClase_estereotipo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDClase_estereotipo_feature", "_UI_TCDClase_type"),
				 AbstractaPackage.Literals.TCD_CLASE__ESTEREOTIPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDClase_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDClase_isAbstract_feature", "_UI_TCDClase_type"),
				 AbstractaPackage.Literals.TCD_CLASE__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDClase_documentacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDClase_documentacion_feature", "_UI_TCDClase_type"),
				 AbstractaPackage.Literals.TCD_CLASE__DOCUMENTACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ruta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRutaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDClase_ruta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDClase_ruta_feature", "_UI_TCDClase_type"),
				 AbstractaPackage.Literals.TCD_CLASE__RUTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(AbstractaPackage.Literals.TCD_CLASE__LISTA_ATRIBUTOS);
			childrenFeatures.add(AbstractaPackage.Literals.TCD_CLASE__LISTA_METODOS);
			childrenFeatures.add(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES);
			childrenFeatures.add(AbstractaPackage.Literals.TCD_CLASE__IDENTIFICADORES);
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
	 * This returns TCDClase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TCDClase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TCDClase)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_TCDClase_type") :
			getString("_UI_TCDClase_type") + " " + label;
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

		switch (notification.getFeatureID(TCDClase.class)) {
			case AbstractaPackage.TCD_CLASE__NOMBRE:
			case AbstractaPackage.TCD_CLASE__ESTEREOTIPO:
			case AbstractaPackage.TCD_CLASE__IS_ABSTRACT:
			case AbstractaPackage.TCD_CLASE__DOCUMENTACION:
			case AbstractaPackage.TCD_CLASE__RUTA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractaPackage.TCD_CLASE__LISTA_ATRIBUTOS:
			case AbstractaPackage.TCD_CLASE__LISTA_METODOS:
			case AbstractaPackage.TCD_CLASE__LISTA_RELACIONES:
			case AbstractaPackage.TCD_CLASE__IDENTIFICADORES:
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

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_ATRIBUTOS,
				 AbstractaFactory.eINSTANCE.createTCDAtributo()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_METODOS,
				 AbstractaFactory.eINSTANCE.createTCDMetodo()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createTCDAsociacion()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createTCDComposicion()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createTCDDependencia()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createTCDHerencia()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__LISTA_RELACIONES,
				 AbstractaFactory.eINSTANCE.createTCDAgregacion()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractaPackage.Literals.TCD_CLASE__IDENTIFICADORES,
				 AbstractaFactory.eINSTANCE.createTCDClass_identifier()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractaEditPlugin.INSTANCE;
	}

}
