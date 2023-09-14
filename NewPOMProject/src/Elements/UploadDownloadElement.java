package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadDownloadElement {
	
	WebDriver driver;
	
	
	public UploadDownloadElement(WebDriver driver) {
		this.driver =driver;
	}

	
	By btnDownload =By.id("downloadButton");
	By btnUpload=By.xpath("//*[@id=\"uploadFile\"]");
	
	
	public void ClickOndownloadButton() {
		
		driver.findElement(btnDownload).click();
	}
	
	public void ClickonUploadButton(String file	)throws InterruptedException {
		
		try {
		
			driver.findElement(btnUpload).sendKeys(file);
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println("File Upload Error message ===>" + e);
		}
		
	}
	
	public void driverclose() {
		driver.close();
	}
}
