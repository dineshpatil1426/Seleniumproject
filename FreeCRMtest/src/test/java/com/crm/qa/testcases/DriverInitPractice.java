package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitPractice {

	// In oop , Singleton class is Class that can have only one object.(instance of
	// the
	// class)
	// How to Design Singleton Class.
	// 1. Make Constuctor is Private
	// 2. write Static method that has Return type of object of this Singleton
	// Class(Lazy Initialization).

	private static DriverInitPractice instanceDriver = null;

	private WebDriver driver;

	private DriverInitPractice() {

	}

	public WebDriver openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/macmini/Documents/Selenium new/selenium script/OrangeHRM/drivers/chromedriver");
		driver = new ChromeDriver();
		return driver;

	}

	public static DriverInitPractice getInstance() {

		if (instanceDriver == null) {
			instanceDriver = new DriverInitPractice();
		}
		return instanceDriver;
	}

}
