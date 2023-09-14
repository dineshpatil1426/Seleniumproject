package Elements;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonElements {
	
	WebDriver driver;
	
	
	public RadioButtonElements(WebDriver driver) {
		this.driver=driver;
	}
	
	//By rtnRadioYes =By.id("yesRadio");
	
	By lblLabelForYes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
	
	

	
	
	
	public void SelectYesRadio() {
		
		WebElement  rtnRadioYes = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
		Boolean SelecteRadioYes =rtnRadioYes.isSelected();
		
		if(SelecteRadioYes== false) {
			rtnRadioYes.click();
		}
	}
	
	public void GetYesLabel() {
		
	 String DisplayYesLabel	= driver.findElement(lblLabelForYes).getText();
	 
	 System.out.println(" Display Label of Yes ===> " + DisplayYesLabel);
	 
	}
	
	public void SelectImpressiveRadio() {
		
		WebElement rtnRadioImpressive =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
		Boolean SelectRadioImpressive =rtnRadioImpressive.isSelected();
		
		if(SelectRadioImpressive==false) {
			rtnRadioImpressive.click();
		}
	}
	
	public void GetImpressiveLabel() {
		
		 String DisplayImpressiveLabel	= driver.findElement(lblLabelForYes).getText();
		 
		 System.out.println(" Display Label of Yes ===> " + DisplayImpressiveLabel);
		 
		}
	
	public void SelectNoRadio() {
		
	   WebElement rtnRadioNo =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]"));
	   Boolean selectRadioNo =rtnRadioNo.isSelected();
	   
	   if(selectRadioNo==true) {
		   System.out.println("Yes ! Radio Button is Enable");
	   }else {
		   System.out.println("NO ! Radio Button is Disable");
	   }
		
	}
	
	

	public void CloseDriver() {
		driver.close();
	}
	
}
