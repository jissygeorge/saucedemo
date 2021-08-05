package com.automatedtest.saucedemo.pages;

import static com.automatedtest.saucedemo.helper.Helper.getWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.automatedtest.saucedemo.helper.*;


public class CheckOutPage extends BasePage {

	By finishBtn = By.id("finish"); 
	By headerMsg = By.xpath("//*[@class='complete-header']"); 
	
	public void completePurchase() {
		element(finishBtn).click();
		assert element(headerMsg).getText().equals("THANK YOU FOR YOUR ORDER");
	}
}

