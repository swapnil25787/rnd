package hashmapsss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class iprd {

	
	///////////////////
	


	
	
	///////////////////
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String homePage = "http://www.biharprd.bih.nic.in/Notices.aspx?FGLID=5";
		ArrayList<String> arrayList = new ArrayList<String>();


		pdfexist p= new pdfexist();
		







		String url = "";
	
		
		System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		//ChromeOptions options = new ChromeOptions();
		
		
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars");
		 options.addArguments("--browser.download.folderList=1");
		options.setExperimentalOption("prefs", chromePrefs);
	//	chromePrefs.put("download.prompt_for_download","True");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);
		
		
		
		
		
		
		
		
		
		// options.addArguments("-incognito");
		/*	options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-extensions");*/
		
		//ChromeDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		//driver.get("chrome://settings/downloads");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Thread.sleep(10000l);
		//driver.findElement(By.linkText("Ask where to save each file before downloading")).click();
/*
		java.util.List<WebElement> links1 = driver.findElements(By.tagName("div"));
		System.out.println(links1.size());
		
		for (int i = 0; i < links1.size(); i++) {
			
			System.out.println("====>"+links1.get(i).getAttribute("id"));
		}*/
		//Thread.sleep(10000l);
		
		driver.get(homePage);
		String Page="Circulars/Notification";
		
		Thread.sleep(15000l);
		//java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int count=0;	
		for (int i = 0; i<links.size(); i=i+1)
 
		{
			
			String url1=links.get(i).getAttribute("href");
//String s= links.get(i).getAttribute("title");
			//System.out.println(links.get(i).getText());
		/*	if (links.get(i).getAttribute("target").contains("_blank"))*/

				
				/*String s1=links.get(i).getAttribute("href");
				arrayList.add(s1);*/
			
			
			///working code/////////////////////////
/*if (links.get(i).getText().contains("भा0पु0से0 के पदाधिकारियों के प्रशिक्षण में भाग लेने के संबंध में")||links.get(i).getText().equalsIgnoreCase("Dynamic Contents")||links.get(i).getText().equalsIgnoreCase("Click here to view Old Office Memorandum")||links.get(i).getText().equalsIgnoreCase("Top"))
{
	System.out.println("links.get("+i+").getText()==>"+links.get(i).getText());
System.out.println("count==>"+count);
	if (links.get(i).getText().contains("भा0पु0से0 के पदाधिकारियों के प्रशिक्षण में भाग लेने के संबंध में ।"))
	{count++;}
	
}else {
	

	
	
		
		
		
			links.get(i).click();		
			count++;
			p.checkExists("C:\\Users\\swapnil.patil\\Downloads\\",count);
			System.out.println("row number+++"+count);
			System.out.println(links.get(i).getText()+"<===document is created"+count+".pdf");
			System.out.println(count+"row==>"+links.get(i).getText());
		
		
	
		
	
			
			
		
			
			
		
		
}
*/	
			System.out.println("url==>"+url1);
		System.err.println("i==>"+i);
PdfDownloading ps=new PdfDownloading();
ps.DownloadPDFFromURL(url1);
	
		
	
}
		
		
	//	p.checkExists("C:\\Users\\swapnil.patil\\Downloads\\",i);
		
	
				
				
				//System.out.println("document is created"+i+".pdf");
				
				///////////////////
				/*String str = Integer.toString(i);
				String downloadFilepath ="row"+str;*/
			//	System.out.println("downloadFilepath"+downloadFilepath);
				   
				//File docfile = new File("C:\\Users\\swapnil.patil\\Downloads" +"row"+str);
				//swap change
				
		
				
				/*if (!docfile.exists()) {
					if (docfile.mkdirs()) {
						System.out.println("Directories created!");
						File docfile1 = new File("C:\\Users\\swapnil.patil\\Downloads"+ "\\" + "row"+str);	
						docfile1.mkdir();
					} else {
						System.out.println("Failed to create directories!");
					}
				} */
				
				///////////
				
				//String autoITExecutable = ".\\AutoITFileUploadWithParam.exe " + downloadFilepath;
				
				/*String[] commands={"C:\\Users\\swapnil.patil\\Desktop\\save.exe",downloadFilepath};
				Runtime.getRuntime().exec(commands);
				Thread.sleep(10000l);*/
				
			
		
		
		
		
		
		//System.out.println("arraylist"+arrayList);
	/*	PdfDownloading p=new PdfDownloading();
		for (int i = 0; i < arrayList.size(); i++) {
			p.DownloadPDFFromURL(arrayList.get(i));
		}
		
		driver.quit();*/
		driver.quit();
	}

}
