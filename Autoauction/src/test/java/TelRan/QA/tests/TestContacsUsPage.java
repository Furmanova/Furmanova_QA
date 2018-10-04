package TelRan.QA.tests;

import org.testng.annotations.Test;

public class TestContacsUsPage extends TestBase {
    @Test
    public void testContactUsPage(){
        app.getSessionHelper().goToContactUs();
    }
}
