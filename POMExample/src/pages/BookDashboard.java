package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookDashboard {

	WebDriver driver;
	
	public BookDashboard(WebDriver driver) {
		
		this.driver =driver;
	}
	
	By heading=By.className("main-header");
	By BtnLogout=By.id("submit");
	
	public String GetHeading() {
		
		String head =driver.findElement(heading).getText();
		
		return head;
		
	}
	
	public void ClickLogout() {
		
		driver.findElement(BtnLogout).click();
	}
	
}
