package TelRan.QA;

import org.testng.annotations.Test;

public class CreateDeleteGroupsTest extends TestBase {
    @Test
    public void testDeleteGroups() {
        goToGroupsPage();
        selectGroup();
        groupDeletion();
        returnToTheGroupsPage();
    }
}
