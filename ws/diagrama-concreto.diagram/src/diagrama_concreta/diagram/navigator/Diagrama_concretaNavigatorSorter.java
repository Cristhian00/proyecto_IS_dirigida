/*
* 
*/
package diagrama_concreta.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Diagrama_concretaNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem item = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
