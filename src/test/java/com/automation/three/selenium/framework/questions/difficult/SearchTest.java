package com.automation.three.selenium.framework.questions.difficult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {
	
	public WebDriver driver;
    public SearchPage searchPage;

    @BeforeClass
    public void setUp() {
        
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo");
        searchPage = new SearchPage(driver);
    }

    @Test
    public void testSearchWithValidProduct() {
        searchPage.enterProductDetail();
        searchPage.clickOnSearchIcon();

        Assert.assertTrue(searchPage.verifyDisplayStatusOfValidProduct());
    }

    @Test
    public void testSearchWithNoEntry() {
    	
        searchPage.clickOnSearchIcon();

        Assert.assertTrue(searchPage.verifyDisplayStatusOfInValidProduct());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
