package TelRan.QA.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOpenSite extends TestBase {
    @Test
    public void testSiteOpening() {
        Assert.assertTrue(app.getSessionHelper()
               .isElementPresent(By.xpath("//img[@class='logo-img-primary']")));



    }
}
