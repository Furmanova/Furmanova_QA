package CV_Bank.model;

import java.util.Objects;

public class ContactInfoData {
    int phone;
    String email;
    String residence;

    public int getPhone() {
        return phone;
    }

    public ContactInfoData setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContactInfoData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getResidence() {
        return residence;
    }

    public ContactInfoData setResidence(String residence) {
        this.residence = residence;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactInfoData)) return false;
        ContactInfoData that = (ContactInfoData) o;
        return phone == that.phone &&
                Objects.equals(email, that.email) &&
                Objects.equals(residence, that.residence);
    }

    @Override
    public int hashCode() {

        return Objects.hash(phone, email, residence);
    }
}
