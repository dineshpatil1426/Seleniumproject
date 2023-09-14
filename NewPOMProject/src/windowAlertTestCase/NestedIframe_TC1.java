package windowAlertTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import windowsAlert.NestedIframepage;

public class NestedIframe_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		
		NestedIframepage Objnstframe = new NestedIframepage(driver);

		
		Objnstframe.ParentIframe();
		Thread.sleep(2000);
		Objnstframe.ChildIframe();
		Thread.sleep(2000);
		Objnstframe.driverclose();
	}

}
