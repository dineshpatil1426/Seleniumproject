package bookStoreTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BookstoreElements.BookStoreElements;


public class BookStoreSearchTestCase  {

	public static void main(String[] args)  {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver(co);
		driver.manage().window().maximize();
		String url ="https://demoqa.com/books";
		
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
	
		 BookStoreElements objBookStoresearch = new BookStoreElements(driver);
		 
		 try {
			 
			 objBookStoresearch.EnterSearchName("Git Pocket Guide");
			 Thread.sleep(1000);
			 objBookStoresearch.closedriver();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());	
		}
	}

}
