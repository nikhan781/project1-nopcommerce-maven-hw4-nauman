package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Adding all the elements on homepage
    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By searchStore = By.id("small-searchterms");

    By logoutLink = By.xpath("//a[contains(text(),'Log out')]");

    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartLink = By.xpath("//button[contains(text(),'Go to cart')]");

    By welcomeTextMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void enterTextInSearchStoreField(String searchProduct) {
        sendTextToElement(searchStore, searchProduct);
    }

    public void hoverMouseOverShoppingCartLink() {
        mouseHoverToElement(shoppingCartLink);
    }

    public void clickOnGoToCartLink() {
        clickOnElement(goToCartLink);
    }

    public String getWelcomeTextMessage() {
        return getTextFromElement(welcomeTextMessage);
    }

    public void clickOnLogOutLink() {
        clickOnElement(logoutLink);
    }

    public String currentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }
}
