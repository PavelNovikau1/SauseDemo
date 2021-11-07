package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void addProductToCartTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .addProductToCart("Sauce Labs Bolt T-Shirt")
                 .openPage("https://www.saucedemo.com/cart.html");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Bolt T-Shirt"), "$15.99");
    }

    @Test
    public void addProductToCartWithPageFactoryTest() {
        loginPageFactory.openPage()
                        .login("standard_user", "secret_sauce")
                        .addProductToCart("Sauce Labs Bolt T-Shirt")
                        .openPage("https://www.saucedemo.com/cart.html");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Bolt T-Shirt"), "$15.99");
    }

}