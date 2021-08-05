package com.automatedtest.saucedemo.pages;

import static com.automatedtest.saucedemo.helper.Helper.getWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.automatedtest.saucedemo.helper.*;


public class YourInformationPage extends BasePage{

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    
    public void submitUserInformation (String firstName, String lastName, String postalCode){
    	element(this.firstName).sendKeys(firstName);
    	element(this.lastName).sendKeys(lastName);
    	element(this.postalCode).sendKeys(postalCode);
    	element(this.continueBtn).click();
    }
    
}

