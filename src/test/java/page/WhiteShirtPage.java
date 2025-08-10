package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class WhiteShirtPage extends BasePage {

    private SelenideElement whiteShirtItem = $("div.inventory_details_name.large_size");
    private SelenideElement whiteShirtDesc = $("div.inventory_details_desc.large_size");

    public String getWhiteShirtItem() {
        return whiteShirtItem.getText();
    }

    public String getWhiteShirtDesc() {
        return whiteShirtDesc.getText();
    }
}
