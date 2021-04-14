package hashmapsss;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class htmlUnitYest {				
		public static void main(String[] args) throws InterruptedException {
			
		
		
		String homePage = "http://192.168.100.157:8090";




			ArrayList<String> arrayList1 = new ArrayList<String>();








			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;
			System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("-incognito");
			/*	options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-extensions");*/
			options.addArguments("disable-infobars");
			ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			
			/////////////////////////////






		// TODO Auto-generated method stub

		driver.navigate().to("http://192.168.100.157:8090");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Hash set<dynamic array>
//Set<String> winds = driver.getWindowHandles();

//Iterator<String> interator = winds.iterator();
//click on link personal loan emi calculater

//
arrayList1.addAll(driver.getWindowHandles());
System.out.println(arrayList1);
	driver.findElement(By.xpath("//*[@id='footer']/div/div/div[2]/div/div[1]/ul/li[1]/a")).click();

	driver.switchTo().window(arrayList1.get(0));
//it open new window
	arrayList1.addAll(driver.getWindowHandles());

System.out.println(arrayList1);

arrayList1.clear();
System.out.println(arrayList1);
arrayList1.addAll(driver.getWindowHandles());
System.out.println(arrayList1);
Thread.sleep(2000);
driver.switchTo().window(arrayList1.get(1)).findElement(By.xpath("/html/body/div[5]/a[1]")).click();
/*winds =driver.getWindowHandles();
interator=winds.iterator();

String Mainwindow=interator.next();
System.out.println("Main window id is "+Mainwindow);
String secondwindow =interator.next();// to extract second window 
System.out.println("second window id is"+secondwindow);
Thread.sleep(2000);*/
Thread.sleep(2000);
driver.switchTo().window(arrayList1.get(0));
driver.close();

	



//The below method will save the screen shot in d drive with name "screenshot.png"




		}	}




			
			
			
					
			//////////////////////
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
