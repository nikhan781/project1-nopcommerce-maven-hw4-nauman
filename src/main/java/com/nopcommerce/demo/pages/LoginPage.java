package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    By checkoutAsGuestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By registerButton = By.xpath("//button[@class='button-1 register-button']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeMessage);
    }

    public void enterEmailId(String userEmail) {
        sendTextToElement(emailField, userEmail);
    }

    public void enterPassword(String userPassword) {
        sendTextToElement(passwordField, userPassword);
    }

    public void clickOnLogInButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }
}
