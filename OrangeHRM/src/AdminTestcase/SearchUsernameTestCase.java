package AdminTestcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import AdminPages.SearchUsername;
import MyAccountPages.LoginPage;

public class SearchUsernameTestCase {

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
		
		LoginPage objLoginPage = new LoginPage(driver);
		SearchUsername objSearch = new SearchUsername(driver);
		
		objLoginPage.EnterUserName("Admin");
		Thread.sleep(2000);
		objLoginPage.EnterPassword("admin123");
		Thread.sleep(2000);
		objLoginPage.ClickOnLoginButton();
		Thread.sleep(2000);
		objSearch.ClickonAdminPanel();
		Thread.sleep(2000);
		objSearch.SearchUserName("Admin");
		Thread.sleep(2000);
		//objSearch.UserRole();
		objSearch.ClickonSearchButton();
		Thread.sleep(2000);
		objSearch.ClickonResetButton();
		Thread.sleep(2000);
		objSearch.EnterEmployeeName("r");
		Thread.sleep(2000);
		objSearch.ClickonSearchButton();
		Thread.sleep(2000);
	
		objSearch.driverclose();
			
	}

}
