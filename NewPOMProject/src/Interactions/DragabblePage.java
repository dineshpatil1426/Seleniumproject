package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragabblePage {
	
	WebDriver driver;

	public DragabblePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void dragabbleSimple()throws InterruptedException {
		
	
		try {
			
			Actions ActionsSimple = new Actions(driver);
			
			WebElement dragBox = driver.findElement(By.id("dragBox"));
			
			ActionsSimple.dragAndDropBy(dragBox, 0, 200).perform();
			
			System.out.println("Pass : Simple dragabble  Successfully...! ");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Simple Draggable  UnSuccessfully ...!"+e);
			
		}
		
	}
	public void dragabbleAxisRestricted() throws InterruptedException {
		
		try {
			
			WebElement tabpPanelAxisRestricted = driver.findElement(By.id("draggableExample-tab-axisRestriction"));
			tabpPanelAxisRestricted.click();
			
			Thread.sleep(1000);
			
			Actions ActionsAxisRestricted = new Actions(driver);
			
			WebElement onlyX = driver.findElement(By.id("restrictedX"));
			WebElement OnlyY =driver.findElement(By.id("restrictedY"));
			
			ActionsAxisRestricted.dragAndDropBy(onlyX, 500, 0).perform();
			
			System.out.println("Pass : onlyX  dragabble Move   Successfully...! ");
			
			Thread.sleep(2000);
			
			ActionsAxisRestricted.dragAndDropBy(OnlyY, 0,200).perform();
			
			
		} catch (Exception e) {
			
			System.out.println("Fail : onlyX  dragabble Move  UnSuccessfully ...!"+e);
		}
	}
	
	public void dragabbleContainerRestricted()throws InterruptedException {
		
		try {
			
			WebElement tabPanelContainerRestricted =driver.findElement(By.id("draggableExample-tab-containerRestriction"));
			tabPanelContainerRestricted.click();
			
			Thread.sleep(1000);
			
			Actions ActionsContainerRestricted = new Actions(driver);
			
			WebElement containedBox =driver.findElement(By.xpath("//*[@id=\"containmentWrapper\"]/div"));
			
			ActionsContainerRestricted.dragAndDropBy(containedBox, 350, 60).perform();
			
			System.out.println("Pass : containment Wrapper   Successfully...! ");
			
			Thread.sleep(1000);
			
			WebElement containedBoxparent =driver.findElement(By.xpath("//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]/span"));
			
			ActionsContainerRestricted.dragAndDropBy(containedBoxparent, 50, 50).perform();
			
			System.out.println("Pass : containment parent Wrapper   Successfully...! ");
			
		} catch (Exception e) {
			
			System.out.println("Fail : containment Wrapper  UnSuccessfully ...!"+e);
		}
	}
	
	public void dragabbleCursorStyle()throws InterruptedException {
		
		try {
			
			
			
			Thread.sleep(2000);
			
			WebElement tabPanelCursorStyle =driver.findElement(By.id("draggableExample-tab-cursorStyle"));
			tabPanelCursorStyle.click();
			
			Thread.sleep(1000);
			
			Actions ActionsCursorStyle = new Actions(driver);
			
			WebElement cursorTopLeft =driver.findElement(By.id("cursorTopLeft"));
			
			ActionsCursorStyle.dragAndDropBy(cursorTopLeft, 100, 100).perform();
			
			System.out.println("Pass : cursor Top Left  Successfully...! ");
			
			
		} catch (Exception e) {
			
			System.out.println("Fail : cursor Top Left UnSuccessfully ...!"+e);
		}
	}
	
	public void driverClose() {
		driver.close();
	}
	
}
