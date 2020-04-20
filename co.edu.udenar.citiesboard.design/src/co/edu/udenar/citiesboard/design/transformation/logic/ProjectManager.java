package co.edu.udenar.citiesboard.design.transformation.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProjectManager {
	
	public ProjectManager() {
		
	}
	
	public void inicio(String base, String source_path, String target_path) {
		try {
			String name = "";
			String name_model = reader_XMI(base,name);
			File source_project = new File(source_path + "/proj/Bks");
			File target_project = new File(target_path + "/" + name_model);
			target_project.mkdirs();
			copyFolder(source_project, target_project, name_model);
			replaceFile(target_project, name_model);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void copyFolder(File source, File target, String name_model) throws Exception {
		String[] parts;
		String part1, part2;
		File[] files = source.listFiles();
		for (int i = 0; i < files.length; i++) {
			File sourceFile = files[i];
			if (!files[i].isDirectory()) {
				File targetFile = new File(target.getAbsolutePath() + "/" + sourceFile.getName());
				parts = targetFile.getName().split("[.]", 2);
				part1 = parts[0];
				part2 = parts[1];
				if (part1.trim().equals("Bks")) {
					targetFile = new File(target.getAbsolutePath() + "/" + name_model + "." + part2);
					copyFile(sourceFile, targetFile);
				} else {
					targetFile = new File(target.getAbsolutePath() + "/" + sourceFile.getName());
					copyFile(sourceFile, targetFile);
				}
			} else if (sourceFile.getName().equals("Bks")) {
				File targetFile = new File(target.getAbsolutePath() + "/" + name_model);
				targetFile.mkdirs();
				copyFolder(sourceFile, targetFile, name_model);
				replaceFile(targetFile, name_model);
			} else {
				File targetFile = new File(target.getAbsolutePath() + "/" + sourceFile.getName());
				targetFile.mkdirs();
				copyFolder(sourceFile, targetFile, name_model);
			}
		}
	}

	public void copyFile(File source, File target) {
		byte[] buf = new byte[1024];
		int len;
		try {
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(target);
			while (((len = in.read(buf))) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void replaceFile(File arch, String name_model) throws Exception {
		File[] files = arch.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (!files[i].isDirectory()) {
				if (files[i].getName().equals(name_model + ".csproj") || files[i].getName().equals("RouteConfig.cs")
						|| files[i].getName().equals("FilterConfig.cs") || files[i].getName().equals("BundleConfig.cs")
						|| files[i].getName().equals(name_model + ".dll")
						|| files[i].getName().equals(name_model + ".pdb")
						|| files[i].getName().equals(name_model + ".csproj.FileListAbsolute.txt")
						|| files[i].getName().equals(name_model + "csprojAssemblyReference.cache")
						|| files[i].getName().equals("DesignTimeResolveAssemblyReferencesInput.cache")
						|| files[i].getName().equals("jquery-3.3.1.slim.min.map")
						|| files[i].getName().equals("Global.asax") || files[i].getName().equals("Global.asax.cs")
						|| files[i].getName().equals("Web.config") || files[i].getName().equals(name_model + ".sln")) {
					String replacement = name_model, needle = "Bks";
					BufferedReader readerSLN = new BufferedReader(new FileReader(files[i]));
					String lineSLN = "", contentSLN = "";
					while (((lineSLN = readerSLN.readLine()) != null)) {
						contentSLN += lineSLN + "\r\n";
					}
					readerSLN.close();
					String newContentSLN = contentSLN.replaceAll(needle, replacement);
					FileWriter writerSLN = new FileWriter(files[i]);
					writerSLN.write(newContentSLN);
					writerSLN.close();
				}
			} else {
				replaceFile(files[i], name_model);
			}
		}
	}
	
	public void deleteFile(File file) {
		try {
			if(file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) 
					deleteFile(files[i]);
				file.delete();
			}else 
				file.delete();
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
	
	public String reader_XMI(String base, String e) throws Exception{
		File archivo = new File(base + "models/Mvc.xmi");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder document_builder = dbf.newDocumentBuilder();
		Document document = document_builder.parse(archivo);
		document.getDocumentElement().normalize();
		NodeList l = document.getElementsByTagName("mvc:MvcApplication");
		for (int temp = 0; temp < l.getLength(); temp++) {
			Node nNode = l.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				e = eElement.getAttribute("name");
			}
		}
		return e;
	}

	// -------------------------------------------- END PROJECT -----------------------------------//

	public void endProyect(String base, String target_path) throws Exception {
		String name = "";
		String name_model = reader_XMI(base, name);
		try {
			File old_file = new File(target_path + "/.temp/code/models/gen/");
			File new_file = new File(target_path + "/" + name_model + "/" + name_model + "/Models/");
			copyFolder2(old_file, new_file);
			old_file = new File(target_path + "/.temp/code/controllers/gen/");
			new_file = new File(target_path + "/" + name_model + "/" + name_model + "/Controllers/");
			copyFolder2(old_file, new_file);
			old_file = new File(target_path + "/.temp/code/views/gen/");
			//new_file = new File(target_path + "/" + name_model + "/" + name_model + "/Views/");
			//copyFolder2(old_file, new_file);
			old_file = new File(old_file + "/" + name_model + "-Index.cshtml");
			new_file = new File(target_path + "/" + name_model + "/" + name_model + "/Views/Home/Index.cshtml");
			copyFile(old_file, new_file);
			old_file = new File(target_path + "/.temp/code/main/gen/" + name_model + ".csproj");
			new_file = new File(target_path + "/" + name_model + "/" + name_model + "/" + name_model + ".csproj");
			copyFile(old_file,new_file);
			
			old_file = new File(target_path + "/.temp/code/views/gen/");
			new_file = new File(target_path + "/" + name_model + "/" + name_model + "/Views/");
			ArrayList<String> folder1 = new ArrayList<String>();
			//ArrayList<String> folder2 = new ArrayList<String>();
			String Nodo ="models"; String Element ="nameclass"; 
			parser2(base,folder1, Nodo, Element);
			View(folder1, new_file , old_file);
			/*String Nodo2= "mvc:SocialComponent"; String Element2="name";
			parser2(folder2, Nodo2, Element2,source_path);
			View(folder2, new_file , old_file);*/
			
			/*File folder = new File(base);
			MessageDialog.openInformation(
					null,
					"Before removing files files",
					folder.getAbsolutePath());
			FileUtils.deleteDirectory(folder);
			deleteFile(folder);*/
			/*folder = new File(target_path+"/.temp/views/");
			deleteFile(folder);
			folder = new File(target_path+"/.temp/controllers/");
			deleteFile(folder);
			folder = new File(target_path+"/.temp/main/");
			deleteFile(folder);
			File source_mvc = new File(source_path+"/.temp/models/Mvc.xmi");
			source_mvc.delete();
			File source_cdb = new File(source_path+"/.temp/models/Dashboard.cdb");
			source_cdb.delete();*/
		} catch (Exception e) {
			e.printStackTrace();		
		}		
	}

	public void View(ArrayList<String> folder, File target, File source ) {
		String name = "";
		for (int i = 0; i < folder.size(); i++) {
			File dir1 = new File(target + "/" + folder.get(i));
			dir1.mkdirs();
			File[] files = source.listFiles();
			for (int j = 0; j < files.length; j++) {
				if (!files[j].isDirectory()) {
					name = files[j].getName();
					String[] parts = name.split("-", 2);
					String part1 = parts[0];
					String part2 = parts[1];
					if (part1.trim().equals(dir1.getName().trim())) {
						File dir2 = new File(target + "/" + folder.get(i) + "s");
						dir2.mkdirs();
						File old_file = new File(source + "/" + files[j].getName());
						File new_file = new File(dir2 + "/" + part2);
						copyFile(old_file, new_file);
						files[j].delete();
						dir1.delete();
					}
				}
			}
		}
	}

	public static ArrayList<String> parser2(String base, ArrayList<String> folder, String list_node, String item)
			throws Exception {
		String e="";
		File archivo = new File(base + "models/Mvc.xmi");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder document_builder = dbf.newDocumentBuilder();
		Document document = document_builder.parse(archivo);
		document.getDocumentElement().normalize();
		NodeList l = document.getElementsByTagName(list_node);
		for (int temp = 0; temp < l.getLength(); temp++) {
			Node nNode = l.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				e = eElement.getAttribute(item);
				folder.add(e);
			}
		}
		return folder;
	}

	public void copyFolder2(File source, File target) {
		File[] files = source.listFiles();
		for (int i = 0; i < files.length; i++) {
			File source_file = files[i];
			if (!files[i].isDirectory()) {
				File target_file = new File(target.getAbsolutePath() + "/" + source_file.getName());
				copyFile(source_file, target_file);
			}
		}
	}

}
