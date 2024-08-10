package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCartPage extends BasePage {


    private static final String checkoutBottonCSSLocator = " [data-test=checkout]";
    private static final String remoweBottonCSSSelector = "#remove-sauce-labs-backpack";


    @FindBy(css =checkoutBottonCSSLocator )
    private WebElement checkoutButton;

    public void clickOnCheckoutButton(){
        click(checkoutButton);
    }
    @FindBy(css = remoweBottonCSSSelector)
    private WebElement remoweButton;

    public void clickOnRemoweBotton(){
        click(remoweButton);
    }

    public MyCartPage(WebDriver driver) {
       super(driver);
        PageFactory.initElements(this.driver,this);
    }
}
