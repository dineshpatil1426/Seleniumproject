package windowsAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModaldialogsPage {
	
	WebDriver driver;
	
	
	public ModaldialogsPage(WebDriver driver) {
		
		this.driver =driver;
	}

	By btnshowSmallModal =By.id("showSmallModal");
	By btnshowLargeModal =By.id("showLargeModal");
	
	// dialogs Close Button
	
	By btncloseSmallModal=By.id("closeSmallModal");
	By btncloseLargeModal=By.id("closeLargeModal");
	By btnSmallcloseicon =By.xpath("/html/body/div[4]/div/div/div[1]/button");
	By btnLargecloseIcon =By.xpath("/html/body/div[4]/div/div/div[1]/button");
	
	public void SmallModalWithCloseButton() throws InterruptedException {
		
		try {
			
			driver.findElement(btnshowSmallModal).click();
			Thread.sleep(2000);
			WebElement smallmodelTitle =driver.findElement(By.id("example-modal-sizes-title-sm"));
			String SmallModelText =smallmodelTitle.getText();
			System.out.println("This is ==> " + SmallModelText);
			Thread.sleep(2000);
			driver.findElement(btncloseSmallModal).click();
			System.out.println("Small Model dialogs is close With Close Button");
			
		} catch (Exception e) {

			System.out.println("Small Model Dialogs Error==> " + e );
		}
	}
	
	public void SmallmodalWithCloseIcon()throws InterruptedException {
		
		try {
			
			driver.findElement(btnshowSmallModal).click();
			Thread.sleep(2000);
			WebElement smallmodelTitle =driver.findElement(By.id("example-modal-sizes-title-sm"));
			String SmallModelText =smallmodelTitle.getText();
			System.out.println("This is ==> " + SmallModelText);
			Thread.sleep(2000);
			driver.findElement(btnSmallcloseicon).click();
			System.out.println("Small Model dialogs is close With Close Icon");
			
		} catch (Exception e) {

			System.out.println("Small Model Dialogs Error==> " + e );
		}		
	}
	
	public void LargeModelWithCloseButton()throws InterruptedException {
		
		try {
			
			driver.findElement(btnshowLargeModal).click();
			Thread.sleep(2000);
			WebElement LargeModelTitle =driver.findElement(By.id("example-modal-sizes-title-lg"));
			String LargeModelText =LargeModelTitle.getText();
			System.out.println("This is ==> " + LargeModelText);
			Thread.sleep(2000);
			driver.findElement(btncloseLargeModal).click();
			System.out.println("Large Model dialogs is close With Close Button");
			
		} catch (Exception e) {

			System.out.println("Large Model Dialogs Error==> " + e );
		}
	}
	
	public void LargemodalWithCloseIcon()throws InterruptedException {
		
		try {
			
			driver.findElement(btnshowLargeModal).click();
			Thread.sleep(2000);
			WebElement LargemodelTitle =driver.findElement(By.id("example-modal-sizes-title-lg"));
			String LargeModelText =LargemodelTitle.getText();
			System.out.println("This is ==> " + LargeModelText);
			Thread.sleep(2000);
			driver.findElement(btnLargecloseIcon).click();
			System.out.println("Large Model dialogs is close With Close Icon");
			
		} catch (Exception e) {

			System.out.println("Large Model Dialogs Error==> " + e );
		}		
	}
	
	
	public void driverclose() {
		
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println("Driver Close Error ==> " + e);
		}
	}
	
}
