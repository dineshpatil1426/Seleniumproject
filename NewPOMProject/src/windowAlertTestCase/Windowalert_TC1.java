package windowAlertTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import windowsAlert.BrowserWindowPage;

public class Windowalert_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		BrowserWindowPage objbwpage= new BrowserWindowPage(driver);

		
		
		objbwpage.ClickonNewTab();
		Thread.sleep(2000);
		objbwpage.ClickOnNewWindow();
		Thread.sleep(2000);
		objbwpage.ClickOnNewWindowMessage();
		Thread.sleep(2000);
		objbwpage.driveclose();
	}

}
