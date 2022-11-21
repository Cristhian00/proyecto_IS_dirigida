/*
* 
*/
package diagrama_concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Diagrama_concretaNavigatorItem
		extends diagrama_concreta.diagram.navigator.Diagrama_concretaAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public Diagrama_concretaNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			return EcoreUtil.getURI(getView()).equals(EcoreUtil
					.getURI(((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
