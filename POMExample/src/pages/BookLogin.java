package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookLogin {
	
	WebDriver driver;
	
	public BookLogin(WebDriver driver) {
		
		this.driver= driver;
	}

	By txtUsername=By.id("userName");
	By txtPassword =By.id("password");
	By Btnlogin=By.id("login");
	
	public void EnterUserName( String username) {
		
		driver.findElement(txtUsername).sendKeys(username);	
	} 
	
	public void EnterPassworde(String Pass) {
		
		driver.findElement(txtPassword).sendKeys(Pass);
	}
	
	public void Clickklogin() {
		
		driver.findElement(Btnlogin).click();
	}
	
	
}
