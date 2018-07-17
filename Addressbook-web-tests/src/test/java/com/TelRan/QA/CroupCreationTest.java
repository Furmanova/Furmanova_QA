package com.TelRan.QA;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

    public abstract class  CroupCreationTest {
    WebDriver wd;


    @BeforeClass
    public void setUp() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin","secret");
        Groups ("Car");
        EditGroupTest editGroupTest = new EditGroupTest();
        DeleteGroups car =  new DeleteGroups();

    }

    private void login (String user, String password) {
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement (By.xpath ("//*[@ type ='submit']")).click();
        wd.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[3]/a")).click();
    }

    private void Groups (String newGroup){
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).sendKeys("Car");
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_header"));
        wd.findElement(By.name("group_header")).sendKeys("Porsche");
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_footer")).sendKeys("large selection of Porsche machines");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();
    }

    @Test
    public void CroupCreationTest() {

    }
    /*@AfterMethod
    public void tearDown() {
        wd.quit();
    }*/
}
