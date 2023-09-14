package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Widgets.SelectMenuDropdownPage;

public class SelectMenuDropdownPage_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		SelectMenuDropdownPage onjdrpmenu =new SelectMenuDropdownPage(driver);
		
		Thread.sleep(2000);
		//onjdrpmenu.GroupDropdown();
		onjdrpmenu.GroupDropdown();
		Thread.sleep(2000);
		onjdrpmenu.singledropdown();
		Thread.sleep(2000);
		onjdrpmenu.Oldstyledropdown();
		Thread.sleep(2000);
		onjdrpmenu.Multipledropdown();
		Thread.sleep(2000);
		onjdrpmenu.StandardMultiSelect();
		Thread.sleep(2000);
		onjdrpmenu.driverClose();
	}
}
