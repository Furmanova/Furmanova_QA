import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class EbayRegistration {
   public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://signin.ebay.com/ws/eBayISAPI.dll");
        }
        @Test
    public void registrationTest(){


            enterUsername();
            enterPassword();
            clickOnSigninButton();
           // ConfirmUp();
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

    /*public void ConfirmUp() {
        driver.findElement(By.id("sbtBtn")).click();
    }*/

    public void clickOnSigninButton() {

        driver.findElement(By.id("sgnBt")).click();
    }

    public void enterPassword() {

        driver.findElement(By.id("pass")).sendKeys("milistan1");
    }

    public void enterUsername() {

        driver.findElement(By.id("userid")).sendKeys("o.furmanova@mail.ru");
    }

}
