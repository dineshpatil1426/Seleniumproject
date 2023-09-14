package com.aiod.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aiod.qa.Pages.BundleDiscountPage;
import com.aiod.qa.base.TestBase;
import com.aiod.qa.util.Testutil;

public class BundleDiscountTestCase extends TestBase {
	
	Testutil testutil;
	BundleDiscountPage bundlepage;
	
	
	
	public BundleDiscountTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testutil = new Testutil();
		bundlepage = new BundleDiscountPage();
	}
	@Test(priority = 1)
	public void verifyhomePageTitle() {
		String bundlepageTitle = bundlepage.verifyhomePageTitle();
		Assert.assertEquals(bundlepageTitle,"Create your offer - All In One Automatic Discount - 8");
	}
	@Test(priority = 2)
	public void VerifyPanelTitle() {
		
		boolean Flag =bundlepage.VerifyPageLabel();
		Assert.assertTrue(Flag);
	}
	@Test(priority = 3)
	public void CreateBudleOffer() throws InterruptedException {
		
		bundlepage.SelectDiscountType("Test Bundle Discount", "75.15", "Test By team123 ", "TestbyTeam456");
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		bundlepage.StratDateSelection();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		bundlepage.EndDateSelection();
		bundlepage.PageScrollDownForMenu();
		
	}
	
	
	@AfterMethod
	public void closedriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
