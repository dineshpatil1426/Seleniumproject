package com.hrm.qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.util.Testutil;

public class LoginPage extends TestBase {

	
	//Page factory -or
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement sumitbtn;
	
	@FindBy(xpath = "//div[contains(@class,'orangehrm-login-branding')]")
	WebElement orangehrmLogo;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-slot']/h5")
	WebElement LoginLabel;
	
	@FindBy(xpath = "//p[text()[contains(.,'Forgot your password? ')]]")   //div[@class='orangehrm-login-forgot']/p
	WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//div[@class='orangehrm-copyright-wrapper']/p")
	WebElement orangeosvesionLabel;
	
	
	
	
	
	//Initializing the Page Objects: 
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifyOrangeLoginTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean VerifyOrangepageLogo() {
		
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		return orangehrmLogo.isDisplayed();
	}
	public String VerifyLoginLabel() {
		
	  return LoginLabel.getText();
	}
	public ForgotPasswordPage ClickonForgorpasswordLink() {
		
		forgotPasswordLink.click();
	
		return new ForgotPasswordPage();
	}
	
	public String VerifyorangeOSversionLabel() {
		
	    return	orangeosvesionLabel.getText();
	}
	
	
	public DashboardPage  VerifyLoginPage(String Username,String Pass) {
		
		userName.sendKeys(Username);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		Password.sendKeys(Pass);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		sumitbtn.click();
		
		return new DashboardPage();
	}
	
}
