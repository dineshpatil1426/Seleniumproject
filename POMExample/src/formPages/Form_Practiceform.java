package formPages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static org.testng.Assert.assertEquals;


public class Form_Practiceform {
	
	public	WebDriver driver;
	
	public Form_Practiceform(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Student Registration Form
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div") WebElement Header;
	By txtFirstname=By.id("firstName");
	By txtLastname=By.id("lastName");
	By txtEmail=By.id("userEmail");
	By txtGender=By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
	
	By txtMobile=By.id("userNumber");
	By selectbirthdate=By.id("dateOfBirthInput");
	By Selectyear=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
	By Selectmonth=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
	By Selectday=By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]");
	
	@FindBy(id = "subjectsContainer")private WebElement textSearch;
	@FindBy(xpath ="//*[@id=\"subjectsContainer\"]/div[2]") List<WebElement> AutoSugectionbox;
	@FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label") private WebElement Selecthobbies; 
	@FindBy(id = "uploadPicture")private WebElement Fileupload; 
	By txtCurrentAddress=By.id("currentAddress");
	@FindBy(id = "state") private WebElement drpstate;
	@FindBy(xpath = "//*[@id=\"state\"]/div[2]") List<WebElement> Statelist;
	@FindBy(id = "city") private WebElement drpCity;
	@FindBy(xpath = "//*[@id=\"city\"]/div[2]") List<WebElement> Citylist;
	@FindBy(id ="submit") private WebElement btnSubmit;
	
	
	
	

	public void EnterFirstname(String Firstname){
		driver.findElement(txtFirstname).sendKeys(Firstname);
	}
	
	public void EnterLastname(String Lastname) {
		driver.findElement(txtLastname).sendKeys(Lastname);
	}
	
	public void EnterUserEmail(String UserEmail) {
		driver.findElement(txtEmail).sendKeys(UserEmail);
	}
	public void SelectGender()
	{
	 driver.findElement(txtGender).click();	
	}
	
	public void EnterUserMobile(String Mobile){
		
		driver.findElement(txtMobile).sendKeys(Mobile);
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
	
	
	public void EnterSubject(String subject) throws InterruptedException {
		
        
		
		Actions builder = new Actions(driver);
	    Actions seriesOfActions = builder.moveToElement(textSearch).click().sendKeys(subject);
	    seriesOfActions.perform();
	   

	    
	    for( WebElement a : AutoSugectionbox)
		{
			System.out.println("Values are = " + a.getText());
			if(a.getText().equalsIgnoreCase("Hindi"));
			{
				a.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void selectHobbies() {
		Selecthobbies.click();
	}
	public void FilUplaod() {
		
		Fileupload.sendKeys("/Users/cirklestudio/Downloads/photo Birds.jpeg");
		
	}
	public void PageScrollDown()throws InterruptedException {
		
		try {
        	
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
        
			Thread.sleep(1000);	
			System.out.println("Current Page ScrollDown Successfully...!");
        
		} catch (Exception e) {
		
			System.out.println("Current Page ScrollDown is anyError...!");
		
		}
	}
	
	public void EnterCurrentAddress(String Address) {
		driver.findElement(txtCurrentAddress).sendKeys(Address);
	}
	
	public void selectState(String state) throws InterruptedException {
		
		Actions builder = new Actions(driver);
	    Actions seriesOfActions = builder.moveToElement(drpstate).click().sendKeys(state);
	    seriesOfActions.perform();
	    Thread.sleep(1000);
	    
	    for( WebElement b : Statelist)
		{
			System.out.println("Values are = " + b.getText());
			if(b.getText().equalsIgnoreCase("Rajasthan"));
			{
				b.click();
				Thread.sleep(2000);
				break;
			}
		}
		
	}
	
	public void selectcity(String City) throws InterruptedException {
		
		Actions builder = new Actions(driver);
	    Actions seriesOfActions = builder.moveToElement(drpCity).click().sendKeys(City);
	    seriesOfActions.perform();
	    
	    for( WebElement c : Citylist)
		{
			System.out.println("Values are = " + c.getText());
			if(c.getText().equalsIgnoreCase("Noida"));
			{
				c.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void SubmitForm() throws AWTException {
		
	   Robot rb = new Robot();
	   rb.keyPress(KeyEvent.VK_ENTER);
	   
	}
	
	public void CloseBrowser() {
		driver.close();
	}
}
