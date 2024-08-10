import org.example.LoginPage;
import org.example.MyCartPage;
import org.example.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RemowingItemFromMyCart extends BaseTest {

    @Test
    public void successfullRemowingItem(){

    LoginPage loginPage = new LoginPage(driver);
    ProductPage productPage = new ProductPage(driver);
    MyCartPage myCartPage = new MyCartPage(driver);

      loginPage.enterUsername("standard_user");
      loginPage.enterPassword("secret_sauce");
      loginPage.clickOnLoginButton();
      productPage.clickOnAddToCartButton();
      productPage.clickOnShopingButton();
      Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
      myCartPage.clickOnRemoweBotton();
      Assertions.assertFalse(driver.getPageSource().contains("Sauce Labs Backpack"));



    }


}
