package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoriesPage extends Utility {

    By categoriesList = By.xpath("//div[@class='item-grid']/child::*");

    public void selectCategory(String cat) {
        List<WebElement> catList = driver.findElements(categoriesList);
        try {
            for (WebElement list : catList) {
                if (list.getText().equalsIgnoreCase(cat)) {
                    list.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            catList = driver.findElements(categoriesList);
        }
    }
}
