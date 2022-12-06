package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TopMenuPage extends Utility {

    By topMenuBar = By.xpath("//div[@class='header-menu']//ul/child::*");

    By pageTitles = By.cssSelector("div.page-title");

    //This method will choose the options from main menu
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(topMenuBar);
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(menu)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenuBar);
        }
    }

    public void hoverOverMenu(String mMenu) {
        Actions actions = new Actions(driver);
        List<WebElement> topMenuList = driver.findElements(topMenuBar);
        try {
            for (WebElement list : topMenuList) {
                if (list.getText().equalsIgnoreCase(mMenu)) {
                    actions.moveToElement(list).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenuBar);
        }
    }

    //This method will return title of each page for verification purpose
    public String textOnEachPage() {
        return getTextFromElement(pageTitles);
    }

}
