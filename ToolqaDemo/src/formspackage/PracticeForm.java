package formspackage;


import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import comman.Basic_Page;
import elementpackage.Elements_Textbox;


public class PracticeForm extends Basic_Page  {

	
			// Open the Element Page
		 public  void FormPageOpen() throws InterruptedException {
			
			 try {
				
				// Click the Element Panel 
				 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]")).click();
				 Thread.sleep(1000);
				 System.out.println("Form Panel Open Successfully...!");
				 Thread.sleep(2000);
				 
				} catch (Exception e) {
			
				System.out.println(e.getMessage());
				Thread.sleep(2000);
				}
			 
		 	}
		 
		 	// Practice form panel open 
		 public  void OpenPracticeformPanel() throws InterruptedException {
		
		 		try {
		 			
		 			 Thread.sleep(1000);
		 			 WebElement SubpanelForm = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));
		 			 SubpanelForm.click();
		 				
		 			Thread.sleep(1000);
		 			System.out.println(" Practice form Panel Open Successfully...!");
		 			Thread.sleep(1000);
				
		 		} catch (Exception e) {
				
		 			System.out.println(e.getMessage());
		 			Thread.sleep(1000);
		 		}
		 	}
		 
		 // Fill Student Registration Form
		public  void Fill_Registration_Form() throws InterruptedException {
			
			  try {
				  
				  Thread.sleep(1000);
				  WebElement txtFirstname=driver.findElement(By.id("firstName"));
				  txtFirstname.sendKeys("Dinesh");
				  Thread.sleep(1000);
				  WebElement txtLastname=driver.findElement(By.id("lastName"));
				  txtLastname.sendKeys("patil");
				  Thread.sleep(1000);
				  WebElement txtEmail=driver.findElement(By.id("userEmail"));
				  txtEmail.sendKeys("Test@gmail.com");
				  Thread.sleep(2000);
		
				  WebElement rbGender=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
				  boolean select =rbGender.isDisplayed();
				  System.out.print(select);
				  
				  if(select==true){
					  
					 rbGender.click(); 
				  }
				  
				  Thread.sleep(1000);
				  WebElement txtMobile=driver.findElement(By.id("userNumber"));
				  txtMobile.sendKeys("7984135129");
				  Thread.sleep(1000);
				  // Datepicker Funcations
				  datePicker();
				  System.out.println(" Test 123");
				  WebElement txtsubject =driver.findElement(By.xpath("//*[@id=\"subjectsWrapper\"]/div[2]"));
				  txtsubject.sendKeys("Computer Science");
				  Thread.sleep(1000);
				  
				  
				  WebElement chkHobbies =driver.findElement(By.id("hobbies-checkbox-1"));
				  chkHobbies.click();
				  Thread.sleep(1000);
				  WebElement AddIamge =driver.findElement(By.id("uploadPicture"));
				  AddIamge.sendKeys("/Users/cirklestudio/Downloads/sampleFile.jpeg");
				  Thread.sleep(2000);
				  WebElement txtcurrentAddress =driver.findElement(By.id("currentAddress"));
				  txtcurrentAddress.sendKeys("168 krishna kunj society");
				  Thread.sleep(1000);
				  WebElement drlstate=driver.findElement(By.id("state"));
				  drlstate.click();
				  Thread.sleep(1000);
				  
				  
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		} 
		
		// Date Picker Selection 	
		public  void datePicker() throws InterruptedException {
			
			 // Current Page  ScrollDown
	        try {
	        	
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("window.scrollBy(0,200)");
	            
	            Thread.sleep(1000);	
	            System.out.println("Current Page ScrollDown Successfully...!");
	            
			} catch (Exception e) {
				
				System.out.println("Current Page ScrollDown is anyError...!");
				
			}
	        Thread.sleep(1000);  
			
			try {
				
				  WebElement txtDateofbirth =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div/div"));	
				  txtDateofbirth.click();
				  Thread.sleep(1000);
				  WebElement drlyear =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
				  drlyear.sendKeys("1988");
				  Thread.sleep(1000);
				  WebElement drlmonth =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
				  drlmonth.sendKeys("July");
				  Thread.sleep(10000);
				  
				  WebElement sldya = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"));
				  Actions action= new Actions(driver);
				  action.moveToElement(sldya).click().build().perform();
				  Thread.sleep(2000);
				  WebElement getDateofbirth =driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
				  String birthdate = getDateofbirth.getText();
				  System.out.println("selection Date is : " +birthdate);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		 
	   public static void main(String[] args) throws InterruptedException {
		 
		Elements_Textbox elmtTextbox = new Elements_Textbox();
		PracticeForm prtForm = new PracticeForm();
		
			elmtTextbox.intit();
		    prtForm.FormPageOpen();
		    prtForm.OpenPracticeformPanel();
		   // prtForm.datePicker();
		    prtForm.Fill_Registration_Form();
			elmtTextbox.BrowserClose();

	}

}
