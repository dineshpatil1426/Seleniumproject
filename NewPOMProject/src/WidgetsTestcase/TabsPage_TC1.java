package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.TabsPage;

public class TabsPage_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
			
			System.setProperty("webdriver.chrome.driver", "/Users/macmini/Downloads/chromedriver");
			WebDriver driver= new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/tabs");
			
		
		
		TabsPage objPage = new TabsPage(driver);

		Thread.sleep(1000);
		objPage.clickOnoriginTab();
		Thread.sleep(2000);
		objPage.clickOnUseTab();
		Thread.sleep(2000);
		objPage.clickOnWhatTab();
		Thread.sleep(2000);
		objPage.driverclose();
		
	}

}
