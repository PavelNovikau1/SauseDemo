package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwoPage extends CheckOutPage{
    public CheckOutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    private static final By FINISH_BUTTON = By.xpath("//*[@id='finish']");

    @Step("Click to the button: FINISH_BUTTON")
    @Description(value = "Click to the button and go to the check out complete page")
    public CheckOutCompletePage clickOnFinishButton(){
        driver.findElement(FINISH_BUTTON).click();
        return  new CheckOutCompletePage(driver);
    }
}
