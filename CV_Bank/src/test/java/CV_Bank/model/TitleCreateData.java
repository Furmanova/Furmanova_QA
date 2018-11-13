package CV_Bank.model;

import java.util.Objects;

public class TitleCreateData {
    private String cvTitle;
    private String firstName;
    private String lastName;
    private int year;
    private String summary;
    private String about;

    public String getCvTitle() {
        return cvTitle;
    }

    public TitleCreateData setCvTitle(String cvTitle) {
        this.cvTitle = cvTitle;
        return this;

    }

    public String getFirstName() {
        return firstName;
    }

    public TitleCreateData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public TitleCreateData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getYear() {
        return year;
    }

    public TitleCreateData setYear(int year) {
        this.year = year;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public TitleCreateData setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public TitleCreateData setAbout(String about) {
        this.about = about;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TitleCreateData)) return false;
        TitleCreateData that = (TitleCreateData) o;
        return year == that.year &&
                Objects.equals(cvTitle, that.cvTitle) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(summary, that.summary) &&
                Objects.equals(about, that.about);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cvTitle, firstName, lastName, year, summary, about);
    }
}