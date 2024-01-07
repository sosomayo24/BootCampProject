package com.automation.three.selenium.framework.questions.difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;
	
	@FindBy(name = "search")
	private WebElement searchTextBoxField;
	
	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;
	
	@FindBy(linkText = "HP LP3065")
	private WebElement validProduct;
	
	@FindBy(xpath = "//p[contains(text(), 'There is no product that matches the search criteria.')]") 
	private WebElement invalidProductWarningMessage;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
		public void enterProductDetail() {
			searchTextBoxField.sendKeys("hp");
		}
		
		public void clickOnSearchIcon() {
			searchButton.click();
		
			
		}
	
		public boolean verifyDisplayStatusOfValidProduct() {
			boolean presenceValidProduct = validProduct.isDisplayed();
			return presenceValidProduct;
		}
		
		public boolean verifyDisplayStatusOfInValidProduct() {
			boolean presenceInvalidProduct = invalidProductWarningMessage.isDisplayed();
			return presenceInvalidProduct;
		}
		
		public void clickOnAddToCartButton() {
			addToCartButton.click();
		
		}
	
}
