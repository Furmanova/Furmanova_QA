import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InputLogin {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
      // driver = new ChromeDriver();
        driver = new FirefoxDriver();
     /*driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
}
        @Test
        public void userLogin() {
        // driver.get("https://google.com");
        //driver.get("https://vk.com/login");
        driver.get("https://ok.ru/");
        /*WebElement loginField = driver.findElement(By.id("email"));
        loginField.sendKeys("o.furmanova@mai.ru");
        WebElement passwordField = driver.findElement(By.id ("pass"));
        passwordField.sendKeys("panadol83");
        WebElement loginButton = driver.findElement(By.id("login_button"));
        loginButton.click();*/

            driver.findElement(By.id("field_email")).sendKeys("o.furmanova");
            driver.findElement(By.id("field_password")).sendKeys("panadol12");
            driver.findElement(By.xpath("//input[@value='Войти']")).click();

    }
   /*@AfterMethod
    public void tearDown(){
        driver.quit();
    }
*/
}