package page;

import base.BasePage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.*;

import static com.codeborne.selenide.Selenide.*;

public class YourCartPage extends BasePage {

    private SelenideElement checkoutButton = $x("//button[@data-test='checkout']");

    @Step("Proceed to checkout")
    public BuyInformationPage clickCheckoutButton() {

        try {
            checkoutButton.click();
        } catch (ElementNotInteractableException e) {
            // Если элемент перекрыт, пытаемся закрыть возможные модальные окна
            try {
                Selenide.switchTo().alert().dismiss();
            } catch (NoAlertPresentException ex) {
                // Если это не алерт, пробуем другие способы
                executeJavaScript("arguments[0].click();", checkoutButton);
            }
            // Повторяем клик после обработки
            checkoutButton.click();
        }
        return new BuyInformationPage();
    }
}