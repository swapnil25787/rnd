package hashmapsss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String homePage = "http://192.168.100.230:8080/CitizenHome.html";




		ArrayList<String> arrayList1 = new ArrayList<String>();








		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
	//	System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
	//	ChromeOptions options = new ChromeOptions();
		// options.addArguments("-incognito");
		/*	options.addArguments("--disable-popup-blocking");
	options.addArguments("--disable-extensions");*/
		//options.addArguments("disable-infobars");
		//driver = new ChromeDriver();
		String baseUrl,nodeURL;
		baseUrl="http://182.18.168.246:8140";
		nodeURL="http://192.168.100.63:5566/wd/hub";
		DesiredCapabilities capablity =DesiredCapabilities.chrome();
		capablity.setBrowserName("chrome");
		capablity.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL),capablity);

		

		driver.manage().window().maximize();

		driver.navigate().to(homePage);
		//String ulb="Revenue & Land Reform";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));
		// element = wait.until(
		//ExpectedConditions.visibilityOfElementLocated(By.linkText(ulb)));

		//driver.findElement(By.linkText(ulb)).click();

		////Navigation to respective page

		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));
		int ulb_counts=driver.findElements(By.xpath("//*[@id='footer']/div/div[1]/div[1]/div[1]/ul/li")).size();
System.err.println("ulb"+ulb_counts);
java.util.List<WebElement> links3 = driver.findElements(By.tagName("a"));
System.out.println(links3.size());

for (int l = 1; l < links3.size(); l++) {
	String hrefulbs=links3.get(l).getAttribute("href");
	//System.out.println("href==>"+hrefulbs);
	if (hrefulbs.contains("ULBHome.html?resetULB")) {
		System.err.println("Ulbs are==>"+links3.get(l).getText());
		arrayList1.add(links3.get(l).getText());
	}

	
}
driver.quit();
for (int s = 5; s < arrayList1.size(); s++) 
//for (int s = 0; s < 1; s++)
{
	broken(arrayList1.get(s));
}


		//broken();

	}
	public static void broken(String data) throws Exception
	{	

		try {
			String homePage = "http://182.18.168.246:8140";




			ArrayList<String> arrayList;
			
			arrayList= new ArrayList<String>();








			String url = "";
			HttpURLConnection huc = null;
			int respCode = 200;
			//System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		//	ChromeOptions options = new ChromeOptions();
			// options.addArguments("-incognito");
			/*	options.addArguments("--disable-popup-blocking");
options.addArguments("--disable-extensions");*/
		//	options.addArguments("disable-infobars");
			
		//	driver = new ChromeDriver();
			String baseUrl,nodeURL;
			baseUrl="http://182.18.168.246:8140";
			nodeURL="http://192.168.100.63:5566/wd/hub";
			DesiredCapabilities capablity =DesiredCapabilities.chrome();
			capablity.setBrowserName("chrome");
			capablity.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL(nodeURL), capablity);

			driver.manage().window().maximize();

			driver.navigate().to(homePage);
			//String ulb="Revenue & Land Reform";
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));
			// element = wait.until(
			//ExpectedConditions.visibilityOfElementLocated(By.linkText(ulb)));

			//driver.findElement(By.linkText(ulb)).click();

			////Navigation to respective page

			element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));




			driver.findElement(By.linkText(data)).click();
			element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));

			driver.findElement(By.id("menu-toggle")).click();
			element = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.linkText("Sitemap")));

			driver.findElement(By.linkText("Sitemap")).click();

			//*[@id="frm8"]/li/input
			//*[@id="frm10"]/li/input
			//*[@id="frm1"]/li/input


			//   driver.findElement(By.cssSelector("input[type='submit'][value='Facts and Figure']")).click();
			// driver.findElement(By.linkText("Sitemap")).click();
			Thread.sleep(4000l);
			java.util.List<WebElement> links1 = driver.findElements(By.tagName("form"));
			System.out.println(links1.size());
			String s = null;
			int count=0;	
			for (int j = 0; j<links1.size(); j=j+1)
			{if (links1.get(j).getAttribute("id").contains("frm")) {
				arrayList.add(links1.get(j).getAttribute("id"));}
			}

			System.out.println("arrayList==>"+arrayList);

			for (int i = 0; i<arrayList.size(); i=i+1)
			{

				if (arrayList.get(i).contains("frm")) {
					s =arrayList.get(i);
					//System.err.println("s==>"+s);

					Thread.sleep(4000l);
					//System.err.println("input[type='submit'][value='"+s+"']");
					//driver.findElement(By.cssSelector("input[type='submit'][value='"+s+"']")).click();
					//driver.findElement(By.linkText("History of Bihar")).click();

					WebElement element1 = driver.findElement(By.xpath("//*[@id='"+s+"']/li/input"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", element1);
					/////////////////////////////////put method for broken links///
					Thread.sleep(5000);
					/*try {
						//driver.switchTo().alert().dismiss();
						System.err.println("alert exist");
						driver.switchTo().alert().accept();		
						System.err.println("verifying alert exist");
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("alert not exist");
				//	throw new Exception();	
					continue;
					}*/
					System.err.println("verifying broken links");
				
					String sectionname= driver.findElement(By.cssSelector("#text-resize > div.content-page > ol > li.active")).getText();
					try {
						if (driver.findElement(By.xpath("//*[@id='DataTables_Table_0_length']/label/select")).isDisplayed()) {
							System.err.println("pagination is there");
							Thread.sleep(1000);
							WebElement drpCountry1 = driver.findElement(By.name("DataTables_Table_0_length"));
							drpCountry1.sendKeys("All");
							Thread.sleep(4000);


							/*
										WebElement mySelectElement = driver.findElement(By.id("mySelect"));
										Select dropdown= new Select(mySelectElement);*/

						}else{

							System.err.println("throw exception");
							throw new Exception();

						}




					} catch (Exception e) {
						// TODO: handle exception
						//e.printStackTrace();
					}






					//driver.findElement(By.linkText("Sitemap")

					//   Thread.sleep(4000l);
					File docfile = new File("C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\" +data);
					docfile.mkdirs();
					
					//"C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\"+data+"\\"+sectionname+".txt"
					String file="C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\"+data+"\\"+sectionname+".txt";

					PrintWriter writer = new PrintWriter(file, "UTF-8");
					PrintStream printStream = new PrintStream(new FileOutputStream(file));
					System.setOut(printStream);

					writer.println(printStream);



					System.out.println("================================"+sectionname+"=======================");


					////////////////////////////

					ArrayList<String> brokenlinks = new ArrayList<String>();

					List<WebElement> links = driver.findElements(By.tagName("a"));
					System.out.println("Total No of Links===================>"+links.size());
					System.err.println("Total No of Links===================>"+links.size());
					Iterator<WebElement> it = links.iterator();


					while(it.hasNext()){

						url = it.next().getAttribute("href");

						System.out.println(url);

						if(url == null || url.isEmpty())
						{
							it.next().getText();
							System.out.println("URL is either not configured for anchor tag or it is empty=>"+it.next().getText());
							continue;
						}

						if(!url.startsWith(homePage)){
							System.out.println("URL belongs to another domain, skipping it.==>"+url);
							continue;
						}

						try {
							huc = (HttpURLConnection)(new URL(url).openConnection());

							huc.setRequestMethod("HEAD");

							huc.connect();

							respCode = huc.getResponseCode();

							if(respCode >= 400){
								System.out.println(url+" is a broken link===>"+it.next().getText());

								brokenlinks.add(url);

							}
							else{
								System.out.println(url+" is a valid link==>"+it.next().getText());
							}

						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//System.out.println("brokenlinks+"+brokenlinks); 


					} 
			

					System.err.println("broken links are");
					takeSnapShot(driver, "C:\\Users\\swapnil.patil\\Desktop\\brokenlink\\"+data+"\\"+sectionname+".png");
					System.out.println("<=================================broken links are=================================>");

					for (int ii = 0; ii < brokenlinks.size(); ii++) {
						System.out.println("broken links are "+brokenlinks.get(ii));
					}





















					//////////////////////////////////////////////////////////
				/*	element = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));

					driver.findElement(By.id("menu-toggle")).click();
					element = wait.until(
							ExpectedConditions.visibilityOfElementLocated(By.linkText("Sitemap")));
					Thread.sleep(4000l);
					driver.findElement(By.linkText("Sitemap")).click();
*/
					
					
					
		driver.navigate().back();
					Thread.sleep(4000l);
				}
			}




			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			driver.quit();
			e.printStackTrace();
		}
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}