package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage{

    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    private static final By OPEN_POP_UP_MENU = By.xpath("//*[@id='react-burger-menu-btn']");
    private static final By LOG_OUT = By.xpath("//*[@id='logout_sidebar_link']");
    private static final By POP_UP_MENU_ITEMS = By.xpath("//*[@class='bm-menu-wrap']");

    public void waitForPageOpened() {
        waitForElementLocated(POP_UP_MENU_ITEMS, 10);
    }

    @Step("Open popup menu")
    @Description("Open popup menu on the header")
    public HeaderPage openPopUpMenu(){
        waitForPageOpened();
        driver.findElement(OPEN_POP_UP_MENU).click();
        return this;
    }

    public boolean isPopUpMenuDisplayed(){
       return driver.findElement(POP_UP_MENU_ITEMS).isDisplayed();
    }

    @Step("Click to the button: {'LOG_OUT'}")
    @Description(value = "Click to the button to quit from account")
    public void clickLogOutButton(){
        driver.findElement(LOG_OUT).click();
    }
}
