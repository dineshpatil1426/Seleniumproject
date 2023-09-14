package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePage {
	
	WebDriver driver;
	
	public SelectablePage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public void ListSelectTable()throws InterruptedException {
		
		try {
			
			WebElement SelectTableList1 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[1]"));
			SelectTableList1.click();
			Thread.sleep(1000);
			WebElement SelectTableList2 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[2]"));
			SelectTableList2.click();
			Thread.sleep(1000);
			WebElement SelectTableList3 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[3]"));
			SelectTableList3.click();
			Thread.sleep(1000);
			WebElement SelectTableList4 = driver.findElement(By.xpath("//*[@id=\"verticalListContainer\"]/li[4]"));
			SelectTableList4.click();
			Thread.sleep(1000);
			SelectTableList3.click();
			
			
			System.out.println("Pass : List Select Table  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println("Fail : List Select Table  UnSuccessfully ...!"+e);
		}
	}

	public void GridSelectTable()throws InterruptedException{
		
		try {
			
			WebElement gridTable = driver.findElement(By.id("demo-tab-grid"));
			gridTable.click();
			Thread.sleep(1000);
			
			WebElement SelectTableGrid1 = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[1]"));
			SelectTableGrid1.click();
			Thread.sleep(1000);
			WebElement SelectTableGrid3 = driver.findElement(By.xpath("//*[@id=\"row1\"]/li[3]"));
			SelectTableGrid3.click();
			Thread.sleep(1000);
			WebElement SelectTableGrid5 = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[2]"));
			SelectTableGrid5.click();
			Thread.sleep(1000);
			WebElement SelectTableGrid6 = driver.findElement(By.xpath("//*[@id=\"row2\"]/li[3]"));
			SelectTableGrid6.click();
			Thread.sleep(1000);
			WebElement SelectTableGrid8 = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[2]"));
			SelectTableGrid8.click();
			Thread.sleep(1000);
			WebElement SelectTableGrid9 = driver.findElement(By.xpath("//*[@id=\"row3\"]/li[3]"));
			SelectTableGrid9.click();
			Thread.sleep(1000);
			SelectTableGrid9.click();
			Thread.sleep(1000);
			SelectTableGrid5.click();
			
			
			System.out.println("Pass : Grid Select Table  Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Grid Select Table  UnSuccessfully ...!"+e);	
		}
	}
	
	public void driverClose() {
		driver.close();
	}
}
