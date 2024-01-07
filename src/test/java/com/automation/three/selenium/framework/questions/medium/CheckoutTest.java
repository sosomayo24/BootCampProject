package com.automation.three.selenium.framework.questions.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTest {
	
	 public WebDriver driver;
	 public CheckoutPage checkoutPage;

	    @BeforeMethod
	    public void setUp() {
	       
	        driver = new ChromeDriver();
	        driver.get("http://tutorialsninja.com/demo");
	        checkoutPage = new CheckoutPage(driver);
	    }

	    @Test
	    public void testCheckout() {
	        
	        checkoutPage.searchAndAddToCart();

	        checkoutPage.viewCartAndVerifyProduct();

	        String actualProductName = checkoutPage.getProductName();
	        String expectedProductName = "HP LP3065"; 
	        
	        if (actualProductName.equals(expectedProductName)) {
	            System.out.println("Product on the checkout page is correct.");
	            
	        checkoutPage.checkout();
	            
	        } else {
	            System.out.println("Incorrect product on the checkout page");
	        }
	        
	    }

	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
	}