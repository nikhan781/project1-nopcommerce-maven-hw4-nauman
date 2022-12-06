package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSelectionPage extends Utility {

    By sortBy = By.xpath("//select[@id='products-orderby']");
    By sortByOptions = By.xpath("///select[@id='products-orderby']");

    By listOfProductsOptions = By.xpath("//div[@class='product-grid']//child::*");
    By productsList = By.xpath("//div[@class='item-grid']/div//h2");
    By addToCartButton = By.xpath("//div[@class='buttons']");

    By listView = By.xpath("//a[contains(text(),'List')]");

    By productTitle = By.xpath("//div[@class='product-grid']//div[1]/div[2]//h2");

    By nokiaLumia = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");

    //This Method will sort the products
    public void selectSortByType(String sortByType) {
        selectByVisibleTextFromDropDown(sortBy, sortByType);

    }

    //This method will click on Add to cart button the change in product listing

    public void selectAddToCartProduct(String product) {
        List<WebElement> productsList = driver.findElements(listOfProductsOptions);
        try {
            for (WebElement list : productsList) {
                if (list.getText().equalsIgnoreCase(product)) {
                    Actions actions = new Actions(driver);
                    WebElement addCart = driver.findElement(addToCartButton);
                    actions.click(addCart).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            productsList = driver.findElements(listOfProductsOptions);
        }
    }

    //These 2 methods will verify sort by application
    public ArrayList beforeSortTheProducts() {
        List<WebElement> products = driver.findElements(productsList);
        ArrayList<String> originalProductList = new ArrayList<>();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    public ArrayList afterSortingTheProducts() {
        System.out.println(beforeSortTheProducts());
        Collections.reverse(beforeSortTheProducts());
        System.out.println(beforeSortTheProducts());
        List<WebElement> products = driver.findElements(productsList);
        ArrayList<String> afterSortList = new ArrayList<>();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }
        return afterSortList;
    }

    //This method will click onm list view
    public void clickOnListViewIcon() {
        clickOnElement(listView);
    }

    //This method will click on Add to cart button the change in product listing

    public void clickOnTheProduct(String product) {
        List<WebElement> productList = driver.findElements(listOfProductsOptions);
        try {
            for (WebElement list : productList) {
                if (list.getText().equalsIgnoreCase(product)) {
                    Actions actions = new Actions(driver);
                    WebElement products = driver.findElement(productTitle);
                    actions.moveToElement(products).click().build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            productList = driver.findElements(listOfProductsOptions);
        }
    }
    public void clickOnNokiaLumia(){
        clickOnElement(nokiaLumia);
    }
}
