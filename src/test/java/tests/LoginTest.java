package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void validLoginTest() {

    	LoginPage loginPage = new LoginPage(driver);

    	loginPage.login(
    	        "standard_user",
    	        "secret_sauce");

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test
    public void invalidLoginTest() {

    	LoginPage loginPage = new LoginPage(driver);

    	loginPage.login(
    	        "wrong_user",
    	        "wrong_password");

        String errorMessage =
                driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertTrue(
                errorMessage.contains("Username and password do not match"));
    }
    
    @Test
    public void lockedUserTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "locked_out_user",
                "secret_sauce");

        String errorMessage =
                driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        Assert.assertTrue(
                errorMessage.contains("Sorry, this user has been locked out."));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
