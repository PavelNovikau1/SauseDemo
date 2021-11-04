package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends BaseTest {

    @Test
    public void popUpMenuIsOpened() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .openPopUpMenu();
        Assert.assertTrue(headerPage.isPopUpMenuDisplayed());
    }

    @Test
    public void logOutFromAccountTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .openPopUpMenu()
                 .clickLogOutButton();
        Assert.assertEquals(loginPage.getUrl(), "https://www.saucedemo.com/");
    }
}
