package TestCasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.LinksElement;

public class LinkElement_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
        
		
		
		LinksElement objLinkbutton = new LinksElement(driver);
		
		
		objLinkbutton.HomenewTablink();
		Thread.sleep(2000);
		objLinkbutton.dynamicHomelink();
		Thread.sleep(2000);
		objLinkbutton.Createdlink();
		Thread.sleep(2000);
		objLinkbutton.NocontentLink();
		Thread.sleep(2000);
		objLinkbutton.Movedlink();
		Thread.sleep(2000);
		objLinkbutton.badRequestlink();
		Thread.sleep(2000);
		objLinkbutton.unauthorizedLink();
		Thread.sleep(2000);
		objLinkbutton.forbiddenLink();
		Thread.sleep(2000);
		objLinkbutton.NotFoundLink(); 
		Thread.sleep(2000);
		objLinkbutton.Closedriver();
		
	}

}
