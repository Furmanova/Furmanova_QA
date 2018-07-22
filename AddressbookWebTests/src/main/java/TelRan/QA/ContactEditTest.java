package TelRan.QA;

import org.testng.annotations.Test;

public class ContactEditTest extends TestBase{
    @Test
    public void contactEditTest(){
        selectContact();
        editContact();
        fillEditContactForm();
    }
}
