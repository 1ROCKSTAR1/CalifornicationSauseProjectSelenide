package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HoodyPage extends BasePage {

    private SelenideElement hoodyPageItem = $x("//div[contains(@class,'inventory_details_name large_size')][contains(text(),'T-Shirt (Red)')]");
    private SelenideElement hoodyPageDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'Super-soft')]");

    public String getHoodyPageItem() {
        return hoodyPageItem.getText();
    }

    public String getHoodyPageDesc() {
        return hoodyPageDesc.getText();
    }
}
