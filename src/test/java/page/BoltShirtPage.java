package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BoltShirtPage extends BasePage {

    private SelenideElement boltShirtItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'Sauce Labs Bolt T-Shirt')]");
    private SelenideElement boltShirtDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Get your testing superhero')]");

    public String getBoltShirtItem() {
        return boltShirtItem.getText();
    }

    public String getBoltShirtDesc() {
        return boltShirtDesc.getText();
    }
}
