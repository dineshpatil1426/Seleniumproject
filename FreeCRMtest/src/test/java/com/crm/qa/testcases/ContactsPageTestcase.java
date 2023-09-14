package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePages;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Testutil;

public class ContactsPageTestcase extends TestBase {
	
	LoginPage loginpage;
	HomePages  HomePages;
	Testutil   testutil;
	ContactsPage contactPage;
	
	String SheetName ="Contact";
	
	public ContactsPageTestcase() {
		super();
	}

	@BeforeMethod
	public 	void Setup() {
		initialization();
		testutil = new Testutil();
		contactPage = new ContactsPage();
		loginpage = new LoginPage();
		HomePages =loginpage.Login(prop.getProperty("username"), prop.getProperty("password")); 
		testutil.SwitchtoFrame();
		contactPage=HomePages.ClickonContactlink();
	}
	
	@Test(priority = 1)
	public void VerifyContanctPageLabel() {
		
		boolean ContactLabelFlag=contactPage.VerifycontactLabel();
		Assert.assertTrue(ContactLabelFlag," Contact Label is Missing on the Page");
	}
	
	@Test(priority = 2)
	public void SelectSingleContactsTest() {
		contactPage.selectContactsByName("Test1 test1");
	}
	
	@Test(priority = 3)
	public void SelectMultipleContactsTest() {
		
		contactPage.selectContactsByName("Test1 test1");
		contactPage.selectContactsByName("Test2 Test2");
	}
	
	@DataProvider
	public Object[][] GetCRMTestdata() {
		Object data[][]=Testutil.GetTestdata(SheetName);
		return data;
	}
	
	@Test(priority = 4,dataProvider="GetCRMTestdata")
	public void ValidateCreateNewContact(String Title,String Firsname,String LastName,String Company) {
		HomePages.NewContactlinks();
		//contactPage.CreateNewContact("Mr.", "Tom", "Peter", "Google");
		contactPage.CreateNewContact(Title, Firsname, LastName, Company);
	}
	
	
	@AfterMethod
	public void CloseDriver() {
		driver.quit();
	}
	
}
