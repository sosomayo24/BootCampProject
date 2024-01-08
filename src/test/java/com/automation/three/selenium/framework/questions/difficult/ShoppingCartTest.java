package com.automation.three.selenium.framework.questions.difficult;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ShoppingCartTest {
	
	public WebDriver driver;
	public ShoppingCartPage shoppingcartPage;
	
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		shoppingcartPage = new ShoppingCartPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingcartPage.getIphone()));
		
	}
	
	@Test
	public void testAddProductToCartAndVerify() {
		
		shoppingcartPage.addingProductToCart();
		
		Assert.assertTrue(shoppingcartPage.verifyProductIsAdded());
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
