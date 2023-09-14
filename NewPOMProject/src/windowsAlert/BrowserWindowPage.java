package windowsAlert;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowPage {
	
	WebDriver driver;
	
	
	public BrowserWindowPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By btnNewTab =By.id("tabButton");
	By btnNewWindow=By.id("windowButton");
	By btnNewwindowMsg = By.id("messageWindowButton");
	
	
	
	public void ClickonNewTab()throws InterruptedException {
		
		try {
			
			driver.findElement(btnNewTab).click();
			System.out.println("New Tab Click successfully ");
			Thread.sleep(2000);
			ArrayList<String> switchTabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(switchTabs.get(1));
			driver.close();
			driver.switchTo().window(switchTabs.get(0));
			
		} catch (Exception e) {
			
			System.out.println("New Tab Click Error ==> " + e);
		}
		
	}
	
	public void ClickOnNewWindow()throws InterruptedException {
		
		driver.findElement(btnNewWindow).click();
		System.out.println("New Window Click successfully ");
		
		try {
			
			ArrayList<String>SwitchNewWindow = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(SwitchNewWindow.get(1));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(SwitchNewWindow.get(0));
			System.out.println("New Window Handle successfully ");
			
		} catch (Exception e) {
			
			System.out.println("New Window Handle Error" + e);
		} 
		
		
	}
	public void ClickOnNewWindowMessage()throws InterruptedException {
		
		driver.findElement(btnNewwindowMsg).click();
		System.out.println("New Window Message Click successfully ");
		
		/* First Option to Close New Window
		try {
			ArrayList<String> switchnewwindowmessge = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(switchnewwindowmessge.get(1));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(switchnewwindowmessge.get(0));
			System.out.println("New Window Message Handle successfully ");
			
		} catch (Exception e) {
			
			System.out.println("New Window Message Handle Error" + e);
		}*/
		
		// Second option to Close Window via For Loop
		
		String HandleBefore =driver.getWindowHandle();
		Thread.sleep(2000);
		for(String winhandle : driver.getWindowHandles()) {
			
			driver.switchTo().window(winhandle);
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(HandleBefore);
		
		
	}
	 public void driveclose() {
		 
		 driver.close();
		
		 System.out.println("Browser Close successfully...! ");
	 }
	
	
}
