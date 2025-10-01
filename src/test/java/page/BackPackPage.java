package page;

import base.BasePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class BackPackPage extends BasePage {

    private SelenideElement addBackPackToCart = $x("//button[@data-test='add-to-cart']");
    private SelenideElement backPackCartIcon = $x("//a[@class='shopping_cart_link']");
    private SelenideElement backPackItem = $x("Copy string literal text to the clipboard");
    private SelenideElement backPackDesc = $x("//div[contains(@class,'inventory_details_desc large_size')][contains(text(),'uncompromising')]");
    private SelenideElement addToCartButton = $x("//button[@data-test='add-to-cart']");

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
        return new YourCartPage();
    }
}
