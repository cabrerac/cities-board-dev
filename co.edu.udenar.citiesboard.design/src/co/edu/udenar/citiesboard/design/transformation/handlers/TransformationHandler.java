package co.edu.udenar.citiesboard.design.transformation.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;

import co.edu.udenar.citiesboard.acceleo.controllers.ControllerGenerator;
import co.edu.udenar.citiesboard.acceleo.main.MainGenerator;
import co.edu.udenar.citiesboard.acceleo.models.ModelGenerator;
import co.edu.udenar.citiesboard.acceleo.views.ViewGenerator;
import co.edu.udenar.citiesboard.design.transformation.logic.ProjectManager;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;

public class TransformationHandler extends AbstractHandler{
	
	@Override
	public Boolean execute(ExecutionEvent event) throws ExecutionException {
		
		String target_path = "";
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		try {
			/*
			 * Getting path to save generated project
			 */
			DirectoryDialog selector = new DirectoryDialog(window.getShell(),SWT.POP_UP);
			selector.setText("Select the folder where to save the dashboard code.");
			selector.setFilterPath("c:\\");
			target_path = selector.open();
			if(target_path==null)
				return false;
			
			/*
			 * Getting model to transform from editor
			 */
			IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			DDiagramEditor editor = (DDiagramEditor) part;
			Saveable[] saveables = editor.getSaveables();
			NullProgressMonitor progress_monitor;
			for(int i=0; i<saveables.length; i++) {
				progress_monitor = new NullProgressMonitor();
				saveables[i].doSave((IProgressMonitor) progress_monitor);
			}
			
			ResourceSet editor_resource_set = editor.getEditingDomain().getResourceSet();
			EList<Resource> editor_resources = editor_resource_set.getResources();
			ArrayList<XMIResourceImpl> cdb_resources = new ArrayList<>();
			for(int i=0; i<editor_resources.size(); i++) {
				Resource editor_resource = editor_resources.get(i);
				if(editor_resource.getClass().getName().contains("XMIResourceImpl") && editor_resource.getURI().fileExtension().equals("cdb")) {
					cdb_resources.add((XMIResourceImpl) editor_resource);
				}
			}
			
			Object[] options = new Object[cdb_resources.size()];
			HashMap<String,XMIResourceImpl> models = new HashMap<>(); 
			
			for(int i=0; i<cdb_resources.size(); i++) {
				String[] segments = cdb_resources.get(i).getURI().segments();
				options[i] = segments[2];
				models.put((String) options[i], cdb_resources.get(i));
			}
			
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(window.getShell(),new LabelProvider());
			dialog.setElements(options);
			dialog.setTitle("Select the dashboard model to transform.");
			if (dialog.open() != Window.OK) {
				return false;
			}
			
			/*
			 * Getting resources paths and creating temps
			 */
			String base = target_path + "/.temp/";
			String base_metamodels = base + "metamodels/";
			String base_transformations = base + "transformations/";
			String base_models = base + "models/";
			String base_structure = base;
			String base_code = base + "code/";
			File folder = new File(base_metamodels);
			folder.mkdirs();
			folder = new File(base_transformations);
			folder.mkdirs();
			folder = new File(base_models);
			folder.mkdirs();
			folder = new File(base_structure);
			folder.mkdirs(); 
			
			InputStream cdb_is = this.getClass().getClassLoader().getResourceAsStream("metamodels/cdb.ecore");
			InputStream mvc_is = this.getClass().getClassLoader().getResourceAsStream("metamodels/mvc.ecore");
			InputStream asm_is = this.getClass().getClassLoader().getResourceAsStream("co/edu/udenar/citiesboard/design/transformation/atl/CdbToMvc.asm");
			File cdb_file = new File(base_metamodels + "cdb.ecore");
			byte[] buffer = new byte[cdb_is.available()];
			cdb_is.read(buffer);
		    OutputStream outStream = new FileOutputStream(cdb_file);
		    outStream.write(buffer);
		    cdb_is.close();
		    outStream.close();
		    File mvc_file = new File(base_metamodels + "mvc.ecore");
		    buffer = new byte[mvc_is.available()];
		    mvc_is.read(buffer);
			outStream = new FileOutputStream(mvc_file);
			outStream.write(buffer);
			mvc_is.close();
			outStream.close();
			File asm_file = new File(base_transformations + "CdbToMvc.asm");
		    buffer = new byte[asm_is.available()];
		    asm_is.read(buffer);
		    outStream = new FileOutputStream(asm_file);
		    outStream.write(buffer);
		    asm_is.close();
		    outStream.close();
		    
		    CodeSource src = this.getClass().getProtectionDomain().getCodeSource();
		    if (src != null) {
		      URL jar = src.getLocation();
		      ZipInputStream zip = new ZipInputStream(jar.openStream());
		      while(true) {
		        ZipEntry e = zip.getNextEntry();
		        if (e == null)
		          break;
		        String res = e.getName();
		        if (res.startsWith("proj/Bks/")) {
		        	String fileName = base_structure + res;
		        	if(res.endsWith("/")) {
		        		File folder_proj = new File(fileName);
		        		folder_proj.mkdirs();
		        	}else {
		        		InputStream proj_is = this.getClass().getClassLoader(). getResourceAsStream(res);
		        		File proj_file = new File(fileName);
		    		    buffer = new byte[proj_is.available()];
		    		    proj_is.read(buffer);
		    		    outStream = new FileOutputStream(proj_file);
		    		    outStream.write(buffer);
		    		    proj_is.close();
		    		    outStream.close();
		        	}
		        }
		      }
		      zip.close();
		    }
		    
		    /*
			 * Getting model to transform
			 */
		    String cdb_path = cdb_file.getPath();
			String mvc_path = mvc_file.getPath();
			String cdb_model_path = base_models + "Dashboard.xmi";
			String mvc_model_path = base_models + "Mvc.xmi";
		    Object[] result = dialog.getResult();
			String s = result[0].toString();
			XMIResourceImpl selected_model = models.get(s);
			String dashboard_path = cdb_model_path;
			File dashboard_file = new File(dashboard_path);
			OutputStream dashboard_output = new FileOutputStream(dashboard_file);
			selected_model.doSave(dashboard_output, new HashMap<>());
			dashboard_output.close();
			
			/*
			 * Setting-up metamodels
			 */
			ILauncher transformation_launcher = new EMFVMLauncher();
			ModelFactory model_factory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			EMFModelFactory emf_model_factory = (EMFModelFactory) model_factory;
			ResourceSet rs = emf_model_factory.getResourceSet();
			
			URI cdb_uri = URI.createFileURI(cdb_path); 
			Resource cdb_res = rs.getResource(cdb_uri, true);
			EObject eObject = cdb_res.getContents().get(0);
			if (eObject instanceof EPackage) {
			    EPackage p = (EPackage)eObject;
			    emf_model_factory.getResourceSet().getPackageRegistry().put(p.getNsURI(), p);
			}
			
			URI mvc_uri = URI.createFileURI(mvc_path); 
			Resource mvc_res = rs.getResource(mvc_uri, true);
			eObject = mvc_res.getContents().get(0);
			if (eObject instanceof EPackage) {
			    EPackage p = (EPackage)eObject;
			    emf_model_factory.getResourceSet().getPackageRegistry().put(p.getNsURI(), p);
			}
						
			/*
			 * Loading metamodels - M2M Transformation
			 */
			System.out.println("Executing ATL transformation...");
			String cdb_string_uri = "http://citiesboard.sistemas.udenar.edu.co/cdb";
			String mvc_string_uri = "http://citiesboard.sistemas.udenar.edu.co/mvc";
			IReferenceModel cdb_metamodel = model_factory.newReferenceModel();
			injector.inject(cdb_metamodel, cdb_string_uri);
			IReferenceModel mvc_metamodel = model_factory.newReferenceModel();
			injector.inject(mvc_metamodel, mvc_string_uri);
			
			/*
			 * Setting models - M2M Transformation
			 */
			IModel cdb_model = model_factory.newModel(cdb_metamodel);
			injector.inject(cdb_model,"file://" + cdb_model_path);
			IModel mvc_model = model_factory.newModel(mvc_metamodel);
			
			/*
			 * Running transformation - M2M Transformation
			 */
			transformation_launcher.initialize(new HashMap<String,Object>());
			transformation_launcher.addInOutModel(cdb_model, "IN", "cdb");
			transformation_launcher.addOutModel(mvc_model, "OUT", "mvc");
			FileInputStream asm_stream = new FileInputStream(asm_file);
			transformation_launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),asm_stream);
			extractor.extract(mvc_model, "file://" +mvc_model_path);
			asm_stream.close();
			System.out.println("MVC model created..."); 
			
			/*
			 * Setting generated project
			 */
			String m2t_main_gen = base_code + "main/gen/";
			String m2t_views_gen = base_code + "views/gen/";
			String m2t_models_gen = base_code + "models/gen/";
			String m2t_controllers_gen = base_code + "controllers/gen/";
			
	        ProjectManager project = new ProjectManager();
	        project.inicio(base,base_structure,target_path);
	        String[] args = new String[2];
	        args[0]=mvc_model_path;
	        
	        System.out.println("Executing main acceleo transformation...");
	        args[1]=m2t_main_gen;
	        MainGenerator.main(args);
	        System.out.println("Main files generated...");
	        
	        System.out.println("Executing views transformations...");
	        args[1]=m2t_views_gen;
	        ViewGenerator.main(args);
	        System.out.println("Views files generated...");
	        
	        System.out.println("Executing models transformations...");
	        args[1]=m2t_models_gen;
	        ModelGenerator.main(args);
	        System.out.println("Models files generated...");
	        
	        System.out.println("Executing controllers transformations...");
	        args[1]=m2t_controllers_gen;
	        ControllerGenerator.main(args);
	        System.out.println("Controllers files generated...");
	        
	        System.out.println("Files generated...");
			project.endProyect(base,target_path);
			File tmp = new File(base);
			project.deleteFile(tmp);
			System.out.println("Project generated.");
			MessageDialog.openInformation(
					window.getShell(),
					"Dashboard Code Generation Status",
					"The dashboard code was succesfully generated!");
			return true;
		}catch(Exception ex) {
			MultiStatus status = createMultiStatus(ex.getLocalizedMessage(), ex);
            ErrorDialog.openError(null, "Error", "The dashboard code generatiot had problems!", status);
			return false;
		}
	}
	
	private static MultiStatus createMultiStatus(String msg, Throwable t) {

        List<Status> childStatuses = new ArrayList<>();
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();

        for (StackTraceElement stackTrace: stackTraces) {
            Status status = new Status(IStatus.ERROR,
                    "com.vogella.tasks.ui", stackTrace.toString());
            childStatuses.add(status);
        }

        MultiStatus ms = new MultiStatus("co.edu.udenar.citiesboard",
                IStatus.ERROR, childStatuses.toArray(new Status[] {}),
                t.toString(), t);
        return ms;
    }

}
