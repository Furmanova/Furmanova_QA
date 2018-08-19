package TelRan.QA.tests;

import TelRan.QA.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactCreateTest extends TestBase {
    @Test
    public void testCreationContact() {
        app.getContactHelper().isOnContactPage();
        int before = app.getContactHelper().getContactCount();
        List<ContactData> contactListBefore=app.getContactHelper().getContactList();
        app.getContactHelper().goToAddNewPage();
        app.getContactHelper().fillContactsForm(
                new ContactData()
                .setFirstName("Ivanov")
                .setAddress("Prodolna 3-a")
                .setEmail("furmano@gmail.com")
                .setLastName("Peter")
                .setEmail12("furmano@gmail.com")
                .setMobile("0987654332"));
        app.getContactHelper().submitContactCreationTest();
        int after = app.getContactHelper().getContactCount();

        List<ContactData> contactListAfter=app.getContactHelper().getContactList();
        Assert.assertEquals(contactListAfter.size(),contactListBefore.size(),+1);
       //Assert.assertEquals(after, before + 1);
    }
}



