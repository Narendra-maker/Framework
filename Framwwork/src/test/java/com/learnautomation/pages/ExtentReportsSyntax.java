
package com.learnautomation.pages;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsSyntax {

	@Test
	public void LoginReports() {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Login-Extent.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		//One Test start
		ExtentTest logger=extent.createTest("LoginTest");
		logger.log(Status.INFO, "Login to application");
		logger.log(Status.INFO, "Title verified");
		extent.flush();
        //End
		
		//2nd Test start
		ExtentTest logger1=extent.createTest("Logoff");
		logger1.log(Status.FAIL, "Title Verified");
		extent.flush();
		//End
		
			
	}
}
