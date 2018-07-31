package TelRan.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToTheGroupsPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupsForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
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

    public void fillGroupModification() {
        type(By.name("group_name"), "testGroupName");
        type(By.name("group_header"), "testGroupHeader");
        type(By.name("group_footer"), "restGroupFooter");
    }

    public int getGroupsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void createGroup() {
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
}
