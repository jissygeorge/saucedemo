package com.automatedtest.saucedemo.pages;

import static com.automatedtest.saucedemo.helper.Helper.getWebDriver;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.automatedtest.saucedemo.helper.*;


public class ProductPage extends BasePage {

   By filter = By.xpath("//*[@class='product_sort_container']");
   By addToCart = By.xpath("//*[@class='btn btn_primary btn_small btn_inventory']");
   By itemPrice = By.xpath("//*[@class='inventory_item_price']");
   By shoppingCart = By.xpath("//*[@class='shopping_cart_link']");
   
  
   public void selectFilterOption(String filterOption) {
	   Select objSelect = new Select(element(filter));
	   objSelect.selectByVisibleText(filterOption);
   }
   
   public void selectCostlierAndCheapest () {
	   List<WebElement> btnAddtoCart = elements(addToCart);
	   int count = btnAddtoCart.size();
	   
	   btnAddtoCart.get(1).click();
	   btnAddtoCart.get(count-1).click();
   }
   
   public void verifySortPrice() {
	   Number prevPrice=0.0;
	   List<WebElement> priceTag = elements(itemPrice);
	   int count = priceTag.size();
	   
	   Locale locale = Locale.US;
	   
	   for(int iter=0; iter<count; iter++) {
		   String sPrice = priceTag.get(iter).getText();
		   Number dPrice=0.0;
		   
		   try {
			   dPrice = NumberFormat.getCurrencyInstance(locale).parse(sPrice);
			   System.out.println("**********");
			   System.out.println(dPrice);
			   System.out.println("**********");
		   }catch(Exception ex) {
			   System.out.println("**********");
			   System.out.println(ex);
			   System.out.println("**********");
		   }
		   
		   if(iter>0) {
			   assert dPrice.doubleValue() <= prevPrice.doubleValue();
		   }
		   prevPrice = dPrice;
	   }
	   
   }
   
   public void clickCheckout() {
	   element(shoppingCart).click();
   }
   	  
}

