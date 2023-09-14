package com.hrm.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.Pages.DashboardPage;
import com.hrm.qa.Pages.LoginPage;
import com.hrm.qa.Pages.UserManagementPage;
import com.hrm.qa.base.TestBase;
import com.hrm.qa.util.Testutil;

public class DashboardPageTestcase extends TestBase {
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	UserManagementPage userManagement;
	
	
	public DashboardPageTestcase()throws InterruptedException{
		super();
	}
	
	@BeforeMethod
	public void setup()  {
		initialization();
		loginpage = new LoginPage();
		dashboardpage = new DashboardPage();
		dashboardpage =loginpage.VerifyLoginPage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void DashboardLabelTest() throws InterruptedException {
		
		boolean Flag = dashboardpage.VerifyDashboardLabel();
		Thread.sleep(2000);
		Assert.assertTrue(Flag);
		
	}
	@Test(priority = 2)
	public void  ClickonAdminLinkTest()throws InterruptedException  {
		
		Thread.sleep(2000);
		userManagement= dashboardpage.ClickOnAdminlink();

	}
	
	@Test(priority = 3)
	public void  VerifyUserNameDropdown() throws InterruptedException {
		  
		  boolean FlagTrue = dashboardpage.VerifyUserdropdownName();
		  Thread.sleep(2000);
		  Assert.assertTrue(FlagTrue);
		
	}
	
	@Test(priority = 4)
	public void VerifyMainMenuButtonTest() throws InterruptedException {
		
		 driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		 dashboardpage =dashboardpage.VerifyMainMenuButton();
		 driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 dashboardpage=dashboardpage.VerifyMainMenuButton();
		 
	}
	@Test(priority = 5)
	public void VerifySearchTest() {
		
		dashboardpage.VerifySearchtext("Leave");
		String SearhingText= dashboardpage.VerifycompareText();
		Assert.assertEquals(SearhingText, "Leave"," Searching Text is Not Match ");
	}
	/*
	@Test(priority = 3)
	public void  ClickonAddButtonTest() {
		
		userManagement= dashboardpage.ClickOnAdminlink();
		userManagement= dashboardpage.ClickonAddbutton();
	}
	*/
	@AfterMethod
	public void Closebrowser() {
		driver.quit();
	}

}
