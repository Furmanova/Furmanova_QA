package TelRan.QA.appManadger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }
    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void login(String userName, String password) {
        type(By.name("user"),userName);
        type(By.name("pass"),password);
       // wd.findElement(By.name("user")).sendKeys(userName);
        /*wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);*/

        //clock on the button login
        click(By.xpath("//*[@value ='Login']"));

    }

    public void logaut() {
       click(By.xpath("//a[contains(text(),'Logout')]"));
    }

    public boolean isLoggin() {
        return isElementPresent(By.xpath("//a[contains(text(),'Logout')]"));
    }
}
