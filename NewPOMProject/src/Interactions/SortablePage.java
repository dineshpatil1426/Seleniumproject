package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SortablePage {

	WebDriver driver;
	
	public SortablePage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void ListSortableTapPanel()throws InterruptedException {
		
		try {
			
			WebElement tblSortable = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));
			WebElement tblSortable1 = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]"));
			WebElement tblSortable2 = driver.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]"));
		
			Actions actions = new Actions(driver);
			actions.dragAndDrop(tblSortable, tblSortable1).perform();
			
			Thread.sleep(2000);
			
			actions.dragAndDrop(tblSortable, tblSortable2).perform();
		
				
			System.out.println("Pass : Sortable Movement  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Sortable Movement UnSuccessfully ...!"+e);
		}
		
	}
	
	public void GridSortableTapPanel() {
		
		try {
			
			WebElement clickGrid = driver.findElement(By.id("demo-tab-grid"));
			clickGrid.click();
			Thread.sleep(1000);
			
			WebElement tblsorttableGrid =driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[1]"));
			WebElement tblsorttableGrid6 =driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[6]"));
			
			
			Actions actionsGrid = new Actions(driver);
			actionsGrid.dragAndDrop(tblsorttableGrid, tblsorttableGrid6).perform();
			
			Thread.sleep(2000);
			
			WebElement tblsorttableGrid4 =driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[4]"));
			WebElement tblsorttableGrid9 =driver.findElement(By.xpath("//*[@id=\"demo-tabpane-grid\"]/div/div/div[9]"));
		
			actionsGrid.dragAndDrop(tblsorttableGrid9, tblsorttableGrid4).perform();
		
			
			System.out.println("Pass : Sortable Grid Movement  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Sortable Grid  Movement UnSuccessfully ...!"+e);
		}
	}
	
	public void driverClose() {
		
		driver.close();
	}
}
