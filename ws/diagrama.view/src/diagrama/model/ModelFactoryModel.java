package diagrama.model;

import javax.swing.JOptionPane;

import abstracta.AbstractaPackage;
import abstracta_relacional.Abstracta_relacionalPackage;
import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.ModelFactory;

public class ModelFactoryModel {

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// ------------------------------ Singleton
	// ------------------------------------------------
	// ModelFactory modelFactory =
	// Diagrama_concretaFactory.eINSTANCE.createModelFactory();

	private ModelFactory modelFactoryConcreta;
	private abstracta.ModelFactory modelFactoryAbstracta;
	private abstracta_relacional.ModelFactory modelFactoryAbstractaRelacional;
	

	public ModelFactoryModel() {

	}

	public ModelFactory cargarConcreta() {
		ModelFactory modelFactory = null;

		Diagrama_concretaPackage whoownmePackage = Diagrama_concretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model2.diagrama_concreta");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}

	public abstracta.ModelFactory cargarAbstracta() {
		abstracta.ModelFactory modelFactory = null;

		AbstractaPackage whoownmePackage = AbstractaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracta.ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}

	public abstracta_relacional.ModelFactory cargarAbstractaRelacional() {
		abstracta_relacional.ModelFactory modelFactory = null;

		Abstracta_relacionalPackage whoownmePackage = Abstracta_relacionalPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta_relacional");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (abstracta_relacional.ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}
	
	public void salvarAbstracta() {

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta");

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
	public void salvarAbstractaRelacional() {

		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/model.abstracta_relacional");

		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryAbstractaRelacional);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return;
	}

	public void generarModelToModel() {

		modelFactoryConcreta = cargarConcreta();
		modelFactoryAbstracta = cargarAbstracta();
		TransformacionM2M transformacionM2M = new TransformacionM2M(modelFactoryConcreta, modelFactoryAbstracta);
		String msj = transformacionM2M.transformarM2M();
		JOptionPane.showMessageDialog(null, msj);
		salvarAbstracta();
	}

	public void generarModelToText() {

		modelFactoryAbstracta = cargarAbstracta();
		TransformacionM2T transformacionM2T = new TransformacionM2T(modelFactoryAbstracta);
		String msj = transformacionM2T.transformarM2T();
		JOptionPane.showMessageDialog(null, msj);
	}
	
	public void generarModelToModelRelacional() {
		
		modelFactoryAbstracta = cargarAbstracta();
		modelFactoryAbstractaRelacional = cargarAbstractaRelacional();
		TransformacionM2R transformacionM2R = new TransformacionM2R(modelFactoryAbstracta, modelFactoryAbstractaRelacional);
		String msj = transformacionM2R.transformarM2R();
		JOptionPane.showMessageDialog(null, msj);
		salvarAbstractaRelacional();
	}

	public void generarRelacionalToText() {
		
		modelFactoryAbstractaRelacional = cargarAbstractaRelacional();
		TransformacionR2T transformacionR2T = new TransformacionR2T(modelFactoryAbstractaRelacional);
		String msj = transformacionR2T.transformarR2T();
		JOptionPane.showMessageDialog(null, msj);
	}
}
