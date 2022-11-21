/**
 */
package diagrama_concreta.provider;


import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.Navegavilidad;
import diagrama_concreta.TCDAgregacion;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link diagrama_concreta.TCDAgregacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDAgregacionItemProvider extends TCDRelacionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDAgregacionItemProvider(AdapterFactory adapterFactory) {
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

			addNombreOrigenPropertyDescriptor(object);
			addNombreDestinoPropertyDescriptor(object);
			addMultiplicidadOrigenPropertyDescriptor(object);
			addMultiplicidadDestinoPropertyDescriptor(object);
			addNavegavilidadPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre Origen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreOrigenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDAgregacion_nombreOrigen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDAgregacion_nombreOrigen_feature", "_UI_TCDAgregacion_type"),
				 Diagrama_concretaPackage.Literals.TCD_AGREGACION__NOMBRE_ORIGEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nombre Destino feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreDestinoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDAgregacion_nombreDestino_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDAgregacion_nombreDestino_feature", "_UI_TCDAgregacion_type"),
				 Diagrama_concretaPackage.Literals.TCD_AGREGACION__NOMBRE_DESTINO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplicidad Origen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicidadOrigenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDAgregacion_multiplicidadOrigen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDAgregacion_multiplicidadOrigen_feature", "_UI_TCDAgregacion_type"),
				 Diagrama_concretaPackage.Literals.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplicidad Destino feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicidadDestinoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDAgregacion_multiplicidadDestino_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDAgregacion_multiplicidadDestino_feature", "_UI_TCDAgregacion_type"),
				 Diagrama_concretaPackage.Literals.TCD_AGREGACION__MULTIPLICIDAD_DESTINO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Navegavilidad feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavegavilidadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCDAgregacion_navegavilidad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCDAgregacion_navegavilidad_feature", "_UI_TCDAgregacion_type"),
				 Diagrama_concretaPackage.Literals.TCD_AGREGACION__NAVEGAVILIDAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TCDAgregacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TCDAgregacion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TCDAgregacion)object).getNombreOrigen();
		return label == null || label.length() == 0 ?
			getString("_UI_TCDAgregacion_type") :
			getString("_UI_TCDAgregacion_type") + " " + label;
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

		switch (notification.getFeatureID(TCDAgregacion.class)) {
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_ORIGEN:
			case Diagrama_concretaPackage.TCD_AGREGACION__NOMBRE_DESTINO:
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_ORIGEN:
			case Diagrama_concretaPackage.TCD_AGREGACION__MULTIPLICIDAD_DESTINO:
			case Diagrama_concretaPackage.TCD_AGREGACION__NAVEGAVILIDAD:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
