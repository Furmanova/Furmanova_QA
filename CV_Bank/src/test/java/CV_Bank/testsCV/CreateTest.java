package CV_Bank.testsCV;

import org.testng.annotations.Test;

public class CreateTest extends TestBase {
    @Test

    public void testCreate() {
        app.getCreateHelper().goToTheCreatePage();
        app.getCreateHelper().createTitle(
                "sdsd",
                "sdsd",
                "dsd",
                "sds",
                "01022018",
                "sds");
        app.getCreateHelper().contactInfo(
                121333,
                "wqw",
                "");
        app.getCreateHelper().description(
                "df",
                "sfdsdgf",
                1,
                2);
        app.getCreateHelper().education(
                "sff",
                "sff",
                2,
                "sf");
        app.getCreateHelper().projectsJobs(
                "dfd",
                "ss",
                "dsd",
                2,
                1);
        app.getCreateHelper().achievements(
                "fg",
                3);
        app.getCreateHelper().certifications(
                "dhdh",
                4);
        app.getCreateHelper().footerLinks(
                "",
                "",
                "");
        app.getCreateHelper().footerInfo(
                "");



        /*LanguagesData languages = new LanguagesData()
                .setLanguage("");
        app.getCreateHelper().fillLanguagesCreate(languages);*/

    }
}
