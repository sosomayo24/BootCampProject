package com.automation.three.selenium.framework.questions.easy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Framework_Questions_Easy_Part1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void tutorialsNinja() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		
	}
	
	@Test
	public void verifyingTitle() {
		
		System.out.println("The title is : " + driver.getTitle());
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Is Correct");
		}
		
	}
	
	@Test 
	public void login() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		Assert.assertTrue(logoutLink.isEnabled());
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
