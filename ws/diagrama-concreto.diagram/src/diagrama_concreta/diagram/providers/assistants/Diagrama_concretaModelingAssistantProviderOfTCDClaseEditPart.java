/*
 * 
 */
package diagrama_concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Diagrama_concretaModelingAssistantProviderOfTCDClaseEditPart
		extends diagrama_concreta.diagram.providers.Diagrama_concretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(diagrama_concreta.diagram.edit.parts.TCDClaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			diagrama_concreta.diagram.edit.parts.TCDClaseEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(diagrama_concreta.diagram.edit.parts.TCDClaseEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(diagrama_concreta.diagram.edit.parts.TCDClaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((diagrama_concreta.diagram.edit.parts.TCDClaseEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(diagrama_concreta.diagram.edit.parts.TCDClaseEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001);
		}
		return types;
	}

}
