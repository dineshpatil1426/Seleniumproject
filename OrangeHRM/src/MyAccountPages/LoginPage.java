package MyAccountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By txtUsername =By.name("username");
	By txtPassword=By.name("password");
	//By btnLogin =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	public void EnterUserName (String UserName) {
		
		driver.findElement(txtUsername).sendKeys(UserName);	
	}
	public void EnterPassword(String Password) {
		
		driver.findElement(txtPassword).sendKeys(Password);
	}
	public void ClickOnLoginButton() {
		
		try {
			
			WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			btnLogin.click();
			System.out.println("Login Successfully..!");
			
		} catch (Exception e) {
			System.out.println("Error In Login"+ e);
		}
		
	}
	
	public void Closedriver() {
		
		driver.close();
	}
}
