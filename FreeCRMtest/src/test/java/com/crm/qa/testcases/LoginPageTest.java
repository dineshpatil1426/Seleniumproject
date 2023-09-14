package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.HomePages;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePages  HomePages;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public 	void Setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginpageTitleTest() {
	 
		String Title =	loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(Title, "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority = 2)
	public void CRMLogoImageTest() {
    
		boolean flag=  loginpage.ValidateCRMImage();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority = 3)
	public void LoginTest() {
		
	HomePages =	loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
