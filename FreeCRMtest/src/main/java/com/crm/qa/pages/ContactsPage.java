package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactLabel;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(name="client_lookup")
	WebElement companyname;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean VerifycontactLabel() {
		
		 return contactLabel.isDisplayed();
		
	}
	
	public void selectContactsByName(String name){
		 
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		//driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
		//		+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
	}
	
	public void CreateNewContact(String title,String ftname,String ltname,String CompanyName) {
		
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		firstName.sendKeys(ftname);
		lastname.sendKeys(ltname);
		companyname.sendKeys(CompanyName);
		saveBtn.click();
		
	}
}
