package TelRanContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBaseContact {
    WebDriver wd;

    @BeforeClass
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        openSite();
        login();
    }

    public void login() {
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//*[@value ='Login']")).click();
    }

    public void goToAddNewPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void fillContactsForm(ContactData contactData) {
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email2")).sendKeys(contactData.getEmail12());
        wd.findElement(By.name("email2")).click();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        wd.findElement(By.name("mobile")).click();
    }

    public void submitContactCreationTest() {

        wd.findElement(By.name("submit")).click();
    }

    public void openSite() {

        wd.get("http://localhost/addressbook/");
    }

    public void confirmAlert() {

        wd.switchTo().alert().accept();
    }

    public void deleteContact() {

        wd.findElement(By.xpath("//*[@value = 'Delete']")).click();
    }

    public void selectContact() {

        wd.findElement(By.name("selected[]")).click();
    }

    public void selectContactByIndex(int ind) {

        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void fillEditContactForm() {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Ivanov1");
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("Peter1");
        wd.findElement(By.xpath("(//input[@name='update'])[2]")).click();
    }

    public void editContact() {

        wd.findElement(By.xpath("//img[@alt='Edit']")).click();
    }


    public int getContactCount() {
        return wd.findElements(
                By.name("selected[]")).size();

    }

    /*public boolean isElementPresent(By locator){
        try {
            wd.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }*/
    public boolean isElementPresent(By locator) {

        return wd.findElements(locator).size() > 0;
    }


    public boolean isContactPresent() {

        return isElementPresent(By.name("selected[]"));
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

    /*@AfterClass
    public void tearDown() {
        wd.quit();
    }*/
}
