package elementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import comman.Basic_Page;

public class Elements_RadioButton extends Basic_Page {
	
	

	   public static void Open_Radio_panel() throws InterruptedException {
		   
		   try {
			   
			   Thread.sleep(1000);
				driver.findElement(By.id("item-2")).click();
				System.out.println("Radio Button Panel Open Successfully...!");
				Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
			   
	}
	   
	   //  Select Radio Button
	   public static void Select_Radio_Button() throws InterruptedException {
		
		   try {
			   
			   
			   WebElement rdButton = driver.findElement(By.className("custom-control-label"));
			   rdButton.click();
			   
			   String SelectedTitle = rdButton.getText();
			   System.out.println("You have selected :=> " +SelectedTitle);
			   
			   Thread.sleep(1000);
			   WebElement rdButton1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
			   rdButton1.click();
			   
			   String SelectedTitle1 = rdButton1.getText();
			   System.out.println("You have selected :=> " +SelectedTitle1);
			      
			   
			   System.out.println("Radio Button Select Successfully...!");
			   Thread.sleep(1000);
			   
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException  {
		
			Elements_Textbox elmsTextbox = new Elements_Textbox();
			elmsTextbox.intit();
			elmsTextbox.ElementPageOpen();
			Open_Radio_panel();
			Select_Radio_Button();
			elmsTextbox.BrowserClose();
			   
	}

}
