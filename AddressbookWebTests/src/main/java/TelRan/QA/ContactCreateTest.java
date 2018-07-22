package TelRan.QA;

import org.testng.annotations.Test;


public class ContactCreateTest extends TestBase {

    @Test
    public void testCreationContact() {
        goToAddNewPage();
        fillContactsForm(new ContactData()
                .withFirstName("Ivanov")
                .withAddress("Prodolna 3-a")
                .withEmail("furmano@gmail.com")
                .withLastName("Peter")
                .withEmail12("furmano@gmail.com")
                .withMobile("0987654332"));
        submitContactCreationTest();
    }

}




