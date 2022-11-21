/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TCDClaseItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TCDClaseItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getVisualID(incomingLink) == diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getVisualID(outgoingLink) == diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(node)) {
			case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(cnode)) {
					case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(cnode)) {
					case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAgregacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAsociacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDComposicionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDDependenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDHerenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAgregacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAsociacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDComposicionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDDependenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDHerenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAgregacionReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAsociacionReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDComposicionReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDDependenciaReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDHerenciaReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
