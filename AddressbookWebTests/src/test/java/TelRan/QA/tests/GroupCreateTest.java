package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreateTest extends TestBase {


    @Test
    public void testCreateGroupTest() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        List<GroupData> groupsListBrfore=app.getGroupHelper().getGroupsList();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupsForm(
                new GroupData()
                        .setGroupFooter("GroupFooter")
                        .setGroupHeader("GroupHeader")
                        .setGroupName("GroupName"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();
        List<GroupData> groupsListAfter=app.getGroupHelper().getGroupsList();
        Assert.assertEquals(groupsListBrfore.size(),groupsListAfter.size()-1);
        //Assert.assertEquals(after, before +1);

    }

}


