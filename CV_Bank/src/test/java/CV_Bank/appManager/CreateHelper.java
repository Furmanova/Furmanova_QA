package CV_Bank.appManager;

import CV_Bank.model.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public void fillDescriptionCreate(DescriptionData descriptionData) {
        click(By.xpath("//a[@aria-controls='desc']//h3"));
        type(By.name("choose_preferable_area"), descriptionData.getChoosePreferable());
        type(By.name("choose_position"), descriptionData.getChoosePreferables());
        type(By.name("salary_from"), String.valueOf(descriptionData.getSalaryFrom()));
        type(By.name("salary_till"), String.valueOf(descriptionData.getSalaryTill()));
    }

    public void fillEducationCreate(EducationData educationData) {
        click(By.xpath("//a[@aria-controls='education']//h3"));
        type(By.xpath("//input[@placeholder='school/institution name*']"), educationData.getSchoolInstitution());
        type(By.xpath("//input[@placeholder='degree*']"), educationData.getDegree());
        type(By.xpath("//div[@id='education']//div//input[@placeholder='graduation year*']"), String.valueOf(educationData.getGraduationYear()));
        type(By.xpath("//textarea[@placeholder='description']"), educationData.getDescription());
    }

    public void fillProjectCreate(ProjectsJobsData projectsJobsData) {
        click(By.xpath("//a[@aria-controls='projects']//h3"));
        type(By.xpath("//input[@placeholder='company*']"), projectsJobsData.getCompany());
        type(By.xpath("//input[@placeholder='position*']"), projectsJobsData.getPosition());
        type(By.xpath("//input[@placeholder='year from']"), String.valueOf(projectsJobsData.getYearFrom()));
        type(By.xpath("//input[@placeholder='year till']"), String.valueOf(projectsJobsData.getYearTill()));
        type(By.xpath("//textarea[@placeholder='project description']"), projectsJobsData.getProjectDescription());
    }

    public void fillAchievementsCreate(AchievementsData achievementsData) {
        click(By.xpath("//a[@aria-controls='achievements']//h3"));
        type(By.xpath("//div[@id='achievements']//div//textarea[@placeholder='description*']"), achievementsData.getDescription());
        type(By.xpath("//div[@id='achievements']//div//input[@placeholder='graduation year*']"), String.valueOf(achievementsData.getGraduationYear()));
    }

    public void fillCertificationCreate(CertificationsData certificationsData) {
        click(By.xpath("//a[@aria-controls='certifications']//h3"));
        type(By.xpath("//div[@id='certifications']//div//textarea[@placeholder='description*']"), certificationsData.getDescription());
        type(By.xpath("//div[@id='certifications']//div//input[@placeholder='graduation year*']"), String.valueOf(certificationsData.getGraduationYear()));
    }

    public void fillFooterLinkCreate(FooterLinksData footerLinksData) {
        click(By.xpath("//a[@aria-controls='links']//h3"));
        type(By.name("linkedin_link"), footerLinksData.getLinkedinLink());
        type(By.xpath("//input[@placeholder='github']"), footerLinksData.getGirHub());
        type(By.xpath("//input[@placeholder='portfolio']"), footerLinksData.getPortfolio());
    }

    public void fillFooterInfoCreate(FooterInfoData footerInfoData) {
        click(By.xpath("//a[@aria-controls='info']//h3"));
        type(By.xpath("//textarea[@placeholder='recommendation']"), footerInfoData.getRecommendation());
    }


    public void selectLanguages() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Languages'])[1]/i[1]"));
        WebElement languages = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Languages'])[1]/following::select[1]"));
        getSelect(languages);
        select.selectByVisibleText("(Afan)/Oromoor/Oriya");
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Languages'])[1]/following::i[2]"));
        WebElement languages2 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Languages'])[1]/following::select[2]"));
        getSelect(languages2);
        select.selectByVisibleText("Arabic");
    }


    public void fillSkillsCreate() throws InterruptedException {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Education'])[1]/following::h3[1]"));
        Thread.sleep(1000);
        click(By.xpath("//u[contains(text(),'PHP')]"));
        Thread.sleep(1000);
        click(By.xpath("//u[contains(text(),'JavaScript')]"));
        Thread.sleep(1000);
        click(By.xpath("//u[contains(text(),'SQL')]"));
    }

    public void createTitle(String title, String firstName, String lastName,
                            String summary, String year, String about) {
        TitleCreateData titleCreateData = new TitleCreateData()
                .setCvTitle(title)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setSummary(summary)
                .setYear(year)
                .setAbout(about);
        fillTitleCreate(titleCreateData);
    }

    public void contactInfo(int phone, String email, String residence) {
        ContactInfoData contact = new ContactInfoData()
                .setPhone(phone)
                .setEmail(email)
                .setResidence(residence);
        fillContactCreateInfo(contact);
    }

    public void description(String choosePreferable, String choosePreferables, int salaryFrom, int salaryTill) {
        DescriptionData descriptionData = new DescriptionData()
                .setChoosePreferable(choosePreferable)
                .setChoosePreferables(choosePreferables)
                .setSalaryFrom(salaryFrom)
                .setSalaryTill(salaryTill);
        fillDescriptionCreate(descriptionData);
    }

    public void education(String schoolInstitution, String degree, int graduationYear, String description) {
        EducationData educationData = new EducationData()
                .setSchoolInstitution(schoolInstitution)
                .setDegree(degree)
                .setGraduationYear(graduationYear)
                .setDescription(description);
        fillEducationCreate(educationData);
    }

    public void projectsJobs(String company, String position, String projectDescription, int earFrom, int earTill) {
        ProjectsJobsData projectsJobsData = new ProjectsJobsData()
                .setCompany(company)
                .setPosition(position)
                .setProjectDescription(projectDescription)
                .setYearFrom(earFrom)
                .setYearTill(earTill);
        fillProjectCreate(projectsJobsData);
    }

    public void achievements(String description, int graduationYear) {
        AchievementsData achievementsData = new AchievementsData()
                .setDescription(description)
                .setGraduationYear(graduationYear);
        fillAchievementsCreate(achievementsData);
    }

    public void certifications(String description, int graduationYear) {
        CertificationsData certificationsData = new CertificationsData()
                .setDescription(description)
                .setGraduationYear(graduationYear);
        fillCertificationCreate(certificationsData);
    }

    public void footerLinks(String linkedinLink, String girHub, String Portfolio) {
        FooterLinksData footerLinksData = new FooterLinksData()
                .setLinkedinLink(linkedinLink)
                .setGirHub(girHub)
                .setPortfolio(Portfolio);
        fillFooterLinkCreate(footerLinksData);
    }

    public void footerInfo(String recommendation) {
        FooterInfoData footerInfoData = new FooterInfoData()
                .setRecommendation(recommendation);
        fillFooterInfoCreate(footerInfoData);
    }

}
