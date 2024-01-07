package com.automation.three.selenium.framework.questions.medium;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class RegistrationPage {
		
	    public WebDriver driver;
	    
	    @FindBy(linkText = "My Account")
	    private WebElement myAccountLink;
	    
	    @FindBy(linkText = "Register")
	    private WebElement registerLink;

	    @FindBy(id = "input-firstname")
	    private WebElement firstNameInput;

	    @FindBy(id = "input-lastname")
	    private WebElement lastNameInput;

	    @FindBy(id = "input-email")
	    private WebElement emailInput;

	    @FindBy(id = "input-telephone")
	    private WebElement telephoneInput;

	    @FindBy(id = "input-password")
	    private WebElement passwordInput;

	    @FindBy(id = "input-confirm")
	    private WebElement confirmPasswordInput;

	    @FindBy(name = "agree")
	    private WebElement agreeCheckbox;

	    @FindBy(css = "input.btn.btn-primary")
	    private WebElement continueButton;

	    @FindBy(xpath = "//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]")
	    private WebElement successMessage;

	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void clickMyAccountLink() {
	        driver.findElement(By.linkText("My Account")).click();
	    }

	    
	    public void clickRegisterLink() {
	        driver.findElement(By.linkText("Register")).click();
	    }

	    public void register(String firstName, String lastName, String email, String telephone, String password) {
	        firstNameInput.sendKeys(firstName);
	        lastNameInput.sendKeys(lastName);
	        emailInput.sendKeys(email);
	        telephoneInput.sendKeys(telephone);
	        passwordInput.sendKeys(password);
	        confirmPasswordInput.sendKeys(password);
	        agreeCheckbox.click();
	        continueButton.click();
	    }

	    public String getSuccessMessage() {
	        return successMessage.getText();
	    }
	}

