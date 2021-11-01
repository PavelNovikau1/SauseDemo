package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void loginWithValidUsernameAndPasswordTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(productsPage.getCurrentUrlOfPage(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginWithEmptysUsernameAndPasswordFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("", "");
        Assert.assertEquals(loginPage.incorrectLoginNotification(), "Epic sadface: Username is required");
    }

    @Test
    public void loginWithEmptyUsernameFieldAndValidPasswordTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.incorrectLoginNotification(), "Epic sadface: Username is required");
    }

    @Test
    public void loginWithValidUsernameAndEmptyPasswordFieldTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "");
        Assert.assertEquals(loginPage.incorrectLoginNotification(), "Epic sadface: Password is required");
    }

}
