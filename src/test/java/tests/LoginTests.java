package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidUsernameAndPasswordTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce");
        Assert.assertEquals(productsPage.getUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginWithEmptyUsernameAndPasswordFieldTest() {
        loginPage.openPage()
                 .login("", "");
        Assert.assertEquals(loginPage.getIncorrectLoginErrorMessageText(), "Epic sadface: Username is required");
    }

    @Test
    public void loginWithEmptyUsernameFieldAndValidPasswordTest() {
        loginPage.openPage()
                 .login("", "secret_sauce");
        Assert.assertEquals(loginPage.getIncorrectLoginErrorMessageText(), "Epic sadface: Username is required");
    }

    @Test
    public void loginWithValidUsernameAndEmptyPasswordFieldTest() {
        loginPage.openPage()
                 .login("standard_user", "");
        Assert.assertEquals(loginPage.getIncorrectLoginErrorMessageText(), "Epic sadface: Password is required");
    }
}
