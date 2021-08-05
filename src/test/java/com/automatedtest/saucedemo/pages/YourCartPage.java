package com.automatedtest.saucedemo.pages;

import static com.automatedtest.saucedemo.helper.Helper.getWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.automatedtest.saucedemo.helper.*;


public class YourCartPage extends BasePage{

	By checkout = By.id("checkout");   
	
	   public void clickCheckout() {
		   element(checkout).click();
	   }
}

