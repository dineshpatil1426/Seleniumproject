package Interactions;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {
	
	WebDriver driver;

	public DroppablePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void droppableSimple() {
		
		try {	
			WebElement drgme = driver.findElement(By.id("draggable"));
			WebElement Drophere =driver.findElement(By.id("droppable"));
		 	WebElement droppedMgs =driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		    String strmessage = droppedMgs.getText(); //new String(droppedMgs.getText());
			
			Actions actionsdrgme = new Actions(driver);
			actionsdrgme.dragAndDrop(drgme, Drophere).perform();
			
			System.out.println("Pass : Simple droppable  Successfully...! Text is ==> " + strmessage);
			
		} catch (Exception e) {
			
			System.out.println("Fail : Simple droppable  UnSuccessfully ...!"+e);
			
		}
	}
	
	public void droppableAcceptable()throws InterruptedException {
		
		try {
			
			// Click on Accept Index Panel
			WebElement clickAccept = driver.findElement(By.id("droppableExample-tab-accept"));
			clickAccept.click();
		
			Thread.sleep(2000);
			Actions ActionsDroped = new Actions(driver);
			
			WebElement  AcceptableDrag = driver.findElement(By.id("acceptable"));
			//WebElement DrophereAccept =driver.findElement(By.id("droppable"));
			WebElement 	notAcceptableDrag=driver.findElement(By.id("notAcceptable"));
			
			
			/*
			int xOffset1=AcceptableDrag.getLocation().getX();
			int yOffset1=AcceptableDrag.getLocation().getY();
			System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);
			Thread.sleep(2000);
			
			//Secondly, get x and y offset for to object
			int xOffset = DrophereAccept.getLocation().getX();	
			int yOffset = DrophereAccept.getLocation().getY();
			System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
			Thread.sleep(2000);
			
			//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
			xOffset =(xOffset-xOffset1)+30;
			yOffset=(yOffset-yOffset1)+10;
			Thread.sleep(2000);
			
			//Perform dragAndDropBy 
			ActionsDroped.dragAndDropBy(AcceptableDrag, xOffset,yOffset).perform();
			*/
			
			
			ActionsDroped.dragAndDropBy(AcceptableDrag, 120, 150).perform();
			Thread.sleep(2000);
			ActionsDroped.dragAndDropBy(notAcceptableDrag, 250, 130).perform();
			
			
		    System.out.println("Pass : Simple droppable  Successfully...! "); //Text is ==> " + strmessage1);
		    
		} catch (Exception e) {
			
			System.out.println("Fail : Simple droppable  UnSuccessfully ...!"+e);
		}
	}
	
	
	public void droppblePrevent()throws InterruptedException {
		
		try {
			
			//Click on prevent Index Panel
			WebElement Clickprevent =driver.findElement(By.id("droppableExample-tab-preventPropogation"));
			Clickprevent.click();
			
			Thread.sleep(1000);
			WebElement Dragprevent=driver.findElement(By.id("dragBox"));
			WebElement Innerdroppable =driver.findElement(By.id("notGreedyInnerDropBox"));
			WebElement InnerdroppableGreedy=driver.findElement(By.id("greedyDropBoxInner"));
			
			Actions ActionPrevent = new Actions(driver);
			ActionPrevent.dragAndDrop(Dragprevent, Innerdroppable).perform();
			System.out.println("Pass : Prevent Inner droppable (not greedy)  Successfully...! ");
			
			Thread.sleep(2000);
			ActionPrevent.dragAndDrop(Dragprevent, InnerdroppableGreedy).perform();
			
			System.out.println("Pass : Prevent Inner droppable (greedy)  Successfully...! ");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Prevent droppable  UnSuccessfully ...!"+e);
		}
	}
	
	public void droppbleRevert()throws InterruptedException {
		
		
		 try {
			 
			 	//Click on Revert
				WebElement ClickRevert = driver.findElement(By.id("droppableExample-tab-revertable"));
				ClickRevert.click();
				
				Thread.sleep(1000);
				WebElement DragRevert =driver.findElement(By.id("revertable"));
				//WebElement droppedRevert =driver.findElement(By.id("droppable"));
				
				Actions ActionsRevert =new Actions(driver);
				ActionsRevert.dragAndDropBy(DragRevert, 100, 100).perform();
				
				System.out.println("Pass : Revert Draggable  Successfully...! ");
				
		} catch (Exception e) {
			
			System.out.println("Fail : Revert Draggable  UnSuccessfully ...!"+e);
		}
	}
	
	public void driverClose() {
		
		driver.close();
	}
}
