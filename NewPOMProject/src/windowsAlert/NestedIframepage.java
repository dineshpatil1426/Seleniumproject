package windowsAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedIframepage {
	
	WebDriver driver;
	
	
	public NestedIframepage(WebDriver driver) {
		
		this.driver =driver;
	}

	
	
	
	
	public void ParentIframe()throws InterruptedException {
		
		
		int countIframeInpage = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames on a Page:" + countIframeInpage);
		
		try {
			
			Thread.sleep(1000);
			driver.switchTo().frame("frame1");
			WebElement ParentHeading =driver.findElement(By.xpath("/html/body"));
			String ParentText = ParentHeading.getText();
			System.out.println("This Parent IFrame Text Message ==>" + ParentText);
			
			
		} catch (Exception e) {
			
			System.out.println("Error in Parent Iframe ==> " + e);
		}
	}
	
	public void ChildIframe() throws InterruptedException {
		
		
		try {
			
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			WebElement ChildHeader =driver.findElement(By.xpath("/html/body/p"));
			String ChildText = ChildHeader.getText();
			System.out.println("This Child IFrame Text Message ==>" + ChildText);
			driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			
			System.out.println("Error in Child Iframe ==> " + e);
		}
		
	}
	
	public void driverclose(){
		
		try {
			
			driver.close();
			
		} catch (Exception e) {
			
			System.out.println("Driver Close Error ==> " + e);
		}
	}
}
