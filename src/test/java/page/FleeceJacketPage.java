package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class FleeceJacketPage extends BasePage {

    private SelenideElement fleeceJacketItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Fleece Jacket')]");
    private SelenideElement fleeceJacketDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'relaxing day outdoors')]");

    public String getFleeceJacketItem() {
        return fleeceJacketItem.getText();
    }

    public String getFleeceJacketDesc() {
        return fleeceJacketDesc.getText();
    }
}
