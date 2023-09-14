package testcase;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import formPages.Form_Practiceform;

public class Form_practiceForm_TC1  {

	public	WebDriver driver;
	
		Form_Practiceform objPracticeform ;

	
		//@BeforeTest
		public void setup() {
			
			System.setProperty("webdriver.chrome.driver", "/Users/cirklestudio/Downloads/BrowserDrivers/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://demoqa.com/automation-practice-form");
		}
		
		//@Test(priority = 1)
		public void EnterStudentsDetails()throws InterruptedException,AWTException   {
			
			objPracticeform = new Form_Practiceform(driver);
			
			System.out.println("Test First");
			objPracticeform.EnterFirstname("Dinesh");
			Thread.sleep(1000);
			objPracticeform.EnterLastname("patil");
			Thread.sleep(1000);
			objPracticeform.EnterUserEmail("Test@gmail.com");
			Thread.sleep(1000);
			objPracticeform.SelectGender();
			Thread.sleep(1000);
			objPracticeform.EnterUserMobile("7984135555");
			Thread.sleep(1000);
			objPracticeform.Selectbirthdate();
			Thread.sleep(1000);
			objPracticeform.SelectYear("1988");
			Thread.sleep(1000);
			objPracticeform.SelectMonth("july");
			Thread.sleep(1000);
			objPracticeform.Selectday();
			Thread.sleep(2000);
			System.out.println("Test 123");
			objPracticeform.EnterSubject("H");
			Thread.sleep(1000);
			System.out.println("Test auto");
			objPracticeform.selectHobbies();
			System.out.println("Test Checkbox");
			Thread.sleep(1000);
			objPracticeform.FilUplaod();
			Thread.sleep(1000);
			objPracticeform.PageScrollDown();
			Thread.sleep(1000);
			objPracticeform.EnterCurrentAddress("168 Krishna kunj Society,Dindoli");
			Thread.sleep(1000);
			objPracticeform.selectState("a");
			Thread.sleep(1000);
			objPracticeform.selectcity("a"); 
			Thread.sleep(1000);
			objPracticeform.SubmitForm();
			Thread.sleep(5000);
		}
	
		//@Test(priority = 2)
		//@AfterTest
		public void BrowserClose() {
			
			objPracticeform = new Form_Practiceform(driver);
			objPracticeform.CloseBrowser();
		}

	}

