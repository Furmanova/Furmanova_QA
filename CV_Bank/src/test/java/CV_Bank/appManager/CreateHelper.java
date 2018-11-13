package CV_Bank.appManager;

import CV_Bank.model.ContactInfoData;
import CV_Bank.model.DescriptionData;
import CV_Bank.model.TitleCreateData;
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
       // type(By.name("birthday"), String.valueOf(titleCreateData.getYear()));
        type(By.id("summary"), titleCreateData.getSummary());
        type(By.cssSelector("#about"), titleCreateData.getAbout());
    }

    public void fillContactCreateInfo(ContactInfoData contactInfoData) {
        click(By.xpath("//a[@aria-controls='contacts']//h3"));
        type(By.xpath("//input[@placeholder='phone*']"), String.valueOf(contactInfoData.getPhone()));
        type(By.xpath("//input[@placeholder='email*']"), contactInfoData.getEmail());
        type(By.name("residence"), contactInfoData.getResidence());
    }
    public void fillDescriptionCreate(DescriptionData descriptionData){
        click(By.xpath("//a[@aria-controls='desc']//h3"));
        type(By.xpath("//input[@placeholder='choose preferable area']"), descriptionData.getChoosePreferable());
        type(By.name("choose_position"), descriptionData.getChoosePreferables());
        type(By.name("salary_from"), String.valueOf(descriptionData.getSalaryFrom()));
        type(By.name("salary_till"), String.valueOf(descriptionData.getSalaryTill()));
    }
}