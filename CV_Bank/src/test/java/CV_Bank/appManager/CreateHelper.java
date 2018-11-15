package CV_Bank.appManager;

import CV_Bank.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateHelper extends HelperBase {
    public CreateHelper(WebDriver driver) {
        super(driver);
    }

    public void goToTheCreatePage() {
        click(By.xpath("//button[contains(text(),'Create')]"));
    }

    public void fillTitleCreate(TitleCreateData titleCreateData) {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title'])[1]/i[1]"));
        type(By.name("title"), titleCreateData.getCvTitle());
        type(By.name("first_name"), titleCreateData.getFirstName());
        type(By.name("last_name"), titleCreateData.getLastName());
       type(By.name("birthday"), titleCreateData.getYear(), false);
        type(By.id("summary"), titleCreateData.getSummary());
        type(By.cssSelector("#about"), titleCreateData.getAbout());
    }

    public void fillContactCreateInfo(ContactInfoData contactInfoData) {
        click(By.xpath("//a[@aria-controls='contacts']//h3"));
        type(By.name("phone"), String.valueOf(contactInfoData.getPhone()));
        type(By.name("email"), contactInfoData.getEmail());
        type(By.name("residence"), contactInfoData.getResidence());
    }
    public void fillDescriptionCreate(DescriptionData descriptionData){
        click(By.xpath("//a[@aria-controls='desc']//h3"));
        type(By.name("choose_preferable_area"), descriptionData.getChoosePreferable());
        type(By.name("choose_position"), descriptionData.getChoosePreferables());
        type(By.name("salary_from"), String.valueOf(descriptionData.getSalaryFrom()));
        type(By.name("salary_till"), String.valueOf(descriptionData.getSalaryTill()));
    }
    public void fillEducationCreate(EducationData educationData){
        click(By.xpath("//a[@aria-controls='education']//h3"));
        type(By.xpath("//input[@placeholder='school/institution name*']"), educationData.getSchoolInstitution());
        type(By.xpath("//input[@placeholder='degree*']"),educationData.getDegree());
        type(By.xpath("//div[@id='education']//div//input[@placeholder='graduation year*']"), String.valueOf(educationData.getGraduationYear()));
        type(By.xpath("//textarea[@placeholder='description']"), educationData.getDescription());
    }
    public void fillProjectCreate(ProjectsJobsData projectsJobsData){
        click(By.xpath("//a[@aria-controls='projects']//h3"));
        type(By.xpath("//input[@placeholder='company*']"),projectsJobsData.getCompany());
        type(By.xpath("//input[@placeholder='position*']"), projectsJobsData.getPosition());
        type(By.xpath("//input[@placeholder='year from']"), String.valueOf(projectsJobsData.getYearFrom()));
        type(By.xpath("//input[@placeholder='year till']"), String.valueOf(projectsJobsData.getYearTill()));
        type(By.xpath("//textarea[@placeholder='project description']"), projectsJobsData.getProjectDescription());
    }
    public void fillAchievementsCreate(AchievementsData achievementsData){
        click(By.xpath("//a[@aria-controls='achievements']//h3"));
        type(By.xpath("//div[@id='achievements']//div//textarea[@placeholder='description*']"), achievementsData.getDescription());
        type(By.xpath("//div[@id='achievements']//div//input[@placeholder='graduation year*']"), String.valueOf(achievementsData.getGraduationYear()));
    }
    public void fillCertificationCreate(CertificationsData certificationsData){
        click(By.xpath("//a[@aria-controls='certifications']//h3"));
        type(By.xpath("//div[@id='certifications']//div//textarea[@placeholder='description*']"),certificationsData.getDescription());
        type(By.xpath("//div[@id='certifications']//div//input[@placeholder='graduation year*']"), String.valueOf(certificationsData.getGraduationYear()));
    }
    public void fillFooterLinkCreate(FooterLinksData footerLinksData){
        click(By.xpath("//a[@aria-controls='links']//h3"));
        type(By.name("linkedin_link"), footerLinksData.getLinkedinLink());
        type(By.xpath("//input[@placeholder='github']"), footerLinksData.getGirHub());
        type(By.xpath("//input[@placeholder='portfolio']"), footerLinksData.getPortfolio());
    }
    public  void fillFooterInfoCreate(FooterInfoData footerInfoData){
        click(By.xpath("//a[@aria-controls='info']//h3"));
        type(By.xpath("//textarea[@placeholder='recommendation']"), footerInfoData.getRecommendation());
    }
    /*public void fillLanguagesCreate(LanguagesData languagesData){
        click(By.xpath("//a[@aria-controls='languages']//h3"));
        type(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']"),languagesData.getLanguage());
    }*/
    public void fillSkillsCreate(SkillsData skillsData){
        click(By.xpath("//a[@aria-controls='skills']//h3"));
    }
}