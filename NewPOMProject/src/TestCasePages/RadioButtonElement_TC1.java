package TestCasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.RadioButtonElements;

public class RadioButtonElement_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		RadioButtonElements ObjRadio = new RadioButtonElements(driver);
		
		Thread.sleep(3000);
		ObjRadio.SelectYesRadio();
		Thread.sleep(2000);
		ObjRadio.GetYesLabel();
		Thread.sleep(2000);
		ObjRadio.SelectImpressiveRadio();
		Thread.sleep(2000);
		ObjRadio.GetImpressiveLabel();
		Thread.sleep(2000);
		ObjRadio.SelectNoRadio();
		Thread.sleep(2000);
		
		
		ObjRadio.CloseDriver();	
		

	}

}
