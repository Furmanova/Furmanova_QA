package TelRan.QA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDeleteTest extends TestBase {
    @Test
    public void testLastDeleteGroup() {
        app.goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroupByIndex(before - 1); //last group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before - 1);
    }

    @Test
    public void testFirstDeleteGroup() {
        app.goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup(); //first group
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before - 1);
    }
}