package com.hrm.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.util.Testutil;

public class ForgotPasswordPage extends TestBase {

	@FindBy(xpath = "//form[@class='oxd-form']/h6")
	WebElement forgotpasswordLabel;
	
	@FindBy(name="username")
	WebElement forgotUsernametxt;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Resetbutton;
	
	@FindBy(xpath = "//div[@class='orangehrm-card-container']/h6")
	WebElement forgotlinksentMess;	
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement cancelButton;
	
	

	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	public String VerifyForgotPasswordLabel() {
		
		return forgotpasswordLabel.getText();	
	}
	
	public ForgotPasswordPage VerifyforgotpasswordUser   ( String Entrusername) {
		
	   	forgotUsernametxt.sendKeys(Entrusername);
	   	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
	   	Resetbutton.click();
	   	
		return new ForgotPasswordPage();
	}
	
	public String VerifyResetSendMessage() {
		
		return forgotlinksentMess.getText(); 
	}
	
	public LoginPage ClickOnCancelButton() {
		
		cancelButton.click();
		return new LoginPage();
		
	}
	
	
}
