package TestCasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.UploadDownloadElement;

public class uploaddownload_Tc1 {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		
		UploadDownloadElement objUplDnw = new UploadDownloadElement(driver);
		
		
		objUplDnw.ClickOndownloadButton();
		Thread.sleep(5000);
		objUplDnw.ClickonUploadButton("/Users/macmini/Desktop/123.png");
		Thread.sleep(5000);
		objUplDnw.driverclose();

		
		
	}

}
