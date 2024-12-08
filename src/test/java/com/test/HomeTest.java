package com.test;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
	
	
	//WebDriver driver;	
	//HomePage obj2=new HomePage(driver);
	
	
	
	@Test(priority=0)
	public void VerifySwagLabHeading() {
		/*
		 * driver=new ChromeDriver(); 
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize(); 
		 * HomePage obj2=new HomePage(driver);
		 */
		obj2.EnterUsername("standard_user");
		obj2.EnterPassword("secret_sauce");
		obj2.ClickLoginButton();
		assertEquals(obj2.verifySwagLabsdisplayed(), true);
		
	}	
	
	
	@Test(priority=1)
	public void ProductHeadingTest() {
		/*
		 * driver=new ChromeDriver(); 
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize(); 
		 * HomePage obj3=new HomePage(driver);
		 */
		obj2.EnterUsername("standard_user");
		obj2.EnterPassword("secret_sauce");
		obj2.ClickLoginButton();
		assertEquals(obj2.verifyproductdisplayed(),true);
	}
	
}
