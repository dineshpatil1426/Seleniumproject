package windowsAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage {
	
	WebDriver driver;

	public IframePage(WebDriver driver) {
		
		this.driver =driver;
	}
	
		//Coding link
	 	// https://www.toolsqa.com/selenium-webdriver/handle-iframes-in-selenium/ 
	
	public void Scrolldown()throws InterruptedException {
		
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
	}
	
	public void ParentIframe()throws InterruptedException {
		
		try {
			Thread.sleep(2000);
			driver.switchTo().frame("frame1");
			WebElement frameHeading = driver.findElement(By.id("sampleHeading"));
			String Frame1Text = frameHeading.getText();
			System.out.println("This Parent IFrame Text Message ==>" + Frame1Text);
			driver.switchTo().defaultContent();
			
			
		} catch (Exception e) {
			System.out.println("Error in Parent Iframe ==> " + e);
		}
	}
	
	public void ChidIframe() throws InterruptedException {
		
		
		try {
			
			Thread.sleep(1000);
			driver.switchTo().frame("frame2");
			WebElement ChildFrameHeading =driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
			String ChildFrameText =ChildFrameHeading.getText();
			System.out.println("This Child IFrame Text Message ==> " + ChildFrameText);
			
		} catch (Exception e) {
			
			System.out.println("Error in Child Iframe ==> " + e);
		}
		
		
	}
	
    public void driverclose() {
    	
    	driver.close();
    }
}
