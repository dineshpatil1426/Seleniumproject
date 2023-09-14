package elementpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import comman.Basic_Page;

public class Elements_ButtonClicks extends Basic_Page  {
	
	//Open Button Panel 
	public static void Open_Button_panel() throws InterruptedException {

		try {
			
			WebElement btnButtonPanel = driver.findElement(By.id("item-4"));	
			btnButtonPanel.click();
			System.out.println("Button Panel is Open");
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
		}
	}
	
	// Buttons Double CLicks Test case
	public static void Button_Double_Click() throws InterruptedException {
		
		try {
			
			//Double Click on Button
			 
			Actions DoubleClickACtion = new Actions(driver);
			WebElement btnDoubleClcik = driver.findElement(By.id("doubleClickBtn"));
			DoubleClickACtion.doubleClick(btnDoubleClcik).perform();
			System.out.println("Button is Double Click");
			Thread.sleep(1000);
			
			//Get Message Text of Double Click
			 WebElement GetTxtMessage= driver.findElement(By.id("doubleClickMessage"));
			 String DoubleClickmessage = GetTxtMessage.getText();
			 
			 System.out.println("Double Click Message is:=>" + DoubleClickmessage);
			 
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
		
	}

	// Buttons Right CLicks Test case
	public static void Button_Right_Click() throws InterruptedException {
		
		try {
			
			Actions RightClickACtion = new Actions(driver);
			WebElement btnRightClcik = driver.findElement(By.id("rightClickBtn"));
			RightClickACtion.contextClick(btnRightClcik).perform();
			System.out.println("Button is Right Click");
			Thread.sleep(1000);
			
			//Get Message Text of Right Click
			 WebElement GetTxtMessage= driver.findElement(By.id("rightClickMessage"));
			 String RightClickmessage = GetTxtMessage.getText();
			 
			 System.out.println("Right Click Message is:=>" + RightClickmessage);
			 
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	}

	
	// Button Single Click Test Case
	public static void Button_Single_Click() throws InterruptedException {

		try {
			
			Thread.sleep(2000);
			Actions SingleClickAction = new Actions(driver);
			WebElement btnSingleClcik = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
		    SingleClickAction.click(btnSingleClcik).perform();
			
			System.out.println("Button is Single Click");
			Thread.sleep(1000);
			
			////*[@id="74I0m"]
			
			//Get Message Text of Single Click
			 WebElement GetTxtMessage= driver.findElement(By.id("dynamicClickMessage"));
			 String SingleClickmessage = GetTxtMessage.getText();
			 
			 System.out.println("Single Click Message is:=>" + SingleClickmessage);
			 
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Elements_Textbox elmsTextbox = new Elements_Textbox();
		elmsTextbox.intit();
		elmsTextbox.ElementPageOpen();
		Open_Button_panel();
		Button_Double_Click();
		Button_Right_Click();
		Button_Single_Click();
		elmsTextbox.BrowserClose();

	}

}
