package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

@Log4j2
public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    HeaderPage headerPage;
    CheckOutPage checkOutPage;
    CheckOutStepTwoPage checkOutStepTwoPage;
    CheckOutCompletePage checkOutCompletePage;
    LoginPageFactory loginPageFactory;

    @BeforeMethod
    public void initTest() {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }catch (Exception e) {
            log.fatal("Error: balbalbla");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        headerPage = new HeaderPage(driver);
        checkOutPage = new CheckOutPage(driver);
        checkOutStepTwoPage = new CheckOutStepTwoPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);
        loginPageFactory = new LoginPageFactory(driver);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}