package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends BaseTest {

    @Test
    public void popUpMenuIsOpened() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        headerPage.openPopUpMenu();
        Assert.assertTrue(headerPage.isPopUpMenuDisplayed());
    }

    @Test
    public void logOutFromAccountTest() {
        loginPage.openPage("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        headerPage.openPopUpMenu();
        headerPage.clickLogOutButton();
        Assert.assertEquals(loginPage.getCurrentUrl(), "https://www.saucedemo.com/");
    }
}
