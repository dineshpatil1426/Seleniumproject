package Elements;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;




public class LinksElement  {
	
	WebDriver driver;

	public LinksElement(WebDriver driver) {
		this.driver =driver;
	}
	
	By lnkHome = By.id("simpleLink");
	By lnkDynamicHome =By.id("dynamicLink");
	By lnkcreated =By.id("created");
	By lnkNocontent =By.id("no-content");
	By lnkmoved =By.id("moved");
	By lnkbadrequest =By.id("bad-request");
	By lnkunauthorized =By.id("unauthorized");
	By lnkforbidden =By.id("forbidden");
	By lnkinvalidurl =By.id("invalid-url");
	
	
	
	
	
	By lnkcreatedResponse =By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[10]");
	
	
	
	
	public void HomenewTablink() {
		
		driver.findElement(lnkHome).click();
	}
	
	public void dynamicHomelink()throws InterruptedException {
		
		driver.findElement(lnkDynamicHome).click();
		Thread.sleep(3000);
		
		try {
		     
			ArrayList<String> switchTabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(switchTabs.get(2));
			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(switchTabs.get(1));
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(switchTabs.get(0));
			
			System.out.println("Action Perform done..");
			
		} catch (Exception e) {
			
			System.out.println("Action Perform Error.." + e);
		}
		
	}
	
	public void Createdlink()throws InterruptedException  {
		
		//Scroll Down 
		try {
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        
        Thread.sleep(1000);	
        System.out.println("Current Page ScrollDown Successfully...!");
        
		} catch (Exception e) {
		
		System.out.println("Current Page ScrollDown is anyError...!");
		
		}
		Thread.sleep(1000);
		
		//Click on Link Button 
		
		driver.findElement(lnkcreated).click();
		//String CreatedResponseMsg =driver.findElement(lnkcreatedResponse).getText();
		//System.out.println("Created link  Response ==> " + CreatedResponseMsg);
	}
	
	public void NocontentLink() {
		
		driver.findElement(lnkNocontent).click();
	}
	public void Movedlink() {
		driver.findElement(lnkmoved).click();
	}
	public void badRequestlink() {
		
		driver.findElement(lnkbadrequest).click();
	}
	public void unauthorizedLink() {
		
		driver.findElement(lnkunauthorized).click();
	}
	public void forbiddenLink() {
		driver.findElement(lnkforbidden).click();
	}
	public void NotFoundLink() {
		driver.findElement(lnkinvalidurl).click();
	}
	
	
	public void Closedriver() {
		
		driver.close();
	}
}
