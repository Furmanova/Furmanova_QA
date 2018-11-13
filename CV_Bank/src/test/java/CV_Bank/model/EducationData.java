package CV_Bank.model;

import java.util.Objects;

public class EducationData {
    private String schoolInstitution;
    private String degree;
    private int graduationYear;
    private String description;

    public String getSchoolInstitution() {
        return schoolInstitution;
    }

    public EducationData setSchoolInstitution(String schoolInstitution) {
        this.schoolInstitution = schoolInstitution;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public EducationData setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public EducationData setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EducationData setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EducationData)) return false;
        EducationData that = (EducationData) o;
        return graduationYear == that.graduationYear &&
                Objects.equals(schoolInstitution, that.schoolInstitution) &&
                Objects.equals(degree, that.degree) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(schoolInstitution, degree, graduationYear, description);
    }
}
