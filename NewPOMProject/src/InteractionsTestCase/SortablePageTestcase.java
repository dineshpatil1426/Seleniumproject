package InteractionsTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Interactions.SortablePage;

public class SortablePageTestcase {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/sortable");
		
		SortablePage objsortablepage = new SortablePage(driver);
		
		objsortablepage.ListSortableTapPanel();
		Thread.sleep(2000);
		objsortablepage.GridSortableTapPanel();
		Thread.sleep(2000);
		objsortablepage.driverClose();
		

	}

}
