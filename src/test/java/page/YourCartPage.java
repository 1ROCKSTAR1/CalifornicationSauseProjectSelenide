package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class YourCartPage extends BasePage {

    private SelenideElement checkoutButton = $x("//button[@data-test='checkout']");

    @Step("Proceed to checkout")
    public BuyInformationPage clickCheckoutButton() {
        checkoutButton.click();
        return page(BuyInformationPage.class);
    }
}
