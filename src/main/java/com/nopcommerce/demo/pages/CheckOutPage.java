package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailIdField = By.id("BillingNewAddress_Email");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.name("BillingNewAddress.City");
    By addressField = By.id("BillingNewAddress_Address1");
    By postCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By telephoneNoField = By.id("BillingNewAddress_PhoneNumber");
    By continueButtonCheckout = By.name("save");
    By nextDayDelivery = By.id("shippingoption_1");
    By nextSecondDayDelivery = By.id("shippingoption_2");
    By continueButtonDelivery = By.xpath("//button[@class ='button-1 shipping-method-next-step-button']");
    By creditCardPaymentMethod = By.id("paymentmethod_1");

    By continueButtonPayment = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectCreditCardFiled = By.id("CreditCardType");
    By cardholderNameField = By.xpath("//input[@id='CardholderName']");
    By cardNumberFiled = By.xpath("//input[@id='CardNumber']");
    By expiryMonthFiled = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearFiled = By.xpath("//select[@id='ExpireYear']");
    By cardCodeFiled = By.xpath("//input[@id='CardCode']");
    By continueButtonCreditCard = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethod = By.xpath("//li[@class='shipping-method']");
    By totalFinalPrice = By.xpath("//tr[@class='order-total']/td[2]");
    By confirmButton = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderProcessedMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButtonOnThankYouNote = By.xpath("//button[@class='button-1 order-completed-continue-button']");


    public void sendTextToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void sendTextToLastNameField(String lName) {
        sendTextToElement(lastNameField, lName);
    }

    public void sendTextTOEmailField(String gEmail) {
        sendTextToElement(emailIdField, gEmail + getAlphaNumericString(2) + "@gmail.com");
    }

    public void sendTextToCityField(String gCity) {
        sendTextToElement(cityField, gCity);

    }

    public void selectACountryInCountryField(String gCountry) {
        selectByVisibleTextFromDropDown(countryField, gCountry);
    }

    public void sendTextToAddressField(String gAddress) {
        sendTextToElement(addressField, gAddress);
    }

    public void sendTextToPostCodeField(String gPostCode) {
        sendTextToElement(postCodeField, gPostCode);
    }


    public void sendTextToPhoneField(String gtele) {
        sendTextToElement(telephoneNoField, gtele);
    }

    public void clickOnContinueButtonCheckout() {
        clickOnElement(continueButtonCheckout);
    }

    public void clickOnNextDayAirDelivery() {
        clickOnElement(nextDayDelivery);
    }

    public void clickOnSecondDayAirDelivery() {
        clickOnElement(nextSecondDayDelivery);
    }

    public void clickOnContinueButtonDelivery() {
        clickOnElement(continueButtonDelivery);
    }

    public void clickOnCreditCardPaymentMethod() {
        clickOnElement(creditCardPaymentMethod);
    }

    public void clickOnContinueButtonPayment() {
        clickOnElement(continueButtonPayment);
    }

    public void selectCreditCard(int cCard) {
        selectByIndexFromDropDown(selectCreditCardFiled, cCard);
    }

    public void sendTextToCardholderNameField(String cardholder) {
        sendTextToElement(cardholderNameField, cardholder);
    }

    public void sendTextToCardNumberField(String cardNumber) {
        sendTextToElement(cardNumberFiled, cardNumber);
    }

    public void selectExpiryMonth(String month) {
        selectByValueFromDropDown(expiryMonthFiled, month);
    }

    public void selectExpiryYear(String year) {
        selectByValueFromDropDown(expiryYearFiled, year);
    }

    public void sendTextToCardCodeField(String cardCode) {
        sendTextToElement(cardCodeFiled, cardCode);
    }

    public void clickOnContinueButtonCreditCard() {
        clickOnElement(continueButtonCreditCard);
    }

    public String getPaymentMethodText() {
        return getTextFromElement(paymentMethodText);
    }

    public String getDeliveryMethodText() {
        return getTextFromElement(shippingMethod);
    }

    public String getTotalPriceText() {
        return getTextFromElement(totalFinalPrice);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouTextAfterOrderConfirmation() {
        return getTextFromElement(thankYouText);
    }

    public String getOrderProcessedSuccessfullyTextAfterOrderConfirmation() {
        return getTextFromElement(orderProcessedMessage);
    }

    public void clickOnContinueButtonOnThankYouNote() {
        clickOnElement(continueButtonOnThankYouNote);
    }

}
