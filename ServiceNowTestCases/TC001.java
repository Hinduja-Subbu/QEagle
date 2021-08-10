package ServiceNowTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
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

		// Search “incident “ Filter Navigator
		WebElement searchIncident = driver.findElementByXPath("//input[@id='filter']");
		searchIncident.sendKeys("incident");
		driver.findElementByXPath("(//div[contains(text(),'Incidents')])[1]").click();
		// Click on Create new option and fill the manadatory fields

				driver.findElementByXPath("(//div[contains(text(),'Create New')])[1]").click();

				// Verify the newly created incident ( copy the incident number and paste it in
				// search field and enter then verify the instancenumber created or not)
				driver.switchTo().frame("gsft_main");
				String incNo = driver.findElementByXPath("//input[@id='incident.number']").getAttribute("value");
				System.out.println("Incident number-" + incNo);

				driver.findElementByXPath("//input[@id='sys_display.incident.caller_id']").click();
				driver.findElementByXPath("//td[contains(text(),'System Administrator')]").click();
				driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("Invoice error for customer");
				driver.findElementByXPath("//button[@id='sysverb_insert_bottom']").click();

				// Verify the newly created incident ( copy the incident number and paste it in
				// search field and enter then verify the instance number created or not)
				WebElement searchInc = driver.findElementByXPath("(//input[@class='form-control'])[1]");
				searchInc.sendKeys(incNo,Keys.ENTER);
				//searchInc.sendKeys(Keys.ENTER);

	}
	
}
