package TelRan.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ContactHelper contactHelper;
    SessionHelper sessionHelper;
    GroupHelper groupHelper;
    private WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.openSite("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    /*public boolean isElementPresent(By locator){
            try {
                wd.findElement(locator);
                return true;
            }catch (NoSuchElementException e){
                return false;
            }
        }*/
    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public void goToAddNewPage() {
        wd.findElement(By.linkText("add new")).click();
    }


    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
