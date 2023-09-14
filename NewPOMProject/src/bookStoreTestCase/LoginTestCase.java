package bookStoreTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BookstoreElements.LoginRegiserElements;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver(co);
		driver.manage().window().maximize();
		String url ="https://demoqa.com/login";
		//String url= "https://phptravels.com/demo/";
		
		driver.navigate().to(url);
		//driver.get(url);
		
		String Title =driver.getTitle();
		int TitleLenght =driver.getTitle().length();
		System.out.println("current Title is : " + Title);
		System.out.println("current Title Lenght  is :" + TitleLenght);
		
		String actualUrl = driver.getCurrentUrl();
		 if(actualUrl.equals(url)) {
			 System.out.println("Verification Successful - The correct Url is opened.");
		 }else {
			 System.out.println("Verification Failed - An incorrect Url is opened."); 
			 
			 
			 	System.out.println("Actual URL is : " + actualUrl); 
				System.out.println("Expected URL is : " + url);
		 }
		 
	  // String PageSource =driver.getPageSource();
		 int PagesourceLenght =driver.getPageSource().length();
		 
		 System.out.println("Total length of the Pgae Source is : " + PagesourceLenght);
		 
		
		
		LoginRegiserElements objLogin = new LoginRegiserElements(driver);
		
		
		try {
		
		objLogin.EnterLoginuserName("dinesh1113");
		Thread.sleep(1000) ;
		objLogin.EnterLoginPassword("Patil@1113");
		Thread.sleep(1000);
		objLogin.ClickonLoginButton();
		Thread.sleep(2000);
		objLogin.PageScrollDownForMenu();
		Thread.sleep(1000);
		objLogin.ClickBookStoremenuList();
		Thread.sleep(1000);
		//objLogin.CLickonLogout();
		//Thread.sleep(3000);
		
		objLogin.closedriver();
		
		} catch (Exception e) {
		
		System.out.println(e.getMessage());	
		}

	}

}
