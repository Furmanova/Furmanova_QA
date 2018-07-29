package TelRanContact;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactCreateTest extends TestBaseContact {

    @Test
    public void testCreationContact() {
        int before = getContactCount();
        goToAddNewPage();
        fillContactsForm(new ContactData()
                .withFirstName("Ivanov")
                .withAddress("Prodolna 3-a")
                .withEmail("furmano@gmail.com")
                .withLastName("Peter")
                .withEmail12("furmano@gmail.com")
                .withMobile("0987654332"));
        submitContactCreationTest();
       int after = getContactCount();
        Assert.assertEquals(after, before +1 );
    }
}




