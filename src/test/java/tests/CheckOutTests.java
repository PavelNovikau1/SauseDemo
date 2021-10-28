package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTests extends HeaderTests {

    @Test
    public void fillingInformationFieldsWithValidValuesTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.saucedemo.com/cart.html");
        cartPage.checkOutButtonClick();
        checkOutPage.fillAllFields("John", "Smith", "34234");
        checkOutPage.clickContinueButton();
        Assert.assertEquals(checkOutStepTwoPage.getCurrentUrlOfPage(), "https://www.saucedemo.com/checkout-step-two.html");
    }
}
