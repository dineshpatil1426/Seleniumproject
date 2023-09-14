package Interactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolqaDemopage {
	
	WebDriver driver;
	
	public ToolqaDemopage(WebDriver driver) {
		this.driver=driver;
	} 
	
	
	public void DemoPratices1() throws InterruptedException {
		
		WebElement panelClick =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
		String TagName=panelClick.getTagName();	
		System.out.println("Tag Name  is ->"+ TagName);
		
		
		
		panelClick.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		String Title = driver.getTitle();
		System.out.println("Title Name is ->"+ Title);
		int TitleLenght = driver.getTitle().length();
		System.out.println("Length of the title is ->"+ TitleLenght);
		String CurrentUrl =driver.getCurrentUrl();
		System.out.println("Current URL is ->"+ CurrentUrl);
		String PageSource = driver.getPageSource();
		System.out.println("Page Source is ->"+ PageSource);
		int PageSourceLenght =driver.getPageSource().length();
		System.out.println("Total length of the Pgae Source is ->"+ PageSourceLenght);
		
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement txtFirstName =driver.findElement(By.id("firstName"));
		txtFirstName.sendKeys("Dinesh");
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		
		if(btnSubmit!=null) {
			
			btnSubmit.submit();
			System.out.println("Element found by ID");
		}
		
		/*
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/links");
		WebElement linkElement = driver.findElement(By.linkText("Home"));
		linkElement.click();
		*/
		
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement chkSport = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
		boolean isdisplay=chkSport.isDisplayed();
		
		if(isdisplay==true) {
			
			chkSport.click();
		}
		Thread.sleep(2000);
	}
	
	public void DemoPratices2()throws InterruptedException {
		
		//Locate by ID Attribute
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement txtFirstname =driver.findElement(By.id("firstName"));
		txtFirstname.sendKeys("Dinesh");
		Thread.sleep(2000);
		
		//Locate by Name attribute
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.name("gender"));
		Thread.sleep(2000);
		
		//Locate by className attribute
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.className("practice-form-wrapper"));
		Thread.sleep(2000);
		
		//Locate by linkText and ParticalLinkText attribute
		driver.get("https://demoqa.com/links");
		//linkText
		String Linktext =driver.findElement(By.linkText("Home")).getText();
		System.out.println(" LinkText ->"+ Linktext );
		//ParticalLinkText
		String partiallink =driver.findElement(By.partialLinkText("Ho")).getText();
		System.out.println(" LinkText ->"+ partiallink );
		
		//Locate by tagName attribute
		driver.get("https://demoqa.com/links");
		List<WebElement> list =driver.findElements(By.tagName("a"));
		list.clear();
		
		//Locate by cssSelector attribute
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector("input[id='userName']"));
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userName']")));
		firstResult.getText();
		
	
		//Locate by xpath attribute
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']"));
		
		
	}
	
	
	
	public void driverClose() {
		
		driver.close();
	}
	

}
