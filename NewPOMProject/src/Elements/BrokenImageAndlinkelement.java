package Elements;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImageAndlinkelement {
	
	
	WebDriver driver;
	
	public BrokenImageAndlinkelement(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//Finding link URL
	//http://www.testingdiaries.com/selenium-verify-image-present-webdriver/
	
	
	
	 public void VerifyValidImage() {
	
		 	WebElement imageFile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]"));
			
			Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile); 
			
			if(!ImagePresent) {
				System.out.println("Image not displayed.");
			}else{
				System.out.println("Image displayed.");
			}
	 }
	 
	 
	 public void VerifyBrokenImage() {
		 
		 WebElement BrokenimageFile = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]"));
		 Boolean BrokenImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", BrokenimageFile);
		 
		 if(!BrokenImagePresent) {
			 System.out.println("Image not displayed.");
		 }else {
			 System.out.println("Image displayed."); 
		 }
		 
	 }
	 
	 //Verify Link  Code 
	 //https://www.toolsqa.com/selenium-webdriver/find-broken-links-in-selenium/
	 
	public void ValiateLink() 
	{
		WebElement Linkname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]"));
		
		
		if(Linkname.isDisplayed()) {
			System.out.println("Yes link is there");
		}else {
			System.out.println("No link is there");
		}
	}
	
	public void BrokenLinkValiate() 
	{
		WebElement Linkname = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]"));
		
		
		if(Linkname.isDisplayed()) {
			System.out.println("Yes link is there");
		}else {
			System.out.println("No link is there");
		}
	}
	
	
	public void Driverclose() {
		
		driver.close();
	}
	
}
