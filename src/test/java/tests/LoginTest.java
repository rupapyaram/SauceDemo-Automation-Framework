package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginPage;
import org.testng.annotations.Listeners;
import listeners.TestListener;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wrong_user", "wrong_password");

        String errorMessage =
                driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertTrue(errorMessage.contains("Username and password do not match"));
    }

    @Test
    public void lockedUserTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("locked_out_user", "secret_sauce");

        String errorMessage =
                driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertTrue(errorMessage.contains("Sorry, this user has been locked out."));
    }
}
