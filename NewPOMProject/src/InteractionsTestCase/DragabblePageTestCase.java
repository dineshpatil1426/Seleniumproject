package InteractionsTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Interactions.DragabblePage;

public class DragabblePageTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		
		DragabblePage objdrabble = new DragabblePage(driver);
		
		objdrabble.dragabbleSimple();
		Thread.sleep(2000);
		objdrabble.dragabbleAxisRestricted();
		Thread.sleep(2000);
		objdrabble.dragabbleContainerRestricted();
		Thread.sleep(2000);
		objdrabble.dragabbleCursorStyle();
		Thread.sleep(2000);
		objdrabble.driverClose();

	}

}
