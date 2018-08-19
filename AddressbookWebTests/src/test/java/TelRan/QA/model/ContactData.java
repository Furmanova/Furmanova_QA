package TelRan.QA.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String email12;
    private String mobile;

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public ContactData setLastName(String lastName) { //set
        this.lastName = lastName;
        return this;
    }

    public ContactData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData setAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData setEmail12(String email12) {
        this.email12 = email12;
        return this;
    }

    public ContactData setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail12() {
        return email12;
    }

    public String getMobile() {
        return mobile;
    }

    public int getId() {
        return id;
    }

    public ContactData setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName);
    }

}
