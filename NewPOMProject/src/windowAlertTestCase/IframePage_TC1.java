package windowAlertTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import windowsAlert.IframePage;

public class IframePage_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		IframePage Objifrmpg = new IframePage(driver);
		
		Objifrmpg.Scrolldown();
		Thread.sleep(2000);
		Objifrmpg.ParentIframe();
		Thread.sleep(2000);
		Objifrmpg.ChidIframe();
		Thread.sleep(2000);
		Objifrmpg.driverclose();
		
	}

}
