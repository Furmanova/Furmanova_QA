import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogleTest {
WebDriver driver;

@BeforeMethod //запуск
public void setUp(){
    driver = new ChromeDriver();
}
@Test // запуск самого теста
public void siteOpenTest(){
    driver.get("https://google.com");
}

@AfterMethod //закрытие
public void tearDown(){
    driver.quit();
}

}
