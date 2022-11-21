/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TCDClaseTCDClaseListaAtributosCompartmentItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TCDClaseTCDClaseListaAtributosCompartmentItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAtributo_3001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TCDAtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
