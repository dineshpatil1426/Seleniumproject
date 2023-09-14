package Widgets;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {

	WebDriver driver;
	
	public SliderPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By Sldicon =By.xpath("");
	
	public void MoveToSlider() {
		
		try {
			
			 
			Actions move = new Actions(driver);
			WebElement Sldicon =driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
			
			//First trick 
			//move.moveToElement(Sldicon, 10, 0).build();
			//Sldicon.click();
			
			//second trick
			//move.dragAndDropBy(Sldicon, 200, 0).build().perform();
			
			 //Third trick
			 move.clickAndHold(Sldicon).moveByOffset(100, 0).release().perform();
			
			System.out.println(" Slide Moving  SuccessFully...! " );
		} catch (Exception e) {
			
			System.out.println(" Slide Moving  Error  = " + e);
		}
		
	
	}
	
	public void driverclose() {
		
		driver.close();
	}
}


