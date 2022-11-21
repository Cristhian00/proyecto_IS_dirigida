/*
* 
*/
package diagrama_concreta.diagram.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.navigator.ILinkHelper;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class Diagrama_concretaNavigatorLinkHelper implements ILinkHelper {

	/**
	* @generated
	*/
	private static IEditorInput getEditorInput(Diagram diagram) {
		Resource diagramResource = diagram.eResource();
		for (EObject nextEObject : diagramResource.getContents()) {
			if (nextEObject == diagram) {
				return new FileEditorInput(WorkspaceSynchronizer.getFile(diagramResource));
			}
			if (nextEObject instanceof Diagram) {
				break;
			}
		}
		URI uri = EcoreUtil.getURI(diagram);
		String editorName = uri.lastSegment() + '#' + diagram.eResource().getContents().indexOf(diagram);
		IEditorInput editorInput = new URIEditorInput(uri, editorName);
		return editorInput;
	}

	/**
	* @generated
	*/
	public IStructuredSelection findSelection(IEditorInput anInput) {
		IDiagramDocument document = diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
				.getDocumentProvider().getDiagramDocument(anInput);
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram == null || diagram.eResource() == null) {
			return StructuredSelection.EMPTY;
		}
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem item = new diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	* @generated
	*/
	public void activateEditor(IWorkbenchPage aPage, IStructuredSelection aSelection) {
		if (aSelection == null || aSelection.isEmpty()) {
			return;
		}
		if (false == aSelection
				.getFirstElement() instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaAbstractNavigatorItem) {
			return;
		}

		diagrama_concreta.diagram.navigator.Diagrama_concretaAbstractNavigatorItem abstractNavigatorItem = (diagrama_concreta.diagram.navigator.Diagrama_concretaAbstractNavigatorItem) aSelection
				.getFirstElement();
		View navigatorView = null;
		if (abstractNavigatorItem instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			navigatorView = ((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) abstractNavigatorItem)
					.getView();
		} else if (abstractNavigatorItem instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup navigatorGroup = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) abstractNavigatorItem;
			if (navigatorGroup
					.getParent() instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
				navigatorView = ((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) navigatorGroup
						.getParent()).getView();
			} else if (navigatorGroup.getParent() instanceof IAdaptable) {
				navigatorView = (View) ((IAdaptable) navigatorGroup.getParent()).getAdapter(View.class);
			}
		}
		if (navigatorView == null) {
			return;
		}
		IEditorInput editorInput = getEditorInput(navigatorView.getDiagram());
		IEditorPart editor = aPage.findEditor(editorInput);
		if (editor == null) {
			return;
		}
		aPage.bringToTop(editor);
		if (editor instanceof DiagramEditor) {
			DiagramEditor diagramEditor = (DiagramEditor) editor;
			ResourceSet diagramEditorResourceSet = diagramEditor.getEditingDomain().getResourceSet();
			EObject selectedView = diagramEditorResourceSet.getEObject(EcoreUtil.getURI(navigatorView), true);
			if (selectedView == null) {
				return;
			}
			GraphicalViewer graphicalViewer = (GraphicalViewer) diagramEditor.getAdapter(GraphicalViewer.class);
			EditPart selectedEditPart = (EditPart) graphicalViewer.getEditPartRegistry().get(selectedView);
			if (selectedEditPart != null) {
				graphicalViewer.select(selectedEditPart);
			}
		}
	}

}
