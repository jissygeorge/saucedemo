package com.automatedtest.saucedemo.pages;

import static com.automatedtest.saucedemo.helper.Helper.getWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	   protected WebElement element(By by){
	 		return getWebDriver().findElement(by);
	   } 
	   
	   protected List<WebElement> elements(By by){
	 		return getWebDriver().findElements(by);
	   } 
}

