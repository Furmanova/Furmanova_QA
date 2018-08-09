package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase {


    @Test
    public void testCreateGroupTest() {
        app.getGroupHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupsForm(
                new GroupData()
                        .setGroupFooter("GroupFooter")
                        .setGroupHeader("GroupHeader")
                        .setGroupName("GroupName"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before +1);

    }

}


