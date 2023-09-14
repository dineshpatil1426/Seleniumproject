package InteractionsTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Interactions.DroppablePage;

public class DroppablePageTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		DroppablePage objdroppble = new DroppablePage(driver);
		
		Thread.sleep(2000);
		objdroppble.droppableSimple();
		Thread.sleep(1000);
		objdroppble.droppableAcceptable();
		Thread.sleep(1000);
		objdroppble.droppblePrevent();
		Thread.sleep(1000);
		objdroppble.droppbleRevert();
		Thread.sleep(1000);
		
		objdroppble.driverClose();

	}

}
