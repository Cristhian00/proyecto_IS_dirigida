/*
 * 
 */
package diagrama_concreta.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Diagrama_concretaCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected diagrama_concreta.diagram.part.Diagrama_concretaCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected diagrama_concreta.diagram.part.Diagrama_concretaCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizardTitle);
		setDefaultPageImageDescriptor(diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDiagrama_concretaWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new diagrama_concreta.diagram.part.Diagrama_concretaCreationWizardPage(
				"DiagramModelFile", getSelection(), "diagrama_concreta_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new diagrama_concreta.diagram.part.Diagrama_concretaCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "diagrama_concreta") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".diagrama_concreta_diagram".length()); //$NON-NLS-1$
					setFileName(diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "diagrama_concreta")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						diagrama_concreta.diagram.part.Messages.Diagrama_concretaCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
