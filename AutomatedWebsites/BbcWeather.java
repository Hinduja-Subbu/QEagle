package AutomatedWebsites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BbcWeather {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Open the BBC Weather website (http://www.bbc.co.uk/weather)
		driver.get("http://www.bbc.co.uk/weather");
		
		//Enter "Chennai" in the serach box
		WebElement enterCitydriver=driver.findElementById("ls-c-search__input-label");
		enterCitydriver.click();
		enterCitydriver.sendKeys("Chennai");
		
		driver.findElementByXPath("(//span[contains(text(),'Chennai')])[1]").click();
		
		//Obtain the pressure value for 21:00 for today
		driver.findElementByXPath("//span[contains(text(),'21')]/following-sibling::span[2]").click();
		String getTextOfPressureDay1=driver.findElementByXPath("(//div[@class='wr-time-slot-secondary__bottom-section']//dd[2])[10]").getText();
		String a=getTextOfPressureDay1.substring(0, 4);
		int getInt1=Integer.parseInt(a);
		//System.out.println(a);
		System.out.println("Pressure of Today="+getInt1);
		
		//Obtain the pressure value for 21:00 for tomorrow
		driver.findElementByXPath("//div[@class='wr-date']/span[2]").click();
		driver.findElementByXPath("//span[contains(text(),'21')]/following-sibling::span[2]").click();
		String getTextOfPressureDay2=driver.findElementByXPath("(//div[@class='wr-time-slot-secondary__bottom-section']//dd[2])[16]").getText();
		String b=getTextOfPressureDay2.substring(0, 4);
		int getInt2=Integer.parseInt(b);
		//System.out.println(b);
		System.out.println("Pressure of Tommorrow="+getInt2);
		
		int sub=getInt1-getInt2;
		System.out.println("Difference between today and tommorrow pressure of 21:30 = "+sub);
		
		
	}

}
