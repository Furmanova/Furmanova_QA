package CV_Bank.testsCV;


import CV_Bank.model.*;
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
                //.setYear(98)
                .setAbout("");
        app.getCreateHelper().fillTitleCreate(title);
        ContactInfoData contact = new ContactInfoData()
                .setPhone(+521111111)
                .setEmail("")
                .setResidence("");
        app.getCreateHelper().fillContactCreateInfo(contact);
        DescriptionData description = new DescriptionData()
                .setChoosePreferable("")
                .setChoosePreferables("")
                .setSalaryFrom(1)
                .setSalaryTill(1);
        app.getCreateHelper().fillDescriptionCreate(description);
        EducationData education = new EducationData()
                .setSchoolInstitution("")
                .setDegree("")
                .setGraduationYear(1)
                .setDescription("");
        app.getCreateHelper().fillEducationCreate(education);
        ProjectsJobsData projects = new ProjectsJobsData()
                .setCompany("")
                .setPosition("")
                .setProjectDescription("")
                .setYearFrom(1)
                .setYearTill(2);
        app.getCreateHelper().fillProjectCreate(projects);
        AchievementsData achievements = new AchievementsData()
                .setDescription("")
                .setGraduationYear(1);
        app.getCreateHelper().fillAchievementsCreate(achievements);
        CertificationsData certification = new CertificationsData()
                .setDescription("")
                .setGraduationYear(1);
        app.getCreateHelper().fillCertificationCreate(certification);
        FooterLinksData footerLinks = new FooterLinksData()
                .setLinkedinLink("")
                .setGirHub("")
                .setPortfolio("");
        app.getCreateHelper().fillFooterLinkCreate(footerLinks);
        FooterInfoData footerInfo = new FooterInfoData()
                .setRecommendation("");
        app.getCreateHelper().fillFooterInfoCreate(footerInfo);

    }
    }
