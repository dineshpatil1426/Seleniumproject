package com.aiod.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiod.qa.base.TestBase;

public class BundleDiscountPage extends TestBase {

	
	@FindBy(xpath = "//div[@class='lg-heading']")
	WebElement PageTitle;
	@FindBy(id = "title")
	WebElement bundleNameTitle;
	@FindBy(id = "discount_value")
	WebElement dicount;
	@FindBy(id = "short_description")
	WebElement shortdescription;
	@FindBy(id ="description")
	WebElement description;
	@FindBy(id="start_time")
	WebElement StartdateInput;
	@FindBy(xpath = "//td[@class='today day']")
	WebElement startDate;
	@FindBy(id="end_time")
	WebElement EnddateInput;
	@FindBy(xpath = "//td[@data-date='1685491200000']")
	WebElement Enddate;
	@FindBy(xpath = "//span[@class='Polaris-RadioButton']//input[@id='sales_channel-online-store']")
	WebElement OfferSalesChannel;
	
	public BundleDiscountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyhomePageTitle() {
		
		return driver.getTitle();
	}
	 public Boolean VerifyPageLabel() {
		 
		 return PageTitle.isDisplayed();
	 }
	 
	 public void SelectDiscountType(String bundletitle, String dicountvalue,String shortDesc,String desc ) {
		 
		 bundleNameTitle.sendKeys(bundletitle);
		 dicount.sendKeys(dicountvalue);
		 shortdescription.sendKeys(shortDesc);
		 description.sendKeys(desc);
	 }
	 
	 public void StratDateSelection() {
		 StartdateInput.click();
		 startDate.click();
	 }
	 
	 public void EndDateSelection() throws InterruptedException {
		 EnddateInput.click();
		 Enddate.click();
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE);
		 action.build().perform();
		 
	 }
	 public void PageScrollDownForMenu()throws InterruptedException {
			
			try {
	        	
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("window.scrollBy(0,200)");
	            
	            Thread.sleep(1000);	
	            System.out.println("Current Page ScrollDown Successfully...!");
	            
	            
			} catch (Exception e) {
				System.out.println("Current Page ScrollDown is anyError...!");
			}
		}
	 
	 public void OfferSaleChannelSelection() {
		 OfferSalesChannel.click();
	 }
}
