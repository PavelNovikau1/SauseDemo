package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends HeaderPage {
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    private static final By FIRST_NAME_FIELD = By.xpath("//*[@id='first-name']");
    private static final By LAST_NAME_FIELD = By.xpath("//*[@id='last-name']");
    private static final By ZIP_POSTAL_CODE_FIELD = By.xpath("//*[@id='postal-code']");
    private static final By CONTINUE_BUTTON = By.xpath("//*[@id='continue']");

    public void clickContinueButton() {
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public void fillAllFields(String firstName, String lastName, String zipPostalCode) {
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
        driver.findElement(ZIP_POSTAL_CODE_FIELD).sendKeys(zipPostalCode);
    }
}
