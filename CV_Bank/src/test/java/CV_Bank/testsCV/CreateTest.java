package CV_Bank.testsCV;

import CV_Bank.appManager.CreateHelper;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CreateTest extends TestBase {

    @Test

    public void testCreate() {
        CreateHelper helper = app.getCreateHelper();
        helper.goToTheCreatePage()
                .createTitle("sdsd", "sdsd", "dsd", "sds", "01022018", "sds")
                .contactInfo(12244, "wqw", "")
                .description("df", "sfdsdgf", 1, 2)
                .education("sff", "sff", 2, "sf")
                .projectsJobs("dfd", "ss", "dsd", 2, 1)
                .achievements("fg", 3)
                .certifications("dhdh", 4)
                .footerLinks("", "", "")
                .footerInfo("")
                .selectLanguage(Arrays.asList(new String[]{"Russian","1"}))
                .clickLanguages()
                .selectLanguages("Russian", "1")
                .addLanguages()
                .selectLanguages("English", "2")
                .addLanguages()
                .selectLanguages("Hebrew", "3")
               .fillSkillsCreate(Arrays.asList(new String[]{"Go", "SQL", "Linux"}));
    }
}