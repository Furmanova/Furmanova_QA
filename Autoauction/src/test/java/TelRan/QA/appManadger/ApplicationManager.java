package TelRan.QA.appManadger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    SessionHelper sessionHelper;
    GroupHelper groupHelper;
    WebDriver wd;
    private String browser;

    public ApplicationManager(String browser) {


        this.browser = browser;
    }

    public void start() {
        if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.openSite("http://autoauction.co.il/%D7%A8%D7%90%D7%A9%D7%99/");
      //  sessionHelper.login("admin", "secret");
       // groupHelper = new GroupHelper(wd);
        //contactHelper = new ContactHelper(wd);
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


    /*public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }*/

}
