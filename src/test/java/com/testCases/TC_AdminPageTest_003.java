package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObjects.AdminPage;
import com.pageObjects.DirectoryPage;
import com.pageObjects.LoginPage;

public class TC_AdminPageTest_003 extends BaseClass{

	@Test(priority=2,enabled=false)
	public void SearchAdmin() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("Log in successfull");
		Thread.sleep(3000);
		AdminPage Admin = new AdminPage(driver);
		logger.info("Admin search started");
		Admin.AdminSearch();
		Admin.AdminReset();
		logger.info("Admin search reset done");
		Admin.SelectSearchedUserThenAddUser();
		logger.info("Selected searched user and clicked on Add user button");
	}
	
}
