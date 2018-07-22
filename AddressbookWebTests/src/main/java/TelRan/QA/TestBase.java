package TelRan.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
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
    public void returnToTheGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }
    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }
    public void fillGroupsForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        wd.findElement(By.name("group_name")).click();

        wd.findElement(By.name("group_header"));
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        wd.findElement(By.name("group_header")).click();

        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
        wd.findElement(By.name("group_footer")).click();
    }
    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }
    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }
    public void initGroupModification() {
        wd.findElement(By.name("edit")).click();
    }
    public void submitGroupModification() {
        wd.findElement(By.name("update")).click();
    }
    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void groupDeletion() {

        wd.findElement(By.name("delete")).click();
    }

    public void fillGroupModification() {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("testGroupName");
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("testGroupheader");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys("restGroupFooter");
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
    /*@AfterClass
    public void tearDown() {
        wd.quit();
    }*/
}