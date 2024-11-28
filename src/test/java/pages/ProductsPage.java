package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_TO_CART_PATTERN =
            "//div[text()='%s']//ancestor::div[@class='inventory_item']//button";
    private final By TITLE = By.cssSelector("[class=title]");
    private final By ERROR_MESSAGE = By.xpath("//h3");

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    public void addToCart(String product){
        By addToCart = By.xpath(String.format(ADD_TO_CART_PATTERN, product));
        driver.findElement(addToCart).click();
    }

    public String getEmptyLoginErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public String getEmptyPasswordErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }

    public String getLockedOutUserErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
