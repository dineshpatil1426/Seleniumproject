package FormPageTestCase;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FormPageElement.Formpage;

public class formPage_TC1 {

	public static void main(String[] args) throws InterruptedException,AWTException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		Formpage objfrmpage = new Formpage(driver);

		objfrmpage.Scrolldown();
		//Thread.sleep(2000);
		objfrmpage.EnterFirstname("Dinesh");
		//Thread.sleep(2000);
		objfrmpage.EnterLastname("Patil");
		Thread.sleep(2000);
		objfrmpage.EnterEmailAddress("TestingForwebsiteall@gmail.com");
		//Thread.sleep(2000);
		objfrmpage.SelectionGender();
		//Thread.sleep(2000);
		objfrmpage.EnterMobileNumber("7567777132");
		Thread.sleep(2000);
		objfrmpage.Selectbirthdate();
		Thread.sleep(2000);
		objfrmpage.SelectYear("1988");
		Thread.sleep(2000);
		objfrmpage.SelectMonth("july");
		Thread.sleep(2000);
		objfrmpage.Selectday();
		Thread.sleep(2000);
		objfrmpage.EnterSubject("H");
		Thread.sleep(3000);
		objfrmpage.selectHobbies();
		Thread.sleep(2000);
		objfrmpage.FileUplaod();
		Thread.sleep(5000);
		objfrmpage.EnterCurrentAddress("168 Krishna kunj Society,Dindoli");
		Thread.sleep(2000);
		objfrmpage.selectstate("a");
		Thread.sleep(2000);
		objfrmpage.selectcity("a");
		Thread.sleep(2000);
		objfrmpage.submitform();
		Thread.sleep(2000);
		objfrmpage.driverClose();
	}

}
