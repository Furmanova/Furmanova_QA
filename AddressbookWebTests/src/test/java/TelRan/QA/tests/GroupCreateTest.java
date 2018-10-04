package TelRan.QA.tests;

import TelRan.QA.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class GroupCreateTest extends TestBase {
    @DataProvider
    public Iterator<Object[]> validGroups() throws IOException {
        List<Object[]> list = new ArrayList<>();
        /*list.add(new Object[]{new GroupData() //дата провайдер
                .setGroupName("123")
                .setGroupHeader("1234")
                .setGroupFooter("12345")});
        list.add(new Object[]{new GroupData()
                .setGroupName("papa")
                .setGroupHeader("mama")
                .setGroupFooter("san")});*/
        BufferedReader reader = new BufferedReader(new FileReader
                (new File("src/test/resources/groups.csv"))); // чтение из файла
        String line = reader.readLine();
        while (line != null) { //цикл прохождения
            String[] split = line.split(",");
            list.add(new Object[]{new GroupData()
                    .setGroupName(split[0])
                    .setGroupHeader(split[1])
                    .setGroupFooter(split[2])});
            line = reader.readLine();
        }
        return list.iterator();
    }

    @Test(dataProvider = "validGroups")
    public void testCreateGroupTest(GroupData group) throws InterruptedException {

        app.getGroupHelper().goToGroupsPage();

        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().initGroupCreation();
        /*GroupData group = new GroupData()
                .setGroupFooter("GroupFooter")
                .setGroupHeader("GroupHeader")
                .setGroupName("GroupName");*/
        app.getGroupHelper().fillGroupsForm(group);

        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToTheGroupsPage();

        List<GroupData> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size(), +1);
        before.add(group);
        int max = 0;
        for (GroupData g : after) {
            if (g.getId() > max) {
                max = g.getId();
            }
            group.setId(max);
        }
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}


