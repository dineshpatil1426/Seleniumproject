package com.hrm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.Pages.DashboardPage;
import com.hrm.qa.Pages.ForgotPasswordPage;
import com.hrm.qa.Pages.LoginPage;
import com.hrm.qa.base.TestBase;

public class LoginPageTestcase extends TestBase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	ForgotPasswordPage forgotpasswordPage;
	
	
	public LoginPageTestcase() {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void LoginPageTitleTest() {
		
	 String LoginTitle =loginpage.VerifyOrangeLoginTitle();
	 Assert.assertEquals(LoginTitle, "OrangeHRM","Login Page Title is not Match");
	}
	
	@Test(priority = 2)
	public void LoginPageLogoTest() {
		
		boolean Flag = loginpage.VerifyOrangepageLogo();
		Assert.assertTrue(Flag);
	}
	
	@Test(priority = 3)
	public void LoginLabelTest() {
		
		String LoginLabel =loginpage.VerifyLoginLabel();
		Assert.assertEquals(LoginLabel, "Login","Login Label is not Match");
	}
	@Test(priority = 4)
	public void ClickonforgotPassworTest() {
		
	 forgotpasswordPage =loginpage.ClickonForgorpasswordLink();
	}
	@Test(priority = 5)
	public void VerifyOrangeOSversionTest() {
		String osversionLabel = loginpage.VerifyorangeOSversionLabel();
		Assert.assertEquals(osversionLabel, "OrangeHRM OS 5.3","OrangeHRM OS version is not Match");
	}
	
	@Test(priority = 6)

	public void LoginTest()throws InterruptedException {
		
	dashboardpage=loginpage.VerifyLoginPage(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void Closebrowser() {
		driver.quit();
	}
}
