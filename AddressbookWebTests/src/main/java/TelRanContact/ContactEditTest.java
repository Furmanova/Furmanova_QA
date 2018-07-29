package TelRanContact;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactEditTest extends TestBaseContact {
    @Test
    public void contactEditTest() {
        if (!isContactPresent()) {
            createContact();
        }
        int before = getContactCount();
        wd.findElement(By.cssSelector("#maintable")).click();
        // selectContact();
        editContact();
        fillEditContactForm();
        int after = getContactCount();
        Assert.assertEquals(after, before );
    }
}
