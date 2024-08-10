package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public static final String UserNameInputCSSLocator = "#user-name";
    public static final String PasswordInputCSSLocator = "#password";
    public static final String LoginButtonInputCSSLocator = "#login-button";
    public static final String ErrorMessageCSSLocator = "[data-test='error']";

    @FindBy(css = UserNameInputCSSLocator)
    private WebElement userNameInput;

    public void enterUsername (String username){
        enterText(userNameInput,username);
    }
    @FindBy(css= PasswordInputCSSLocator)
    private WebElement passwordInput;

    public void enterPassword(String password){
        enterText(passwordInput,password);
    }

    @FindBy(css =LoginButtonInputCSSLocator )
    private WebElement loginButton;

    public void clickOnLoginButton(){
        click(loginButton);
    }

    @FindBy(css = ErrorMessageCSSLocator)
    private WebElement errorMesaggeLabel;

    public void waitForErrorMessageToContain(String errorMessage){
        wait.until(ExpectedConditions.textToBePresentInElement(errorMesaggeLabel,errorMessage));
    }

    public String getErrorMessage(){
        return errorMesaggeLabel.getText();
    }

   public LoginPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver,this);
   }
}
