package hashmapsss;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

import bsh.org.objectweb.asm.Constants;

public class pdfexist {
	public  void checkExists(String directory,int data) throws InterruptedException {

		for (int j = 0; j < 1; ) {
			File dir1 = new File(directory);
			File[] dir_contents1 = dir1.listFiles();

			if (dir_contents1.length==0) {
				System.out.println("no file is there ");
				j=0;
			}else {

				String temp = dir_contents1[0] + "";
				String ext2 = FilenameUtils.getExtension(temp);
				
				if (ext2.equalsIgnoreCase("pdf")) {
///code to move file in specifed folder with new name
					System.out.println("extension1==>"+ext2);
					Thread.sleep(2000l);
					File file = new File(temp);
					
			        // renaming the file and moving it to a new location
			        if(file.renameTo
			           (new File("E:\\brokendownload\\Home\\Office Memorandum\\"+data+".pdf")))
			        {
			            // if file copied successfully then delete the original file
			            file.delete();
			            System.out.println("File moved successfully");
			        }
			        else
			        {
			            System.out.println("Failed to move the file");
			        }
			 
					
					
					
					
					/////////////////////////////////////
					
					
					
					
					for (int k = 0; k <1; k++) {
						File dir11 = new File(directory);
						File[] dir_contents11 = dir11.listFiles();
						if (dir_contents11.length==0)
						{
							k=2;
						}else {
							k=0;
						}
					}
					j=2;
				}else {
					j=0;
				}
			}

		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checkExists("C:\\Users\\swapnil.patil\\Downloads\\", 0);
	}

}




//////////////////////////////////////////////////////////commented code
/*File dir = new File(directory);
File[] dir_contents = dir.listFiles();*/

//System.out.println("Check"+check);  // -->always says false

/*if (dir_contents.length>0) {

for(int i = 0; i<=dir_contents.length;) {

 String temp = dir_contents[i] + "";
System.out.println("========"+temp);
boolean check = new File(temp).exists();
System.out.println("Check==>"+check);


String ext2 = FilenameUtils.getExtension(temp);
System.out.println("extension==>"+ext2);
if (ext2.equalsIgnoreCase("pdf")) {
	if(check==true){
		System.out.println("FILE__EXIST");
		i=dir_contents.length+1;

		///code to move file in new folder and rename file name


	}else {
		System.out.println("FILE_DOES_NOT_EXIST");


	}	
}else {
	i = 0;
}

//	System.out.println("files"+dir_contents[i]);
}


}


}*/