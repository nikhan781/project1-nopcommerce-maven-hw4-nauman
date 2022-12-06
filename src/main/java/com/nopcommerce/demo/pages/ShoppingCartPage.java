package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantityField = By.xpath("//td[@class='quantity']/input");
    By updateCartButton = By.id("updatecart");
    By totalPrice = By.xpath("//span[@class='value-summary'][1]/strong");
    By termAndConditions = By.id("termsofservice");
    By checkoutButton = By.name("checkout");

    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public void sendTextToQuantityField(String qty) {
        clearTextFromElement(quantityField);
        sendTextToElement(quantityField, qty);
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updateCartButton);
    }

    public String getTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermAndConditions() {
        clickOnElement(termAndConditions);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }

    public String getQuantityInQtyField(){
        WebElement actualQuantity =driver.findElement(quantityField);
        String actual = actualQuantity.getAttribute("value");
        return actual;
    }

}
