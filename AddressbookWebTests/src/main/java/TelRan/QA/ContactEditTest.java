package TelRan.QA;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBase {
    WebDriver wd;
    @Test
    public void contactEditTest() {
        if (!app.getContactHelper().isContactPresent()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillEditContactForm();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before );
    }
}
