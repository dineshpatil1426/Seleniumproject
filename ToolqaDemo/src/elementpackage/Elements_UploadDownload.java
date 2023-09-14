package elementpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import comman.Basic_Page;

public class Elements_UploadDownload extends Basic_Page {

	  public static void Open_uploadDownload() throws InterruptedException {
		  
		  try {

		        Thread.sleep(1000);
		        
		        // Current Page  ScrollDown
		        try {
		        	
		            JavascriptExecutor jse = (JavascriptExecutor)driver;
		            jse.executeScript("window.scrollBy(0,400)");
		            
		            Thread.sleep(1000);	
		            System.out.println("Element Page ScrollDown Successfully...!");
		            
				} catch (Exception e) {
					
					System.out.println(e.getMessage());
					Thread.sleep(1000);
					
				}
		        
				
				WebElement btnLinkButtonPanel = driver.findElement(By.id("item-7"));
				btnLinkButtonPanel.click();
				System.out.println("Upload /Download  Panel is open..!");
				Thread.sleep(2000);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				Thread.sleep(2000);
			}
		  
	  }
	  
	  public static void VerifyFileUpload() throws InterruptedException {
		  
		try {
			
			WebElement AddFile =driver.findElement(By.id("uploadFile"));
			AddFile.sendKeys("/Users/cirklestudio/Downloads/sampleFile.jpeg");
			Thread.sleep(2000);
			if(driver.findElement(By.xpath("//*[@id=\"uploadedFilePath\"]")).isDisplayed())
			{
				
				
			}else {
				 
			}
			
			System.out.println(" File Upload Sucessfully");
	
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
		  
	}
	
	
	public static void main(String[] args)throws InterruptedException {
     
		Elements_Textbox elmtTextbox = new Elements_Textbox();
		
		 elmtTextbox.intit();
		 elmtTextbox.ElementPageOpen();
		 Open_uploadDownload();
		 VerifyFileUpload();
		 elmtTextbox.BrowserClose();

	}

}
