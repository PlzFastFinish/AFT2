package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;

public class CartPage extends BaseTest {

    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchPage () {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    private final By INVENTORY_ITEM_NAME = By.xpath("//div[@class='inventory_item_name']");

    public String getInventoryItemName(){
        return driver.findElement(INVENTORY_ITEM_NAME).getText();
    }
}
