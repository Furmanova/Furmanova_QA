import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Trello {
  private WebDriver driver;

  @BeforeClass
  public void setUp() {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTrello() {
    openSite();
    driver.findElement(By.xpath("//*[@href='/login']")).click();

    //fillNameFild();
    fillEmailFild();
    fillPasswordFild();


  }

  public void fillPasswordFild() {
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("milistan12");
    driver.findElement(By.id("login")).click();
  }

  public void fillEmailFild() {
    driver.findElement(By.id("user")).click();
    driver.findElement(By.id("user")).clear();
    driver.findElement(By.id("user")).sendKeys("furmanovolga@gmail.com");
  }

 /* public void fillNameFild() {
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("Olga");
  }*/

  public void openSite() {
    driver.get("https://trello.com/");
  }


}
