package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutCompleteTests extends CheckOutStepTwoTests {

    @Test
    public  void verificationOfSuccessfulPurchaseTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.saucedemo.com/cart.html");
        cartPage.checkOutButtonClick();
        checkOutPage.fillAllFields("John", "Smith", "34234");
        checkOutPage.clickContinueButton();
        checkOutStepTwoPage.clickOnFinishButton();
        Assert.assertEquals(checkOutCompletePage.getCheckOutCompleteInformation(), "CHECKOUT: COMPLETE!");
    }

    @Test
    public  void backToProductPageAfterSuccessfulPurchaseTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.saucedemo.com/cart.html");
        cartPage.checkOutButtonClick();
        checkOutPage.fillAllFields("John", "Smith", "34234");
        checkOutPage.clickContinueButton();
        checkOutStepTwoPage.clickOnFinishButton();
        checkOutCompletePage.backHomeButtonClick();
        Assert.assertEquals(productsPage.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
}

