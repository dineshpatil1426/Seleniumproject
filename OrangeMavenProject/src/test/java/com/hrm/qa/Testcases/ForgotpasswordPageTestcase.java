package com.hrm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.Pages.ForgotPasswordPage;
import com.hrm.qa.Pages.LoginPage;
import com.hrm.qa.base.TestBase;

public class ForgotpasswordPageTestcase extends TestBase {
	
		LoginPage loginpage;
		ForgotPasswordPage forgotpasswordpage;
		
		
	
	
	public ForgotpasswordPageTestcase() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
			initialization();
			loginpage = new LoginPage();
			forgotpasswordpage = new ForgotPasswordPage();
			loginpage.ClickonForgorpasswordLink();
	}
	
	@Test(priority = 1)
	public void verifyforgotPasswordLabelTest() {
	 
	String forgotpasswordTitle =forgotpasswordpage.VerifyForgotPasswordLabel();
	Assert.assertEquals(forgotpasswordTitle, "Reset Password","Forgot Password Title is not Match");
		
	} 
	@Test(priority = 2)
	public void VerifyforgotpasswordTest() {
	 	
	 forgotpasswordpage =forgotpasswordpage.VerifyforgotpasswordUser(prop.getProperty("username"));	
	 
	 String forgotSuccessfully = forgotpasswordpage.VerifyResetSendMessage();
	 Assert.assertEquals(forgotSuccessfully, "Reset Password link sent successfully","successfully message is not Match");
	}
	@Test(priority = 3)
	public void ClickonCancelButton() {
		
	 loginpage= forgotpasswordpage.ClickOnCancelButton();
	}

	@AfterMethod
	public void Closebrowser() {
		driver.quit();
	}
}
