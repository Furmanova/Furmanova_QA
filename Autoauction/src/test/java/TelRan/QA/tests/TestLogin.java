package TelRan.QA.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {

    private WebDriver driver;


    @Test
    public void loginTest() throws InterruptedException {
        app.getSessionHelper().clickToRegister();
        app.getSessionHelper().login("ddf@mail.ru", "secret12");
        /*driver.findElement(By.id("user_email-56")).click();
        driver.findElement(By.id("user_email-56")).clear();
        driver.findElement(By.id("user_email-56")).sendKeys("adad@sdsfd.com");
        driver.findElement(By.id("user_pass-56")).click();
        driver.findElement(By.id("user_pass-56")).clear();
        driver.findElement(By.id("user_pass-56")).sendKeys("milihfc");*/

    }

}
