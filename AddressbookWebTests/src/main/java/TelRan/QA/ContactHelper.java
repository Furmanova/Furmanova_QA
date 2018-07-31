package TelRan.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactsForm(ContactData contactData) {
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail12());
        type(By.name("mobile"), contactData.getMobile());
    }

    public void submitContactCreationTest() {
        click(By.name("submit"));
    }

    public void deleteContact() {
        click(By.xpath("//*[@value = 'Delete']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void selectContactByIndex(int ind) {

        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void fillEditContactForm() {
        type(By.name("firstname"), "Ivanov1");
        type(By.name("lastname"), "Peter1");
        click(By.xpath("(//input[@name='update'])[2]"));
    }

    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();

    }

    public void createContact() {
        goToAddNewPage();
        fillContactsForm(new ContactData()
                .withFirstName("Ivanov")
                .withAddress("Prodolna 3-a")
                .withEmail("furmano@gmail.com")
                .withLastName("Peter")
                .withEmail12("furmano@gmail.com")
                .withMobile("0987654332"));
        submitContactCreationTest();
    }

    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }


    public boolean isContactPresent() {
        return isElementPresent(By.name("selected[]"));
    }
}
