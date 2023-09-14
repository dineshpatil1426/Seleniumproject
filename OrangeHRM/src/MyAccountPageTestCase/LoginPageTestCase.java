package MyAccountPageTestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import MyAccountPages.LoginPage;

public class LoginPageTestCase {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/OrangeHRM/drivers/chromedriver");
		//String URL ="https://demoqa.com/";
	    String URL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(URL);
		driver.manage().window().maximize();
		
		
		LoginPage ObjLoginPage = new LoginPage(driver);
		
		ObjLoginPage.EnterUserName("Admin");
		Thread.sleep(2000);
		ObjLoginPage.EnterPassword("admin123");
		Thread.sleep(2000);
		ObjLoginPage.ClickOnLoginButton();
		
		Thread.sleep(5000);
		ObjLoginPage.Closedriver();

	}

}
