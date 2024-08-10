import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeAll
    public static void setupManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeEachTestSetup() {

        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void quitDriverAfterEach() {
//        driver.quit();
    }
}
