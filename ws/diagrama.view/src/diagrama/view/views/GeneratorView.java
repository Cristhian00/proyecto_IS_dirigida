package diagrama.view.views;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import javax.inject.Inject;
import org.eclipse.wb.swt.SWTResourceManager;

public class GeneratorView extends ViewPart {

	public GeneratorView() {
	}

	@Override
	public void createPartControl(Composite parent) {

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(null);

		Group grpDeModeloA = new Group(composite, SWT.NONE);
		grpDeModeloA.setBackground(SWTResourceManager.getColor(224, 255, 255));
		grpDeModeloA.setText("Generaci\u00F3n de Modelo a Modelo");
		grpDeModeloA.setBounds(10, 10, 400, 70);

		Button btnGeneradorM2M = new Button(grpDeModeloA, SWT.NONE);
		btnGeneradorM2M.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnGeneradorM2M.setForeground(SWTResourceManager.getColor(0, 0, 0));
		btnGeneradorM2M.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModel();
			}
		});
		btnGeneradorM2M.setBounds(10, 30, 380, 30);
		btnGeneradorM2M.setText("Generador de M2M");

		Group grpDeModeloA_1 = new Group(composite, SWT.NONE);
		grpDeModeloA_1.setBackground(SWTResourceManager.getColor(255, 182, 193));
		grpDeModeloA_1.setText("Generaci\u00F3n de modelo a texto");
		grpDeModeloA_1.setBounds(10, 95, 400, 70);

		Button btnGeneradorM2T = new Button(grpDeModeloA_1, SWT.NONE);
		btnGeneradorM2T.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnGeneradorM2T.setBounds(10, 30, 380, 30);
		btnGeneradorM2T.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToText();
			}
		});
		btnGeneradorM2T.setText("Generador de M2T");
		
		Group grpDeModeloA_1_1 = new Group(composite, SWT.NONE);
		grpDeModeloA_1_1.setText("Generaci\u00F3n de modelo a modelo relacional");
		grpDeModeloA_1_1.setBackground(SWTResourceManager.getColor(255, 250, 205));
		grpDeModeloA_1_1.setBounds(10, 180, 400, 70);
		
		Button btnGeneradorM2R = new Button(grpDeModeloA_1_1, SWT.NONE);
		btnGeneradorM2R.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModelRelacional();
			}
		});
		btnGeneradorM2R.setText("Generador de M2R");
		btnGeneradorM2R.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnGeneradorM2R.setBounds(10, 30, 380, 30);
		
		Group grpDeModeloA_1_1_1 = new Group(composite, SWT.NONE);
		grpDeModeloA_1_1_1.setText("Generaci\u00F3n de modelo relacional a texto MySQL");
		grpDeModeloA_1_1_1.setBackground(SWTResourceManager.getColor(255, 250, 205));
		grpDeModeloA_1_1_1.setBounds(10, 266, 400, 70);
		
		Button btnGeneradorR2T = new Button(grpDeModeloA_1_1_1, SWT.NONE);
		btnGeneradorR2T.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarRelacionalToText();
			}
		});
		btnGeneradorR2T.setText("Generador de R2T");
		btnGeneradorR2T.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnGeneradorR2T.setBounds(10, 30, 380, 30);

	}

	private void fillLocalToolBar(IToolBarManager manager) {

	}

	@Override
	public void setFocus() {

	}
}
