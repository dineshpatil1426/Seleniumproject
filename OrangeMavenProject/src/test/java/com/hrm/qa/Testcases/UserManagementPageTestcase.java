package com.hrm.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.Pages.DashboardPage;
import com.hrm.qa.Pages.LoginPage;
import com.hrm.qa.Pages.UserManagementPage;
import com.hrm.qa.base.TestBase;

public class UserManagementPageTestcase extends TestBase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	UserManagementPage userManagementpage;
	DashboardPageTestcase dashboardPageTestcase; 
	
	public UserManagementPageTestcase() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		loginpage = new LoginPage();
		dashboardpage = new DashboardPage();
		dashboardpage=loginpage.VerifyLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		userManagementpage=dashboardpage.ClickOnAdminlink();
		userManagementpage=dashboardpage.ClickonAddbutton();
		
	}
	@Test(priority = 1)
	public void VerifyAddUserLabelTest() {
		String AddUserLabel =userManagementpage.VerifyAddUserLabel();
		Assert.assertEquals(AddUserLabel,"Add User","Add User label is not Match");
	}
	
	@AfterMethod
	public void Closedriver() {
		driver.quit();
	}
	
}
