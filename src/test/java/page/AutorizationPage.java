package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class AutorizationPage extends BasePage {

    private SelenideElement usernameField = $x("//input[@id='user-name']");
    private SelenideElement passwordField = $x("//input[@id='password']");
    private SelenideElement submitButton = $x("//input[@id='login-button']");

    public AutorizationPage inputLogin() {
        setValue(usernameField, "standard_user");
        return this;
    }

    public AutorizationPage inputPassword() {
        setValue(passwordField, "secret_sauce");
        return this;
    }

    public GoodsPage clickSubmit() {
        clickElement(submitButton);
        return new GoodsPage();
    }
}
