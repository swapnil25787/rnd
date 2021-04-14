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
import java.util.List;

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

public class home {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String homePage = "https://dbtagriculture.bihar.gov.in/krishimis/WebPortal/Notification_Inner.aspx?Cid=10";
		ArrayList<String> arrayList = new ArrayList<String>();

		String url = "";

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		// ChromeOptions options = new ChromeOptions();

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(10000l);
		brokenlinkdownload bb=new brokenlinkdownload();
		driver.get(homePage);
		driver.manage().window().maximize();
		
		
			List<WebElement> swap=driver.findElements(By.tagName("a"));
			
			for (int i = 0; i < swap.size(); i++) {
				System.out.println(swap.get(i).getText());
				System.out.println(swap.get(i).getAttribute("href"));
				
				String s="";
				
				String path[]=swap.get(i).getAttribute("href").toString().replaceAll("https://dbtagriculture.bihar.gov.in/", "").split("/");
				for (int j = 0; j < path.length; j++) {
					//System.out.println(j+"---------------"+path[j]);
					
					if (j>=0 && j<path.length-1) {
						
						s=s+"\\"+path[j];
						
						
					}
				}
				System.out.println(s);
				
				bb.DownloadPDFFromURL(swap.get(i).getAttribute("href").toString(), s);
			
		}
		
		
		
		
		

	}

}
