import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class EbayRegistration {
    WebDriver driver;

    @BeforeMethod
    public void ebayTest() {

            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        @Test
    public void registration(){
       // driver.get("https://www ebay.com/");
            driver.get("https://signin.ebay.com/ws/eBayISAPI.dll");
            UserUp();
            PasswordUp();
            SignInUp();
            ConfirmUp();
            //driver.get("https://reg.ebay.com/reg/PartialReg");
            /*driver.findElement(By.id("firstname")).sendKeys("Olga");
            driver.findElement(By.id("lastname")).sendKeys("Furmanova");
            driver.findElement(By.id("email")).sendKeys("o.furmanova@mail.ru");
            driver.findElement(By.id("PASSWORD")).sendKeys("milistan1");
            driver.findElement(By.id("ppaFormSbtBtn")).click();*/
        }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void ConfirmUp() {
        driver.findElement(By.id("sbtBtn")).click();
    }

    public void SignInUp() {
        driver.findElement(By.id("sgnBt")).click();
    }

    public void PasswordUp() {
        driver.findElement(By.id("pass")).sendKeys("milistan1");
    }

    public void UserUp() {
        driver.findElement(By.id("userid")).sendKeys("o.furmanova@mail.ru");
    }

}
