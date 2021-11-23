package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends BaseTest {

    @Test
    @Description(value = "Opening pop up menu test")
    public void popUpMenuIsOpened() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .openPopUpMenu();
        Assert.assertTrue(headerPage.isPopUpMenuDisplayed());
    }

    @Test
    @Description(value = "Logout from account test")
    public void logOutFromAccountTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .openPopUpMenu()
                 .clickLogOutButton();
        Assert.assertEquals(loginPage.getUrl(), "https://www.saucedemo.com/");
    }
}
