package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Loginpage;
import com.learnautomation.utility.Helper;
public class LoginTestCRM extends BaseClass {

	@Test
	public void loginApp()
	{
		
		//excel.getStringData("Login", 0, 0);
		logger=report.createTest("Login to crm");
		
		Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class );
		
		logger.info("Login success");
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login pass");
		
		Helper.captureScreenshot(driver);
    }
	
	
	
}
