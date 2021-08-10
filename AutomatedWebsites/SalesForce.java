package AutomatedWebsites;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Login to https://login.salesforce.com
		driver.get("https://login.salesforce.com");

		// nupela@testleaf.com India@123
		driver.findElementById("username").sendKeys("nupela@testleaf.com");
		driver.findElementById("password").sendKeys("India@123");

		// Click on toggle menu button from the left corner
		driver.findElementById("Login").click();

		// Click on toggle menu button from the left corner
		driver.findElementByXPath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip'])[6]").click();

		// Click view All
		driver.findElementByXPath("//button[contains(text(),'View All')]").click();

		// Click Service Console from App Launcher
		driver.findElementByXPath("//p[contains(text(),'Service Console')]").click();

		// Select Home from the DropDown
		driver.findElementByXPath(
				"//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']")
				.click();

		driver.findElementByXPath("//span[contains(text(),'Home')]").click();

		// Add CLOSED + OPEN values and result should set as the GOAL (If the result is
		// less than 10000 then set the goal as 10000)
		String verifyGoal = driver.findElementByXPath("(//span[@class='metricAmount uiOutputText'])[3]").getText();
		if (verifyGoal.equals("10000")) {
			System.out.println("Goal value is 10000");
		} else {
			System.out.println("Goal is less than 10000");
		}

		// Select Dashboards from DropDown
		driver.findElementByXPath(
				"//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']")
				.click();

		driver.findElementByXPath("//span[contains(text(),'Dashboards')]").click();

		// Click on New Dashboard
		driver.findElementByXPath("//div[contains(text(),'New Dashboard')]").click();

		// Enter the Dashboard name as "YourName_Workout"
		
		driver.switchTo().frame(0);

		driver.findElementByXPath("//input[@id='dashboardNameInput']").sendKeys("Hinduja_Workout");

		// Enter Description as Testing and Click on Create
		driver.findElementById("dashboardDescriptionInput").sendKeys("Testing");

		// Click on Done
		driver.findElementByXPath("//button[contains(text(),'Create')]").click();
		driver.switchTo().defaultContent();

		// Click on Done
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElementByXPath("//button[contains(text(),'Done')]").click();

		

	}

}
