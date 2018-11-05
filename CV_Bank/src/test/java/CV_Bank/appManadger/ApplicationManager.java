package CV_Bank.appManadger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    SessionHelper sessionHelper;
    WebDriver driver;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }
    public void start() {
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.openSite("https://cv-app-test.herokuapp.com/");
    }

    public void stop() {
        driver.quit();
    }
    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}