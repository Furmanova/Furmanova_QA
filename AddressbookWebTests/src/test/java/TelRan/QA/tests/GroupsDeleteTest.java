package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupsDeleteTest extends TestBase {
    @Test
    public void testLastDeleteGroup() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        List<GroupData> groupsListBefore = app.getGroupHelper().getGroupsList();
        // int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroupByIndex(groupsListBefore.size() - 1); //last group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        // int after = app.getGroupHelper().getGroupsCount();
        Thread.sleep(2000);

        List<GroupData> groupsListAfter = app.getGroupHelper().getGroupsList();
        Assert.assertEquals(groupsListAfter.size(), groupsListBefore.size() - 1);
        groupsListBefore.remove(groupsListBefore.size() - 1);
        Assert.assertEquals(groupsListAfter, groupsListBefore);
    }

    @Test
    public void testFirstDeleteGroup() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        List<GroupData> groupsListBefore = app.getGroupHelper().getGroupsList();
        //int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup(); //first group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        //int after = app.getGroupHelper().getGroupsCount();
        List<GroupData> groupsListAfter = app.getGroupHelper().getGroupsList();
        groupsListBefore.remove(0);
        Assert.assertEquals(groupsListBefore.size(), groupsListAfter.size());
        Assert.assertEquals(groupsListBefore, groupsListAfter);

    }
}