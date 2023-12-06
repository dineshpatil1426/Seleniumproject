package com.aiodfront.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aiodfront.qa.util.Testutil;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/macmini/Documents/Selenium new/selenium script/AiodfrontendProjTest/src/main/java/com/aiodfront/qa/config/config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException Path Error...");	
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException Path Error...");
		}
	}
	
	public static void initialization() {
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.out.println("Check browser Name is =>" + browserName);
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*"); 
			System.setProperty("webdriver.chrome.driver", "/Users/macmini/Documents/Selenium new/selenium script/Aiodadmin/drivers/chromedriver");
			driver = new ChromeDriver();
		}else if (browserName.equals("FF")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/macmini/Documents/Selenium new/selenium script/Aiodadmin/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
