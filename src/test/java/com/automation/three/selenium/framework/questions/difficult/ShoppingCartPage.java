package com.automation.three.selenium.framework.questions.difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public WebDriver driver;
	
	@FindBy(linkText = "iPhone")
	private WebElement iphone;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(linkText = "Shopping Cart")
	private WebElement shoppingCartIcon;
	
	@FindBy(xpath = "//td[text()='product 11']")
	private WebElement productModelName;
	
	public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	 public WebElement getIphone() {
	        return iphone;
	    }
	
	public void addingProductToCart() {
		iphone.click();
		addToCartButton.click();
		shoppingCartIcon.click();
	
	}
	
	public boolean verifyProductIsAdded() {
		boolean verify = productModelName.isDisplayed();
		return verify;
	}

}
