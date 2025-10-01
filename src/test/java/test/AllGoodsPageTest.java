package test;

import base.BaseTest;
import page.AutorizationPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllGoodsPageTest extends BaseTest {

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Bike Light + the correctness of the description of this product.")
    @Test(priority = 1, description = "Bike Light Main Page's Check")
    public void bikeLightHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBikeLightItem();

        Assert.assertEquals(itemText, "Sauce Labs Bike Light");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Backpack + the correctness of the description of this product.")
    @Test(priority = 2, description = "Backpack Main Page's Check")
    public void backPackHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBackPackItem();

        Assert.assertEquals(itemText, "Sauce Labs Backpack");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt + the correctness of the description of this product.")
    @Test(priority = 3, description = "T-Shirt Main Page's Check")
    public void boltTshirtHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getBoltShirtItem();

        Assert.assertEquals(itemText, "Sauce Labs Bolt T-Shirt");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Fleece jacket + the correctness of the description of this product.")
    @Test(priority = 4, description = "Fleece jacket Main Page's Check")
    public void fleeceJacketHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getFleeceJacketItem();

        Assert.assertEquals(itemText, "Sauce Labs Fleece Jacket");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the Onesie + the correctness of the description of this product.")
    @Test(priority = 5, description = "Onesie Main Page's Check")
    public void whiteShirtHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getWhiteShirtItem();

        Assert.assertEquals(itemText, "Sauce Labs Onesie");
    }

    @Epic(value = "Goods tests")
    @Feature(value = "Main page Headers")
    @Severity(value = SeverityLevel.NORMAL)
    @Description("Checks aviability of the T-Shirt RED + the correctness of the description of this product.")
    @Test(priority = 6, description = "T-Shirt RED Main Page's Check")
    public void hoodyHeaderTextTest() {
        String itemText = new AutorizationPage()
                .inputLogin()
                .inputPassword()
                .clickSubmit()
                .getHoodyItem();

        Assert.assertEquals(itemText, "T-Shirt (Red)");
    }
}
