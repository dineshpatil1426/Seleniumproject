   package Widgets;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class SelectMenuDropdownPage {
	
	WebDriver driver;
	
	public SelectMenuDropdownPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public void GroupDropdown() throws InterruptedException {
		
		try {
			
			WebElement selectgroupdrp =driver.findElement(By.id("react-select-2-input"));
			selectgroupdrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			selectgroupdrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			selectgroupdrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			selectgroupdrp.sendKeys(Keys.ENTER);
			
			System.out.println("Pass : Group Dropdown Selection Successfully...!");
		} catch (Exception e) {
			System.out.println("Fail : Group Dropdown Selection UnSuccessfully ...!"+e);
		}
		
	}
	public void singledropdown() throws InterruptedException {
		
		try {
			
			WebElement SelectSingledrp =driver.findElement(By.id("react-select-3-input"));
			
			SelectSingledrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			SelectSingledrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			SelectSingledrp.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			SelectSingledrp.sendKeys(Keys.ENTER);
			
			System.out.println("Pass : Single Dropdown Selection Successfully...!");
		} catch (Exception e) {
			System.out.println("Fail : Single Dropdown Selection UnSuccessfully ...!"+e);
			
		}
		
		
	}
	
	public void Oldstyledropdown() throws InterruptedException {
		
		try {
			
			Select selecolddrp = new Select(driver.findElement(By.id("oldSelectMenu")));
			selecolddrp.selectByIndex(4);
			
			System.out.println("Pass : Old Style Dropdown Selection Successfully...!");
		} catch (Exception e) {
			System.out.println("Fail : Old Style Dropdown Selection UnSuccessfully ...!"+e);
			
		}
	}
	
	
	public void Multipledropdown() throws InterruptedException {
		
		try {
			
			WebElement txtmultipledropdown = driver.findElement(By.id("react-select-4-input"));
			
			txtmultipledropdown.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			txtmultipledropdown.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			txtmultipledropdown.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			txtmultipledropdown.sendKeys(Keys.ENTER);
			
			/*
			List<WebElement> MultipleDropDownselection = driver.findElements(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div[2]"));
			
			Actions multidropAction = new Actions(driver);
			Actions selectmultipledrp = multidropAction.moveToElement(txtmultipledropdown).click().sendKeys(multipleDropdown);
			selectmultipledrp.perform();
			
			for(WebElement a : MultipleDropDownselection){
				
				System.out.println(" Multiple Color Values are = " + a.getText());
				
				if(a.getText().contentEquals("Green")); {
					
					Thread.sleep(2000);
					a.click();
					Thread.sleep(2000);
					break;
					
				}
			}
			*/
			
			System.out.println("Pass : Multiple Dropdown Selection Successfully...!");
		} catch (Exception e) {
			System.out.println("Fail : Multiple Dropdown Selection UnSuccessfully ...!"+e);
		}
	}
	
	
	public void StandardMultiSelect() throws InterruptedException {
		
		try {
			
			Select StandardSelect = new Select(driver.findElement(By.id("cars")));
			
			if(StandardSelect.isMultiple()) {
				StandardSelect.selectByValue("saab");
				Thread.sleep(2000);
				StandardSelect.selectByValue("audi");
			}
					
			System.out.println("Pass : Standard Multi Dropdown Selection Successfully...!");
		} catch (Exception e) {
			System.out.println("Fail : Standard Multi Dropdown Selection UnSuccessfully ...!"+e);
			
		}
	}
	
	public void driverClose() {
		driver.close();
	}
}

