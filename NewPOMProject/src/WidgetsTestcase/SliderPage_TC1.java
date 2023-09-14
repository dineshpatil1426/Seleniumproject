package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.SliderPage;

public class SliderPage_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");
		
	  SliderPage objSlider = new SliderPage(driver);
	  
	  Thread.sleep(2000);
	  objSlider.MoveToSlider();
	  Thread.sleep(2000);
	  objSlider.driverclose();	
	  

	}

}
