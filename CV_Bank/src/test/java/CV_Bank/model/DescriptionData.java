package CV_Bank.model;

public class DescriptionData {
    private String choosePreferable;
    private String choosePreferables;
    private int salaryFrom;
    private int salaryTill;

    public String getChoosePreferable() {
        return choosePreferable;
    }

    public DescriptionData setChoosePreferable(String choosePreferable) {
        this.choosePreferable = choosePreferable;
        return this;
    }

    public String getChoosePreferables() {
        return choosePreferables;
    }

    public DescriptionData setChoosePreferables(String choosePreferables) {
        this.choosePreferables = choosePreferables;
        return this;
    }

    public int getSalaryFrom() {
        return salaryFrom;
    }

    public DescriptionData setSalaryFrom(int salaryFrom) {
        this.salaryFrom = salaryFrom;
        return this;
    }

    public int getSalaryTill() {
        return salaryTill;
    }

    public DescriptionData setSalaryTill(int salaryTill) {
        this.salaryTill = salaryTill;
        return this;
    }
}
