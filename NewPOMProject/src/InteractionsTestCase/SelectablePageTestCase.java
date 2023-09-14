package InteractionsTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Interactions.SelectablePage;

public class SelectablePageTestCase {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable");
		
		SelectablePage objselectable = new SelectablePage(driver);
		
		objselectable.ListSelectTable();
		Thread.sleep(1000);
		objselectable.GridSelectTable();
		Thread.sleep(1000);
		objselectable.driverClose();
	}

}
