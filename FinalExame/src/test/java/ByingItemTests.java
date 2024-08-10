import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ByingItemTests extends BaseTest {



    @Test
    public void successfulByingItem(){
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        MyCartPage myCartPage = new MyCartPage(driver);
        InformationPage informationPage = new InformationPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        productPage.clickOnAddToCartButton();
        productPage.clickOnShopingButton();
        myCartPage.clickOnCheckoutButton();
        informationPage.enterFirstName("Djordje");
        informationPage.enterLastName("Filipovic");
        informationPage.enterPostalCode("31210");
        informationPage.clickOnContinueButton();
        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        overviewPage.clickOnFinishButton();
        Assertions.assertTrue(driver.getPageSource().contains("Thank you for your order!"));

    }




}


