package TestCasePages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.ElementWebTable;

public class ElementWebTable_TC1 {

	public static void main(String[] args) throws InterruptedException {		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
		ElementWebTable objWebTable = new ElementWebTable(driver);
		
		
		//Click on Add Button 
		
		objWebTable.ClickonAddButton();
		Thread.sleep(2000);
		
		
		//Fill The Data 
		
		objWebTable.EnterFirsname("Dinesh");
		Thread.sleep(1000);
		objWebTable.EnterLastname("patil");
		Thread.sleep(1000);
		objWebTable.EnterUserEmail("patildinesh2688@gmail.com");
		Thread.sleep(1000);
		objWebTable.EnterAge("34");
		Thread.sleep(1000);
		objWebTable.EnterSalary("50000");
		Thread.sleep(1000);
		objWebTable.EnterDepartment("Software  Engineer");
		Thread.sleep(1000);
		
		// Click on Submit Button 
		
		objWebTable.ClickonSubmitButton();
		Thread.sleep(2000);
		
		//Edit Current Record
		objWebTable.EditRecord();
		Thread.sleep(2000);
		
		//Edit Record & Changed Data 
		objWebTable.ClearFirstname();
		Thread.sleep(1000);
		objWebTable.EnterFirsname("Raj");
		Thread.sleep(1000);
		
		objWebTable.ClearLastname();
		Thread.sleep(1000);
		objWebTable.EnterLastname("Patil");
		Thread.sleep(1000);
		
		objWebTable.ClearUserEmail();
		Thread.sleep(1000);
		objWebTable.EnterUserEmail("testingForwebsiteall@gmail.com");
		Thread.sleep(1000);
		
		objWebTable.Clearage();
		Thread.sleep(1000);
		objWebTable.EnterAge("35");
		Thread.sleep(1000);
		
		objWebTable.Clearsalary();
		Thread.sleep(1000);
		objWebTable.EnterSalary("56000");
		Thread.sleep(1000);
		
		objWebTable.Cleardeprt();
		Thread.sleep(1000);
		objWebTable.EnterDepartment("Automatio Tester");
		Thread.sleep(1000);
		
		
		objWebTable.ClickonSubmitButton();
		Thread.sleep(1000);
		
		objWebTable.FirstnameBySorting();
		Thread.sleep(2000);
		objWebTable.LastnameBySorting();
		Thread.sleep(2000);
		objWebTable.AgebySorting();
		Thread.sleep(2000);
		objWebTable.EmailBySorting();
		Thread.sleep(2000);
		objWebTable.SalaryBySoring();
		Thread.sleep(2000);
		objWebTable.DepartmentBySorting();
		Thread.sleep(2000);
		
		driver.close();

	}

}
