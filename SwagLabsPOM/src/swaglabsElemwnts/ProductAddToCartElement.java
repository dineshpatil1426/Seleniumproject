package swaglabsElemwnts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductAddToCartElement  {
	
	WebDriver driver;
	
	
	public ProductAddToCartElement(WebDriver driver) {
		this.driver=driver;
	}

	//Filter the Product
	
	By Frtfilter =By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span");
	By FilterZtoA =By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
	By FilterLowTohigh =By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]");
	By filterHighToLow =By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]");
	By FilterAtoZ =By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]");
	
	// Product AddTocart
	By btnAddtoCart =By.id("add-to-cart-sauce-labs-backpack");
	By btnRighAddtocart =By.id("add-to-cart-sauce-labs-bike-light");
	
	// Click on Minicart icon
	By btnMinicart =By.id("shopping_cart_container");
	
	// Checkout Path 
	By btnCheckout =By.id("checkout");
	
	//Checkout details
	By txtFirstname =By.id("first-name");
	By txtLastname =By.id("last-name");
	By txtZipCode =By.id("postal-code");
	By btncontinue =By.id("continue");
	
	//Get Finish Button
	By btnFinish =By.id("finish");
	
	By ordMessage=By.xpath("//*[@id=\"checkout_complete_container\"]/h2");
	
	
	
	
	// Filter Apply Function 
	
	public void SelectFilter() {
		
		driver.findElement(Frtfilter).click();
	}
	
	public void SelectZtoAFilter() {
		
		driver.findElement(FilterZtoA).click();
	}
	public void SelectLowTohigh() {
		driver.findElement(FilterLowTohigh).click();
	}
	
	public void SelecthighToLow() {
		driver.findElement(filterHighToLow).click();
	}
	public void SelectAtoZ() {
		driver.findElement(FilterAtoZ).click();
	}
		
	
	
	//Add To cart Functions
	
	public void ClickOnAddtocart() {
		 
		driver.findElement(btnAddtoCart).click();
	}
	
	public void ClickonRightAddtoCart() {
		
		driver.findElement(btnRighAddtocart).click();
	}
	
	// Click on miniCart Button
	
	public void ClickOnMiniCart() {
		
		driver.findElement(btnMinicart).click();
	}
	
	
	// Click on Checkout Button 
	
	public void Clickoncheckout() {
		
		driver.findElement(btnCheckout).click();
	}
	
	// Get Checkout details
	
	public void EnterFirstname(String Firstname) {
		
		driver.findElement(txtFirstname).sendKeys(Firstname);
	}
	
	public void EnterLastname(String Lastname) {
		
		driver.findElement(txtLastname).sendKeys(Lastname);
		
	}
	
	public void EnterZipcode(String Zipcode) {
		
		driver.findElement(txtZipCode).sendKeys(Zipcode);
	}
	
	public void ClickOncontinueButton() {
		driver.findElement(btncontinue).click();
	}
	
	//ScrollDown Function
	public void CurrenPageScroll() throws InterruptedException {
		
		// Current Page  ScrollDown
        try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,400)");
            
            Thread.sleep(1000);	
            System.out.println("Element Page ScrollDown Successfully...!");
            
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
			
		}
	}
	
	//Click on Finish Button
	public void ClickOnfinishButton() {
		
		driver.findElement(btnFinish).click();
	}
	
	public void orderMessage() {
		
		String orderMess =driver.findElement(ordMessage).getText();
		System.out.println("order Message is -: "  + orderMess);
	
	}
	
	//Close Driver function
	public void Closedriver() {
		driver.close();
	}
	
	
}
