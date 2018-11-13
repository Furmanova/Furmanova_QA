package CV_Bank.testsCV;

import CV_Bank.appManager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
       public static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod
    public void setUp() {
        app.start();
    }

    /*@AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }*/

}
