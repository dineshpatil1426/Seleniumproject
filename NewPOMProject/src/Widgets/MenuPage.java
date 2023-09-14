package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {
	
	WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public void MousehoverOnMenu()throws InterruptedException {
		
		try {
			
			Actions MenuActions1 = new Actions(driver);
			WebElement MainMenu1 =driver.findElement(By.xpath("//a[text()='Main Item 1']"));
			MenuActions1.moveToElement(MainMenu1).perform();
			Thread.sleep(3000);
			
			Actions MenuActions2 = new Actions(driver);
			WebElement MainMenu2 =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
			MenuActions2.moveToElement(MainMenu2).perform();
			Thread.sleep(3000);
			
			Actions MenuActions3 = new Actions(driver);
			WebElement MainMenu3 =driver.findElement(By.xpath("//a[text()='Main Item 3']"));
			MenuActions3.moveToElement(MainMenu3).perform();
			Thread.sleep(3000);
			
			System.out.println("Pass : Main Menu Hover Successfully...!");
			
		} catch (Exception e) {
			
			System.out.println("Fail : Main Menu Hover UnSuccessfully...!" + e);
		}
		
	}
	
	
public void MousehoverOnSubMenu() throws InterruptedException {
	
	try {
		
		Actions MenuActions2 = new Actions(driver);
		WebElement MainMenu2 =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		MenuActions2.moveToElement(MainMenu2).perform();
		Thread.sleep(3000);
		
		Actions SubMenuActions1= new Actions(driver);
		WebElement Submenu1 =driver.findElement(By.xpath("//a[text()='Sub Item']"));
		SubMenuActions1.moveToElement(Submenu1).perform();
		Thread.sleep(3000);
		
		Actions SubMenuActions2= new Actions(driver);
		WebElement Submenu2 =driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		SubMenuActions2.moveToElement(Submenu2).perform();
		Thread.sleep(3000);
		
		Actions SubChildMenuActions1= new Actions(driver);
		WebElement SubChilmenu2 =driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		SubChildMenuActions1.moveToElement(SubChilmenu2).perform();
		Thread.sleep(3000);
		
		System.out.println("Pass : Sub Menu Hover Successfully...!");
	} catch (Exception e) {
		
		System.out.println("Fail : Sub Menu Hover UnSuccessfully...!" + e);	
	}
}
	
	public void driverclose() {
		
		driver.close();
	}
}
