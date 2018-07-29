package TelRan.QA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase {


    @Test
    public void testCreateGroupTest() {
        goToGroupsPage();
        int before = getGroupsCount();
        initGroupCreation();
        fillGroupsForm(
                new GroupData()
                        .setGroupFooter("GroupFooter")
                        .setGroupHeader("GroupHeader")
                        .setGroupName("GroupName"));
        submitGroupCreation();
        returnToTheGroupsPage();
        int after = getGroupsCount();
        Assert.assertEquals(after, before +1);

    }

}


