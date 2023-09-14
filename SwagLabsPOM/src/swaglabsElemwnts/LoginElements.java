package swaglabsElemwnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginElements {
	
	WebDriver driver;
	
	
	public LoginElements( WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	//Get id of Textbox
	
	By TxtUsername = By.id("user-name");
	By TxtPassword = By.id("password");
	By btnLogin =By.id("login-button");	
	
	
	public void EnterUsername(String Username) {
		
		driver.findElement(TxtUsername).sendKeys(Username);
		
	}
	
	public void EnterPassword(String Password) {
		
		driver.findElement(TxtPassword).sendKeys(Password);
	}
	
	public void ClickonLogin() {
		
		driver.findElement(btnLogin).click();
	}
	
}
