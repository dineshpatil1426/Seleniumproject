package com.hrm.qa.Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.util.Testutil;



public class DashboardPage extends TestBase {
	
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
	WebElement DashboardLabel;
	
	@FindBy(xpath ="//a[@class='oxd-main-menu-item']/span")
	WebElement AdminLinkbutton;
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement AddButton;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']/p" )
	WebElement UserdropdownName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	WebElement SearchInputtxt;
	
	@FindBy(xpath ="//button[@class='oxd-icon-button oxd-main-menu-button']")
	WebElement MainMenuButton;
	
	@FindBy(xpath ="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	WebElement SearchLabel; 
	
	
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean  VerifyDashboardLabel() {
		
	   return  DashboardLabel.isDisplayed();
	}
	
	public UserManagementPage ClickOnAdminlink() {

	 	AdminLinkbutton.click();
	 	
	 	return new UserManagementPage();
	}
	
	public UserManagementPage ClickonAddbutton() {
		
	 	 AddButton.click();
	 	return new UserManagementPage();
	}
	
	
	public boolean VerifyUserdropdownName() {
		
		return UserdropdownName.isDisplayed();
	}
	
	public DashboardPage VerifyMainMenuButton() throws InterruptedException {
	
	    MainMenuButton.click(); 
		return new DashboardPage();
	}
	
	public DashboardPage VerifySearchtext(String Search) {
		
		 SearchInputtxt.sendKeys(Search);
		 driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		 
		 SearchLabel.getText();
		 return new DashboardPage();
		
	}
	
	public String VerifycompareText() {
		
		return SearchLabel.getText();
	}
	
}
