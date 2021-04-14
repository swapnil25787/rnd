package hashmapsss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datafetch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String homePage = "http://192.168.100.230:8080/CitizenHome.html";
		System.setProperty("webdriver.chrome.driver","D:\\AutomationFramework\\ABMSmartScript\\functional\\config\\chromedriver36.exe");
		driver=new ChromeDriver();
		driver.get("https://thanecity.gov.in/index.php");
			Thread.sleep(5000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i < allLinks.size(); i++) {
			
			if (allLinks.get(i).getText().equalsIgnoreCase("")) {
				
			}else {
				System.out.println(allLinks.get(i).getText());
			}
		
		}
		
		driver.quit();
	}

}
