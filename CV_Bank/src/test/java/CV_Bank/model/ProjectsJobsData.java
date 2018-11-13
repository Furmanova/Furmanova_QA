package CV_Bank.model;

public class ProjectsJobsData {
    private String company;
    private String position;
    private int yearFrom;
    private int yearTill;
    private String projectDescription;

    public String getCompany() {
        return company;
    }

    public ProjectsJobsData setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public ProjectsJobsData setPosition(String position) {
        this.position = position;
        return this;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public ProjectsJobsData setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
        return this;
    }

    public int getYearTill() {
        return yearTill;
    }

    public ProjectsJobsData setYearTill(int yearTill) {
        this.yearTill = yearTill;
        return this;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public ProjectsJobsData setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }
}
