package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.configuration.Initialization;
import com.pages.HomePage;
import com.pages.LoginPage;

public class BaseTest extends Initialization {

//WebDriver driver;
LoginPage obj1;
HomePage obj2;

	@BeforeMethod
	public void SetUp() {
		Initial();
//		driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();	
		obj1=new LoginPage(driver);
		obj2=new HomePage(driver);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
