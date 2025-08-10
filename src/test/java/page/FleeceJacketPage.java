package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class FleeceJacketPage extends BasePage {

    private SelenideElement fleeceJacketItem = $("div.inventory_details_name.large_size");
    private SelenideElement fleeceJacketDesc = $("div.inventory_details_desc.large_size");

    public String getFleeceJacketItem() {
        return fleeceJacketItem.getText();
    }

    public String getFleeceJacketDesc() {
        return fleeceJacketDesc.getText();
    }
}
