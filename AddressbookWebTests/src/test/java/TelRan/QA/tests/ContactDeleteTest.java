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

        List<ContactData> before=app.getContactHelper().getContactList();
       // app.getContactHelper().selectContactByIndex(before - 1); //last group
        app.getContactHelper().deleteContact();
        app.confirmAlert();


        List<ContactData> after=app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()-1);
        before.remove(before.size()-1);

        Assert.assertEquals(after, before);



    }

    @Test
    public void firstContactDeletionTest() throws InterruptedException {
        if (!app.getContactHelper().isContactPresent()) {
            app.getContactHelper().createContact();
        }

        List<ContactData> before=app.getContactHelper().getContactList();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.confirmAlert();

        List<ContactData> after=app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size()-1);
        before.remove(before.size()-1);

        Assert.assertEquals(after, before);



    }
}