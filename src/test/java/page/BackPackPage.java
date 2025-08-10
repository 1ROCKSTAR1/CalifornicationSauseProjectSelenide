package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BackPackPage extends BasePage {

    private SelenideElement addBackPackToCart = $("button[data-test='add-to-cart']");
    private SelenideElement backPackCartIcon = $("a.shopping_cart_link");
    private SelenideElement backPackItem = $("div.inventory_details_name"); // Пример, уточните локатор
    private SelenideElement backPackDesc = $("div.inventory_details_desc.large_size");
    private SelenideElement addToCartButton = $("button[data-test='add-to-cart']");

    public BackPackPage() {
    }

    public String getBackPackItem() {
        return backPackItem.getText();
    }

    public String getBackPackDesc() {
        return backPackDesc.getText();
    }

    @Step("Click on add to cart button")
    public BackPackPage addBackPackToCart() {
        addToCartButton.click();
        return this;
    }

    @Step("Go to the cart with BackPack")
    public YourCartPage clickBackPackCartIcon() {
        backPackCartIcon.click();
        return page(YourCartPage.class);
    }
}
