package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AccordianPage {
	
	WebDriver driver;

	public AccordianPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By btnSection1 =By.id("section1Heading");
	By btnSection2 =By.id("section2Heading");
	By btnSection3 =By.id("section3Heading");
	
	
	public void Scrolldown()throws InterruptedException {
		
		//Scroll Down 
				try {
					
				JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("window.scrollBy(0,300)");
		        
		        Thread.sleep(1000);	
		        System.out.println("Current Page ScrollDown Successfully...!");
		        
				} catch (Exception e) {
				
				System.out.println("Current Page ScrollDown is anyError...!");
				
				}
				Thread.sleep(1000);
	}
	
	public void OneSectionHeading() {
		
		driver.findElement(btnSection1).click();
	}
	public void TwoSectionHeading() {
		
		driver.findElement(btnSection2).click();
	}
	
	public void ThreeSectionHeading() {
		
		driver.findElement(btnSection3).click();
	}
	
	public void driverClose() {
		
		try {
			
			driver.close();
		} catch (Exception e) {
			
			System.out.println("Driver Close Error ==> " + e);
		}
	}
}

