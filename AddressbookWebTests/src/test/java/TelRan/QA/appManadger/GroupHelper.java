package TelRan.QA.appManadger;

import TelRan.QA.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToTheGroupsPage() throws InterruptedException {
        click(By.linkText("group page"));
        Thread.sleep(2000);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupsForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void goToGroupsPage() {
        if (!isElementPresent(By.xpath("//h1[contains(text(),'Groups'])"))
                && !isElementPresent(By.name("new"))) {
            click(By.linkText("groups"));
        }

    }


    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void selectGroupByIndex(int ind) {
        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void groupDeletion() {
        click(By.name("delete"));
    }

    public void fillGroupModification(GroupData group) {
        type(By.name("group_name"), "testGroupName");
        type(By.name("group_header"), "testGroupHeader");
        type(By.name("group_footer"), "restGroupFooter");
    }

    public int getGroupsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void createGroup() throws InterruptedException {
        initGroupCreation();
        fillGroupsForm(
                new GroupData()
                        .setGroupFooter("GroupFooter")
                        .setGroupHeader("GroupHeader")
                        .setGroupName("GroupName"));
        submitGroupCreation();
        returnToTheGroupsPage();

    }

    public boolean isGroupPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String groupName = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData().setId(id).setGroupName(groupName);
            groups.add(group);

        }
        System.out.println(groups);
        return groups;
    }
}
