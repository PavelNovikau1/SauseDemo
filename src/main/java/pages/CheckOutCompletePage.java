package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends CheckOutStepTwoPage {
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    private static final By COMPLETE_ALERT_OF_SUCCESS_ORDER = By.xpath("//*[@id='header_container']//span");
    private static final By BACK_HOME_BUTTON = By.xpath("//*[@id='back-to-products']");

    public String getCheckOutCompleteInformation() {
        return driver.findElement(COMPLETE_ALERT_OF_SUCCESS_ORDER).getText();
    }

    public void backHomeButtonClick() {
        driver.findElement(BACK_HOME_BUTTON).click();
    }
}


