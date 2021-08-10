package AutomatedWebsites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarWale {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// Go to https://www.carwale.com/
		driver.get("https://www.carwale.com/");
		
		//Click on Used
		driver.findElementByXPath("//span[contains(text(),'Used')]").click();
		
		//Select the City as Chennai
		driver.findElementByXPath("(//input[@class='o-dqBOwT o-cKuOoN o-eZCpVk o-bfyaNx o-eZTujG o-jjpuv o-fzptVd o-fzptYr o-fEEqXL o-eKWNKE o-bIMsfE o-ItVGT  o-fznJFI E6NC89 _2XUNC9 _2aq9yP  E6NC89 '])[1]").sendKeys("Chennai");
		driver.findElementByXPath("//mark[contains(text(),'Chennai')]").click();
		
		//Select budget min (8L) and max(12L) and Click Search
		Thread.sleep(2000);
		driver.findElementByXPath("//div[contains(text(),'Choose your Budget')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='o-brXWGL']//input[@placeholder='Min']").sendKeys("8");
	
		driver.findElementByXPath("//div[@class='o-brXWGL']//input[@placeholder='Max']").sendKeys("12");
		driver.findElementByXPath("//button[contains(text(),'Search')]").click();
		
		//Select Cars with Photos under Only Show Cars With 
		driver.findElementByXPath("//span[contains(text(),'Cars with Photos')]").click();
		
		//Select Manufacturer as "Hyundai" --> Creta 
		driver.findElementByXPath("//span[contains(text(),' Hyundai ')]").click();
		driver.findElementByXPath("(//ul[@class='rootUl']/li)[1]").click();
		
		//Select Fuel Type as Petrol 
		driver.findElementByXPath("//h3[contains(text(),'Fuel Type')]").click();
		driver.findElementByXPath("(//span[contains(text(),'Petrol')])[1]").click();
		
		//Select Best Match as "KM: Low to High"
		driver.findElementByXPath("//option[contains(text(),'KM: Low to High')]").click();		
	
	}

}
