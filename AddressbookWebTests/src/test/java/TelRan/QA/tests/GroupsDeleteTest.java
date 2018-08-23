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
        List<GroupData> before = app.getGroupHelper().getGroupList();
        // int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroupByIndex(before.size() - 1); //last group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        // int after = app.getGroupHelper().getGroupsCount();

        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(after, before);
    }

    @Test
    public void testFirstDeleteGroup() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        //int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup(); //first group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        //int after = app.getGroupHelper().getGroupsCount();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        before.remove(0);
        Assert.assertEquals(before.size(), after.size());
        Assert.assertEquals(before, after);

    }
}