package elementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import comman.Basic_Page;

public class Elements_Textbox extends Basic_Page {
	
	
	public  void intit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cirklestudio/Downloads/BrowserDrivers/chromedriver");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(1000);
       
        String titile = driver.getTitle();
        System.out.println("The page title is : " +titile);
        
        System.out.println("Website is opened successfully...!");
        
        Thread.sleep(1000);
        
        // Current Page  ScrollDown
        try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,400)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
		} catch (Exception e) {
			
			System.out.println("Current Page ScrollDown is anyError...!");
			
		}
        Thread.sleep(1000);
		
	}
	
	// Open the Element Page
	 public  void ElementPageOpen() throws InterruptedException {
		
		try {
			
			// Click the Element Panel 
			 driver.findElement(By.className("card-up")).click();
			 Thread.sleep(1000);
			 System.out.println("Element Panel Open Successfully...!");
			 Thread.sleep(1000);
			
		} catch (Exception e) {
		
			System.out.println("Error In Element Panel...!");
			Thread.sleep(1000);
		}
		 
	}
	 
	 //Texbox panel open 
	 public void OpenTextboxPanel() throws InterruptedException {
	
		 try {
			 
			 driver.findElement(By.id("item-0")).click();
			 Thread.sleep(2000);
			 System.out.println("Textbox Panel Open Successfully...!");
			 Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
		}
		 
		 
		 
	 }
	 //Fill Textboxs Data & Submit 
	 
	 public  void FillTextboxData() throws InterruptedException  {
		 
		try {
		
			WebElement TxtFullname = driver.findElement(By.id("userName"));
			TxtFullname.sendKeys("Dinesh Haribhai patil");
			Thread.sleep(1000);
			WebElement TxtEmail = driver.findElement(By.id("userEmail"));
			TxtEmail.sendKeys("Testingforoftmail@gmail.com");
			Thread.sleep(1000);
            WebElement TxtCurrentAddress = driver.findElement(By.id("currentAddress"));
            TxtCurrentAddress.sendKeys("168 krishna kunj society dindoli surat ");
            Thread.sleep(1000);
            WebElement txtParmentAddress = driver.findElement(By.id("permanentAddress"));
            txtParmentAddress.sendKeys("Sarvoday Nagar near Sarthak Hospital Stattion Road");
            Thread.sleep(1000);
            WebElement BtnSubmit = driver.findElement(By.id("submit"));
            BtnSubmit.click();
            
            System.out.println("Form Submit Successfully...!");
            Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println("Form Submit Error...!");
			Thread.sleep(1000);
		}
	}
	
	
	// Browser Close Method
	public void BrowserClose(){
		
		driver.close();
		
	}

	/*
	public static void main(String[] args) throws InterruptedException {
		
		intit();
		ElementPageOpen();
		FillTextboxData();	

	}
	*/

}
