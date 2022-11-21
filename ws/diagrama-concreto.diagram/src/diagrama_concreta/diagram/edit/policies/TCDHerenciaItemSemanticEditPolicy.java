/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class TCDHerenciaItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TCDHerenciaItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
