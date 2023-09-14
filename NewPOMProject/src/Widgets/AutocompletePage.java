package Widgets;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutocompletePage {
	
	WebDriver driver;
	
	public AutocompletePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="autoCompleteMultipleContainer") private WebElement txtmultiColor;
	@FindBy(xpath ="//*[@id=\"autoCompleteMultipleContainer\"]/div[2]") List<WebElement> MulticolorAutoSuggestion;
	@FindBy(id="autoCompleteSingleContainer") private WebElement txtSinglecolor;
	@FindBy(xpath ="//*[@id=\"autoCompleteSingleContainer\"]/div[2]")List<WebElement>SinglecolorAutoSuggestion; 
	
		
	
	public void EnterMultipleColor(String Multiplecolor)throws InterruptedException {
		
		try {
			Actions MultiColorAction = new Actions(driver);
			Actions SelectMultiColor =MultiColorAction.moveToElement(txtmultiColor).click().sendKeys(Multiplecolor);
			SelectMultiColor.perform();
			
			for(WebElement a : MulticolorAutoSuggestion){
				
				System.out.println(" Multiple Color Values are = " + a.getText());
				
				if(a.getText().equalsIgnoreCase("Green")); {
					
					Thread.sleep(2000);
					a.click();
					Thread.sleep(2000);
					break;
					
				}
			}
			
		} catch (Exception e) {
			
			System.out.println(" Multiple Color sugession Error  = " + e);
		}
	}

	public void EnterSingleColor(String SingleColor) throws InterruptedException {
		
		try {
			Actions SingleColorAction = new Actions(driver);
			Actions SelectSingleColor =SingleColorAction.moveToElement(txtSinglecolor).click().sendKeys(SingleColor);
			SelectSingleColor.perform();
			
			for(WebElement b:SinglecolorAutoSuggestion) {
				
				System.out.println("Multiple Color Values are = " + b.getText());
				
				if(b.getText().equalsIgnoreCase("Red")); {
					
					Thread.sleep(2000);
					b.click();
					Thread.sleep(2000);
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.println(" Multiple Color sugession Error  = " + e);
		}
	}
	
	
	public void driverClose() {
		
		try {
			
			driver.close();
		} catch (Exception e) {
			
			System.out.println("Driver Close Error ==> " + e);
		}
	}
	
}

