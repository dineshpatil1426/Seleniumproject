package WidgetsTestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Widgets.DatepickerPage;

public class Datepicker_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		
		DatepickerPage ObjDatepck = new DatepickerPage(driver);
		
		/*
		Thread.sleep(2000);
		ObjDatepck.Selectdate();
		Thread.sleep(2000);
		ObjDatepck.SelectYear("2001");
		Thread.sleep(2000);
		ObjDatepck.Selectmonth("july");
		Thread.sleep(2000);
		ObjDatepck.Selectday();
		*/
		
		ObjDatepck.SelectDateTime();
		Thread.sleep(2000);
		ObjDatepck.DateTimeYear();
		Thread.sleep(2000);
		ObjDatepck.DateTimeMonth();
		Thread.sleep(2000);
		ObjDatepck.DateTimeDays();
		Thread.sleep(5000);
		ObjDatepck.SelectTime();
		Thread.sleep(2000);
		ObjDatepck.driver();
		
		

	}

}
