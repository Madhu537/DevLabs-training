package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.ReadConfig;

public class DirectoryPage {

	WebDriver ldriver;

	public DirectoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "menu_directory_viewDirectory")
	@CacheLookup
	WebElement Directory;

	@FindBy(id = "searchDirectory_emp_name_empName")
	@CacheLookup
	WebElement DirName;

	@FindBy(id = "searchDirectory_job_title")
	@CacheLookup
	WebElement JobTitle_txt;

	@FindBy(id = "searchDirectory_location")
	@CacheLookup
	WebElement Location;

	@FindBy(id = "searchBtn")
	@CacheLookup
	WebElement Search;
	
	@FindBy(id = "resetBtn")
	@CacheLookup
	WebElement Reset;
	
	//This method is used to Search for a Directory
	public void SearchDirctory() throws InterruptedException {
		//ReadConfig config = new ReadConfig();
		Directory.click();
		//config.getDirName();
		DirName.sendKeys("Selenium Webdriver");
		
		DirName.sendKeys(Keys.ENTER);

		WebElement element = ldriver.findElement(By.id("searchDirectory_job_title"));
		Select oSelect = new Select(element);
		Thread.sleep(3000);
		oSelect.selectByVisibleText("All");
		Thread.sleep(3000);
		ldriver.findElement(By.id("searchDirectory_location"));
		new Select(element);
		oSelect.selectByVisibleText("All");
		Search.click();

	}
	public void setDirName(String Dirname)
	{
		DirName.sendKeys(Dirname);
	}
	//This method is used to reset a Directory
	public void ResetDirectory(){
		Reset.click();
	}
	
}