package CV_Bank.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void loginClick(){
        click(By.xpath("//button[contains(text(),'Log In')]"));
    }
    public void login(String mail, String password){

        type(By.xpath("//input[@placeholder='email']"), mail);
        type(By.xpath("//input[@placeholder='password']"), password);
        click(By.xpath("//cv-button[@type='submit']"));
    }
    public void openSite(String url) {
        driver.navigate().to(url);
    }
    }



