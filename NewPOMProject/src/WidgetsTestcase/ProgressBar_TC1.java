package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.ProgressBarPage;

public class ProgressBar_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/progress-bar");
		
		ProgressBarPage Objprbar = new ProgressBarPage(driver);
		
		Thread.sleep(2000);
		Objprbar.ClickOnStartButton();
		Thread.sleep(2000);
		Objprbar.CheckProgressBar();
		Thread.sleep(2000);	
		Objprbar.driverclose();
	}

}
