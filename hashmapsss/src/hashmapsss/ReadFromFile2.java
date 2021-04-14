package hashmapsss;

//Java Program to illustrate reading from FileReader
//using BufferedReader
import java.io.*;
public class ReadFromFile2
{
public static void main(String[] args)throws Exception
{
// We need to provide file path as the parameter:
// double backquote is to avoid compiler interpret words
// like \test as \t (ie. as a escape sequence)
	
	
		String prefix="http://www.pad.bih.nic.in/RTI/";
		String text="RTI Matters";
	
File file = new File("C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\Parliament Affairs\\"+text+".txt");

BufferedReader br = new BufferedReader(new FileReader(file));

String st="";
String newurl="";
///
System.out.println("noti");
for (int i = 0; i <=i;) {
	if ((st = br.readLine()) != null)
	{
	if (st.contains("broken links Count=============>")) {
		System.err.println("st"+st);
		String ss=st.replace("broken links Count=============>","" );
		int ss1=Integer.parseInt(ss);
		System.out.println(ss1);
		if (ss1>0) {
			File f=new File("E:\\brokendownload\\Parliament Affairs\\"+text);
			if (!f.exists()) {
				if (f.mkdir()) {
					
				}
				
			}
		}
		
		break;
	} i++;}
	
	
}
///

for (int i = 0; i <=i;) {
if ((st = br.readLine()) != null)
{
if (st.contains("broken links are")) {
		
		String [] a=st.split("/");
		 System.out.println(a[a.length-1]);
		 newurl=prefix+a[a.length-1];
		 System.out.println(newurl);
		 
		 brokenlinkdownload b=new brokenlinkdownload();
		 if (i>0) {
				b.DownloadPDFFromURL(newurl,text);
			 System.out.println(newurl);
				
		}
		 i++;
		 
		 System.err.println("io="+i);
}	
		
	}else {
		break;
	}
	
	
}




}
}