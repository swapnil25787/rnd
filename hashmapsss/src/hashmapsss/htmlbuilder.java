package hashmapsss;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class htmlbuilder {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, UnsupportedEncodingException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		//ChromeOptions options = new ChromeOptions();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--browser.download.folderList=1");

		//	chromePrefs.put("download.prompt_for_download","True");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(cap);


		WebDriverWait wait = new WebDriverWait(driver, 20);


		driver.get("http://210.212.23.61/PressRelease.aspx");
		Thread.sleep(5000l);
		int count=1;
		Thread.sleep(5000l);
		String file="C:\\Users\\swapnil.patil\\Desktop\\pressreles.txt";

		PrintWriter writer = new PrintWriter(file, "UTF-8");
		PrintStream printStream = new PrintStream(new FileOutputStream(file));
		System.setOut(printStream);

		writer.println(printStream);
		System.err.println("hi");
		for (int k = 0; k <= 60; k++) {
			System.out.println("pagination length=====>"+driver.findElements(By.xpath("//*[@id='gvPressRelease']/tbody/tr[102]/td/table/tbody/tr/td")).size());
			int pagination=driver.findElements(By.xpath("//*[@id='gvPressRelease']/tbody/tr[102]/td/table/tbody/tr/td")).size();
			for (int j = count; j <=pagination; j++) {
				
				//*[@id="gvPressRelease"]/tbody/tr[22]/td/table/tbody/tr/td[5]/a
				if (j>1) {
				
						//System.out.println("j====>"+j);
						//System.out.println("page No========>"+driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr[22]/td/table/tbody/tr/td["+j+"]/a")).getText());
						driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr[102]/td/table/tbody/tr/td["+j+"]/a")).click();
						
						//*[@id="gvPressRelease"]/tbody/tr[102]/td/table/tbody/tr/td[2]/a
						//count=count+1;
						
					}
						
				
				Thread.sleep(5000l);


				////////////////////////////

				int s=driver.findElements(By.xpath("//*[@id='gvPressRelease']/tbody/tr")).size();
			//	System.out.println("size==>"+s);
				for (int i = 2; i < s; i++) {
					System.out.print("<tr>");
					System.out.print("<td>");
					System.out.print(driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr["+i+"]/td[1]")).getText());	
					System.out.print("</td>");
					System.out.print("<td>");
					System.out.print(driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr["+i+"]/td[2]")).getText());
					System.out.print("</td>");
					System.out.print("<td>");
					System.out.print(driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr["+i+"]/td[3]")).getText());
					System.out.print("</td>");
					System.out.print("<td>");
					System.out.print("<a target=\"blank\" href="+"\""+driver.findElement(By.xpath("//*[@id='gvPressRelease']/tbody/tr["+i+"]/td[4]/a")).getAttribute("href")+"\""+"\""+">");
					System.out.print("</td>");
					System.out.print("</tr>");
					System.out.println();

				

				}
				////////////////////










			}
count=3;
		}



	}

}













