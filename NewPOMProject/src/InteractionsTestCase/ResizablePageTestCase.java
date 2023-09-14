package InteractionsTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Interactions.ResizablePage;

public class ResizablePageTestCase {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/resizable");
		
		ResizablePage objResizablepage = new ResizablePage(driver);
		
		objResizablepage.ResizableFixbox();
		Thread.sleep(2000);
		objResizablepage.resizableNolimitbox();
		Thread.sleep(2000);
		objResizablepage.driverclose();		
	}

}
