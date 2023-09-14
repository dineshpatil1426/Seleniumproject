package ElementPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements_Textbox {

	WebDriver driver;

	
	public Elements_Textbox(WebDriver driver) {
		
		this.driver =driver;
	}
	
	By TxtFullname =By.id("userName");
	By TxtEmail=By.id("userEmail");
	By TxtAddress =By.id("currentAddress");
	By TxtpermanentAddress =By.id("permanentAddress");
	By BtnSubmit = By.id("submit");
	
	// Get Output of Details 
	By Getname =By.id("name");
	By Getemail =By.id("email");
	By GetcurrentAddress =By.xpath("//*[@id=\"currentAddress\"]");
	By GetpermanentAddress =By.id("permanentAddress");
	
	public void EnterFullname(String Fullname) {
			
		driver.findElement(TxtFullname).sendKeys(Fullname);
		
	}
	
	public void EnterEmail(String Emailid) {
		
		driver.findElement(TxtEmail).sendKeys(Emailid);
	}
	
	public void EnterCurrentAddress(String CurrentAdd) {
		
		driver.findElement(TxtAddress).sendKeys(CurrentAdd);
		
	}
	
	public void EnterpermanentAddress(String parementAdd) {
		
		driver.findElement(TxtpermanentAddress).sendKeys(parementAdd);
		
	}
	
	public void ClickOnSubmit() {
		
		driver.findElement(BtnSubmit).click();
	}
	
	//Get Submit Details
	public String GetFullname() {
		
		String fullname = driver.findElement(Getname).getText();
		return fullname;
	}
	
	public String GetEmailid() {
		
		String Emailid = driver.findElement(Getemail).getText();
		return Emailid;
	}
	
	public String GetCurrentaddress1() {
		
		String Caddress = driver.findElement(GetcurrentAddress).getText();
		return Caddress;
	}
	public String GetparmentAddrress1() {
		
		String paddress = driver.findElement(GetpermanentAddress).getText();
		return paddress;
	}
	
	
}
