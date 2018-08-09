package TelRan.QA.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {
    @Test
    public void testGroupModification() {
        app.getGroupHelper().goToGroupsPage();

        if (!app.getGroupHelper().isGroupPresent()){
            app.getGroupHelper().createGroup();
        }

        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupModification();
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();
        Assert.assertEquals(after, before);
    }
}
