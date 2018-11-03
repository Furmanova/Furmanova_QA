import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginCVBank {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://cv-app-test.herokuapp.com/");
    }

    @Test
    public void loginTest() {
        clickToLogin();
        enterEmail();
        enterPassword();
        clickOnProceedButton();
        clickCloseSuccesslogin();
    }

    private void clickCloseSuccesslogin() {
        driver.findElement(By.xpath("//button[@class='btn btn-close']")).click();
    }

    private void clickToLogin() {
        driver.findElement(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]")).click();
    }

    private void clickOnProceedButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    private void enterPassword() {
        driver.findElement(By.cssSelector("#password")).sendKeys("12345.com");
    }

    private void enterEmail() {
        driver.findElement(By.cssSelector("#email")).sendKeys("ivanova@mail.ru");
    }

}
