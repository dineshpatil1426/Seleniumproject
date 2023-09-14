package BookstoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRegiserElements {
	
	WebDriver driver;
	
	
	public LoginRegiserElements(WebDriver driver) {
		this.driver=driver;
	}
	
	//Get Elements 
	By btnNewuser =By.id("newUser");
	By txtfirstname=By.id("firstname");
	By txtLasttname=By.id("lastname");
	By txtUsername=By.id("userName");
	By txtPasswordname=By.id("password");
	By btnRegister=By.id("register");
	By lblMessage=By.id("name"); 
	
	By txtloginusername =By.id("userName");
	By txtloginpassword =By.id("password");
	By btnLoginButton =By.id("login");
	
	//Book Store Menu list 
	By btnbookStoreButton =By.id("gotoStore");
	
	
	
	
	//Login Function
	public void EnterLoginuserName(String loginUserName) {
		
		driver.findElement(txtloginusername).sendKeys(loginUserName);
	
	}
	
	public void EnterLoginPassword(String LoginPassword) {
		
		driver.findElement(txtloginpassword).sendKeys(LoginPassword);
	}
	
	public void ClickonLoginButton() {
		
	  driver.findElement(btnLoginButton).click();
	  
	}
	
	
	public void PageScrollDownForMenu()throws InterruptedException {
		
		try {
        	
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,400)");
            
            Thread.sleep(1000);	
            System.out.println("Current Page ScrollDown Successfully...!");
            
            
		} catch (Exception e) {
			System.out.println("Current Page ScrollDown is anyError...!");
		}
	}
	
	// book Store Menu list 
	public void ClickBookStoremenuList()  {
		
		driver.findElement(btnbookStoreButton).click();
	}
	
	
	
	//Logout Function 
	public void CLickonLogout() {
		
		WebElement  btnLogout =driver.findElement(By.id("submit"));
		
		try {
			
			if(btnLogout.isDisplayed()) {
				btnLogout.click();
				System.out.println("LogOut Successful!");
			}
			
		} catch (Exception e) {
			
			System.out.println("Incorrect login....");
			
		}
	}
	
	
	//Register Functions
	public void ClicknewUserButton() {
		
		driver.findElement(btnNewuser).click(); 
	}
	
	//Fill Register date 
	
	public void EnterFirstname(String Firstname) {

		driver.findElement(txtfirstname).sendKeys(Firstname);
	}
	public void EnterLastname(String Lastname) {

		driver.findElement(txtLasttname).sendKeys(Lastname);
	}
	public void EnterUsername(String Username) {

		driver.findElement(txtUsername).sendKeys(Username);
	}
	public void EnterPassword(String Password) {

		driver.findElement(txtPasswordname).sendKeys(Password);
	}
	public void ShowErrorMessage() {
		
		String AtualErrormessage = driver.findElement(lblMessage).getText();
		String  Errormessage ="Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer.";

		 if(AtualErrormessage.equals(Errormessage)) {
			 
			 System.out.println("Error Message is -: "+ AtualErrormessage);
		 }else {
			 
			 System.out.println("User Register Successfully....!"); 
		 }
	}
	
	
    public void ClickOnRegiter() {
    	driver.findElement(btnRegister).click();
    }	

	
	public void closedriver() {
		
		driver.close();
	}

}
