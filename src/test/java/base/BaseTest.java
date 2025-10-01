package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.*;

@Listeners({AllureTestNg.class})
public abstract class BaseTest {

    private static final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeMethod(description = "Browser startUp")
    protected void beforeMethod() {

        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 18000;
        Configuration.screenshots = true;
        Configuration.savePageSource = false;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=PasswordLeakDetection");
        options.addArguments("--disable-password-manager-reauthentication");
        options.addArguments("--disable-password-check");
        options.addArguments("--disable-background-timer-throttling");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--password-store=basic");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-autofill-keyboard-accessory-view");
        options.addArguments("--disable-features=PasswordLeakDetection");

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false));

        open(BASE_URL);
    }

    @AfterMethod(description = "Browser tearDown")
    protected void afterMethod() {
        Selenide.closeWebDriver();
    }
}
