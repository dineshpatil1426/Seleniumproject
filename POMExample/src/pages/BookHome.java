package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookHome {
	
	WebDriver driver;
	
	public BookHome(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	 By LoginBtn=By.id("login");
	
	
	public void ClickLogin() {
		
		driver.findElement(LoginBtn).click();
	}
	
	

}
