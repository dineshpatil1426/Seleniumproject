package MyAccountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotpasswordPage {
	
	WebDriver driver;
	
	public ForgotpasswordPage(WebDriver driver) {
		
		this.driver=driver;
	}

	By lnkforgot =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	By txtUsername =By.name("username");
	By btnResetButton =By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]");
	
	
	
	public void ClickonforgotLink() {
		
		driver.findElement(lnkforgot).click();
	}
	public void EnterUsername(String ForgotUsername) {
		driver.findElement(txtUsername).sendKeys(ForgotUsername);
	}
	
	public void ClickOnResetButton() {
		driver.findElement(btnResetButton).click();
	}
	
	public void RedirectLoginURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void closedriver() {
		driver.close();
	}
}
