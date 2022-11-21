/*
 * 
 */
package diagrama_concreta.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		diagrama_concreta.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		diagrama_concreta.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		diagrama_concreta.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		diagrama_concreta.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		diagrama_concreta.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
