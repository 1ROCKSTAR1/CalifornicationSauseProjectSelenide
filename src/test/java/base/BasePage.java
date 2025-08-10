package base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;

public abstract class BasePage {

    public BasePage() {
        //PageFactory.initElements(webdriver().object(), this);
    }

    protected void clickElement(SelenideElement element) {
        element.click();
    }

    protected void setValue(SelenideElement element, String value) {
        element.setValue(value);
    }

    protected String getText(SelenideElement element) {
        return element.getText();
    }
}
