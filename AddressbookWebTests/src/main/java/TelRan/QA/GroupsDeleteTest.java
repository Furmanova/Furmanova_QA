package TelRan.QA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDeleteTest extends TestBase {
    @Test
    public void testLastDeleteGroup() {
        goToGroupsPage();

        if (!isGroupPresent()) {
            createGroup();
        }
        int before = getGroupsCount();
        selectGroupByIndex(before - 1); //last group
        groupDeletion();
        returnToTheGroupsPage();
        int after = getGroupsCount();
        Assert.assertEquals(after, before - 1);
    }

    @Test
    public void testFirstDeleteGroup() {
        goToGroupsPage();

        if (!isGroupPresent()) {
            createGroup();
        }
        int before = getGroupsCount();
        selectGroup(); //first group
        groupDeletion();
        returnToTheGroupsPage();
        int after = getGroupsCount();
        Assert.assertEquals(after, before - 1);
    }

}