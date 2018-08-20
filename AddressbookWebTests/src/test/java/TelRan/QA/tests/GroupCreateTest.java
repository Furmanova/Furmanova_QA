package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupCreateTest extends TestBase {


    @Test
    public void testCreateGroupTest() throws InterruptedException {
        app.getGroupHelper().goToGroupsPage();

        List<GroupData> before = app.getGroupHelper().getGroupsList();
        app.getGroupHelper().initGroupCreation();
        GroupData group = new GroupData().setId((before.get(0).getId()))
                .setGroupFooter("GroupFooter")
                .setGroupHeader("GroupHeader")
                .setGroupName("GroupName");
        app.getGroupHelper().fillGroupsForm(group);

        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToTheGroupsPage();

        List<GroupData> after = app.getGroupHelper().getGroupsList();

        Assert.assertEquals(after.size(), before.size(), +1);
        before.add(group);
        int max = 0;
        for (GroupData g : after){
            if(g.getId() > max){
                max = g.getId();
            }
            group.setId(max);
        }

    }
}


