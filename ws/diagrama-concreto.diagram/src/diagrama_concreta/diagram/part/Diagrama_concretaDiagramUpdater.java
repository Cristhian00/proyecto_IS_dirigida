/*
* 
*/
package diagrama_concreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Diagrama_concretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getSemanticChildren(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
			return getTCDDiagramaClases_1000SemanticChildren(view);
		case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart.VISUAL_ID:
			return getTCDClaseTCDClaseListaAtributosCompartment_7001SemanticChildren(view);
		case diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart.VISUAL_ID:
			return getTCDClaseTCDClaseListaMetodosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTCDDiagramaClases_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TCDDiagramaClases modelElement = (diagrama_concreta.TCDDiagramaClases) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			diagrama_concreta.TCDClase childElement = (diagrama_concreta.TCDClase) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getListaPaquetes().iterator(); it.hasNext();) {
			diagrama_concreta.TCDPaquete childElement = (diagrama_concreta.TCDPaquete) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTCDClaseTCDClaseListaAtributosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TCDClase modelElement = (diagrama_concreta.TCDClase) containerView.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaAtributos().iterator(); it.hasNext();) {
			diagrama_concreta.TCDAtributo childElement = (diagrama_concreta.TCDAtributo) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTCDClaseTCDClaseListaMetodosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TCDClase modelElement = (diagrama_concreta.TCDClase) containerView.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaMetodos().iterator(); it.hasNext();) {
			diagrama_concreta.TCDMetodo childElement = (diagrama_concreta.TCDMetodo) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
			return getTCDDiagramaClases_1000ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return getTCDClase_2001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return getTCDPaquete_2002ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return getTCDAtributo_3001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return getTCDMetodo_3002ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getTCDAgregacion_4005ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getTCDAsociacion_4001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getTCDComposicion_4002ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getTCDDependencia_4003ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getTCDHerencia_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return getTCDClase_2001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return getTCDPaquete_2002IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return getTCDAtributo_3001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return getTCDMetodo_3002IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getTCDAgregacion_4005IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getTCDAsociacion_4001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getTCDComposicion_4002IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getTCDDependencia_4003IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getTCDHerencia_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return getTCDClase_2001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return getTCDPaquete_2002OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return getTCDAtributo_3001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return getTCDMetodo_3002OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return getTCDAgregacion_4005OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return getTCDAsociacion_4001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return getTCDComposicion_4002OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return getTCDDependencia_4003OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return getTCDHerencia_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDDiagramaClases_1000ContainedLinks(
			View view) {
		diagrama_concreta.TCDDiagramaClases modelElement = (diagrama_concreta.TCDDiagramaClases) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TCDAgregacion_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TCDAsociacion_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TCDComposicion_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TCDDependencia_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TCDHerencia_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDClase_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDPaquete_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAtributo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDMetodo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAgregacion_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAsociacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDComposicion_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDDependencia_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDHerencia_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDClase_2001IncomingLinks(
			View view) {
		diagrama_concreta.TCDClase modelElement = (diagrama_concreta.TCDClase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TCDAgregacion_4005(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TCDAsociacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TCDComposicion_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TCDDependencia_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TCDHerencia_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDPaquete_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAtributo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDMetodo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAgregacion_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAsociacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDComposicion_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDDependencia_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDHerencia_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDClase_2001OutgoingLinks(
			View view) {
		diagrama_concreta.TCDClase modelElement = (diagrama_concreta.TCDClase) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TCDAgregacion_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TCDAsociacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TCDComposicion_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TCDDependencia_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TCDHerencia_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDPaquete_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAtributo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDMetodo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAgregacion_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDAsociacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDComposicion_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDDependencia_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTCDHerencia_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TCDAgregacion_4005(
			diagrama_concreta.TCDDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDAgregacion) {
				continue;
			}
			diagrama_concreta.TCDAgregacion link = (diagrama_concreta.TCDAgregacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TCDAsociacion_4001(
			diagrama_concreta.TCDDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDAsociacion) {
				continue;
			}
			diagrama_concreta.TCDAsociacion link = (diagrama_concreta.TCDAsociacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TCDComposicion_4002(
			diagrama_concreta.TCDDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDComposicion) {
				continue;
			}
			diagrama_concreta.TCDComposicion link = (diagrama_concreta.TCDComposicion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TCDDependencia_4003(
			diagrama_concreta.TCDDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDDependencia) {
				continue;
			}
			diagrama_concreta.TCDDependencia link = (diagrama_concreta.TCDDependencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TCDHerencia_4004(
			diagrama_concreta.TCDDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDHerencia) {
				continue;
			}
			diagrama_concreta.TCDHerencia link = (diagrama_concreta.TCDHerencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TCDAgregacion_4005(
			diagrama_concreta.TCDClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTCDRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TCDAgregacion) {
				continue;
			}
			diagrama_concreta.TCDAgregacion link = (diagrama_concreta.TCDAgregacion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TCDAsociacion_4001(
			diagrama_concreta.TCDClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTCDRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TCDAsociacion) {
				continue;
			}
			diagrama_concreta.TCDAsociacion link = (diagrama_concreta.TCDAsociacion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TCDComposicion_4002(
			diagrama_concreta.TCDClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTCDRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TCDComposicion) {
				continue;
			}
			diagrama_concreta.TCDComposicion link = (diagrama_concreta.TCDComposicion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TCDDependencia_4003(
			diagrama_concreta.TCDClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTCDRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TCDDependencia) {
				continue;
			}
			diagrama_concreta.TCDDependencia link = (diagrama_concreta.TCDDependencia) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TCDHerencia_4004(
			diagrama_concreta.TCDClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTCDRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TCDHerencia) {
				continue;
			}
			diagrama_concreta.TCDHerencia link = (diagrama_concreta.TCDHerencia) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TCDAgregacion_4005(
			diagrama_concreta.TCDClase source) {
		diagrama_concreta.TCDDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TCDDiagramaClases) {
				container = (diagrama_concreta.TCDDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDAgregacion) {
				continue;
			}
			diagrama_concreta.TCDAgregacion link = (diagrama_concreta.TCDAgregacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TCDAsociacion_4001(
			diagrama_concreta.TCDClase source) {
		diagrama_concreta.TCDDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TCDDiagramaClases) {
				container = (diagrama_concreta.TCDDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDAsociacion) {
				continue;
			}
			diagrama_concreta.TCDAsociacion link = (diagrama_concreta.TCDAsociacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TCDComposicion_4002(
			diagrama_concreta.TCDClase source) {
		diagrama_concreta.TCDDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TCDDiagramaClases) {
				container = (diagrama_concreta.TCDDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDComposicion) {
				continue;
			}
			diagrama_concreta.TCDComposicion link = (diagrama_concreta.TCDComposicion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TCDDependencia_4003(
			diagrama_concreta.TCDClase source) {
		diagrama_concreta.TCDDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TCDDiagramaClases) {
				container = (diagrama_concreta.TCDDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDDependencia) {
				continue;
			}
			diagrama_concreta.TCDDependencia link = (diagrama_concreta.TCDDependencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TCDHerencia_4004(
			diagrama_concreta.TCDClase source) {
		diagrama_concreta.TCDDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TCDDiagramaClases) {
				container = (diagrama_concreta.TCDDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TCDHerencia) {
				continue;
			}
			diagrama_concreta.TCDHerencia link = (diagrama_concreta.TCDHerencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TCDClase dst = link.getTarget();
			diagrama_concreta.TCDClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getSemanticChildren(View view) {
			return Diagrama_concretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
