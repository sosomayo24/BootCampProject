package com.automation.three.selenium.framework.questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TN_TestNG {
	
	public WebDriver driver;
	
	@Test
	public void tutorialsNinja() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		System.out.println("The title is : " + driver.getTitle());
		
		
		
	}
	
	@Test
	public void verifyingTitle() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Is Correct");
		}
		
	}

}
