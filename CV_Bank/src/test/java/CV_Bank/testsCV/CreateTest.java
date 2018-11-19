package CV_Bank.testsCV;

import CV_Bank.appManager.CreateHelper;
import org.testng.annotations.Test;

public class CreateTest extends TestBase {
    @Test

    public void testCreate() {
        CreateHelper helper = app.getCreateHelper();
        helper.goToTheCreatePage();
        helper.createTitle(
                "sdsd",
                "sdsd",
                "dsd",
                "sds",
                "01022018",
                "sds");
        helper.contactInfo(
                121333,
                "wqw",
                "");
        helper.description(
                "df",
                "sfdsdgf",
                1,
                2);
        helper.education(
                "sff",
                "sff",
                2,
                "sf");
        helper.projectsJobs(
                "dfd",
                "ss",
                "dsd",
                2,
                1);
        helper.achievements(
                "fg",
                3);
        helper.certifications(
                "dhdh",
                4);
        helper.footerLinks(
                "",
                "",
                "");
        helper.footerInfo("");

        /*LanguagesData languages = new LanguagesData()
                .setLanguage("");
        app.getCreateHelper().fillLanguagesCreate(languages);*/

    }
}
