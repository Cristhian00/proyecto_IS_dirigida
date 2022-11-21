/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TCDClaseTCDClaseListaMetodosCompartmentItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TCDClaseTCDClaseListaMetodosCompartmentItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDMetodo_3002 == req.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDMetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
