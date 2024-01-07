package com.automation.three.selenium.framework.questions.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
    public WebDriver driver;
    
    @FindBy(name = "search")
    private WebElement searchBar;
    
    @FindBy(css = "button.btn.btn-default.btn-lg")
    private WebElement search;
    
    @FindBy(linkText = "HP LP3065")
    private WebElement hpLaptop;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;
    
    @FindBy(linkText = "Shopping Cart")
    private WebElement viewCart;

    @FindBy(linkText = "Checkout")
    private WebElement checkoutButton;

    @FindBy(linkText = "HP LP3065")
    private WebElement productName;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchAndAddToCart() {
    	 searchBar.sendKeys("HP");
         search.click();
         hpLaptop.click();
         addToCartButton.click();    }

    public void viewCartAndVerifyProduct() {
    	viewCart.click();
        
    }

    public String getProductName() {
        return productName.getText();
    }
    
    public void checkout() {
    	checkoutButton.click();
    	
    }
    
}