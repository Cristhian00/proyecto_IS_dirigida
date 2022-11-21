/*
 * 
 */
package diagrama_concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Diagrama_concretaElementTypes {

	/**
	* @generated
	*/
	private Diagrama_concretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType TCDDiagramaClases_1000 = getElementType(
			"diagrama-concreto.diagram.TCDDiagramaClases_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDClase_2001 = getElementType("diagrama-concreto.diagram.TCDClase_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDPaquete_2002 = getElementType("diagrama-concreto.diagram.TCDPaquete_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDAtributo_3001 = getElementType("diagrama-concreto.diagram.TCDAtributo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDMetodo_3002 = getElementType("diagrama-concreto.diagram.TCDMetodo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDAgregacion_4005 = getElementType(
			"diagrama-concreto.diagram.TCDAgregacion_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDAsociacion_4001 = getElementType(
			"diagrama-concreto.diagram.TCDAsociacion_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDComposicion_4002 = getElementType(
			"diagrama-concreto.diagram.TCDComposicion_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDDependencia_4003 = getElementType(
			"diagrama-concreto.diagram.TCDDependencia_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TCDHerencia_4004 = getElementType("diagrama-concreto.diagram.TCDHerencia_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(TCDDiagramaClases_1000,
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDDiagramaClases());

			elements.put(TCDClase_2001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDClase());

			elements.put(TCDPaquete_2002, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDPaquete());

			elements.put(TCDAtributo_3001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAtributo());

			elements.put(TCDMetodo_3002, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDMetodo());

			elements.put(TCDAgregacion_4005, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAgregacion());

			elements.put(TCDAsociacion_4001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAsociacion());

			elements.put(TCDComposicion_4002, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDComposicion());

			elements.put(TCDDependencia_4003, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDDependencia());

			elements.put(TCDHerencia_4004, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDHerencia());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(TCDDiagramaClases_1000);
			KNOWN_ELEMENT_TYPES.add(TCDClase_2001);
			KNOWN_ELEMENT_TYPES.add(TCDPaquete_2002);
			KNOWN_ELEMENT_TYPES.add(TCDAtributo_3001);
			KNOWN_ELEMENT_TYPES.add(TCDMetodo_3002);
			KNOWN_ELEMENT_TYPES.add(TCDAgregacion_4005);
			KNOWN_ELEMENT_TYPES.add(TCDAsociacion_4001);
			KNOWN_ELEMENT_TYPES.add(TCDComposicion_4002);
			KNOWN_ELEMENT_TYPES.add(TCDDependencia_4003);
			KNOWN_ELEMENT_TYPES.add(TCDHerencia_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID:
			return TCDDiagramaClases_1000;
		case diagrama_concreta.diagram.edit.parts.TCDClaseEditPart.VISUAL_ID:
			return TCDClase_2001;
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteEditPart.VISUAL_ID:
			return TCDPaquete_2002;
		case diagrama_concreta.diagram.edit.parts.TCDAtributoEditPart.VISUAL_ID:
			return TCDAtributo_3001;
		case diagrama_concreta.diagram.edit.parts.TCDMetodoEditPart.VISUAL_ID:
			return TCDMetodo_3002;
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionEditPart.VISUAL_ID:
			return TCDAgregacion_4005;
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionEditPart.VISUAL_ID:
			return TCDAsociacion_4001;
		case diagrama_concreta.diagram.edit.parts.TCDComposicionEditPart.VISUAL_ID:
			return TCDComposicion_4002;
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaEditPart.VISUAL_ID:
			return TCDDependencia_4003;
		case diagrama_concreta.diagram.edit.parts.TCDHerenciaEditPart.VISUAL_ID:
			return TCDHerencia_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
