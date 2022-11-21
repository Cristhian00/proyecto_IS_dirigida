
/*
 * 
 */
package diagrama_concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Diagrama_concretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(diagrama_concreta.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createTCDAtributo1CreationTool());
		paletteContainer.add(createTCDClase2CreationTool());
		paletteContainer.add(createTCDMetodo3CreationTool());
		paletteContainer.add(createTCDPaquete4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				diagrama_concreta.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTCDAgregacion1CreationTool());
		paletteContainer.add(createTCDAsociacion2CreationTool());
		paletteContainer.add(createTCDComposicion3CreationTool());
		paletteContainer.add(createTCDDependencia4CreationTool());
		paletteContainer.add(createTCDHerencia5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDAtributo1CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDAtributo1CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAtributo_3001));
		entry.setId("createTCDAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAtributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDClase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDClase2CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDClase2CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001));
		entry.setId("createTCDClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes
				.getImageDescriptor(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDClase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDMetodo3CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDMetodo3CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDMetodo_3002));
		entry.setId("createTCDMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes
				.getImageDescriptor(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDMetodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDPaquete4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDPaquete4CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDPaquete4CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDPaquete_2002));
		entry.setId("createTCDPaquete4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes
				.getImageDescriptor(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDPaquete_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDAgregacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDAgregacion1CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDAgregacion1CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005));
		entry.setId("createTCDAgregacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAgregacion_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDAsociacion2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDAsociacion2CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDAsociacion2CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001));
		entry.setId("createTCDAsociacion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDAsociacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDComposicion3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDComposicion3CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDComposicion3CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002));
		entry.setId("createTCDComposicion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDComposicion_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDDependencia4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDDependencia4CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDDependencia4CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003));
		entry.setId("createTCDDependencia4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDDependencia_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTCDHerencia5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TCDHerencia5CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TCDHerencia5CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004));
		entry.setId("createTCDHerencia5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TCDHerencia_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
