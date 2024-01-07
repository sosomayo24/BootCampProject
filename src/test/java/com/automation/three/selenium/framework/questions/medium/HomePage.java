package com.automation.three.selenium.framework.questions.medium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 public WebDriver driver;
	   
	 public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//div[@class='logobar']//span[@class='hmsprite logo']")
	    private WebElement logoElement;

	    @FindBy(className = "signin")
	    private WebElement signinLink;
	    
	    @FindBy(css = "input.signinbtn")
	    private WebElement signinButton;

	    public boolean isLogoDisplayed() {
	        return logoElement.isDisplayed();
	    }

	    public void clickOnSigninLink() {
	        signinLink.click();
	        
	    }
	        
	    	 
	    
		

		
	}