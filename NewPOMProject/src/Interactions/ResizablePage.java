package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ResizablePage {
	
	WebDriver driver;
	
	
	public ResizablePage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public void ResizableFixbox()throws InterruptedException  {
		
		
		WebElement resizeableElement = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
		resize(resizeableElement,150,90);
		
	}
	
	public void resizableNolimitbox()throws InterruptedException {
	
		WebElement resizeablenolimit =driver.findElement(By.xpath("//*[@id=\"resizable\"]/span"));
		resize(resizeablenolimit,250,90);
	}
	
	public void resize(WebElement elementToResize, int xOffset,int yOffset) {
		
		try {
			
			if(elementToResize.isDisplayed()) {
				Actions action = new Actions(driver);
				action.clickAndHold(elementToResize).moveByOffset(xOffset, yOffset).release().build().perform();
				System.out.println("Element was displayed to drag");
			}else {
				System.out.println("Element was not displayed to drag");
			}
			
		} catch (StaleElementReferenceException e) {
			
			System.out.println("Element with " + elementToResize + "is not attached to the page document "  + e.getStackTrace());
		}catch (NoSuchElementException e) {
			
			System.out.println("Element " + elementToResize + " was not found in DOM " + e.getStackTrace());
		}catch (Exception e) {
			
			System.out.println("Unable to resize" + elementToResize + " - " + e.getStackTrace());
		}
	}
	
	public void driverclose() {
		driver.close();
	}
}
