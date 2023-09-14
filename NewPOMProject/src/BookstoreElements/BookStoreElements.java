package BookstoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreElements {
 
	WebDriver driver;
	
	public BookStoreElements(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By txtSearch =By.id("searchBox");
	
	public void EnterSearchName(String SearchName) {
		
		driver.findElement(txtSearch).sendKeys(SearchName);
	}
	
	public void closedriver() {
		
		driver.close();
	}
}
