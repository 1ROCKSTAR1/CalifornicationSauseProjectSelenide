package page;

import Base.BasicModel;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BackPackPage extends BasePage {

    // Локаторы заменены на SelenideElement
    private final SelenideElement addBackPackToCart = $("button[data-test='add-to-cart']");
    private final SelenideElement backPackCartIcon = $("a.shopping_cart_link");
    private final SelenideElement backPackItem = $("div.inventory_details_name"); // Пример, уточните локатор
    private final SelenideElement backPackDesc = $("div.inventory_details_desc.large_size");
    private final SelenideElement addToCartButton = $("button[data-test='add-to-cart']");

    // Конструктор теперь пустой, так как Selenide управляет драйвером самостоятельно
    public BackPackPage() {
    }

    public String getBackPackItem() {
        return backPackItem.getText(); // Автоматическое ожидание элемента
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
        return page(YourCartPage.class); // Selenide сам инициализирует страницу
    }

    // Удалены явные ожидания - Selenide делает это автоматически
}
