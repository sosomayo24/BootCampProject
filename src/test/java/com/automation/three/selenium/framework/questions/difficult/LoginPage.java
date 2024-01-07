package com.automation.three.selenium.framework.questions.difficult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 public WebDriver driver;
	    
	    @FindBy(linkText = "My Account")
	    private WebElement myAccountLink;
	    
	    @FindBy(linkText = "Login")
	    private WebElement loginLink;

	    @FindBy(id = "input-email")
	    private WebElement emailInput;

	    @FindBy(id = "input-password")
	    private WebElement passwordInput;

	    @FindBy(css = "input.btn.btn-primary")
	    private WebElement loginButton;

	    @FindBy(linkText = "Logout")
	    private WebElement logoutLink;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickMyAccountLink() {
	        driver.findElement(By.linkText("My Account")).click();
	    }

	    
	    public void clickLoginLink() {
	        driver.findElement(By.linkText("Login")).click();
	    }

	    public void login() {
	    	emailInput.sendKeys("seleniumpanda@gmail.com");
	    	passwordInput.sendKeys("Selenium@123");
	    	loginButton.click();
	    	
	    }

	    public boolean verifyLogin() {
	    	return logoutLink.isEnabled();
	    
	}



}
