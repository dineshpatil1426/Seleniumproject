package Widgets;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ToolTipsPage {
	
	WebDriver driver;
	
	public ToolTipsPage(WebDriver driver) {
		
		this.driver=driver;
	}

	
	
	public void HoverOnButton() throws InterruptedException {
		
		//https://www.toolsqa.com/selenium-webdriver/tooltip-in-selenium/
		
		try {
			
			Actions actions = new Actions(driver);
			WebElement btnhover = driver.findElement(By.id("toolTipButton"));
			actions.moveToElement(btnhover).perform();
			
			//WebElement Tooltip = driver.findElement(By.id("buttonToolTip"));
			
			Thread.sleep(2000);
			
			//WebElement Tooltip = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
			
			WebElement Tooltip =driver.findElement(By.id("buttonToolTip"));
			
			String TooltipText =Tooltip.getText();
			
			System.out.println("toolTipText-->"+TooltipText);
			
			Thread.sleep(2000);
			
				
			if (TooltipText.equals("You hovered over the Button")) {
				
				System.out.println("Pass* : Tooltip matching expected value");
			} else {
				System.out.println("Fail : Tooltip NOT matching expected value");
			}
			
		} catch (Exception e) {
			
			System.out.println("Error in Hover on Button ==>" + e);
		}
		
	}
	
	public void TextfieldToolTip() throws InterruptedException {
		
		try {
			
			Actions actionTextField = new Actions(driver);
			WebElement txtTextField = driver.findElement(By.id("toolTipTextField"));
			actionTextField.moveToElement(txtTextField).perform();
			
			Thread.sleep(2000);
			
			WebElement TextToolTip =driver.findElement(By.id("textFieldToolTip"));
			
			String TextBoxToolTip = TextToolTip.getText();
			
			System.out.println("toolTipText-->"+TextBoxToolTip);
			
			Thread.sleep(2000);
			
			if(TextBoxToolTip.equals("You hovered over the text field")) {
				
				System.out.println("Pass* : Textbox Tooltip matching expected value");
				
			}else{
				
				System.out.println("Fail : Textbox Tooltip NOT matching expected value");
			}
			
		} catch (Exception e) {
			
			System.out.println("Error in Hover on TextboxField  ==>" + e);
		}
		
	}
	
	public void CountryLinkButtonhover() throws InterruptedException {
		
		try {
			
			Actions actionCountrylink = new Actions(driver);
			WebElement lnkCountry =driver.findElement(By.xpath("//a[text()='Contrary']"));
			actionCountrylink.moveToElement(lnkCountry).perform();
			
			Thread.sleep(2000);
			
			WebElement countryToolTip =driver.findElement(By.id("contraryTexToolTip"));
			
			String CountryLinkToolTip = countryToolTip.getText();
			
			System.out.println("toolTipCountry Text-->"+CountryLinkToolTip);
			
			Thread.sleep(2000);
			
			if(CountryLinkToolTip.equals("You hovered over the Contrary")) {
				
				System.out.println("Pass* : Country Tooltip matching expected value");
			}else {
				System.out.println("Fail : Country Tooltip NOT matching expected value");
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Error in Hover on country linkButton  ==>" + e);
		}
	}
	
	public void Sectionlinkbuttonhover()throws InterruptedException {
		
		
		try {
			
			Actions actionsectionLinkButton = new Actions(driver);
			WebElement lnksection =driver.findElement(By.xpath("//a[text()='1.10.32']"));
			actionsectionLinkButton.moveToElement(lnksection).perform();
			
			Thread.sleep(2000);
			
			WebElement sectionToolTip =driver.findElement(By.id("sectionToolTip"));
			
			String sectionLinkToolTip = sectionToolTip.getText();
			
			System.out.println("toolTipSection Text-->"+ sectionLinkToolTip);
			
			Thread.sleep(2000);
			 
			//You can put the equals funcation
			
			if(sectionLinkToolTip.equalsIgnoreCase("You hovered over the 1.10.32")) {
				
				System.out.println("Pass* : Section Tooltip matching expected value");
			}else {
				System.out.println("Fail : section Tooltip NOT matching expected value");
			}
			
		} catch (Exception e) {
			
			System.out.println("Error in Hover on Section linkButton  ==>" + e);
		}
		
	}
	 
	
	public void driverclose() {
		
		driver.close();
	}
	
}
