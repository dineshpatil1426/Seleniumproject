

import org.testng.annotations.BeforeMethod;

/*
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
*/

public class NewTestNG {
	
	WebDriver driver ;

	@BeforeMethod
	public void beforeMethod()throws Exception {
		
		driver= new ChromeDriver();
		driver.get("https://www.store.demoqa.com");
	}
}
