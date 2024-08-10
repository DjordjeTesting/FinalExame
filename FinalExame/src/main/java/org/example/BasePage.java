package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;



//    protected void waitForElementsToBeVisible(By by) {
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
//    }

    protected void click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    protected void enterText(WebElement element, String textToEnter) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(textToEnter);

    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

}

