package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTests extends HeaderTests {

    @Test
    @Description(value = "Filling information fields with valid data test")
    public void fillingInformationFieldsWithValidValuesTest() {
        loginPage.openPage()
                 .login("standard_user", "secret_sauce")
                 .addProductToCart("Sauce Labs Bolt T-Shirt");
         cartPage.openCardPage()
                 .checkOutButtonClick()
                 .fillAllFields("John", "Smith", "34234")
                 .clickContinueButton();
        Assert.assertEquals(checkOutStepTwoPage.getUrl(), "https://www.saucedemo.com/checkout-step-two.html");
    }
}
