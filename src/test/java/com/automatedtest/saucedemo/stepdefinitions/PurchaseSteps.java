package com.automatedtest.saucedemo.stepdefinitions;

import com.automatedtest.saucedemo.helper.*;
import com.automatedtest.saucedemo.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSteps {
	
	private LoginPage loginPage;
	private ProductPage productPage;
	private YourCartPage yourCartPage;
	private YourInformationPage yourInformationPage;
	private CheckOutPage checkoutPage;

	
	public PurchaseSteps(LoginPage loginPage, ProductPage productPage, 
			YourCartPage yourCartPage, YourInformationPage yourInformationPage, CheckOutPage checkoutPage) {
		this.loginPage = loginPage;
		this.productPage = productPage;
		this.yourCartPage = yourCartPage;
		this.yourInformationPage = yourInformationPage;
		this.checkoutPage = checkoutPage;
	}
		
@Given("user is on login page")
public void user_is_on_login_page() {
	Helper.openBrowser();
}

@When("user navigates to product page successfully with valid credentials")
public void user_navigates_to_product_page_successfully_with_valid_credentials() {
	loginPage.login();
}

@And("add cheapest and costier product to basket")
public void add_cheapest_and_costier_product_to_basket() {
    // Write code here that turns the phrase above into concrete actions
	productPage.selectFilterOption("Price (high to low)");
	productPage.verifySortPrice();
	productPage.selectCostlierAndCheapest();
	productPage.clickCheckout();
}

@And("open basket and checkout products")
public void open_basket_and_checout_products() {
	yourCartPage.clickCheckout();
}

@When("user is able to complete details {string} {string} and {string}")
public void user_is_able_to_complete_details_and(String firstName, String lastName, String postalCode) {
	yourInformationPage.submitUserInformation ( firstName,  lastName,  postalCode);
}

@Then("user can finish purchase successfully")
public void user_can_finish_purchase_successfully() {
	checkoutPage.completePurchase();
}



}
