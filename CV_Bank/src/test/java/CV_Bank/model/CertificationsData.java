package CV_Bank.model;

public class CertificationsData {
    private String description;
    private int graduationYear;

    public String getDescription() {
        return description;
    }

    public CertificationsData setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public CertificationsData setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }
}
