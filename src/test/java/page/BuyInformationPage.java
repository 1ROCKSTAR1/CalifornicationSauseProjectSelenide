package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class BuyInformationPage extends BasePage {

    private SelenideElement firstNameField = $x("//input[@placeholder='First Name']");
    private SelenideElement lastNameField = $x("//input[@placeholder='Last Name']");
    private SelenideElement postCodeField = $x("//input[@placeholder='Zip/Postal Code']");
    private SelenideElement submitButton = $x("//input[@type='submit']");

    @Step("Fill first name field")
    public BuyInformationPage fillThefirstNameField() {
        firstNameField.setValue("Tom");
        return this;
    }

    @Step("Fill last name field")
    public BuyInformationPage fillThelastNameField() {
        lastNameField.setValue("Harris");
        return this;
    }

    @Step("Fill postal code field")
    public BuyInformationPage fillThepostCodeField() {
        postCodeField.setValue("000");
        return this;
    }

    @Step("Fill first name field with dynamic value")
    public BuyInformationPage fillThefirstNameFieldDP(String value) {
        firstNameField.setValue(value);
        return this;
    }

    @Step("Fill last name field with dynamic value")
    public BuyInformationPage fillThelastNameFieldDP(String value) {
        lastNameField.setValue(value);
        return this;
    }

    @Step("Fill postal code field with dynamic value")
    public BuyInformationPage fillThepostCodeFieldDP(String value) {
        postCodeField.setValue(value);
        return this;
    }

    @Step("Submit order information")
    public OverviewPage clickOnsumbitButton() {
        submitButton.click();
        return page(OverviewPage.class);
    }
}
