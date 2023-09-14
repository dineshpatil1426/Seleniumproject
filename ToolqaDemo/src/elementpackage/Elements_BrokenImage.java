package elementpackage;




import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import comman.Basic_Page;

public class Elements_BrokenImage extends Basic_Page {
	
	int invalidImageCount = 0; 
	
	public static void Open_BrokenLinksPanel() throws InterruptedException {
		
		try {

	        Thread.sleep(1000);
	        
	        // Current Page  ScrollDown
	        try {
	        	
	            JavascriptExecutor jse = (JavascriptExecutor)driver;
	            jse.executeScript("window.scrollBy(0,400)");
	            
	            Thread.sleep(1000);	
	            System.out.println("Element Page ScrollDown Successfully...!");
	            
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				Thread.sleep(1000);
				
			}
	        
			
			WebElement btnLinkButtonPanel = driver.findElement(By.id("item-6"));
			btnLinkButtonPanel.click();
			System.out.println(" Broken Links  Panel is open..!");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(2000);
		}		
		
	}
	
	// Verify Broken Image 
	public static void VerifyBrokenImage() throws InterruptedException {
			
		try {
			
			Thread.sleep(1000);
			List<WebElement> images =driver.findElements(By.tagName("img"));
			System.out.println("Total number of Images on the Page are " + images.size());
			
			//checking the links fetched.
			
			for(int index=0; index<images.size();index++) 
			{
				WebElement image =images.get(index);
				String imageURL =image.getAttribute("src");
				System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
				verifyLinks(imageURL);
				
				//Validate image display using JavaScript executor
				
				try {
						boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
						if (imageDisplayed) {
							System.out.println("DISPLAY - OK");
						}else {
							System.out.println("DISPLAY - BROKEN");
	                }
					
				} catch (Exception e) {
					
					System.out.println("Error Occured");
				}
						
			}
			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
		}
	}

	//Verify BrokenLinks	
	public static void VerifyBrokenLinks() throws InterruptedException{

		try {
			
			Thread.sleep(1000);
			
			List<WebElement> Links =driver.findElements(By.tagName("a"));
			System.out.println("No of links are "+ Links.size());
			
			for (int i=0; i<Links.size();i++) 	
			{
				WebElement Emlink =Links.get(i);
				String url =Emlink.getAttribute("href");
				verifyLinks(url);
			}
			Thread.sleep(1000);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.sleep(1000);
			
		}
	}
	
	// Verify Links
	public static void verifyLinks(String linkUrl) {
	
		try {
			
			URL url = new URL(linkUrl);
			
			//Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()>=400)
			{
				System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
				
			}else{
				
				//Fetching and Printing the response code obtained	
				System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		Elements_Textbox elmtTextbox = new Elements_Textbox();
		
		 elmtTextbox.intit();
		 elmtTextbox.ElementPageOpen();
         Open_BrokenLinksPanel();
         VerifyBrokenImage();
         VerifyBrokenLinks();
		 elmtTextbox.BrowserClose();
		

	}

}
