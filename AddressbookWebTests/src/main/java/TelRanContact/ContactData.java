package TelRanContact;

public class ContactData {
    private String lastName;
    private String firstName;
    private String address;
    private String email;
    private String email12;
    private String mobile;


    public ContactData withLastName(String lastName) { //set
        this.lastName = lastName;
        return this;
    }

    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData withEmail12(String email12) {
        this.email12 = email12;
        return this;
    }

    public ContactData withMobile(String mobile) {
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
}
