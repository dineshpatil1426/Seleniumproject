package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatepickerPage {

	WebDriver driver;
	
	
	public DatepickerPage(WebDriver driver) {
		
		this.driver=driver;
	}

	//select Date 
	
	By txtDatepicker =By.id("datePickerMonthYearInput");
	By drpYear =By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
	By drpMonth =By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
	By selectday=By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]");
	
	// Date & Time 
	
	By txtdateAndTimePickerInput =By.id("dateAndTimePickerInput");
	By drpDatepickerYear =By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div");
	By selectYear1 =By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[9]");
	
	By drpDatepickerMonth = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div");
	By selectMonth1 = By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]");
	
	By selectDatePickerday =By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]");
	By selectTime=By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[67]");
	
	public void Selectdate() {
		
		try {
			
			driver.findElement(txtDatepicker).click();
			System.out.println("Date Picker Selected..!");
			
		} catch (Exception e) {
			
			System.out.println("Date Picker selected Fail...!"+e);
		}
		
		
	}
	
	public void SelectYear(String year) {
		
		try {
			driver.findElement(drpYear).sendKeys(year);
			System.out.println("year Selection is Correct..!");
		} catch (Exception e) {
			System.out.println("Year Selection is wrong...!"+e);
		}
		
	}
	public void Selectmonth(String Month) {
		
		try {
			driver.findElement(drpMonth).sendKeys(Month);
			System.out.println("Month selection is correct...!");
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown Successfully...!"+e);
		}
		
		
	}
	
	public void Selectday() {
		
		try {
			driver.findElement(selectday).click();
			System.out.println("Day is selected...!");
		} catch (Exception e) {
			System.out.println("Day selection Error ...!" + e);
		}
		
	}
	
	public void SelectDateTime() {
		
		try {
			driver.findElement(txtdateAndTimePickerInput).click();
			System.out.println("Date&Time is selected...!");
		} catch (Exception e) {
			
			System.out.println("Date&time Error ...!"+e);
			
		}
	}
	
	public void DateTimeYear()throws InterruptedException {
	
		try {
			
			driver.findElement(drpDatepickerYear).click();
			Thread.sleep(1000);
			driver.findElement(selectYear1).click();
			
			System.out.println("Year is selected...!");
			
		} catch (Exception e) {
			
			System.out.println("Year is selected Error...!"+e);
		}
	}
	
	public void DateTimeMonth()throws InterruptedException {
		
		try {
			
		  	driver.findElement(drpDatepickerMonth).click();
		  	Thread.sleep(1000);
		  	driver.findElement(selectMonth1).click();
		} catch (Exception e) {
			System.out.println("Month selection Error...!"+e);
		}
	}
	public void DateTimeDays() {
		
		try {
			driver.findElement(selectDatePickerday).click();
		} catch (Exception e) {
			System.out.println("days selection Error...!"+e);
		}
	}
	
	public void SelectTime() {
		
		try {
			driver.findElement(selectTime).click();
		} catch (Exception e) {
			System.out.println("Timer selection Error...!"+e);
		}
	}
	
	public void driver() {
		
		try {
			driver.close();
			System.out.println("driver Close Successfully...!");
		} catch (Exception e) {
			System.out.println("Driver Close an Error...!"+e);
		}
		
		
	}
	
}


