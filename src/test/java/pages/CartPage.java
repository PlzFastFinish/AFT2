package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By INVENTORY_ITEM_NAME = By.xpath("//div[@class='inventory_item_name']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void switchPage() {
        driver.get("https://www.saucedemo.com/cart.html");
    }

    public String getInventoryItemName() {
        return driver.findElement(INVENTORY_ITEM_NAME).getText();
    }
}
