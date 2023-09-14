package elementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import comman.Basic_Page;

public class Elements_WebTables extends Basic_Page {
	 
	//Open WebTable Panel
	public static void Open_WebTables_panel() throws InterruptedException {
		   
		   try {
			   
			    Thread.sleep(1000);
				driver.findElement(By.id("item-3")).click();
				System.out.println("WebTables Panel Open Successfully...!");
				Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
			   
	}
		
	// Add Personal Details Test Case
	public static void TC_Add_PersoDetail() throws InterruptedException  {
		
		 	try {
			
				// CLick on Add Button 
		        driver.findElement(By.id("addNewRecordButton")).click();
		        Thread.sleep(1000);
		        //Fill Registration Form
		        
		        WebElement txtFirstName = driver.findElement(By.id("firstName"));
		        txtFirstName.sendKeys("Dinesh");
		        Thread.sleep(1000);
		        WebElement txtLastName = driver.findElement(By.id("lastName"));
		        txtLastName.sendKeys("patil");
		        Thread.sleep(1000);
		        WebElement txtEmail = driver.findElement(By.id("userEmail"));
		        txtEmail.sendKeys("Test@gmail.com");
		        Thread.sleep(1000);
		        WebElement txtAge = driver.findElement(By.id("age"));
		        txtAge.sendKeys("32");
		        Thread.sleep(1000);
		        WebElement txtSalary = driver.findElement(By.id("salary"));
		        txtSalary.sendKeys("45000");
		        Thread.sleep(1000);
		        WebElement txtDepartment = driver.findElement(By.id("department"));
		        txtDepartment.sendKeys("Software Engineer");
		        Thread.sleep(1000);
		        WebElement btnsubmit =driver.findElement(By.id("submit"));
		        btnsubmit.click();
		        Thread.sleep(2000);
			
			        
		        System.out.println("Registration Form Submit Successfully...!");
	       
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
			
		}
		
	}
	
	// Update Person Details Test Case
	public static void TC_Update_PersoDetail()throws InterruptedException  {
		
		try {
			//Click on Edit Button
			driver.findElement(By.id("edit-record-4")).click();
			Thread.sleep(1000);
			// update Person Details 
			WebElement txtFirstName = driver.findElement(By.id("firstName"));
			txtFirstName.clear();
	        txtFirstName.sendKeys("Ankit");
	        Thread.sleep(1000);
	        WebElement txtLastName = driver.findElement(By.id("lastName"));
	        txtLastName.clear();
	        txtLastName.sendKeys("ghodadariya");
	        Thread.sleep(1000);
	        WebElement txtEmail = driver.findElement(By.id("userEmail"));
	        txtEmail.clear();
	        txtEmail.sendKeys("Ankit@gmail.com");
	        Thread.sleep(1000);
	        WebElement txtAge = driver.findElement(By.id("age"));
	        txtAge.clear();
	        txtAge.sendKeys("26");
	        Thread.sleep(1000);
	        WebElement txtSalary = driver.findElement(By.id("salary"));
	        txtSalary.clear();
	        txtSalary.sendKeys("40000");
	        Thread.sleep(1000);
	        WebElement txtDepartment = driver.findElement(By.id("department"));
	        txtDepartment.clear();
	        txtDepartment.sendKeys("Software Engineer");
	        Thread.sleep(1000);
	        WebElement btnsubmit =driver.findElement(By.id("submit"));
	        btnsubmit.click();
	        Thread.sleep(2000);
			
	        System.out.println("Registration Form Update Successfully...!");
	        
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
		
	}
	
	// Person Data delete Test Case
	public static void TC_Delete_PersoDetail() throws InterruptedException  {
		
		try {
			WebElement btndelete = driver.findElement(By.id("delete-record-4"));
			btndelete.click();
			
			Thread.sleep(2000);
			System.out.println("Porson Delete  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	}
	
	public static void TC_Serch_PersonRecord() throws InterruptedException {
	
		try {
			
			 WebElement txtSearch = driver.findElement(By.id("searchBox"));
			 txtSearch.sendKeys("Alden");
			 Thread.sleep(1000);
			 txtSearch.clear();
			 Thread.sleep(1000);
			 txtSearch.sendKeys("Vega"); 
			 txtSearch.clear();
			 Thread.sleep(1000);
			 txtSearch.sendKeys("29");
			 Thread.sleep(1000);
			 txtSearch.clear();
			 Thread.sleep(1000);
			 txtSearch.sendKeys("alden@example.com");
			 Thread.sleep(1000);
			 txtSearch.clear();
			 Thread.sleep(1000);
			 txtSearch.sendKeys("10000");
			 Thread.sleep(1000);
			 txtSearch.clear();
			 Thread.sleep(1000);
			 txtSearch.sendKeys("Legal");
			 Thread.sleep(1000);
			 txtSearch.clear();
			 Thread.sleep(1000);
			 
			 System.out.println(" All Field Search Successfully...!");
			 
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Elements_Textbox elmsTextbox = new Elements_Textbox();
		elmsTextbox.intit();
		elmsTextbox.ElementPageOpen();
		Open_WebTables_panel();
		TC_Add_PersoDetail();
		TC_Update_PersoDetail();
		TC_Delete_PersoDetail();
		TC_Serch_PersonRecord();	
		elmsTextbox.BrowserClose();
	}

}
