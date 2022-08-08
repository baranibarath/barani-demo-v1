package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Get the driver Object 
	WebDriver ldriver;
	
	// Creating constructor and WebDriver rdriver as parameter
	LoginPage(WebDriver rdriver)
	{
		// initiating the driver
		ldriver = rdriver;
		//Specifying the page factory class
		PageFactory.initElements(rdriver, this);
	}
	
	//identifying the elements present in the login page
	
	@FindBy(name="email")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="continue")
	@CacheLookup
	WebElement continuebtn;
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}

}
