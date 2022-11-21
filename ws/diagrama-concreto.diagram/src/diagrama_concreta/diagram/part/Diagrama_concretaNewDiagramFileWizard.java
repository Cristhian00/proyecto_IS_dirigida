/*
 * 
 */
package diagrama_concreta.diagram.part;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * @generated
 */
public class Diagrama_concretaNewDiagramFileWizard extends Wizard {

	/**
	* @generated
	*/
	private WizardNewFileCreationPage myFileCreationPage;

	/**
	* @generated
	*/
	private diagrama_concreta.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
	* @generated
	*/
	private TransactionalEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	public Diagrama_concretaNewDiagramFileWizard(URI domainModelURI, EObject diagramRoot,
			TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
		assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
		assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new WizardNewFileCreationPage(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_CreationPageName,
				StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(NLS.bind(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_CreationPageDescription,
				diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.MODEL_ID));
		IPath filePath;
		String fileName = URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI); //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil
				.getUniqueFileName(filePath, fileName, "diagrama_concreta_diagram")); //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage.setDescription(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

		myEditingDomain = editingDomain;
	}

	/**
	* @generated
	*/
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		LinkedList<IFile> affectedFiles = new LinkedList<IFile>();
		IFile diagramFile = myFileCreationPage.createNewFile();
		diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final Resource diagramResource = resourceSet.createResource(diagramModelURI);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(myEditingDomain,
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_InitDiagramCommand,
				affectedFiles) {

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				int diagramVID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.VISUAL_ID) {
					return CommandResult.newErrorCommandResult(
							diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_IncorrectRootError);
				}
				Diagram diagram = ViewService.createDiagram(diagramRootElementSelectionPage.getModelElement(),
						diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.MODEL_ID,
						diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
			diagramResource.save(diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil.getSaveOptions());
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil.openDiagram(diagramResource);
		} catch (ExecutionException e) {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Unable to create model and diagram", e); //$NON-NLS-1$
		} catch (IOException ex) {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Save operation failed for: " + diagramModelURI, ex); //$NON-NLS-1$
		} catch (PartInitException ex) {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Unable to open editor", ex); //$NON-NLS-1$
		}
		return true;
	}

	/**
	* @generated
	*/
	private static class DiagramRootElementSelectionPage
			extends diagrama_concreta.diagram.part.ModelElementSelectionPage {

		/**
		* @generated
		*/
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
		* @generated
		*/
		protected String getSelectionTitle() {
			return diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
		* @generated
		*/
		protected boolean validatePage() {
			if (getModelElement() == null) {
				setErrorMessage(
						diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = ViewService.getInstance().provides(new CreateDiagramViewOperation(
					new EObjectAdapter(getModelElement()),
					diagrama_concreta.diagram.edit.parts.TCDDiagramaClasesEditPart.MODEL_ID,
					diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null
					: diagrama_concreta.diagram.part.Messages.Diagrama_concretaNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
