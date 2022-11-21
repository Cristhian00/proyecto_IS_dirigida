/*
 * 
 */
package diagrama_concreta.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
