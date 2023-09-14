package TestCasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.BrokenImageAndlinkelement;

public class BrokenImageElement_TC1 {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		
		BrokenImageAndlinkelement objbrkimg = new BrokenImageAndlinkelement(driver);
		
		
		
		objbrkimg.VerifyValidImage();
		Thread.sleep(2000);
		objbrkimg.VerifyBrokenImage();
		Thread.sleep(2000);
		objbrkimg.ValiateLink();
		Thread.sleep(2000);
		objbrkimg.BrokenLinkValiate();
		Thread.sleep(2000);
		objbrkimg.Driverclose();
		
	}

}
