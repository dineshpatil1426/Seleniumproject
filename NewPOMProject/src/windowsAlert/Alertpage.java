package windowsAlert;





import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;

public class Alertpage {
	
	WebDriver driver;
	
	
	public Alertpage(WebDriver driver) {
		this.driver=driver;
	}

	
	By btnAlertButton =By.id("alertButton");
	By btntimerAlertButton =By.id("timerAlertButton");
	By btnconfirmButton = By.id("confirmButton");
	By btnpromtButton =By.id("promtButton");
	
	
	
	public void ClickAlertButton()throws InterruptedException {
		
		driver.findElement(btnAlertButton).click();
		Thread.sleep(3000);
		
		try {
			
			Alert simplealert = driver.switchTo().alert();
			simplealert.accept();
			
			//Two Way Option Coding
			/*
			Actions KeyAction = new Actions(driver);
			KeyAction.sendKeys(Keys.ESCAPE).build().perform();
			*/
			
		} catch (Exception e) {
		
			System.out.println("Alert  Error" + e);
		}
		
		
	}
	
	public void ClickTimeAlertButton()throws InterruptedException {
		
		driver.findElement(btntimerAlertButton).click();
		Thread.sleep(10000);
		
		try {
			
			Alert timealert =driver.switchTo().alert();
			timealert.accept();
			
			//Two Way Option Coding
			/*
			Actions TimeAlertAction = new Actions(driver);
			TimeAlertAction.sendKeys(Keys.ESCAPE).build().perform();
			*/
			
		} catch (Exception e) {
		
			System.out.println("Timer Alert Handle Error" + e);
		}
	}
	
	public void ClickconfirmButton()throws InterruptedException {
		
		driver.findElement(btnconfirmButton).click();
		Thread.sleep(2000);
		
		try {
			
			Alert confirmAlert =driver.switchTo().alert();
			confirmAlert.accept();
			
			//Two Way Option Logic
			/*
			Actions ConfirmButtonaction = new Actions(driver);
			ConfirmButtonaction.sendKeys(Keys.ENTER).build().perform();
			*/
			
		} catch (Exception e) {
			
			System.out.println("Confirm Button Handle Error" + e);
		}
	}
	public void clickpromtButton()throws InterruptedException {
		
		driver.findElement(btnpromtButton).click();
		Thread.sleep(1000);
		
		try {
			
			Alert PromtAlert =driver.switchTo().alert();
			String AlertText =PromtAlert.getText();
			System.out.println("Alert text is " + AlertText);
			PromtAlert.sendKeys("Dinesh Patil");
			Thread.sleep(2000);
			PromtAlert.accept();
			
		} catch (Exception e) {
			
			System.out.println(" Promt Button Handle Error" + e);
		}
		
	}
	
	public void driveclose() {
	
		try {
			
			driver.close();
			
		} catch (Exception e) {
			
			System.out.println("Close driver Error " + e);
		}
		
		
	}
	
	
	
}
