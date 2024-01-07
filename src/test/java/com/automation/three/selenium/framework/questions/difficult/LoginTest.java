package com.automation.three.selenium.framework.questions.difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	public WebDriver driver;
	public LoginPage loginpage;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		loginpage = new LoginPage(driver);
		loginpage.clickMyAccountLink();
		loginpage.clickLoginLink();
		
	}
	
	@Test
	public void testSuccessfulLogin() {
		loginpage.login();
		
		Assert.assertTrue(loginpage.verifyLogin());
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}
	
}
