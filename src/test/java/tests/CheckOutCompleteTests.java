package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutCompleteTests extends CheckOutStepTwoTests {

    @Test
    @Description(value = "product purchase verification test")
    public  void verificationOfSuccessfulPurchaseTest() {
        loginPage.openPage()
                 .login(System.getProperty("username"), System.getProperty("password"))
                 .addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openCardPage()
                 .checkOutButtonClick()
                 .fillAllFields("John", "Smith", "34234")
                 .clickContinueButton()
                 .clickOnFinishButton();
        Assert.assertEquals(checkOutCompletePage.getCheckOutCompleteInformation(), "CHECKOUT: COMPLETE!");
    }

    @Test
    @Description(value = "product page return check test")
    public  void backToProductPageAfterSuccessfulPurchaseTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openCardPage()
                 .checkOutButtonClick()
                 .fillAllFields("John", "Smith", "34234")
                 .clickContinueButton()
                 .clickOnFinishButton()
                 .backHomeButtonClick();
        Assert.assertEquals(productsPage.getUrl(), "https://www.saucedemo.com/inventory.html");
    }
}

