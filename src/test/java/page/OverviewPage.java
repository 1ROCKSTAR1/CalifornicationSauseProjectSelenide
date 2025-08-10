package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class OverviewPage extends BasePage {

    private SelenideElement checkoutTitle = $x("//span[@class='title'][contains(text(),'Checkout: Overview')]");
    private SelenideElement paymentInfo = $x("//div[contains(text(),'Payment Information')]");
    private SelenideElement shipInfo = $x("//div[contains(text(),'Shipping Information')]");
    private SelenideElement price = $x("//div[contains(text(),'Price Total')]");
    private SelenideElement finishButton = $x("//button[@data-test='finish'][@name='finish']");

    @Step("Verify checkout title")
    public OverviewPage checkoutTitleCheck() {
        checkoutTitle.shouldHave(text("Checkout: Overview"));
        return this;
    }

    @Step("Verify payment information")
    public OverviewPage checkPaymentInfo() {
        paymentInfo.shouldHave(text("Payment Information"));
        return this;
    }

    @Step("Verify shipping information")
    public OverviewPage checkShipInfo() {
        shipInfo.shouldHave(text("Shipping Information"));
        return this;
    }

    @Step("Verify price total")
    public OverviewPage checkPrice() {
        price.shouldHave(text("Price Total"));
        return this;
    }

    @Step("Complete order")
    public CompletePage finishButtonClick() {
        finishButton.click();
        return page(CompletePage.class);
    }
}
