package com.automatedtest.saucedemo.pages;

import com.automatedtest.saucedemo.helper.*;


import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	By username = By.id("user-name");
	By password = By.id("password");
    By loginButton = By.id("login-button");
    

// Login to saucedemo application
  public void login() {
	element(username).sendKeys(Helper.getuserName());
	element(password).sendKeys(Helper.getPassword());
	element(loginButton).click();
	//wait(10);
  }

}