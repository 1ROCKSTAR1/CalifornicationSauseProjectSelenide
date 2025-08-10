package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.testng.AllureTestNg;
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
        Configuration.browserVersion = "138";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
        Configuration.savePageSource = false;

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
