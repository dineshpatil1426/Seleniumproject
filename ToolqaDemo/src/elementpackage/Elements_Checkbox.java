package elementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import comman.Basic_Page;

public class Elements_Checkbox extends Basic_Page {
	
	//open CheckboxPanel 
	public static void OpenCheckboxPanel() throws InterruptedException  {
      
		//Click on Checkboxpanel 
		try {
			
			Thread.sleep(1000);
			driver.findElement(By.id("item-1")).click();
			System.out.println("Checkbox Panel Open Successfully...!");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}
		
	}
	//Checkmark Main Checkbox
	public static void MainCheckbox() throws InterruptedException  {
		
		try {
		
			WebElement btnMaintoggle = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
			btnMaintoggle.click();
			Thread.sleep(1000);
			// Check Mark the main Checkbox
			WebElement chkMain =driver.findElement(By.className("rct-checkbox"));
			chkMain.click();
			System.out.println("Checkbox Checked  Successfully...!");
			Thread.sleep(1000);
			chkMain.click();
			Thread.sleep(2000);
			System.out.println("Checkbox UnChecked  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		} 		
		
	}
	
	public static void SubCheckBox() throws InterruptedException {
		
		try {
			
			WebElement btnsubtoggle1 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
			btnsubtoggle1.click();
			Thread.sleep(1000);
			WebElement btnsubtoggle2 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
			btnsubtoggle2.click();
			Thread.sleep(1000);
			WebElement btnsubtoggle3 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button"));
			btnsubtoggle3.click();
			Thread.sleep(1000);
			
			System.out.println("subCheckbox Open Successfully...!");
			Thread.sleep(1000);
			
			//Checkmark SubCheckboxs
			WebElement Chksub1 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]"));
			Chksub1.click();
			Thread.sleep(1000);
			
			WebElement Chksub2 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]"));
			Chksub2.click();
			Thread.sleep(1000);
			
			WebElement Chksub3 =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]"));
			Chksub3.click();
			Thread.sleep(1000);
			
			System.out.println("subCheckbox Checked Successfully...!");
			Thread.sleep(1000);
			
			// Check Mark the main Checkbox
			WebElement chkMain =driver.findElement(By.className("rct-checkbox"));
			chkMain.click();
			Thread.sleep(1000);
			System.out.println("Checkbox UnChecked  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
		}
	
	}	
	
	// Expand&CollapseAllcheckbox
	
	public static void Expand_Collapse_Button() throws InterruptedException {
		
		try {
			WebElement btnexpand =driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]"));
			btnexpand.click();
			Thread.sleep(1000);
			WebElement btnCollapse = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]"));
			btnCollapse.click();
			Thread.sleep(1000);
			
			System.out.println("Checkbox Expand & Collapse  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static void main(String[] args)throws InterruptedException   {
		
		Elements_Textbox eLmstextbox = new Elements_Textbox();
		
		eLmstextbox.intit();
		eLmstextbox.ElementPageOpen();	
		OpenCheckboxPanel();
		MainCheckbox();
		SubCheckBox();
		Expand_Collapse_Button();
		eLmstextbox.BrowserClose();

	}

}
