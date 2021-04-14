package hashmapsss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class PdfDownloading extends iprd
{
	
	
    public static void DownloadPDFFromURL(String link)
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
            System.out.println("Pdfname"+pdfname[pdfname.length-1]);
            FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\swapnil.patil\\Desktop\\New folder\\"+pdfname[pdfname.length-1]));
            int length = -1;
            byte[] buffer = new byte[1024];// buffer for portion of data from connection
            while ((length = in.read(buffer)) != -1) {
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
    	
    
        DownloadPDFFromURL("http://thanecity.gov.in/uploadpdf/Election%20Cand%20List1371556947.pdf");
    }

}