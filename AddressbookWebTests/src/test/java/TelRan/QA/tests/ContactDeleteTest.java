package TelRan.QA.tests;

import TelRan.QA.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeleteTest extends TestBase {
    @Test
    public void lastContactDeletionTest() throws InterruptedException {

        if (!app.getContactHelper().isContactPresent()) {
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        List<ContactData> contactListBefore=app.getContactHelper().getContactList();
        app.getContactHelper().selectContactByIndex(before - 1); //last group
        app.getContactHelper().deleteContact();
        app.confirmAlert();
        Thread.sleep(2000);
        int after = app.getContactHelper().getContactCount();
        List<ContactData> contactListAfter=app.getContactHelper().getContactList();
        Assert.assertEquals(contactListAfter.size(),contactListBefore.size(),+1);

       // Assert.assertEquals(after, before - 1);
    }

    @Test
    public void firstContactDeletionTest() throws InterruptedException {
        if (!app.getContactHelper().isContactPresent()) {
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        List<ContactData> contactListBefore=app.getContactHelper().getContactList();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.confirmAlert();

        int after = app.getContactHelper().getContactCount();
        List<ContactData> contactListAfter=app.getContactHelper().getContactList();
        Assert.assertEquals(contactListAfter.size(),contactListBefore.size(),+1);
       // Assert.assertEquals(after, before - 1);
    }
}