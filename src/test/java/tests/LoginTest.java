package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(productsPage.getTitle(), "Products");
    }

    @Test
    public void emptyPasswordInputCheck() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(productsPage.getEmptyPasswordErrorMessage(), "Epic sadface: Password is required");
    }

    @Test
    public void emptyLoginInputCheck() {
        loginPage.open();
        loginPage.login("", "secret_sauce");
        assertEquals(productsPage.getEmptyLoginErrorMessage(), "Epic sadface: Username is required");
    }

    @Test
    public void lockedOutUserCheck() {
        loginPage.open();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(productsPage.getLockedOutUserErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
    }
}
