package homework_19.task_3;

public class TaxAccounting extends Accounting{

    private int countOfEmployers;
    private String departmentName;

    public TaxAccounting() {
    }

    public TaxAccounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account() {
        System.out.println("TaxAccounting");
    }
}
