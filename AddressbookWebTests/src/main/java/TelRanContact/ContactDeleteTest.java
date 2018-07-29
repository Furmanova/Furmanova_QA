package TelRanContact;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBaseContact {
    @Test
    public void lastContactDeletionTest() {

        if (!isContactPresent()) {
            createContact();
        }
        int before = getContactCount();
        selectContactByIndex(before - 1); //last group
        deleteContact();
        confirmAlert();
        int after = getContactCount();
        Assert.assertEquals(after, before - 1);
    }
    @Test
    public void firstContactDeletionTest() {
        if (!isContactPresent()) {
            createContact();
        }
        int before = getContactCount();
        selectContact();
        deleteContact();
        confirmAlert();
        int after = getContactCount();
        Assert.assertEquals(after, before - 1);
    }

}
