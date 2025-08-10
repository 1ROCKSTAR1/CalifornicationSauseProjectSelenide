package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class BikeLightPage extends BasePage {

    private SelenideElement bikeLightItem = $("div.inventory_details_name.large_size");
    private SelenideElement bikeLightDesc = $("div.inventory_details_desc.large_size");

    public String getBikeLightItem() {
        return bikeLightItem.getText();
    }

    public String getBikeLightDesc() {
        return bikeLightDesc.getText();
    }
}
