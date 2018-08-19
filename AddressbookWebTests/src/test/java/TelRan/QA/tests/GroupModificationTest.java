package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTest extends TestBase {
    @Test
    public void testGroupModification() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        List<GroupData> groupsListBefore = app.getGroupHelper().getGroupsList();


        // int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        GroupData group =  new GroupData().setId(groupsListBefore.get(0).getId());
        app.getGroupHelper().fillGroupModification(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroupsPage();
        List<GroupData> groupsListAfter = app.getGroupHelper().getGroupsList();
        groupsListBefore.remove(0);
        groupsListBefore.add(group);
        // int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(groupsListAfter.size(), groupsListBefore.size());


       /* Assert.assertEquals(new HashSet<Object>(groupsListAfter),
                new HashSet<Object>(groupsListBefore));*/
    }
}
