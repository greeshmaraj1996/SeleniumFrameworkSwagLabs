package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilitiesconcept;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Username = By.id("user-name");
	By Password = By.id("password");
	By LoginButton = By.id("login-button");
	By SwagLabs=By.xpath("//div[@class='app_logo']");
	By Product=By.xpath("//span[@class='title']");

	public void EnterUsername(String user) {
		
		Utilitiesconcept.EnterText(driver, Username, user);
		//driver.findElement(Username).sendKeys(user);
		
	}

	public void EnterPassword(String pass) {
		Utilitiesconcept.EnterText(driver, Password, pass);
		//driver.findElement(Password).sendKeys(pass);
		
	}

	public void ClickLoginButton() {
		Utilitiesconcept.ClickElememt(driver, LoginButton);
		//driver.findElement(LoginButton).click();
	}
	public boolean verifySwagLabsdisplayed() {
		return Utilitiesconcept.IsElementDisplayed(driver, SwagLabs);	
		//return driver.findElement(SwagLabs).isDisplayed();
	}
	public boolean verifyproductdisplayed() {
		return Utilitiesconcept.IsElementDisplayed(driver, Product);
				//	return driver.findElement(Product).isDisplayed();
		
	}
}
