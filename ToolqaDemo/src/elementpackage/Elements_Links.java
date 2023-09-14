package elementpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import comman.Basic_Page;

public class Elements_Links extends Basic_Page {
	
	
	//Open Links Panel 
	public static void Open_Link_Panel() throws InterruptedException {
	
		try {
			
			WebElement btnLinkButtonPanel = driver.findElement(By.id("item-5"));
			btnLinkButtonPanel.click();
			System.out.println("Link Panel is open..!");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	}
	
	//Simple link , It's open new Tab
   public static void Simple_Link() throws InterruptedException {
	
	   try {
		   
	 	 WebElement lnkbutton = driver.findElement(By.id("simpleLink"));
	 	 lnkbutton.click();
	 	 Thread.sleep(2000);
	 	 System.out.println("Link is open  New Tab..!");
	 	 Thread.sleep(1000);
	 	 
	 	 //https://riptutorial.com/selenium-webdriver/example/27211/closing-the-current-browser-window
	 	 // New Tab Tab Close Coding 
	 	 Set<String> handlesSet = driver.getWindowHandles();
	 	 List<String> handlesList = new ArrayList<String>(handlesSet);
	 	 driver.switchTo().window(handlesList.get(1));
	 	 driver.close();
	 	 driver.switchTo().window(handlesList.get(0));
	 	 
	 	 Thread.sleep(2000);
	   
	   } catch (Exception e) {
		
		System.out.println(e.getMessage());
		Thread.sleep(2000);
	   }
  }
   
   public static void Dynamic_Link() throws InterruptedException {
		
	   try {
		   
	 	 WebElement lnkbutton = driver.findElement(By.id("dynamicLink"));
	 	 lnkbutton.click();
	 	 System.out.println("Dynamic Link is open New Tab..!");
	 	 Thread.sleep(2000);
	 	 String GetlnkbtnText = lnkbutton.getText();
	 	 System.out.println("Dynamic Link Name is :=> " +GetlnkbtnText); 
	 	 
	 	 Thread.sleep(1000);
	 	 
	 	  //https://riptutorial.com/selenium-webdriver/example/27211/closing-the-current-browser-window
	 	 // New Tab Tab Close Coding 
	 	 
		 Set<String> handlesSet = driver.getWindowHandles();
	     List<String> handlesList = new ArrayList<String>(handlesSet);
	     driver.switchTo().window(handlesList.get(1));
	     driver.close();
	     driver.switchTo().window(handlesList.get(0));
	 	 Thread.sleep(2000);
	 	 
	 	 
	   } catch (Exception e) {
		
		System.out.println(e.getMessage());
		Thread.sleep(2000);
	   }
  }

   //Following links will send an api call
   public static void All_linkCall() throws InterruptedException {
	   
	   	try {
	   		
	   		 WebElement lnkCreated = driver.findElement(By.id("created"));
		 	 lnkCreated.click();
		 	 Thread.sleep(1000);
		 	 WebElement GetStatusCodeMsg=driver.findElement(By.xpath("//*[@id=\"linkResponse\"]"));
		 	 String GetCreatedText = GetStatusCodeMsg.getText();
		     System.out.println("Link has responded is :=> " +GetCreatedText); 
		 	 Thread.sleep(1000);
		 	 
		 	 
		 	 WebElement lnkNocontent = driver.findElement(By.id("no-content"));
		 	 lnkNocontent.click();	
		 	 Thread.sleep(1000);
		 	 String GetNocontentText = GetStatusCodeMsg.getText();
		 	 System.out.println("Link has responded is :=> " +GetNocontentText); 
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement lnkmoved = driver.findElement(By.id("moved"));
		 	 lnkmoved.click();
		 	 Thread.sleep(1000);
		 	 String GetmovedText = GetStatusCodeMsg.getText();
		 	 System.out.println("Link has responded is  :=> " +GetmovedText); 
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement lnkBadRequest = driver.findElement(By.id("bad-request"));
		 	 lnkBadRequest.click();
		 	 Thread.sleep(1000);
			 String GetBadRequestText = GetStatusCodeMsg.getText();
			 System.out.println("Link has responded is :=> " +GetBadRequestText); 
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement lnkUnauthorized = driver.findElement(By.id("unauthorized"));
		 	 lnkUnauthorized.click();
		 	 Thread.sleep(1000);
		 	 String GetUnauthorizedText = GetStatusCodeMsg.getText();
		 	 System.out.println("Link has responded is :=> " +GetUnauthorizedText); 
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement lnkForbidden = driver.findElement(By.id("forbidden"));
		 	 lnkForbidden.click();
		 	 Thread.sleep(1000);
		 	 String GetForbiddenText = GetStatusCodeMsg.getText();
		 	 System.out.println("Link has responded is :=> " +GetForbiddenText); 
		 	 Thread.sleep(1000);
		 	 
		 	 WebElement lnkNotFound = driver.findElement(By.id("invalid-url"));
		 	 lnkNotFound.click();
		 	 Thread.sleep(1000);
		 	 String GetNotFoundText = GetStatusCodeMsg.getText();
		 	 System.out.println("Link has responded is :=> " +GetNotFoundText); 
		 	 Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	   
   }
   
	public static void main(String[] args) throws InterruptedException {
	
		 Elements_Textbox elmtTextbox = new Elements_Textbox();
		 elmtTextbox.intit();
		 elmtTextbox.ElementPageOpen();
		 Open_Link_Panel();
		 Simple_Link();
		 Dynamic_Link();
		 All_linkCall();
		 elmtTextbox.BrowserClose();

	}

}
