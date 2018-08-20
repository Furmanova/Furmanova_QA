package TelRan.QA.tests;

import TelRan.QA.model.ContactData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactEditTest extends TestBase {
    WebDriver wd;
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
        contactListBefore.remove(0);
        contactListBefore.add(contact);
        Assert.assertEquals(contactListAfter.size(), contactListBefore.size());
        Assert.assertEquals(new HashSet<Object>(contactListAfter),
                new HashSet<Object>(contactListAfter));

    }
}
