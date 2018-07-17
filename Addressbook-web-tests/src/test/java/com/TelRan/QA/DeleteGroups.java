package com.TelRan.QA;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;



    public class DeleteGroups extends CroupCreationTest{


    @BeforeClass
    public void DeleteGroups(String delete) {
        wd.findElement(By.xpath("//*[@id=\"content\"]/form/span[2]/input")).click();
        wd.findElement(By.name("delete")).click();
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/i/a")).click();
    }
}
