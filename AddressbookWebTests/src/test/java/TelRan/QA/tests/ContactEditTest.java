package TelRan.QA.tests;

import TelRan.QA.model.ContactData;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactEditTest extends TestBase {

    @Test
    public void contactEditTest() {
        if (!app.getContactHelper().isContactPresent()){
            app.getContactHelper().createContact();
        }
        List<ContactData> contactListBefore = app.getContactHelper().getContactList();

        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        ContactData contact =  new ContactData().setId(contactListBefore.get(0).getId());
        app.getContactHelper().fillEditContactForm(contact);

        List<ContactData> contactListAfter = app.getContactHelper().getContactList();

        Assert.assertEquals(contactListAfter.size(), contactListBefore.size());
        contactListBefore.remove(0);
        contactListBefore.add(contact);
        Assert.assertEquals(new HashSet<Object>(contactListAfter),
                new HashSet<Object>(contactListAfter));

    }
}
