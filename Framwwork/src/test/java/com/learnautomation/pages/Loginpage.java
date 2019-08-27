package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver ldriver)
	{
		this.driver = ldriver;
		
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement uname;
	@FindBy(xpath="//input[@id='pass']") WebElement pass;
	@FindBy(xpath="//input[@value='Log In']") WebElement Loginbutton;
	
	public void loginToCRM(String usernameApplication,String passwordApplication) 
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			
		}
	  
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		Loginbutton.click();
	}
	

	
	
	
	
}
