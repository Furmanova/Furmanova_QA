package TelRan.QA.tests;

import org.testng.annotations.Test;

public class TestTendersPage extends TestBase {
    @Test
    public void testTendersPage() {
        app.getSessionHelper().goToTendersPage();


    }
}