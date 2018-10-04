package TelRan.QA.tests;

import org.testng.annotations.Test;

public class TestPublishTenderForAVehiclePage extends TestBase {
    @Test
    public void testPublishTenderForAVehiclePage(){
        app.getSessionHelper().goToPublishTenderForAVehiclePage();
    }
}
