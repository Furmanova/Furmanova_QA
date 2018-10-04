package TelRan.QA.appManadger;

import TelRan.QA.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
        attach(By.name("photo"),contactData.getPhoto());

        new Select(wd.findElement(By.name("new_group"))) //выпадающий список начинаем с new
                .selectByVisibleText(contactData.getGroup()); //выбор группы

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
        List<WebElement> rows = wd.findElements(By.name("entry"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            int id = Integer.parseInt(cells.get(0).findElement(By.name("selected[]")).getAttribute("value"));
            String lastName = cells.get(1).getText();
            String firstName = cells.get(2).getText();
            contacts.add(new ContactData().setId(id).setLastName(lastName).setFirstName(firstName));
        }
        System.out.println(contacts);
        return contacts;
    }
}

