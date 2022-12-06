package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By maleGenderButton = By.xpath("//div[@class='form-fields']/div[1]/div/span[1]");
    By femaleGenderButton = By.xpath("//div[@class='form-fields']/div[1]/div/span[2]");

    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");

    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationSuccessfulText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButtonAfterRegistrationComplete = By.xpath("//a[contains(text(),'Continue')]");

    public String getRegisterPageText() {
        return getTextFromElement(registerText);
    }

    public void selectGenderOnRegistrationPage(String gender) {

        if (gender.equalsIgnoreCase("Male")) {
            clickOnElement(maleGenderButton);
        } else if (gender.equalsIgnoreCase("Female")) {
            clickOnElement(femaleGenderButton);
        }

    }

    public void sendTextToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void sendTextToLastNameField(String lName) {
        sendTextToElement(lastNameField, lName);
    }

    public void selectDayOfBirth(String day) {
        selectByValueFromDropDown(dateOfBirthDay, day);
    }

    public void selectDayOfMonth(String month) {
        selectByValueFromDropDown(dateOfBirthMonth, month);
    }

    public void selectDayOfYear(String year) {
        selectByValueFromDropDown(dateOfBirthYear, year);
    }

    public void sendTextToEmailField(String email) {
        sendTextToElement(emailId, email + getAlphaNumericString(2) + "@gmail.com");
    }

    public void sendTextToPasswordField(String rPassword) {
        sendTextToElement(password, rPassword);
    }

    public void sendTextToConfirmPasswordField(String cPassword) {
        sendTextToElement(confirmPassword, cPassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegistrationSuccessfulText() {
        return getTextFromElement(registrationSuccessfulText);
    }

    public void clickOnContinueButtonAfterRegistrationComplete() {
        clickOnElement(continueButtonAfterRegistrationComplete);
    }
}