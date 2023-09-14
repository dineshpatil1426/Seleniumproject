package WidgetsTestcase;

//import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.MenuPage;

public class MenuPage_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
	 	System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu");
		
		
		MenuPage objmenu  = new MenuPage(driver);

		Thread.sleep(2000);
		objmenu.MousehoverOnMenu();
		Thread.sleep(2000);
		objmenu.MousehoverOnSubMenu();
		Thread.sleep(2000);
		objmenu.driverclose();
	}
	

}
