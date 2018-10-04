package TelRan.QA.tests;

import org.testng.annotations.Test;

public class TestHowItWorksPage extends TestBase{
    @Test
    public void testHowItWorksPage (){
        app.getSessionHelper().goToHowItWorksPage();
    }
}
