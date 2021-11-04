package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutCompleteTests extends CheckOutStepTwoTests {

    @Test
    public  void verificationOfSuccessfulPurchaseTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .addProductToCart("Sauce Labs Bolt T-Shirt")
                 .openPage("https://www.saucedemo.com/cart.html");
        cartPage.checkOutButtonClick()
                 .fillAllFields("John", "Smith", "34234")
                 .clickContinueButton()
                 .clickOnFinishButton();
        Assert.assertEquals(checkOutCompletePage.getCheckOutCompleteInformation(), "CHECKOUT: COMPLETE!");
    }

    @Test
    public  void backToProductPageAfterSuccessfulPurchaseTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .addProductToCart("Sauce Labs Bolt T-Shirt")
                 .openPage("https://www.saucedemo.com/cart.html");
        cartPage.checkOutButtonClick()
                 .fillAllFields("John", "Smith", "34234")
                 .clickContinueButton()
                 .clickOnFinishButton()
                 .backHomeButtonClick();
        Assert.assertEquals(productsPage.getUrl(), "https://www.saucedemo.com/inventory.html");
    }
}

