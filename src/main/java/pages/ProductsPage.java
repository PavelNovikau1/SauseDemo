package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends HeaderPage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_PRODUCT_TO_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='inventory_item']//button";
    private static final By PRODUCT_IMAGE = By.xpath("//*[@id='item_5_img_link']/img");

    public void waitForPageOpened() {
        waitForElementLocated(PRODUCT_IMAGE, 10);
    }

    public ProductsPage addProductToCart(String productName) {
        waitForPageOpened();
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName))).click();
        return this;
    }
}