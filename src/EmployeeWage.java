public class EmployeeWage {

    public final String company;
    public final int empRatePerHr;
    public final int noOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    EmployeeWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        totalEmpWage = 0;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", noOfWorkingDays=" + noOfWorkingDays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
}
