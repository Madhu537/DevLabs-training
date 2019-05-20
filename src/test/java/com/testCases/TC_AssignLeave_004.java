package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObjects.AssignLeave;
import com.pageObjects.LoginPage;

public class TC_AssignLeave_004 extends BaseClass{

	@Test(priority=0)
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		AssignLeave leave = new AssignLeave(driver);
		logger.info("Applying for leave");
		leave.AssignLeave();
		logger.info("Leave submited successfully");
}

}