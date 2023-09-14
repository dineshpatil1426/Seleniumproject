package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ElementPages.Elements_Textbox;

public class Element_Textbox_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Downloads/BrowserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		Elements_Textbox ObjTextbox = new Elements_Textbox(driver);
		
		ObjTextbox.EnterFullname("DineshPatil");
		Thread.sleep(1000);
		ObjTextbox.EnterEmail("Test@gmail.com");
		Thread.sleep(1000);
		ObjTextbox.EnterCurrentAddress("168 Krishna kunj Soceity");
		Thread.sleep(1000);
		ObjTextbox.EnterpermanentAddress("26 sarvoday Nagar");
		Thread.sleep(1000);
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,400)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
			} catch (Exception e) {
			
			System.out.println("Current Page ScrollDown is anyError...!");
			
			}
			Thread.sleep(1000);
		
		// Click on Login Button
		ObjTextbox.ClickOnSubmit();
		Thread.sleep(2000);
		System.out.println("Submit Click SucessFully");
			
		
		System.out.println("FullName is -->" + ObjTextbox.GetFullname());
		Thread.sleep(1000);
		System.out.println("Email id  is -->" + ObjTextbox.GetEmailid());
		Thread.sleep(1000);
		System.out.println("Current Address is -->" + ObjTextbox.GetCurrentaddress1());
		Thread.sleep(1000);
		System.out.println("Parment Address is -->" + ObjTextbox.GetparmentAddrress1());
		Thread.sleep(1000);
		System.out.println("Get Data SucessFully ");
		
		
		//close the Browser
		driver.close();
	}

}
