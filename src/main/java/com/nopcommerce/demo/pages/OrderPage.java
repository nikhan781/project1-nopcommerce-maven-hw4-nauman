package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class OrderPage extends Utility {

    By productName = By.xpath("//div[@class='product-name']/h1");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD400GB = By.id("product_attribute_3_7");
    By selectVistaPremium = By.id("product_attribute_4_9");
    By selectTotalCommander = By.id("product_attribute_5_12");
    By price = By.xpath("//div[@class='product-price']");

    By quantityField = By.id("product_enteredQuantity_20");

    By addToCartButton = By.xpath("//button[@class='button-1 add-to-cart-button']");
    By messageAfterAddingToCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButtonOnMessage = By.xpath("//div[@id='bar-notification']/div[1]/span[1]");

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public void selectAProcessor(String process) {
        selectByVisibleTextFromDropDown(selectProcessor, process);
    }

    public void SelectARam(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
    }

    public void clickAndSelectHDD() {
        clickOnElement(selectHDD400GB);
    }

    public void clickAndSelectOsPremium() {
        clickOnElement(selectVistaPremium);
    }

    public void clickAndSelectTotalCommander() {
        clickOnElement(selectTotalCommander);
    }

    public String getPrice() {
        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getMessageAfterAddingToCart() {
        return getTextFromElement(messageAfterAddingToCart);
    }

    public void clickOnCloseButtonOnMessage() {
        clickOnElement(closeButtonOnMessage);
    }

    public void sentTextToQuantityField(String qty) {
        clearTextFromElement(quantityField);
        sendTextToElement(quantityField, qty);
    }


}
