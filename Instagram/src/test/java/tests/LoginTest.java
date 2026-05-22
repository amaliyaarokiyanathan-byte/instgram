	package tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void instagramLoginTest() throws InterruptedException {

        // Setup ChromeOptions (CI-safe)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        // Initialize driver with options
        driver = new ChromeDriver(options);

        driver.get("https://www.instagram.com/");

        LoginPage loginPage = new LoginPage(driver);

        Thread.sleep(5000);

        loginPage.login("your_username", "your_password");

        Thread.sleep(5000);
    }
}