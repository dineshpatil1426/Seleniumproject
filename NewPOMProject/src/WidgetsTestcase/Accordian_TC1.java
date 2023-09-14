package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.AccordianPage;

public class Accordian_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/accordian");
		
		AccordianPage Objacrdpage = new AccordianPage(driver);
		
		Objacrdpage.Scrolldown();
		Thread.sleep(3000);
		Objacrdpage.OneSectionHeading();
		Thread.sleep(3000);
		Objacrdpage.TwoSectionHeading();
		Thread.sleep(3000);
		Objacrdpage.ThreeSectionHeading();
		Thread.sleep(3000);
		Objacrdpage.driverClose();
	}

}
