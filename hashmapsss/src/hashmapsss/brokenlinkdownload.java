package hashmapsss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.common.io.Files;

public class brokenlinkdownload extends iprd
{
	
	
    public static void DownloadPDFFromURL(String link ,String t)
    {
        try
        {
        	
           	
        	
            URL url = new URL(link);
            InputStream in = url.openStream();
            String pdfname[]=link.split("/");
         //   System.out.println("length"+pdfname.length);
            
           /* for (int i = 0; i < pdfname.length; i++) {
				System.out.println("names"+i+pdfname[i]);
			}*/
            
            File theDir = new File("C:\\Users\\swapnil.patil\\Desktop\\IPRD\\Data"+t);
            theDir.mkdirs();
            System.out.println("Pdfname"+pdfname[pdfname.length-1]);
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\swapnil.patil\\Desktop\\IPRD\\Data"+t+"\\"+pdfname[pdfname.length-1]));
            int length = -1;
            byte[] buffer = new byte[50000];// buffer for portion of data from connection
            while ((length = in.read(buffer)) > -1) {
                fos.write(buffer, 0, length);
            }
            fos.close();
            in.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String [] args)
    {
    	//iprd s1=new iprd();
    	
    
        //DownloadPDFFromURL("http://csd.bih.nic.in/Upload/Asset//Nand%20Kishore%20Yadav17.PDF");
    }

}