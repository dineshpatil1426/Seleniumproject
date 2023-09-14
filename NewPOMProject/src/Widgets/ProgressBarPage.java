package Widgets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {
	
	WebDriver driver;

	public ProgressBarPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By btnStart =By.id("startStopButton");
	
	
	
	
	
	public void ClickOnStartButton() {
		
		driver.findElement(btnStart).click();
	}
	public void CheckProgressBar() throws InterruptedException {
		
		WebElement ProgressBar = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		boolean ProgressBarStatus = wait.until(ExpectedConditions.attributeToBe(ProgressBar, "aria-valuenow", "100"));
		Thread.sleep(2000);
		
		if(ProgressBarStatus==true) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resetButton"))).click();
		}
		
	}
	
	public void driverclose() {
		driver.close();
	}
	
	
}
