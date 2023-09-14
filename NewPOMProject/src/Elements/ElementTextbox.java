package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ElementTextbox {

	WebDriver driver;
	
	public ElementTextbox(WebDriver driver) {
		
		this.driver=driver;
	}
	

	By TxtFullname=By.id("userName");
	By TxtEmail=By.id("userEmail");
	By TxtAddress =By.id("currentAddress");
	By TxtpermanentAddress=By.id("permanentAddress");
	By BtnSubmit=By.id("submit");
	
	// Get Output of Details 
	
	By Getname=By.id("name");
	By GetEmail =By.id("email");
	By GetCurrentAddress =By.xpath("//*[@id=\"currentAddress\"]");
	By GetParenentAddress =By.id("permanentAddress");
	
	
	public void EnterFullName(String Fullname) {
		
		driver.findElement(TxtFullname).sendKeys(Fullname);
		
	}
	
	public void EnterEmailaddress(String Emailid) {
		
		driver.findElement(TxtEmail).sendKeys(Emailid);
		
	}
	
	public void EnterCurrentAddress(String CurrentAddress) {
		
		driver.findElement(TxtAddress).sendKeys(CurrentAddress);
		
	}
	
	public void EnterpermanentAddress(String PermanentAddress) {
		
		driver.findElement(TxtpermanentAddress).sendKeys(PermanentAddress);
		
	}
	
	public void Clickonsubmit() {
		
		driver.findElement(BtnSubmit).click();
	}
	
	
	//Get Submit Details
	public String GetFullname() {
		
		String Fullname = driver.findElement(Getname).getText();
		return Fullname;
				
	}
	
	public String GetEmailid() {

		String Emailid  =driver.findElement(GetEmail).getText();
		return Emailid;
	}
	
	public String GetCurrentAddress1() {
		
		String CurrentAddress = driver.findElement(GetCurrentAddress).getText();
		return CurrentAddress;
	}
	
	public String GetparnentAddress1() {
		
		String Parmentaddress =driver.findElement(GetParenentAddress).getText();
		return Parmentaddress; 
	}
	
	public void driveclose() {
		
		driver.close();
	}
	
}
