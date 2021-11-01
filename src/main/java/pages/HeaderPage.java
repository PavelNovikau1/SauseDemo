package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage{
    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    private static final By OPEN_POP_UP_MENU = By.xpath("//*[@id='react-burger-menu-btn']");
    private static final By LOG_OUT = By.xpath("//*[@id='logout_sidebar_link']");
    private static final By POP_UP_MENU_ITEMS = By.xpath("//*[@class='bm-menu-wrap']");

    public void openPopUpMenu(){
        driver.findElement(OPEN_POP_UP_MENU).click();
    }

    public boolean isPopUpMenuDisplayed(){
       return driver.findElement(POP_UP_MENU_ITEMS).isDisplayed();
    }

    public void clickLogOutButton(){
        driver.findElement(LOG_OUT).click();
    }
}
