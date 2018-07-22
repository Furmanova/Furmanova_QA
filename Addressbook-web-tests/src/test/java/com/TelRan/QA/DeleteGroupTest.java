package com.TelRan.QA;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class DeleteGroupTest extends GroupCommonTest {
    @Test
    public void test(){

    }
    @BeforeMethod
    public void deleteGroups(String delete) {
        wd.findElement(By.xpath("//*[@id=\"content\"]/form/span[2]/input")).click();
        wd.findElement(By.name("delete")).click();
        wd.findElement(By.xpath("//*[@id=\"content\"]/div/i/a")).click();
    }
}
