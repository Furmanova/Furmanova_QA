package TelRan.QA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreateTest extends TestBase {
    @Test
    public void testCreationContact() {
        int before = app.getContactHelper().getContactCount();
        app.goToAddNewPage();
        app.getContactHelper().fillContactsForm(new ContactData()
                .withFirstName("Ivanov")
                .withAddress("Prodolna 3-a")
                .withEmail("furmano@gmail.com")
                .withLastName("Peter")
                .withEmail12("furmano@gmail.com")
                .withMobile("0987654332"));
        app.getContactHelper().submitContactCreationTest();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }
}



