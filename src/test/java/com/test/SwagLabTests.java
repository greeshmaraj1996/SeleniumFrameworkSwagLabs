package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SwagLabTests {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void SetUp() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void LoginDisplayed() {
		assertEquals(driver.findElement(By.id("login-button")).isDisplayed(), true, "Button displayed");

	}

	@Test
	public void EmptyUsernamePassword() {

		driver.findElement(By.id("login-button")).click();
		assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(),"Epic sadface: Username is required");
	}

	@Test
	public void VerifySwagLabsHeading() {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		assertEquals(driver.findElement(By.xpath("//div[@class='app_logo']")).getText(), "Swag Labs");
		
	}
	
	@Test
	public void ProductHeading() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		assertEquals(driver.findElement(By.xpath("//span[@class='title']")).getText(), "Products");
		
	}
}
