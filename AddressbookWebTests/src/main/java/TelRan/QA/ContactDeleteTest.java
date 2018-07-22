package TelRan.QA;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase {
    @Test
    public void contactDeletionTest(){
        int before = wd.findElements(By.name("selected[]")).size();
        selectContact();
        deleteContact();
        confirmAlert();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after,before-1);
    }
}
