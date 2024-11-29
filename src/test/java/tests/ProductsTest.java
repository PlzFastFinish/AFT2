package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductsTest extends BaseTest {
    @Test
    public void addGoods() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Onesie");
        cartPage.switchPage();
        assertEquals(cartPage.getInventoryItemName(), "Sauce Labs Onesie");
    }
}
