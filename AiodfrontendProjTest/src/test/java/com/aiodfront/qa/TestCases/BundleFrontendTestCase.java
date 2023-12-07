package com.aiodfront.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aiodfront.qa.base.TestBase;
import com.aiodfront.qa.pages.BundleDiscountFrontPage;
import com.aiodfront.qa.util.Testutil;

public class BundleFrontendTestCase extends TestBase {
			
	Testutil testuntil;
	BundleDiscountFrontPage bundleFrontend;
	
	
	public BundleFrontendTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		testuntil = new Testutil();
		bundleFrontend = new BundleDiscountFrontPage();
	}
	public void StorePasswordVerify()throws InterruptedException {
		Thread.sleep(2000);
		bundleFrontend.storePassword("City");
	}
	@Test(priority = 1)
	public void verifyhomePageTitle() throws InterruptedException {
		Thread.sleep(2000);
		StorePasswordVerify();
		String bundleHomepageTitle = bundleFrontend.verifyhomePageTitle();
		Assert.assertEquals(bundleHomepageTitle,"Dinesh Patil Tester");
		
		Thread.sleep(1000);
		bundleFrontend.GotoProductDetails();
		Thread.sleep(2000);
		bundleFrontend.PageScrollDownForMenu();
		bundleFrontend.bunleProductAddToCartFuncations();
		Thread.sleep(1000);
		bundleFrontend.GoToCartPage();
		Thread.sleep(2000);
		bundleFrontend.PageScrollDownForCartPage();
		Thread.sleep(2000);
		
		String Bundleoffer=bundleFrontend.CheckOffer1();
		Assert.assertEquals(Bundleoffer,"D's Bundle Discount-2");
		
		/*
		 boolean Flag=bundleFrontend.CheckBundleOffer();
		 Assert.assertTrue(Flag);
		 */
		
	}
	
	
	@AfterMethod
	public void CloseDriver() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
