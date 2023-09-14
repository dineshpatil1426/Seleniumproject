package TestCasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.ButtonsElement;

public class ButtonsElements_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		
		ButtonsElement objButtons = new ButtonsElement(driver);
		
		Thread.sleep(2000);
		objButtons.ClickSingleButton();
		Thread.sleep(2000);
		objButtons.RightClickButton();
		Thread.sleep(2000);
		objButtons.doubleClickButton();
		Thread.sleep(2000);
		objButtons.Closedriver();

	}

}
