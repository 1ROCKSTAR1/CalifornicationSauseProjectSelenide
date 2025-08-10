package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BikeLightPage extends BasePage {

    private SelenideElement bikeLightItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bike Light')]");
    private SelenideElement bikeLightDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'when riding your bike at night')]");

    public String getBikeLightItem() {
        return bikeLightItem.getText();
    }

    public String getBikeLightDesc() {
        return bikeLightDesc.getText();
    }
}
