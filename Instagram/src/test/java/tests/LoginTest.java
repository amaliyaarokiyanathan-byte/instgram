package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void instagramLoginTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        Thread.sleep(5000); // wait for page load

        loginPage.login("your_username", "your_password");

        Thread.sleep(5000);
    }
}