package TestCasePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.ElementTextbox;

public class ElementTextbox_TC1 {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		ElementTextbox objTextbox = new ElementTextbox(driver);
		
		objTextbox.EnterFullName("Dinesh Patil");
		Thread.sleep(1000);
		objTextbox.EnterEmailaddress("Patildinesh2688@gmail.com");
		Thread.sleep(1000);
		objTextbox.EnterCurrentAddress("168 Krishna kunj Society");
		Thread.sleep(1000);
		objTextbox.EnterpermanentAddress(" Sarvoday nagar near Sarthak hospital");
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
			objTextbox.Clickonsubmit();
			Thread.sleep(2000);
			System.out.println("Submit Click SucessFully");
			
			
			System.out.println("FullName is -->" + objTextbox.GetFullname());
			Thread.sleep(1000);
			System.out.println("Email id  is -->"+ objTextbox.GetEmailid());
			Thread.sleep(1000);
			System.out.println("Current address is -->"+ objTextbox.GetCurrentAddress1());
			Thread.sleep(1000);
			System.out.println("Parment address is -->"+ objTextbox.GetparnentAddress1());
			Thread.sleep(1000);
			System.out.println("Get Data SucessFully ");
			
			objTextbox.driveclose();

	}

}
