package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HeaderPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_PRICE = "//*[text()='%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";
    private static final By CHECK_OUT_BUTTON = By.xpath("//*[@id='checkout']");
    private static final String CART_URL = "cart.html";

    public String getProductPrice(String productName) {
        return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
    }

    @Step("Click to the button: {'CHECK_OUT_BUTTON'}")
    @Description(value = "Click to the button and go to check out page")
    public  CheckOutPage checkOutButtonClick() {
        driver.findElement(CHECK_OUT_BUTTON).click();
        return new CheckOutPage(driver);
    }
    @Step("Open URL: {url}")
    @Description(value ="Opening cart page")
    public CartPage openCardPage() {
        openPage(BASE_URL + CART_URL);
        return this;
    }
}

