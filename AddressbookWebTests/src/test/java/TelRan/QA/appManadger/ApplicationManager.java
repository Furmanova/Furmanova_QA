package TelRan.QA.appManadger;

import TelRan.QA.tests.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ContactHelper contactHelper;
    SessionHelper sessionHelper;
    GroupHelper groupHelper;
    EventFiringWebDriver wd;
    private String browser;

    public ApplicationManager(String browser) {


        this.browser = browser;
    }

    public void start() {
        if (browser.equals(BrowserType.CHROME)) {
            wd = new EventFiringWebDriver( new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)) {
        wd =  new EventFiringWebDriver( new FirefoxDriver());
        }
        wd.register(new MyListener());

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.openSite("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
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

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    /*public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }*/

}
