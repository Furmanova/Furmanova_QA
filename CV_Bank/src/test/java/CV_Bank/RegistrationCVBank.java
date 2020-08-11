package CV_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationCVBank {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {

       // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://cv-app-test.herokuapp.com/");
    }
    @Test
    public void registrationTest(){
        clickToRegister();
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPhone();
        enterPassword();
        enterPasswordConfirm();
        clickOnProceedButton();
    }

    private void clickToRegister() {
        driver.findElement(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Register')]")).click();
    }

    private void clickOnProceedButton() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    private void enterPhone() {
        driver.findElement(By.cssSelector("#phone")).sendKeys("+972 53 0000000");
    }

    private void enterPasswordConfirm() {
        driver.findElement(By.cssSelector("#password-confirm")).sendKeys("12345.com");
    }

    private void enterPassword() {
        driver.findElement(By.cssSelector("#password")).sendKeys("12345.com");
    }

    private void enterEmail() {
        driver.findElement(By.cssSelector("#email")).sendKeys("ivanova@mail.ru");
    }

    private void enterLastName() {
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Ivanova");
    }

    private void enterFirstName() {
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Olga");
    }
}
