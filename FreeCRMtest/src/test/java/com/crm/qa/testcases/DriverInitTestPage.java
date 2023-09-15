package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverInitTestPage {

	WebDriver driver;

	@BeforeMethod

	public void Setup() {

		DriverInitPractice instancedriver = DriverInitPractice.getInstance();
		driver = instancedriver.openBrowser();

	}
	@Test
	public void testmothod1() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit(); 
	}
}
