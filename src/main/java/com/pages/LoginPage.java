package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilitiesconcept;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)// create constructor
	{
		this.driver = driver;
	}

	// --- webelements

	By LoginButton = By.id("login-button");
	By Errormessage = By.xpath("//h3[@data-test='error']");

	// --methods

	public boolean VerifyLoginButtonDisplayed() 
	{
		return Utilitiesconcept.IsElementDisplayed(driver, LoginButton);
		//return driver.findElement(By.id("login-button")).isDisplayed();
	}

	public void ClickLoginButton() {
		Utilitiesconcept.ClickElememt(driver, LoginButton);
		//driver.findElement(By.id("login-button")).click();
	}

	public String VerifyAlertMessage() {
	
		return Utilitiesconcept.GetTextElement(driver, Errormessage);
		
		//	return driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	}

}
