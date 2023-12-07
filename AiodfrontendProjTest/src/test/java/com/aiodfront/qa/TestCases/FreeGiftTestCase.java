package com.aiodfront.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aiodfront.qa.base.TestBase;
import com.aiodfront.qa.pages.FreeGiftFrontEndPage;
import com.aiodfront.qa.util.Testutil;

public class FreeGiftTestCase extends TestBase {
	
	Testutil tesuntil;
	FreeGiftFrontEndPage freegiftfront;
	
	
	public FreeGiftTestCase() {
		super();
	}

	
	@BeforeMethod
	public void Setup() {
		initialization();
		tesuntil = new Testutil();
		freegiftfront = new FreeGiftFrontEndPage();
	}
	@Test(priority = 1)
	public void verifyhomePageTitle() throws InterruptedException {
		Thread.sleep(2000);
		freegiftfront.StorePassword("city");
		String FrontEndHomePageTitle = freegiftfront.verifyhomePageTitle();
		Assert.assertEquals(FrontEndHomePageTitle, "Dinesh Patil Tester");
	}
	@Test(priority = 2)
	public void AddFreeGiftProduct()throws InterruptedException {
		
		Thread.sleep(2000);
		freegiftfront.StorePassword("city");
		Thread.sleep(2000);
		freegiftfront.GotoProductdetails();
		Thread.sleep(2000);
		
	}
	
	
	@AfterMethod
	public void CloseDriver()throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
