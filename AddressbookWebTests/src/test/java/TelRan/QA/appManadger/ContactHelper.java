package TelRan.QA.appManadger;

import TelRan.QA.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public void deleteContact() throws InterruptedException {
        click(By.xpath("//*[@value = 'Delete']"));
        Thread.sleep(2000);
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void selectContactByIndex(int ind) {

        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void fillEditContactForm(ContactData contact) {
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
        goToHomePage();
        goToAddNewPage();
        fillContactsForm(new ContactData()
                .setFirstName("Ivanov")
                .setAddress("Prodolna 3-a")
                .setEmail("furmano@gmail.com")
                .setLastName("Peter")
                .setEmail12("furmano@gmail.com")
                .setMobile("0987654332"));
        submitContactCreationTest();
    }

    private void goToHomePage() {
        click(By.linkText("home"));
    }

    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }


    public boolean isContactPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public void isOnContactPage() {
        if (!isElementPresent(By.xpath("//form[@name='MainForm'],'Home'"))) {
            goToHomePage();
        }
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.cssSelector("table"));
        for (WebElement element : elements) {
            String contactName = element.getText();
           int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
           ContactData contact = new ContactData().setId(id).setFirstName(contactName);
          contacts.add(contact);

        }
        System.out.println(contacts);
        return contacts;
    }

}

