package windowAlertTestCase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import windowsAlert.Alertpage;

public class AlertPage_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		Alertpage objalrtpg = new Alertpage(driver);
		Thread.sleep(2000);
		objalrtpg.ClickAlertButton();
		Thread.sleep(2000);
		objalrtpg.ClickTimeAlertButton();
		Thread.sleep(2000);
		objalrtpg.ClickconfirmButton();
		Thread.sleep(5000);
		objalrtpg.clickpromtButton();
		Thread.sleep(2000);
		objalrtpg.driveclose();
		

	}

}
