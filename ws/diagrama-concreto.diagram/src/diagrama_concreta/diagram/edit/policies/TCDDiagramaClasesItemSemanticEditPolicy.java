/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class TCDDiagramaClasesItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TCDDiagramaClasesItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDiagramaClases_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001 == req.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDClaseCreateCommand(req));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDPaquete_2002 == req.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDPaqueteCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
