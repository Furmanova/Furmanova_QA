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
        List<GroupData> before = app.getGroupHelper().getGroupsList();         app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        GroupData group =  new GroupData().setId(before.get(0).getId());
        app.getGroupHelper().fillGroupModification(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroupsPage();
        List<GroupData> after = app.getGroupHelper().getGroupsList();
        Assert.assertEquals(after.size(),before.size());
        before.remove(0);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));



    }
}
