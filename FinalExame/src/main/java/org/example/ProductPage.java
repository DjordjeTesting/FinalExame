package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {


    private static final String addToCartButtonCSSLocator = "#add-to-cart-sauce-labs-backpack";
    private static final String shoppingButtonCSSLocator = "[data-test=shopping-cart-link]";
    private static final String twiterButtonCSSLocator = "[data-test=social-twitter]";
    private static final String facebookButtonCSSLocator = "[data-test=social-facebook]";
    private static final String linkedInButtonCSSLocatpor = "[data-test=social-linkedin]";


    @FindBy(css =addToCartButtonCSSLocator )
    private WebElement addToCartButton;

    public void clickOnAddToCartButton(){
        click(addToCartButton);

    }
    @FindBy(css = shoppingButtonCSSLocator)
    private WebElement shoppingButton;

    public void clickOnShopingButton(){
        click(shoppingButton);
    }
    @FindBy(css =twiterButtonCSSLocator )
    private WebElement twiterButton;

    public void clickOnTwiterButton(){
        click(twiterButton);

    }
    @FindBy(css = facebookButtonCSSLocator)
    private WebElement facebookButton;

    public void clickOnFacebookButton(){
        click(facebookButton);
    }
    @FindBy(css = linkedInButtonCSSLocatpor)
    private WebElement linkedInButton;

    public void clickOnLinkedInButton(){
        click(linkedInButton);
    }

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);


    }
}
