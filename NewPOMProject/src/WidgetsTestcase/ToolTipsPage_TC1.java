package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.ToolTipsPage;

public class ToolTipsPage_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		
		ToolTipsPage objTool = new ToolTipsPage(driver);
		
		Thread.sleep(3000);
		objTool.HoverOnButton();
		Thread.sleep(2000);
		objTool.TextfieldToolTip();
		Thread.sleep(2000);
		objTool.CountryLinkButtonhover();
		Thread.sleep(2000);
		objTool.Sectionlinkbuttonhover();
		Thread.sleep(2000);
		objTool.driverclose();

	}

}
