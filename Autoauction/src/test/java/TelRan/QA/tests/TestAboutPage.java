package TelRan.QA.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAboutPage extends TestBase {

    @Test
    public void  testAboutPage(){
        app.getSessionHelper().goToAboutPage();


    }





}

