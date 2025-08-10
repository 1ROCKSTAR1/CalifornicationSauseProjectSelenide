package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class WhiteShirtPage extends BasePage {

    private SelenideElement whiteShirtItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Onesie')]");
    private SelenideElement whiteShirtDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Rib snap infant onesie for the junior automation engineer')]");

    public String getWhiteShirtItem() {
        return whiteShirtItem.getText();
    }

    public String getWhiteShirtDesc() {
        return whiteShirtDesc.getText();
    }
}
