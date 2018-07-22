package TelRan.QA;

import org.testng.annotations.Test;

public class CreateModificationGroupTest extends TestBase {


    @Test
    public void testGroupModification() {
       goToGroupsPage();
       selectGroup();
       initGroupModification();
        fillGroupModification();
        submitGroupModification();
        returnToTheGroupsPage();

    }

}
