package com.aiodfront.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiodfront.qa.base.TestBase;

public class FreeGiftFrontEndPage extends TestBase {
	
	
	@FindBy(xpath ="/html/head/title")
	WebElement PageTitle;
	@FindBy(id="password")
	WebElement StorePassword;
	@FindBy(xpath = "/html/body/div/div[2]/div[2]/form/button")
	WebElement StoreButton;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/form/button")
	WebElement CloseButton;
	@FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[2]")
	WebElement AllCategory;
	@FindBy(xpath = "//*[@id=\"product-grid\"]/li[2]")
	WebElement ClickOnProduct;
	
	
	
	public FreeGiftFrontEndPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void StorePassword(String Strpassword) throws InterruptedException {
		
		StorePassword.sendKeys(Strpassword);
		StoreButton.click();
		Thread.sleep(2000);
		CloseButton.click();	
		
	}
	
	public String verifyhomePageTitle() {
		
		return driver.getTitle();
	}
	
	public void GotoProductdetails()throws InterruptedException {
		
		Thread.sleep(2000);
		AllCategory.click();
		Thread.sleep(2000);
		ClickOnProduct.click();
		
	}
	
	
	
}
