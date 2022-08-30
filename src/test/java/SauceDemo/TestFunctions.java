package SauceDemo;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFunctions {
    static WebDriver driver;

    void browserOpen() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chrdriver.exe");
        driver.get("https://www.saucedemo.com/");
    }

    void login() {
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@name='login-button']")).click();
    }

    void verification(String locator, String expected) {
        String actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.equals(expected), "Expected result does not match with actual result");
    }

    void addToCart() {
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
    }

    void cartLinkClick() {
        driver.findElement(By.xpath("//div/a[@class='shopping_cart_link']")).click();
    }

    void checkoutButtonClick() {
        driver.findElement(By.xpath("//button[@name='checkout']")).click();
    }

    void checkoutInformation() {
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Standard");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("User");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='continue']")).click();
    }

    void finishButton() {
        driver.findElement(By.xpath("//button[@name='finish']")).click();
    }

    void closeBrowser()
    {
        driver.quit();
    }
}
