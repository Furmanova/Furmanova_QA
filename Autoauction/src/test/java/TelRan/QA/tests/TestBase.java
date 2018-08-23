package TelRan.QA.tests;

import TelRan.QA.appManadger.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    public static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod
    public void logTestStart(Method method) {
        logger.info("Start test" + method.getName());
    }
    @AfterMethod(alwaysRun = true)
    public void logTestStop(Method method){
        logger.info("Stop test" + method.getName());
    }

    @BeforeSuite
    public void setUp() {
        app.start();
    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }
}