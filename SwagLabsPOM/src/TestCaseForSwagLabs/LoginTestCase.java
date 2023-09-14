package TestCaseForSwagLabs;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import swaglabsElemwnts.LoginElements;
import swaglabsElemwnts.ProductAddToCartElement;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		LoginElements ObjLogin = new LoginElements(driver);
		ProductAddToCartElement objProduct = new ProductAddToCartElement(driver);
		
		
		//Fill Data 
		try {
			
			ObjLogin.EnterUsername("standard_user");
			Thread.sleep(1000);
			ObjLogin.EnterPassword("secret_sauce");
			Thread.sleep(1000);	
			ObjLogin.ClickonLogin();
			Thread.sleep(5000);
			
			System.out.println("User Login Successfully...!" );
			
		} catch (Exception e) {
			
			System.out.println("User Login is  UnSuccessfully...!" + e );
		}
		
		//Apply Filter 
		try {
			
			objProduct.SelectFilter();
			Thread.sleep(1000);
			objProduct.SelectZtoAFilter();
			Thread.sleep(1000);
			objProduct.SelectFilter();
			Thread.sleep(1000);
			objProduct.SelectLowTohigh();
			Thread.sleep(1000);
			objProduct.SelectFilter();
			Thread.sleep(1000);
			objProduct.SelecthighToLow();
			Thread.sleep(1000);
			objProduct.SelectFilter();
			Thread.sleep(1000);
			objProduct.SelectAtoZ();
			Thread.sleep(1000);
			
			System.out.println("All Filter Apply  Succerssfully...!" );
			
		} catch (Exception e) {
			
			System.out.println("All Filter Apply   UnbSuccerssfully...!" +e);
			
		}

	   // Click on Add to Cart		
		try {
			
			objProduct.ClickOnAddtocart();
			Thread.sleep(1000);
			objProduct.ClickonRightAddtoCart();
			Thread.sleep(1000);
			
			System.out.println("Product Add Succerssfully...!" );
			
		} catch (Exception e) {
			
			System.out.println("Product Add  UnSuccerssfully...!" + e );
			
		}
		
		
		// Open MiniCart
		try {
	
			objProduct.ClickOnMiniCart();
			Thread.sleep(1000);
			
			//Click on Checkout button
			objProduct.Clickoncheckout();
			Thread.sleep(1000);
			
			// Fill Checkout Data 
			objProduct.EnterFirstname("Dinesh");
			Thread.sleep(1000);
			objProduct.EnterLastname("patil");
			Thread.sleep(1000);
			objProduct.EnterZipcode("394210");
			Thread.sleep(1000);
			objProduct.ClickOncontinueButton();
			Thread.sleep(1000);
			objProduct.CurrenPageScroll();
			Thread.sleep(1000);
			objProduct.ClickOnfinishButton();
			Thread.sleep(5000);
			objProduct.orderMessage();		
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
	
	   //Close driver	
	 	objProduct.Closedriver();
		

	}

}
