package TelRan.QA;

import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase {


    @Test
    public void testCreateGroupTest() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupsForm(
                new GroupData()
                        .setGroupFooter("GroupFooter")
                        .setGroupHeader("GroupHeader")
                        .setGroupName("GroupName"));


        submitGroupCreation();
        returnToTheGroupsPage();

    }

}


