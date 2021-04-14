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
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class menuall {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String homePage = "http://182.18.168.246:8140/CitizenHome.html";




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
		driver = new ChromeDriver();

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
		
		
		
		//driver.findElement(By.id("menu-toggle")).click();
		
		//driver.findElement(By.linkText("Disaster")).click();
		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("menu-toggle")));
		driver.findElement(By.id("menu-toggle")).click();
		Thread.sleep(5000);
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");*/
	//	WebElement scrollArea = driver.findElement(By.cssSelector("#navigation > div > div > div.col-md-9.col-xs-12 > div > div.slimScrollBar"));
			//	driver.findElement(By.cssSelector("input[title='Workshop,Training Programme'][value='Workshop,Training Programme']")).click();
		//input
		
		List<WebElement> links3 = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links3.size(); i++) {

				String sss=links3.get(i).getAttribute("href");
				//System.err.println("==="+links3.get(i).getAttribute("action"));
				//System.err.println("ss"+sss[0]);
				System.err.println(sss);
			
			
			}
		
}
	
	
	
	/*WebElement scrollArea = driver.findElement(By.cssSelector("#mCSB_2_dragger_vertical"));
	
	scroll_Page(scrollArea ,100);
	System.err.println("scrolled");
*/
	
	
	public static boolean scroll_Page(WebElement webelement, int scrollPoints)
	{
	    try
	    {               String s="swapnil";
	    	char a=s.charAt(0);
	        Actions dragger = new Actions(driver);
	        // drag downwards
	        int numberOfPixelsToDragTheScrollbarDown = 90;
	        for (int i = 10; i < scrollPoints; i = i + numberOfPixelsToDragTheScrollbarDown)
	        {dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, 100).release(webelement).build().perform();
	            //dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, numberOfPixelsToDragTheScrollbarDown).release(webelement).build().perform();
	        	//dragger.moveToElement(webelement).clickAndHold().moveByOffset(0, -numberOfPixelsToDragTheScrollbarDown).release(webelement).build().perform();
	        	
	        }
	        Thread.sleep(500);
	        return true;
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	        return false;
	    }
	}



		

	}
