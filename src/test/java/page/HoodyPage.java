package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HoodyPage extends BasePage {

    private SelenideElement hoodyPageItem = $("div.inventory_details_name.large_size");
    private SelenideElement hoodyPageDesc = $("div.inventory_details_desc.large_size");

    public String getHoodyPageItem() {
        return hoodyPageItem.getText();
    }

    public String getHoodyPageDesc() {
        return hoodyPageDesc.getText();
    }
}
