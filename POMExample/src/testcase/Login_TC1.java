package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.BookDashboard;
import pages.BookHome;
import pages.BookLogin;

public class Login_TC1 {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/cirklestudio/Downloads/BrowserDrivers/chromedriver");
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/books");
		Thread.sleep(1000);
		
		BookHome objhome = new BookHome(driver);
		
		BookLogin objLogin = new BookLogin(driver);
	
		BookDashboard objDashboard = new BookDashboard(driver);
		
		// CLick on Login Button
		objhome.ClickLogin();
		Thread.sleep(2000);
		
		//Enter Username & Password
		objLogin.EnterUserName("dinesh1426");
		Thread.sleep(1000);
		objLogin.EnterPassworde("Pdpatil@1426");
		Thread.sleep(1000);
		
		//Click on Login Button 
		objLogin.Clickklogin();
		Thread.sleep(3000);
		
		System.out.println("The page heading is ---> " +objDashboard.GetHeading());
		Thread.sleep(1000);
		
		// Click on Logout Button
		objDashboard.ClickLogout();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
