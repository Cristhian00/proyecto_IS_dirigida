/*
* 
*/
package diagrama_concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Diagrama_concretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem && !isOwnView(
				((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup group = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) element;
			return diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem navigatorItem = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?diagrama_concreta?TCDDiagramaClases", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDiagramaClases_1000);
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?diagrama_concreta?TCDClase", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?diagrama_concreta?TCDPaquete", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDPaquete_2002);
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagrama_concreta?TCDAtributo", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAtributo_3001);
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagrama_concreta?TCDMetodo", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDMetodo_3002);
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TCDAsociacion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001);
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TCDComposicion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002);
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TCDDependencia", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003);
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TCDHerencia", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004);
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TCDAgregacion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.isKnownElementType(elementType)) {
			image = diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup group = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem navigatorItem = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
			return getTCDDiagramaClases_1000Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return getTCDClase_2001Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return getTCDPaquete_2002Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return getTCDAtributo_3001Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return getTCDMetodo_3002Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getTCDAsociacion_4001Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getTCDComposicion_4002Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getTCDDependencia_4003Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getTCDHerencia_4004Text(view);
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getTCDAgregacion_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getTCDDiagramaClases_1000Text(View view) {
		diagrama_concreta.TCDDiagramaClases domainModelElement = (diagrama_concreta.TCDDiagramaClases) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDClase_2001Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDPaquete_2002Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDPaquete_2002,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TCDPaqueteNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDAtributo_3001Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAtributo_3001,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TCDAtributoNombreTipoDatoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDMetodo_3002Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDMetodo_3002,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TCDMetodoNombreTipoRetornoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDAsociacion_4001Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getType(
						diagrama_concreta.diagram.edit.parts.TCDAsociacionNombreDestinoMultipliciEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDComposicion_4002Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getType(
						diagrama_concreta.diagram.edit.parts.TCDComposicionNombreDestinoMultipliciEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDDependencia_4003Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getType(
						diagrama_concreta.diagram.edit.parts.TCDDependenciaNombreDestinoMultipliciEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTCDHerencia_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getTCDAgregacion_4005Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getType(
						diagrama_concreta.diagram.edit.parts.TCDAgregacionNombreDestinoMultipliciEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.MODEL_ID
				.equals(diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getModelID(view));
	}

}
