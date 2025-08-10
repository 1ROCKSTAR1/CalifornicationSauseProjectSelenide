package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class BoltShirtPage extends BasePage {

    private SelenideElement boltShirtItem = $("div.inventory_details_name.large_size");
    private SelenideElement boltShirtDesc = $("div.inventory_details_desc.large_size");

    public String getBoltShirtItem() {
        return boltShirtItem.getText();
    }

    public String getBoltShirtDesc() {
        return boltShirtDesc.getText();
    }
}
