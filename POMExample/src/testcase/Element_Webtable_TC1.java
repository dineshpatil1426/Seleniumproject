package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ElementPages.Elements_WebTable;

public class Element_Webtable_TC1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cirklestudio/Downloads/BrowserDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");

		Elements_WebTable objwebtable = new Elements_WebTable(driver);
		
		//Click on Add Button
		objwebtable.ClickonAdd(); 
		Thread.sleep(2000);
		
		// Fill textbox Data 
		objwebtable.EnterFirstName("Dinesh");
		Thread.sleep(1000);
		objwebtable.EnterLastname("Patil");
		Thread.sleep(1000);
		objwebtable.EnterEmail("Test@gmail.com");
		Thread.sleep(1000);
		objwebtable.EnterAge("33");
		Thread.sleep(1000);
		objwebtable.EnterSalary("500000");
		Thread.sleep(1000);
		objwebtable.EnterDeparment("Software Engineer");
		Thread.sleep(1000);
		
		//Click on Submit button
		objwebtable.ClickonSubmit();
		Thread.sleep(5000);
		
		//Edit Current Record
		objwebtable.EditRecord();
		Thread.sleep(2000);
		
		//Edit Record & Changed Data 
		objwebtable.ClearFirstname();
		Thread.sleep(1000);
		objwebtable.EnterFirstName("Raj");
		Thread.sleep(1000);

		objwebtable.ClearLastname();
		Thread.sleep(1000);
		objwebtable.EnterLastname("Shah");
		Thread.sleep(1000);

		objwebtable.ClearUserEmail();
		Thread.sleep(1000);
		objwebtable.EnterEmail("RajShah@gmail.com");
		Thread.sleep(1000);
		
		objwebtable.Clearage();
		Thread.sleep(1000);
		objwebtable.EnterAge("35");
		Thread.sleep(1000);
		
		objwebtable.Clearsalary();
		Thread.sleep(1000);
		objwebtable.EnterSalary("600000");
		Thread.sleep(1000);
		
		objwebtable.Cleardeprt();
		Thread.sleep(1000);
		objwebtable.EnterDeparment("TV reporter");
		Thread.sleep(1000);
		
		
		objwebtable.ClickonSubmit();
		Thread.sleep(5000);

		
		// Check Search Funcationlity 
		objwebtable.EnterSearch("Raj");
		Thread.sleep(2000); 
		objwebtable.ClearSearchtext();
		Thread.sleep(3000);
		
		objwebtable.EnterSearch("Vega");
		Thread.sleep(2000);
		objwebtable.ClearSearchtext();
		Thread.sleep(3000);
		
		objwebtable.EnterSearch("kierra@example.com");
		Thread.sleep(2000);
		objwebtable.ClearSearchtext();
		Thread.sleep(3000);
		
		objwebtable.EnterSearch("60000");
		Thread.sleep(2000);
		objwebtable.ClearSearchtext();
		Thread.sleep(3000);
		
		objwebtable.EnterSearch("Insurance");
		Thread.sleep(2000);
		objwebtable.ClearSearchtext();
		Thread.sleep(3000);
		
		//Delete Action
		objwebtable.ClickDelete();
		Thread.sleep(3000);
		
		
		//Close the browser
		driver.close();
		
		
	}

}
