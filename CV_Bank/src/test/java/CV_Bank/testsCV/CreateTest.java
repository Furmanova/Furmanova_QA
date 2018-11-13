package CV_Bank.testsCV;


import CV_Bank.model.ContactInfoData;
import CV_Bank.model.TitleCreateData;
import org.testng.annotations.Test;

public class CreateTest extends TestBase {
    @Test
    public void testCreate() {
        app.getCreateHelper().goToTheCreatePage();
        TitleCreateData title = new TitleCreateData()
                .setCvTitle("")
                .setFirstName("")
                .setLastName("")
                .setSummary("")
                //.setYear(1)
                .setAbout("");
        app.getCreateHelper().fillCreateTitle(title);
        ContactInfoData contact = new ContactInfoData()
                .setPhone(+521111111)
                .setEmail("")
                .setResidence("");
        app.getCreateHelper().fillCreateContactInfo(contact);

    }


}
