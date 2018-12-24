package CV_Bank.appManager;

import CV_Bank.model.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateHelper extends HelperBase {
    public CreateHelper(WebDriver driver) {
        super(driver);
    }

    public CreateHelper goToTheCreatePage() {
        click(By.xpath("//button[contains(text(),'Create')]"));
        return this;
    }

    public CreateHelper fillTitleCreate(TitleCreateData titleCreateData) {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title'])[1]/i[1]"));
        type(By.name("title"), titleCreateData.getCvTitle());
        type(By.name("first_name"), titleCreateData.getFirstName());
        type(By.name("last_name"), titleCreateData.getLastName());
        type(By.name("birthday"), titleCreateData.getYear(), false);
        type(By.id("summary"), titleCreateData.getSummary());
        type(By.cssSelector("#about"), titleCreateData.getAbout());
        return this;
    }

    public CreateHelper fillContactCreateInfo(ContactInfoData contactInfoData) {
        click(By.xpath("//a[@aria-controls='contacts']//h3"));
        type(By.name("phone"), String.valueOf(contactInfoData.getPhone()));
        type(By.name("email"), contactInfoData.getEmail());
        type(By.name("residence"), contactInfoData.getResidence());
        return this;
    }

    public CreateHelper fillDescriptionCreate(DescriptionData descriptionData) {
        click(By.xpath("//a[@aria-controls='desc']//h3"));
        type(By.name("choose_preferable_area"), descriptionData.getChoosePreferable());
        type(By.name("choose_position"), descriptionData.getChoosePreferables());
        type(By.name("salary_from"), String.valueOf(descriptionData.getSalaryFrom()));
        type(By.name("salary_till"), String.valueOf(descriptionData.getSalaryTill()));
        return this;
    }

    public CreateHelper fillEducationCreate(EducationData educationData) {
        click(By.xpath("//a[@aria-controls='education']//h3"));
        type(By.xpath("//input[@placeholder='school/institution name*']"), educationData.getSchoolInstitution());
        type(By.xpath("//input[@placeholder='degree*']"), educationData.getDegree());
        type(By.xpath("//div[@id='education']//div//input[@placeholder='graduation year*']"), String.valueOf(educationData.getGraduationYear()));
        type(By.xpath("//textarea[@placeholder='description']"), educationData.getDescription());
        return this;
    }

    public CreateHelper fillProjectCreate(ProjectsJobsData projectsJobsData) {
        click(By.xpath("//a[@aria-controls='projects']//h3"));
        type(By.xpath("//input[@placeholder='company*']"), projectsJobsData.getCompany());
        type(By.xpath("//input[@placeholder='position*']"), projectsJobsData.getPosition());
        type(By.xpath("//input[@placeholder='year from']"), String.valueOf(projectsJobsData.getYearFrom()));
        type(By.xpath("//input[@placeholder='year till']"), String.valueOf(projectsJobsData.getYearTill()));
        type(By.xpath("//textarea[@placeholder='project description']"), projectsJobsData.getProjectDescription());
        return this;
    }

    public CreateHelper fillAchievementsCreate(AchievementsData achievementsData) {
        click(By.xpath("//a[@aria-controls='achievements']//h3"));
        type(By.xpath("//div[@id='achievements']//div//textarea[@placeholder='description*']"), achievementsData.getDescription());
        type(By.xpath("//div[@id='achievements']//div//input[@placeholder='graduation year*']"), String.valueOf(achievementsData.getGraduationYear()));
        return this;
    }

    public CreateHelper fillCertificationCreate(CertificationsData certificationsData) {
        click(By.xpath("//a[@aria-controls='certifications']//h3"));
        type(By.xpath("//div[@id='certifications']//div//textarea[@placeholder='description*']"), certificationsData.getDescription());
        type(By.xpath("//div[@id='certifications']//div//input[@placeholder='graduation year*']"), String.valueOf(certificationsData.getGraduationYear()));
        return this;
    }

    public CreateHelper fillFooterLinkCreate(FooterLinksData footerLinksData) {
        click(By.xpath("//a[@aria-controls='links']//h3"));
        type(By.name("linkedin_link"), footerLinksData.getLinkedinLink());
        type(By.xpath("//input[@placeholder='github']"), footerLinksData.getGirHub());
        type(By.xpath("//input[@placeholder='portfolio']"), footerLinksData.getPortfolio());
        return this;
    }

    public CreateHelper fillFooterInfoCreate(FooterInfoData footerInfoData) {
        click(By.xpath("//a[@aria-controls='info']//h3"));
        type(By.xpath("//textarea[@placeholder='recommendation']"), footerInfoData.getRecommendation());
        return this;
    }

    public CreateHelper addLanguages() {
        click(By.xpath("//button[@title='Add Language']//i[@class='fas fa-plus fa-2x']"));
        return this;
    }

    public CreateHelper clickLanguages() {
        click(By.xpath("//a[@aria-controls='languages']//i[@class='fas fa-chevron-circle-down']"));
        return this;
    }

    public CreateHelper selectLanguages(String languages, String element) {
        this.waitUntilIsLoadedCustomTime(driver.findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']")));
        new Select(driver.findElement(By.xpath("//div[@id='languages']//div//div[" + element + "]//select[1]")))
                .selectByVisibleText(languages);
        return this;
    }
    public CreateHelper selectLanguage(List<String> languages ) {
        click(By.xpath("//a[@aria-controls='languages']//i[@class='fas fa-chevron-circle-down']"));

//        this.waitUntilIsLoadedCustomTime(driver.findElement(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']")));
        for (String language :languages) {

            WebElement element = driver.findElement(By.xpath("//div[@id='skill-list']"));
            new Select(driver.findElement(By.xpath("//div[@id='languages']//div//div[" + element + "]//select[1]")))
                    .selectByVisibleText(language);



        }

        return this;
    }
    public CreateHelper fillSkillsCreate(List<String> skills) {
        click(By.xpath("//a[@aria-controls='skills']//i[@class='fas fa-chevron-circle-down']"));
        this.waitUntilIsLoadedCustomTime(driver.findElement(By.xpath("//div[@id='skills']")));
        for (String skill : skills) {
            click(By.xpath("//div[@id='skill-list']//u[contains(text(),'" + skill + "')]"));
        }
        return this;
    }

    public CreateHelper createTitle(String title, String firstName, String lastName, String summary, String year, String about) {
        TitleCreateData titleCreateData = new TitleCreateData().setCvTitle(title).setFirstName(firstName).setLastName(lastName).setSummary(summary).setYear(year).setAbout(about);
        fillTitleCreate(titleCreateData);
        return this;
    }

    public CreateHelper contactInfo(int phone, String email, String residence) {
        ContactInfoData contact = new ContactInfoData().setPhone(phone).setEmail(email).setResidence(residence);
        fillContactCreateInfo(contact);
        return this;
    }

    public CreateHelper description(String choosePreferable, String choosePreferables, int salaryFrom, int salaryTill) {
        DescriptionData descriptionData = new DescriptionData().setChoosePreferable(choosePreferable).setChoosePreferables(choosePreferables).setSalaryFrom(salaryFrom).setSalaryTill(salaryTill);
        fillDescriptionCreate(descriptionData);
        return this;
    }

    public CreateHelper education(String schoolInstitution, String degree, int graduationYear, String description) {
        EducationData educationData = new EducationData().setSchoolInstitution(schoolInstitution).setDegree(degree).setGraduationYear(graduationYear).setDescription(description);
        fillEducationCreate(educationData);
        return this;
    }

    public CreateHelper projectsJobs(String company, String position, String projectDescription, int earFrom, int earTill) {
        ProjectsJobsData projectsJobsData = new ProjectsJobsData().setCompany(company).setPosition(position).setProjectDescription(projectDescription).setYearFrom(earFrom).setYearTill(earTill);
        fillProjectCreate(projectsJobsData);
        return this;
    }

    public CreateHelper achievements(String description, int graduationYear) {
        AchievementsData achievementsData = new AchievementsData().setDescription(description).setGraduationYear(graduationYear);
        fillAchievementsCreate(achievementsData);
        return this;
    }

    public CreateHelper certifications(String description, int graduationYear) {
        CertificationsData certificationsData = new CertificationsData().setDescription(description).setGraduationYear(graduationYear);
        fillCertificationCreate(certificationsData);
        return this;
    }

    public CreateHelper footerLinks(String linkedinLink, String girHub, String Portfolio) {
        FooterLinksData footerLinksData = new FooterLinksData().setLinkedinLink(linkedinLink).setGirHub(girHub).setPortfolio(Portfolio);
        fillFooterLinkCreate(footerLinksData);
        return this;
    }

    public CreateHelper footerInfo(String recommendation) {
        FooterInfoData footerInfoData = new FooterInfoData().setRecommendation(recommendation);
        fillFooterInfoCreate(footerInfoData);
        return this;
    }
}
