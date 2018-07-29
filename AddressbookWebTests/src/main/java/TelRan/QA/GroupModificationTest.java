package TelRan.QA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {


    @Test
    public void testGroupModification() {
        goToGroupsPage();
        if (!isGroupPresent()){
            createGroup();
        }
        int before = getGroupsCount();
        selectGroup();
        initGroupModification();
        fillGroupModification();
        submitGroupModification();
        returnToTheGroupsPage();
        int after = getGroupsCount();
        Assert.assertEquals(after, before);

    }

}
