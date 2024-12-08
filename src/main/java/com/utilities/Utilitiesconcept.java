package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilitiesconcept {

	public static boolean IsElementDisplayed(WebDriver driver, By bylocator) {

		return driver.findElement(bylocator).isDisplayed();

	}
	public static  void ClickElememt(WebDriver driver, By bylocator) {

		 driver.findElement(bylocator).click();

	}
	public static String GetTextElement(WebDriver driver, By bylocator) {

		return driver.findElement(bylocator).getText();

	}
	 
	public static void EnterText(WebDriver driver, By bylocator,String value) {
		driver.findElement(bylocator).clear();
		 driver.findElement(bylocator).sendKeys(value);

	}
}
