package com.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.DirectoryPage;
import com.pageObjects.LoginPage;

public class TC_SearchDirectoryTest_002 extends BaseClass {

	@Test(priority = 1,enabled=false)
	public void SearchDirectory() throws IOException, InterruptedException {

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("Log in successful");
		if (driver.getTitle().equals("OrangeHRM2")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

		Thread.sleep(3000);
		DirectoryPage Dpage = new DirectoryPage(driver);
		Dpage.SearchDirctory();
		logger.info("Directory search successfully");
		Dpage.ResetDirectory();
		logger.info("Reset Directory search successful");
		
		
	}

}
