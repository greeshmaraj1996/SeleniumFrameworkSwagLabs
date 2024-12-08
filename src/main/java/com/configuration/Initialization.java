package com.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialization {

	public static WebDriver driver;

	public static void Initial() {

		String browser = System.getProperty("browsername","chrome");
		
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid");
		}
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

}
