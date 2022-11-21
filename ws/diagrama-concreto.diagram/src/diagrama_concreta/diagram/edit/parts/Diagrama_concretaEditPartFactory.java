/*
 * 
 */
package diagrama_concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Diagrama_concretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {

			case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDClaseEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDPaqueteNombreEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDPaqueteNombreEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAtributoNombreTipoDatoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAtributoNombreTipoDatoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDMetodoNombreTipoRetornoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDMetodoNombreTipoRetornoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAgregacionNombreDestinoMultipliciEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAgregacionNombreDestinoMultipliciEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDAsociacionNombreDestinoMultipliciEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDAsociacionNombreDestinoMultipliciEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDComposicionNombreDestinoMultipliciEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDComposicionNombreDestinoMultipliciEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDDependenciaNombreDestinoMultipliciEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDDependenciaNombreDestinoMultipliciEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
