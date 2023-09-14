package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.AutocompletePage;

public class Autocomplete_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/auto-complete");
		
		
		AutocompletePage objatmpage = new AutocompletePage(driver);

		Thread.sleep(2000);
		objatmpage.EnterMultipleColor("G");
		Thread.sleep(2000);
		objatmpage.EnterMultipleColor("R");
		Thread.sleep(2000);
		objatmpage.EnterMultipleColor("w");
		Thread.sleep(2000);
		objatmpage.EnterSingleColor("R");
		Thread.sleep(2000);
		objatmpage.driverClose();
		
	}

}
