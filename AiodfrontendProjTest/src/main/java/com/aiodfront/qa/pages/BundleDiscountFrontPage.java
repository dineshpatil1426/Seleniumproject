package com.aiodfront.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiodfront.qa.base.TestBase;

public class BundleDiscountFrontPage extends TestBase {
	
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
	@FindBy(xpath = "//*[@id=\"product-grid\"]/li[1]/div")
	WebElement ClickOnProduct;
	@FindBy(xpath = "//*[@id=\"shopify-section-template--15294275354789__main\"]/section/div[2]/div/div[3]/div[2]/div[2]/button")
	WebElement BundleAddToCartButton;	
	@FindBy(xpath = "/html/body/div[8]/div/div[1]/button")
	WebElement CloseminiCartbtn;
	@FindBy(xpath = "//*[@id=\"cart-icon-bubble\"]")
	WebElement CartIcon;
	@FindBy(xpath = "//*[@id=\"main-cart-footer\"]/div/div/div/div[1]/div[1]/p/span[1]/div/div[3]/div/div[1]/div/span[2]")
	WebElement bundleOffer;
	
	
	public BundleDiscountFrontPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void storePassword( String Storepws)throws InterruptedException {
		
		StorePassword.sendKeys(Storepws);
		StoreButton.click();
		Thread.sleep(2000);
		CloseButton.click();	
		}
	
	public String verifyhomePageTitle()  {
		
		return driver.getTitle();
	}
	
	public void GotoProductDetails() throws InterruptedException {
		
		Thread.sleep(2000);
		AllCategory.click();
		Thread.sleep(2000);
		ClickOnProduct.click();
	}
	
	public String CheckOffer1() {
		
		
		String DicountText=bundleOffer.getText();
		System.out.println("Dicount Offer Name :->"+ DicountText);
		return bundleOffer.getText();
	}
	
	public Boolean CheckBundleOffer() {
		
		return bundleOffer.isDisplayed(); 
	}
	
	public void PageScrollDownForMenu()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,4100)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	public void bunleProductAddToCartFuncations()throws InterruptedException {
		
			Thread.sleep(2000);
		    BundleAddToCartButton.click();
		    Thread.sleep(2000);
	}
	
	public void GoToCartPage() throws InterruptedException {
		
		CloseminiCartbtn.click();
		Thread.sleep(2000);
		PageScrollupForMenu();
		Thread.sleep(1000);
		CartIcon.click();	
	}
	
	public void PageScrollupForMenu()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,-100)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page Scrollup Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollUp is anyError...!");
		}
	}
	
	public void PageScrollDownForCartPage()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,500)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
}
