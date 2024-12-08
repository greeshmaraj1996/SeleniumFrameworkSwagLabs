package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	//WebDriver driver;	

	@Test(priority=0)
	public void LoginDisplayed() {

		/*
		 * driver=new ChromeDriver(); 
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 *  LoginPage obj1=new LoginPage(driver);
		 */
		Assert.assertEquals(obj1.VerifyLoginButtonDisplayed(), true);
		

	}

	@Test(priority=1)
	public void VerifyAlertMessage() {
		obj1.ClickLoginButton();
		Assert.assertEquals(obj1.VerifyAlertMessage(), "Epic sadface: Username is required");
	}

}
