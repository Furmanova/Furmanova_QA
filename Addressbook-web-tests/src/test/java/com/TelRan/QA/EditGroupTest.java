package com.TelRan.QA;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;


    public class EditGroupTest extends CroupCreationTest {

    @BeforeClass
    private void EditGroup (String edit){
        wd.findElement(By.name("selected[]")).click();
        wd.findElement(By.name("edit")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("motorcycle");
        wd.findElement(By.name("update")).click();
        wd.findElement(By.linkText("group page")).click();
    }
}
