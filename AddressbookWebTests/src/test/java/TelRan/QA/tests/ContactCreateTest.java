package TelRan.QA.tests;

import TelRan.QA.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashSet;
import java.util.List;

public class ContactCreateTest extends TestBase {
    @Test
    public void testCreationContact() {
        app.getContactHelper().isOnContactPage();

        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().goToAddNewPage();
        File photo = new File("src/test/resources/08VEy0Pg.jpeg");


        ContactData contact = new ContactData()
                .setFirstName("Ivanov")
                .setAddress("1Prodolna 3-a")
                .setEmail("furmano@gmail.com")
                .setLastName("Peter")
                .setEmail12("furmano@gmail.com")
                .setMobile("0987654332")
                .setPhoto(photo)
                .setGroup("123");
        app.getContactHelper().fillContactsForm(contact);

        app.getContactHelper().submitContactCreationTest();

        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size(), +1);
        before.add(contact);
        int max = 0;
        for (ContactData g : after) {
            if (g.getId() > max) {
                max = g.getId();
            }
            contact.setId(max);
        }
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}



