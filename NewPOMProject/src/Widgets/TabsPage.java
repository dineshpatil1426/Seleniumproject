package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabsPage {
	
	WebDriver driver;
	
	
	public TabsPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By btnTabOrginal = By.id("demo-tab-origin");
	By btnTabUse = By.id("demo-tab-use");
	By btnTabWhat = By.id("demo-tab-what");
	
	
	public void clickOnoriginTab() {
		
		driver.findElement(btnTabOrginal).click();
	}
	
	public void clickOnUseTab() {
		
		driver.findElement(btnTabUse).click();
	}
	
	public void clickOnWhatTab() {
	
	driver.findElement(btnTabWhat).click();
	}
	
	public void driverclose() {
		
		driver.close();
	}
}
