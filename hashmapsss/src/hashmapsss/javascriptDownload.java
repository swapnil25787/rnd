package hashmapsss;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class javascriptDownload {
	 public static String   filename="";

	public static void main(String[] args) throws InterruptedException {
		
		file("2");
		
		
	}
	
public static String file(String data)
{

	// TODO Auto-generated method stub 
	File folder = new File("C:\\Users\\swapnil.patil\\Downloads\\");
	
	
	File[] listOfFiles1 = folder.listFiles();
	   String extension="";
	  
	    for (int i = 1; i <2 ;/*listOfFiles1.length; */) {
	    	File[] listOfFiles = folder.listFiles();
	      if (listOfFiles[i].isFile()) {
	        
	        extension= FilenameUtils.getExtension(listOfFiles[i].getName());
	      
	        System.out.println("extension+"+extension);
	       System.out.println("extension+"+filename);
	       
	       if (extension.equalsIgnoreCase("pdf")) {
	    	   System.out.println("pdf file Downloaded");
	    	   filename=listOfFiles[i].getName();
	    	   
	    		System.err.println(filename);
	    		File source = new File("C:\\Users\\swapnil.patil\\Downloads\\"+filename);
	    		File dest = new File("E:\\brokendownload\\Home\\Office Memorandum\\"+data+".pdf");
	    		try {
	    			source.renameTo(dest);
	    		    //FileUtils.copyDirectory(source, dest);
	    		} catch (Exception e) {
	    		    e.printStackTrace();
	    		}
	    	   break;
	    	   
	       }else {
			i=1;
		}
	       
	       
	      } 
	    }

	return filename;
	
}
}