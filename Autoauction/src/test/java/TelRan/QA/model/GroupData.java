package TelRan.QA.model;

import java.util.Objects;

public class GroupData {
    private int id;
    private String groupName;
    private String groupHeader;
    private String groupFooter;

    public GroupData setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupData setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
        return this;
    }

    public GroupData setGroupFooter(String groupFooter) {
        this.groupFooter = groupFooter;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }

    public int getId() {
        return id;
    }

    public GroupData setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName=" + groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id == groupData.id &&
                Objects.equals(groupName, groupData.groupName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, groupName);
    }
}
