package FormPageElement;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Formpage {
	
	WebDriver driver;
	
	
	public Formpage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	
	By txtFirstName =By.id("firstName");
	By txtLastName =By.id("lastName");
	By txtEmail =By.id("userEmail");
	By rbtGender =By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
	By txtMobilenumber=By.id("userNumber");
	By selectbirthdate=By.id("dateOfBirthInput");
	By Selectyear=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
	By Selectmonth=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
	By Selectday=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]");
	
	@FindBy(id="subjectsContainer")private WebElement txtSearch;
	@FindBy(xpath ="//*[@id=\"subjectsContainer\"]/div[2]") List<WebElement> autoSuggetionbox;
	@FindBy(xpath ="//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")private WebElement Selecthobbies;
	@FindBy(id ="uploadPicture")private WebElement Fileupload;
	By txtCurrentAddress =By.id("currentAddress");
	@FindBy(id="state") private WebElement state;
	@FindBy(xpath = "//*[@id=\"state\"]/div[2]")List<WebElement> Statelist;
	@FindBy(id="city") private WebElement City;
	@FindBy(xpath = "//*[@id=\"city\"]/div[2]")List<WebElement>citylist; 
	By btnsubmit =By.id("submit");
	
	
	
		
	
	
	public void Scrolldown()throws InterruptedException {
		
		//Scroll Down 
				try {
					
				JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("window.scrollBy(0,350)");
		        
		        Thread.sleep(1000);	
		        System.out.println("Current Page ScrollDown Successfully...!");
		        
				} catch (Exception e) {
				
				System.out.println("Current Page ScrollDown is anyError...!");
				
				}
				Thread.sleep(1000);
	}
	
	public void EnterFirstname(String FirstName) {
		
		driver.findElement(txtFirstName).sendKeys(FirstName);
	}
	public void EnterLastname(String LastName) {
		
		driver.findElement(txtLastName).sendKeys(LastName);
	}
	public void EnterEmailAddress(String Emailid) {
		
		driver.findElement(txtEmail).sendKeys(Emailid);
	}
	public void SelectionGender() {
		driver.findElement(rbtGender).click();
	}
	public void EnterMobileNumber(String MobileNumber) {
		driver.findElement(txtMobilenumber).sendKeys(MobileNumber);
	}
	public void Selectbirthdate(){
		driver.findElement(selectbirthdate).click();
	}
	public void SelectYear(String Year){
		driver.findElement(Selectyear).sendKeys(Year);
	}
	public void SelectMonth(String month){
		driver.findElement(Selectmonth).sendKeys(month);
	}
	public void Selectday(){
		driver.findElement(Selectday).click();
	}
	
	public void EnterSubject(String Subject) {
			
		try {
			
			Actions ActionSubject = new Actions(driver);
			Actions ActionSelectKeys = ActionSubject.moveToElement(txtSearch).click().sendKeys(Subject);
			ActionSelectKeys.perform();
			
			for( WebElement a: autoSuggetionbox) {
				
				System.out.println("Values are = " + a.getText());
				
				if(a.getText().equalsIgnoreCase("Hindi")); 
				{
					Thread.sleep(2000);
					a.click();
					Thread.sleep(2000);
					break;
				}
				
			}
			
		} catch (Exception e) {
			
			System.out.println("sugession Error  = " + e);
		}	
		
	}
	
	public void selectHobbies() {
		
		Selecthobbies.click();
	}
	
	public void FileUplaod() {
		Fileupload.sendKeys("/Users/macmini/Downloads/sampleFile (8).jpeg");
	}
	public void EnterCurrentAddress(String CurrentAddress) {
		driver.findElement(txtCurrentAddress).sendKeys(CurrentAddress);
	}
	
	public void selectstate(String selectstate)throws InterruptedException{
		
		Actions actionState = new Actions(driver);
		Actions actionSelectstate = actionState.moveToElement(state).click().sendKeys(selectstate);
		actionSelectstate.perform();
		Thread.sleep(1000);
		
		for(WebElement b : Statelist) {
		
			System.out.println("Values are = " + b.getText());
			if(b.getText().equalsIgnoreCase("Rajasthan"));{
				
				b.click();
				Thread.sleep(2000);
				break;
			}
		}

	}
  public void selectcity(String selectcity) throws InterruptedException {
	  
	  Actions actionCity = new Actions(driver);
	  Actions actionselectcity = actionCity.moveToElement(City).click().sendKeys(selectcity);
	  actionselectcity.perform();
	  Thread.sleep(1000);
	  
	  for(WebElement c : citylist) {
		  
		  System.out.println("Values are = " + c.getText());
		  if(c.getText().equalsIgnoreCase("Noida"));{
			  
			  	c.click();
				Thread.sleep(2000);
				break;
		  }
	  }  
  }
  
  public void submitform() {
	  
	  
	  try {

		  driver.findElement(btnsubmit).click();
		 
	  } catch (Exception e) {
		  
		  System.out.println("Error in Enter Press = " + e);  
	  }
  }
	
	public void driverClose() {
		driver.close();
	}
}
