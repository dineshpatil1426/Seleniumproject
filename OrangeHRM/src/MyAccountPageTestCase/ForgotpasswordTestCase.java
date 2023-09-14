package MyAccountPageTestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import MyAccountPages.ForgotpasswordPage;
import MyAccountPages.LoginPage;

public class ForgotpasswordTestCase {

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
		
		ForgotpasswordPage objForgotpass = new ForgotpasswordPage(driver);
		LoginPage objLogin = new LoginPage(driver);
		
		
		objForgotpass.ClickonforgotLink();
		Thread.sleep(1000);
		objForgotpass.EnterUsername("Admin");
		Thread.sleep(1000);
		objForgotpass.ClickOnResetButton();
		Thread.sleep(2000);
		objForgotpass.RedirectLoginURL();
		Thread.sleep(3000);
		objLogin.EnterUserName("Admin");
		Thread.sleep(2000);
		objLogin.EnterPassword("admin123");
		Thread.sleep(2000);
		objLogin.ClickOnLoginButton();
		Thread.sleep(5000);
		objForgotpass.closedriver();
		

	}

}
