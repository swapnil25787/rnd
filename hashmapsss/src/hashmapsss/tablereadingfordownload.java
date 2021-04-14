package hashmapsss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablereadingfordownload {
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.navigate().to("http://home.bihar.gov.in/CMS/officeMemorandum.aspx");
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.xpath("//*[@id='GV']/tbody/tr"));
		System.out.println("size"+links.size());
		pdfexist j=new pdfexist();
		for (int i = 0; i <= links.size(); i++) {
			
			String sr=driver.findElement(By.xpath("//*[@id='GV']/tbody/tr["+(i+2)+"]/td[1]")).getText();
			System.err.println(sr);
			
				//driver.findElement(By.xpath("//*[@id='GV']/tbody/tr["+(i+2)+"]/td[6]")).click();
			
				
			Thread.sleep(5000);
			int sr1=Integer.parseInt(sr);
			j.checkExists("C:\\Users\\swapnil.patil\\Downloads\\",sr1 );
		
		}
		
		
		
	}
}
