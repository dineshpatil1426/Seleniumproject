package Elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsElement {
	
	WebDriver driver;
	
	
	public ButtonsElement(WebDriver driver) {
		this.driver =driver;
	}

	
	
	By btnClick = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
	
	By dynamicMsg = By.id("dynamicClickMessage");
	By rightClickMsg = By.id("rightClickMessage");
	By doubleClickMsg = By.id("doubleClickMessage");
	
	
	
	
	public void ClickSingleButton() {
		
		driver.findElement(btnClick).click();
		String DynamicMessage = driver.findElement(dynamicMsg).getText();
		System.out.println("Single Click  Button perform ===>" + DynamicMessage );
	}
	
	public void RightClickButton() {
		
		Actions actionRighclick = new Actions(driver);
		WebElement btbRightClick =driver.findElement(By.id("rightClickBtn"));
		actionRighclick.contextClick(btbRightClick).perform();
		String RightClickMessage =driver.findElement(rightClickMsg).getText();
		System.out.println("Right click Button Perform ===>"+ RightClickMessage);
	}
	
	public void doubleClickButton() {
		
		Actions actionDoubleClick = new Actions(driver);
		WebElement btndoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actionDoubleClick.doubleClick(btndoubleClick).perform();
		String DoubleClickMessage = driver.findElement(doubleClickMsg).getText();
		System.out.println("Double Click Button Perform ===>" + DoubleClickMessage );
	}
	
	public void Closedriver() {
		
		driver.close();
	}
}
