package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends CheckOutStepTwoPage {
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    private static final By COMPLETE_ALERT_OF_SUCCESS_ORDER = By.xpath("//*[@id='header_container']//span");
    private static final By BACK_HOME_BUTTON = By.xpath("//*[@id='back-to-products']");

    @Step("Get check out complete information ")
    @Description(value = "Get check out complete information of success order")
    public String getCheckOutCompleteInformation() {
        return driver.findElement(COMPLETE_ALERT_OF_SUCCESS_ORDER).getText();
    }

    @Step("Click to the button: {'BACK_HOME_BUTTON'}")
    @Description(value = "Click to the back home button button to return on main page")
    public void backHomeButtonClick() {
        driver.findElement(BACK_HOME_BUTTON).click();
    }
}


