package ChangeManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteChangeRequest {

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

		// Enter password as “m3GkKEKU8atr”
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("m3GkKEKU8atr");

		// Click Login
		driver.findElementByXPath("//button[@id='sysverb_login']").click();

		// Search “change “ Filter Navigator
		WebElement searchIncident = driver.findElementByXPath("//input[@id='filter']");
		searchIncident.sendKeys("change");

		// Click Create New and click Normal change

		driver.findElementByXPath("(//div[contains(text(),'Create New')])[3]").click();

		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");

		driver.findElementByXPath("(//div[@class='change-model-card-component'])[2]").click();
		String incNo = driver.findElementById("change_request.number").getAttribute("value");
		System.out.println("Change Request number-" + incNo);
		// create new normal Change by filling mandatory fields and click 'Submit'
		// button.

		driver.findElementById("change_request.short_description").sendKeys("Issue with webpage");
		driver.findElementById("sysverb_insert_bottom").click();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("(//div[contains(text(),'Open')])[5]").click();
		driver.switchTo().frame("gsft_main");
		driver.findElementById("change_request_table_header_search_control").sendKeys(incNo, Keys.ENTER);
		driver.findElementByXPath("//a[@class='linked formlink']").click();
		Thread.sleep(2000);
		driver.findElementById("sysverb_delete_bottom").click();
		
		driver.findElementById("ok_button").click();
		Thread.sleep(2000);
		
		String verify = driver.findElementByXPath("//td[contains(text(),'No records to display')]").getText();
		if (verify.contains("No records")) {
			System.out.println("Deleted Successfully ");
		} else {
			System.out.println("Not Verified");
		}

	}

}
