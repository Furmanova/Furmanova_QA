package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTests {
    @Test
    public void openToHomePage() {
        System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        waitUntilIsLoadedCustomTime(driver, By.xpath("//span[contains(text(),'Go to Event list')]"), 30);
        WebElement buttomLogin = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        buttomLogin.click();
        driver.quit();
    }

    @Test
    public void loginTest() {
        System.out.println("Hello World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mish.sheygam.com/#/wellcome");
        waitUntilIsLoadedCustomTime(driver, By.xpath("//span[contains(text(),'Go to Event list')]"), 30);
        WebElement buttomLogin = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        buttomLogin.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@type = 'email']"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("marina@123.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type = 'password']"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("marina");
        WebElement logaut = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        logaut.click();
        waitUntilIsLoadedCustomTime(driver, By.xpath("//span[contains(text(),'Filters')]"), 30);
        WebElement icon = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        System.out.println("Element of the page" + icon.getAttribute("mattooltip"));
        driver.quit();

    }

    private static void waitUntilIsLoadedCustomTime(WebDriver driver, By locator, int time) {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



