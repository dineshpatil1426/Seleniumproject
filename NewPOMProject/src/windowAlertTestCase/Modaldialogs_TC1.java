package windowAlertTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import windowsAlert.ModaldialogsPage;

public class Modaldialogs_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/modal-dialogs");

		 ModaldialogsPage objmd = new ModaldialogsPage(driver);
		 
		 objmd.SmallModalWithCloseButton();
		 Thread.sleep(2000);
		 objmd.SmallmodalWithCloseIcon();
		 Thread.sleep(2000);
		 objmd.LargeModelWithCloseButton();
		 Thread.sleep(2000);
		 objmd.LargemodalWithCloseIcon();
		 Thread.sleep(2000);
		 objmd.driverclose();
		 
	}

}
