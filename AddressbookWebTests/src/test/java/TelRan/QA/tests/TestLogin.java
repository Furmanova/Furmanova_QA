package TelRan.QA.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    @BeforeMethod
    public void userPrecondition() {
        app.getSessionHelper().logaut();
    }

    @Test
    public void loginTest() {
        app.getSessionHelper().login("admin", "secret");

        Assert.assertTrue(app.getSessionHelper().isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }
    @Test
    public void negativeLoginTest() {
        app.getSessionHelper().login("admin", "kjgg");

        Assert.assertFalse(app.getSessionHelper().isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }
    @AfterMethod
    public void postconditionAfterLoginTest(){
        if (!app.getSessionHelper().isLoggin()){
            app.getSessionHelper().login("admin","secret");
        }
    }

}
