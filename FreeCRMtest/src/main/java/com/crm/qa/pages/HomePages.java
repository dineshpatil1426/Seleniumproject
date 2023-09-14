package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePages extends TestBase {

	
	@FindBy(xpath = "//td[contains(text(),'User: Dinesh Patil')]") 
	WebElement usernamelabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	//Initializing the Page Objects: 
	public HomePages() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomePageTitle() {
		
		return driver.getTitle();
	}
	
	
	public boolean verifyCorrectUserName() {
		
		return usernamelabel.isDisplayed(); 
	}

	public ContactsPage ClickonContactlink() {
		ContactLink.click();
		
		return new ContactsPage();
	}
	
	public DealsPage ClickOnDealslink() {
		DealsLink.click();
		
		return new DealsPage();
	}
	
	public TasksPage ClickonTaskslink() {
		 TasksLink.click();
		 
		 return new TasksPage();
	}
	
	public void NewContactlinks() {
	   Actions action = new Actions(driver);
	   action.moveToElement(ContactLink).build().perform();
	   newContactLink.click();
		
	}
	
	
}
