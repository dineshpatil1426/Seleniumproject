package com.hrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class UserManagementPage extends TestBase {
	
	
	@FindBy(xpath = "//div[@class='orangehrm-card-container']/h6")
	WebElement AddUserLabel;
	
	
	
	public UserManagementPage() {
		PageFactory.initElements(driver, this);
	}

	
	public String VerifyAddUserLabel() {
		
		return AddUserLabel.getText();
	}
	
	
	
}
