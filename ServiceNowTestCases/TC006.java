package ServiceNowTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		// Load ServiceNow application https://dev111627.service-now.com/

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev113545.service-now.com/");
		// Enter username as “admin”
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");

		// Enter password as “India@123”
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");

		// Click Login
		driver.findElementByXPath("//button[@id='sysverb_login']").click();

		// Enter Incident in filter navigator and press enter
		
		driver.findElementByXPath("(//div[contains(text(),'Create New')])[1]").click();
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();
		String verify= driver.findElementByXPath("//span[contains(text(),'The following mandatory fields are not filled in: Short description, Caller')]").getText();
		if(verify.contains("The following mandatory fields are not filled in: Short description, Caller"))
		{
			System.out.println("Alert displayed cannot sumbit without entering mandatory fields");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
		

	}

}
