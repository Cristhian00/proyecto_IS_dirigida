/*
 * 
 */
package diagrama_concreta.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class TCDClaseEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2001;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public TCDClaseEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new diagrama_concreta.diagram.edit.policies.TCDClaseItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new diagrama_concreta.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new TCDClaseFigure();
	}

	/**
	* @generated
	*/
	public TCDClaseFigure getPrimaryShape() {
		return (TCDClaseFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart) {
			((diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTCDClaseLabelFigure());
			return true;
		}
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTCDClaseListaAtributosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTCDClaseListaMetodosCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart) {
			return true;
		}
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTCDClaseListaAtributosCompartmentFigure();
			pane.remove(
					((diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getTCDClaseListaMetodosCompartmentFigure();
			pane.remove(
					((diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaAtributosCompartmentEditPart) {
			return getPrimaryShape().getTCDClaseListaAtributosCompartmentFigure();
		}
		if (editPart instanceof diagrama_concreta.diagram.edit.parts.TCDClaseTCDClaseListaMetodosCompartmentEditPart) {
			return getPrimaryShape().getTCDClaseListaMetodosCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
				.getType(diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class TCDClaseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTCDClaseLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTCDClaseListaAtributosCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fTCDClaseListaMetodosCompartmentFigure;

		/**
		 * @generated
		 */
		public TCDClaseFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTCDClaseLabelFigure = new WrappingLabel();

			fFigureTCDClaseLabelFigure.setText("TCDClase");
			fFigureTCDClaseLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureTCDClaseLabelFigure);

			fTCDClaseListaAtributosCompartmentFigure = new RectangleFigure();

			fTCDClaseListaAtributosCompartmentFigure.setOutline(false);

			this.add(fTCDClaseListaAtributosCompartmentFigure);

			fTCDClaseListaMetodosCompartmentFigure = new RectangleFigure();

			fTCDClaseListaMetodosCompartmentFigure.setOutline(false);

			this.add(fTCDClaseListaMetodosCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTCDClaseLabelFigure() {
			return fFigureTCDClaseLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTCDClaseListaAtributosCompartmentFigure() {
			return fTCDClaseListaAtributosCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getTCDClaseListaMetodosCompartmentFigure() {
			return fTCDClaseListaMetodosCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 227, 255, 248);

}
