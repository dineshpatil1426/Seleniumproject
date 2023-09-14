package bookStoreTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BookstoreElements.LoginRegiserElements;

public class RegisterTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		LoginRegiserElements objLogin = new LoginRegiserElements(driver);
		
		
		try {
		
			objLogin.ClicknewUserButton();
			Thread.sleep(1000);
			objLogin.EnterFirstname("Dinesh");
			Thread.sleep(1000);
			objLogin.EnterLastname("Patil");
			Thread.sleep(1000);
			objLogin.EnterUsername("dinesh1113");
			Thread.sleep(1000);
			objLogin.EnterPassword("Patil@1113");
			Thread.sleep(10000);
			objLogin.ClickOnRegiter();
			Thread.sleep(5000);
			
			//objLogin.ShowErrorMessage();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		
		objLogin.closedriver();

	}

}
