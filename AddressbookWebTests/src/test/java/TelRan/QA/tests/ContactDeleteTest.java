package TelRan.QA.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase {
    @Test
    public void lastContactDeletionTest() throws InterruptedException {

        if (!app.getContactHelper().isContactPresent()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContactByIndex(before - 1); //last group
        app.getContactHelper().deleteContact();
        app.confirmAlert();
        int after = app.getContactHelper().getContactCount();
        Thread.sleep(2000);
        Assert.assertEquals(after, before - 1);
    }
    @Test
    public void firstContactDeletionTest() {
        if (!app.getContactHelper().isContactPresent()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.confirmAlert();
        int after = app.getContactHelper().getContactCount();

        Assert.assertEquals(after, before - 1);
    }
}