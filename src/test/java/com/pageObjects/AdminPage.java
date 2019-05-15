package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	WebDriver ldriver;

	public AdminPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	@CacheLookup
	WebElement Administrator;

	@FindBy(id = "searchSystemUser_userName")
	@CacheLookup
	WebElement AdminName;

	@FindBy(id = "searchSystemUser_userType")
	@CacheLookup
	WebElement UserType;

	@FindBy(id = "searchSystemUser_employeeName_empName")
	@CacheLookup
	WebElement empType;

	@FindBy(id = "searchSystemUser_status")
	@CacheLookup
	WebElement Status;

	@FindBy(id = "searchBtn")
	@CacheLookup
	WebElement Search;

	@FindBy(id = "resetBtn")
	@CacheLookup
	WebElement Reset;
	
	@FindBy(id = "ohrmList_chkSelectRecord_4")
	@CacheLookup
	WebElement Checkbox;
	
	@FindBy(id = "btnAdd")
	@CacheLookup
	WebElement AddButton;
	
	@FindBy(id = "systemUser_userType")
	@CacheLookup
	WebElement UserRole;
	
	@FindBy(name = "systemUser[employeeName][empName]")
	@CacheLookup
	WebElement EmpName;
	
	@FindBy(id = "systemUser_userName")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(id = "systemUser_status")
	@CacheLookup
	WebElement UserStatus;
	
	@FindBy(id = "systemUser_password")
	@CacheLookup
	WebElement UserPwd;
	
	@FindBy(id = "systemUser_confirmPassword")
	@CacheLookup
	WebElement ConPwd;
	
	@FindBy(id = "btnSave")
	@CacheLookup
	WebElement SaveButton;
	
		
	// This method is used for AdminSearch
	public void AdminSearch() throws InterruptedException {

		Administrator.click();
		AdminName.sendKeys("Test user");
		AdminName.sendKeys(Keys.ENTER);

		WebElement element = ldriver.findElement(By.id("searchSystemUser_userType"));
		Select oSelect = new Select(element);
		Thread.sleep(3000);
		oSelect.selectByVisibleText("All");

		empType.sendKeys("John Smith");
		empType.sendKeys(Keys.ENTER);

		WebElement element1 = ldriver.findElement(By.id("searchSystemUser_status"));
		Select oSelect1 = new Select(element);
		Thread.sleep(3000);
		oSelect.selectByVisibleText("All");

		Search.click();

	}
	//This method is used to reset Admin page
	public void AdminReset(){
		
		Reset.click();
	}
	
	//This method is used to SelectSearchedUserThenAddUser
	public void SelectSearchedUserThenAddUser(){
		
		Checkbox.click();
		AddButton.click();
		
		
		
	}
	
	

}
