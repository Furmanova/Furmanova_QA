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

    public void login(String mail, String password) throws InterruptedException {
       Thread.sleep(1000);
        type(By.cssSelector("#register:last-child .userpro-input > input[type=text]"), mail);
       Thread.sleep(1000);
        type(By.cssSelector("#register:last-child .userpro-input > input[type=password]"), password);
        click(By.xpath("//input[contains(@value,'customer')]"));
        click(By.cssSelector("#register div.userpro-body div:nth-child(11) label > span"));
        click(By.cssSelector("#register div.userpro-body div.userpro-field.userpro-submit.userpro-column > input:nth-child(3)"));

    }

    public void goToAboutPage() {
        click(By.linkText("אודות"));
    }

    public void goToTendersPage() {
        click(By.xpath("//span[contains(text(),'מכרזים')]"));
    }

    public void goToHowItWorksPage() {
        click(By.linkText("איך זה עובד?"));
    }

    public void goToPublishTenderForAVehiclePage() {
        click(By.xpath("//span[contains(text(),'פרסם מכרז רכב')]"));
    }

    public void goToContactUs() {
        click(By.linkText("צור קשר"));
    }

    public void clickToRegister() {
        click(By.xpath("//span[contains(text(),'הרשם')]"));
    }



    /*public void logaut() {
       click(By.xpath("//a[contains(text(),'Logout')]"));
    }*/

    /*public boolean isLoggin() {
        return isElementPresent(By.xpath("//a[contains(text(),'Logout')]"));
    }*/
}
