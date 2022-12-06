package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();


    @Test
    public void verifySuccessfulPageNavigation() {
        topMenuPage.selectMenu("Electronics");
        Assert.assertEquals(topMenuPage.textOnEachPage(),"Electronics");
    }
    @Test
    public void verifySuccessfulPageNavigation2() {
        topMenuPage.selectMenu("Computers");
        Assert.assertEquals(topMenuPage.textOnEachPage(),"Computers");
    }
}
