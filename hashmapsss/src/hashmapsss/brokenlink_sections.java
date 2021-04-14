package hashmapsss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class brokenlink_sections {
	static ArrayList<String> arrayList1 = new ArrayList<String>();
	public static int c=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stuint count=0;b
		String file="C:\\Users\\swapnil.patil\\Desktop\\brokenlinks.txt";

		/*PrintWriter writer = new PrintWriter(file, "UTF-8");
		PrintStream printStream = new PrintStream(new FileOutputStream(file));
		System.setOut(printStream);

		writer.println(printStream);
*/
		String file1="C:\\Users\\swapnil.patil\\Desktop\\b.txt";
		PrintWriter writer = new PrintWriter(file1, "UTF-8");
		PrintStream printStream = new PrintStream(new FileOutputStream(file1));
		System.setOut(printStream);
		writer.println(printStream);
		int count=0;
		File folders=new File("C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\");
		File [] listoffolders=folders.listFiles();
		System.out.println("started");
		for (int i = 0; i < listoffolders.length; i++) {
			File[] inside_files=listoffolders[i].listFiles();
			//System.out.println(listoffolders[i]);

			for (int j = 0; j < inside_files.length; j++) {
				//System.out.println(inside_files[j].toString());

				if (inside_files[j].toString().contains(".txt")) {
					//System.out.println(inside_files[j].toString());
					//	//System.out.println(count++);
					textreader(inside_files[j].toString());


				}


			}


		}
		//	//System.out.println(arrayList1);



		for (int i = 0; i < arrayList1.size(); i++) {
			//System.out.println(arrayList1.get(i));
		}
//System.out.println("No of broken links in 43 department are="+c);
	}



	public static void textreader(String data) throws NumberFormatException, IOException {

		File file1 = new File(data);

		String st="";


		BufferedReader br = new BufferedReader(new FileReader(file1));


		while ((st = br.readLine()) != null)


			if (st.contains("Broken link is observed in ")) {
				//		  //System.out.println(data);
				c++;
				System.out.println(st);
				/*filecreation(data);
				if (!arrayList1.contains(data)) {
					arrayList1.add(data);
				}
				
				//break;
*/			}
	}	


public static void filecreation(String path) {
	
	//System.out.println(path);
	String[] paths = path.split("\\\\");
	//String pathmaker=paths[0]+"\\45deptbrokentext\\"+paths[2]+"\\"+paths[3];
	String pathmaker="C:\\Users\\swapnil.patil\\Desktop\\b\\";
	//System.out.println(pathmaker);
	 
	/* File dir = new File(pathmaker);
	 boolean successful = dir.mkdirs();
	
	    if (successful)
	    {
	    	  
	      //System.out.println("directories were created successfully");
	    }
	    else
	    {
	      
	      //System.out.println("directory alerady exist");
	    }*/
	   
	  //  Files.copy(path, pathmaker);
	     try {
			FileUtils.copyFile(new File(path), new File(pathmaker));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //Files.copy(path, pathmaker);
	  
}





}
