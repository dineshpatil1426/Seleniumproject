package com.crm.qa.pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.Testutil;

public class LoginPage extends TestBase {

	//Page Factory -OR
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignUpbtn;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	//Initializing the Page Objects: 
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions : 
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePages Login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		Loginbtn.click();
		
		return new HomePages();
	}
}
