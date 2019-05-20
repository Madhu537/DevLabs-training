package com.pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave {

	
	WebDriver ldriver;

	public AssignLeave(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "menu_leave_viewLeaveModule")
	WebElement Leave;
	
	@FindBy(id = "menu_leave_assignLeave")
	WebElement AssignLeave;
	
	@FindBy(id = "assignleave_txtEmployee_empName")
	WebElement EmpName;
	
	@FindBy(id = "assignleave_txtLeaveType")
	WebElement LeaveType;
	
	@FindBy(id = "assignleave_txtFromDate")
	WebElement FromDate;
	
	@FindBy(id = "assignleave_txtToDate")
	WebElement ToDate;
	
	@FindBy(id = "assignleave_duration_duration")
	WebElement Duration;
	
	@FindBy(id = "assignBtn")
	WebElement AssignButton;
	
	public void AssignLeave() throws InterruptedException
	{
		Leave.click();
		AssignLeave.click();
		EmpName.sendKeys("Madhu Babu N");
		WebElement element = ldriver.findElement(By.id("assignleave_txtLeaveType"));
		Select oSelect = new Select(element);
		Thread.sleep(3000);
		oSelect.selectByVisibleText("Vacation US");
		Thread.sleep(3000);
		FromDate.clear();
		FromDate.sendKeys("2019-05-23");
		FromDate.sendKeys(Keys.ENTER);
		ToDate.clear();
		ToDate.sendKeys("2019-05-23");
		ToDate.sendKeys(Keys.ENTER);
		AssignButton.click();
		
		
		
		
	}
	
	
	
	
}

