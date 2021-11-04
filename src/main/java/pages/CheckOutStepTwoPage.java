package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutStepTwoPage extends CheckOutPage{
    public CheckOutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    private static final By FINISH_BUTTON = By.xpath("//*[@id='finish']");

    public CheckOutCompletePage clickOnFinishButton(){
        driver.findElement(FINISH_BUTTON).click();
        return  new CheckOutCompletePage(driver);
    }
}
