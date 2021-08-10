package ChangeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssessTheChangeRequest {

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
		
		//update the State as "Assess"
		Select state = new Select(driver.findElementById("change_request.state"));
		state.selectByVisibleText("Assess");
		
		//Assign the request to 'ITIL User' and  'Software' in Assignment group and click 'Update'
		driver.findElementById("lookup.change_request.assignment_group").click();
		Set<String> newWin=driver.getWindowHandles();
	     for (String eachRef : newWin) {
				System.out.println(eachRef);
			}
	     List<String> secWin=new ArrayList<String>(newWin);
	     System.out.println(secWin.get(1));
	     driver.switchTo().window(secWin.get(1));
	     driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[contains(text(),'Software')]").click();
		
		driver.switchTo().window(secWin.get(0));
		
		Thread.sleep(2000);
		driver.switchTo().frame("gsft_main");
		driver.findElementById("lookup.change_request.assigned_to").click();
		Set<String> windowHandles=driver.getWindowHandles();
	     for (String eachRef1 : windowHandles) {
				System.out.println(eachRef1);
			}
	     List<String> listHanldes=new ArrayList<String>(windowHandles);
	     System.out.println(listHanldes.get(1));
	     driver.switchTo().window(listHanldes.get(1));
	     driver.manage().window().maximize();
	     driver.findElementByXPath("//a[contains(text(),'ITIL User')]").click();
	     driver.switchTo().window(listHanldes.get(0));
	     Thread.sleep(2000);
	     driver.switchTo().frame("gsft_main");
	     driver.findElementById("sysverb_update_bottom").click();
	     
	     String stateVerify=driver.findElementByXPath("//td[contains(text(),'Assess')]").getText();
	     if(stateVerify.contains("Assess")) {
	    	 System.out.println("State Verified");
	     }
	     else
	     {
	    	 System.out.println("Not Verified");
	     }

	     String assign=driver.findElementByXPath("//a[contains(text(),'ITIL User')]").getText();
	     if(assign.contains("ITIL User")) {
	    	 System.out.println("Assigned to ITIL User and  Verified the same");
	     }
	     else
	     {
	    	 System.out.println("Not Verified");
	     }

	}

}
