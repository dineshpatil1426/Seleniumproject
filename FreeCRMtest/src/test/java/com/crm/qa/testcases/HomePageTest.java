package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePages;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Testutil;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePages  HomePages;
	Testutil   testutil;
	ContactsPage contactPage;
	
	public HomePageTest() {
		super();
	}
	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public 	void Setup() {
		initialization();
		testutil = new Testutil();
		contactPage = new ContactsPage();
		loginpage = new LoginPage();
		HomePages =loginpage.Login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	@Test(priority = 1)
	public void VerifyHomePagetitleTest() {
		
		String HomePageTitle =HomePages.verifyhomePageTitle();
		Assert.assertEquals(HomePageTitle, "CRMPRO","Home Page Title not match");
		
	}
	
	@Test(priority = 2)
	public void VerifyUserNameLabelTest() {
		testutil.SwitchtoFrame();
		boolean Flag = HomePages.verifyCorrectUserName();
		Assert.assertTrue(Flag);
		
	}
	
	@Test(priority = 3)
	public void verifyContactsLinkTest() {
		testutil.SwitchtoFrame();
		contactPage=HomePages.ClickonContactlink();
	}
	
	@AfterMethod
	public void CloseDriver() {
		driver.quit();
	}
}
