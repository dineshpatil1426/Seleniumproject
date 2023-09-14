package InteractionsTestCase;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Interactions.ToolqaDemopage;


public class ToolqaDemo {

	public static void main(String[] args)throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/NewPOMProject/drivers/chromedriver");
		//String URL ="https://demoqa.com/";
	    String URL ="https://admin.shopify.com/store/dinesh-patil-tester/apps/all-in-one-discount";
		driver.get(URL);
		//driver.navigate().to(URL);
		driver.manage().window().maximize();
		
		ToolqaDemopage objdemopage = new ToolqaDemopage(driver);
		
		//objdemopage.DemoPratices1();
	//	objdemopage.DemoPratices2();
		Thread.sleep(1000);
		objdemopage.driverClose();
		
			
		
	}
	
	

}
