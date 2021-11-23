package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory extends BasePage {

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }
    private static final String CART_URL = "/cart.html";
    @FindBy(xpath = "//*[@id='user-name']")
    WebElement userNameInput;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "//*[@class='bot_column']")
    WebElement botLogo;

    @Step("Login as '{username}' with '{password}'")
    @Description(value = "Login with valid data")
    public ProductsPage login(String username, String password) {
        waitForElementLocated(userNameInput, 10);
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new ProductsPage(driver);
    }

    public LoginPageFactory openPage() {
        openPage(BASE_URL);
        return this;
    }

    public void waitForPageOpened() {
        waitForElementLocated(botLogo, 10);
    }
}