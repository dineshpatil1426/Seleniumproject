package AdminPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SearchUsername {
	
	WebDriver driver;
	
	public SearchUsername(WebDriver driver) {
		this.driver=driver;
	}

	By lnkButtonAdmin =By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	By SearchUserName =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	By btnSearch =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By btnReset =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
	By employeeName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input");
	
	
	
	public void ClickonAdminPanel() {
		
		driver.findElement(lnkButtonAdmin).click();
		
		}
	
	public void SearchUserName(String EnterUsername) {
			
		driver.findElement(SearchUserName).sendKeys(EnterUsername);
	}
	
	public void ClickonResetButton() {
		
		driver.findElement(btnReset).click();
	}
	
	public void ClickonSearchButton() {
		
		driver.findElement(btnSearch).click();	
	}
	public void EnterEmployeeName(String EmployeeName) throws InterruptedException  {
		
			try {
				
			WebElement employeeName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
			List<WebElement>  autoSuggetionbox = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]"));
			
			Actions ActionSubject = new Actions(driver);
			Actions ActionSelectKeys = ActionSubject.moveToElement(employeeName).click().sendKeys(EmployeeName);
			ActionSelectKeys.perform();
			
			
			
			for( WebElement a: autoSuggetionbox) {
				
				System.out.println("Values are = " + a.getText());
				
				if(a.getText().equalsIgnoreCase("r")); 
				{
					Thread.sleep(1000);
					a.click();
					Thread.sleep(1000);
					break;
				}
				
			}
			
		} catch (Exception e) {
			
			System.out.println("sugession Error  = " + e);
		}
		
	}
	

	public void driverclose() {
		driver.close();
	}
	
}
