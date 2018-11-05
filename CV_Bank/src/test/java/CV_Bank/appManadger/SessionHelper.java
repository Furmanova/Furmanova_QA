package CV_Bank.appManadger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String mail, String password){

        type(By.cssSelector("#email"), mail);
        type(By.cssSelector("#password"), password);
    }
    public void openSite(String url) {
        driver.navigate().to(url);
    }
    public void clickToLogin() {
        click(By.xpath("//ul[@class='menu-btns']//button[@type='button'][contains(text(),'Log in')]"));
    }

    public void clickCloseSuccessLogin() {
        click(By.xpath("//button[@class='btn btn-close']"));
    }



    public void clickOnProceedButton() {
        click(By.xpath("//button[@type='submit']"));
    }

    }



