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

    public String getCompany() {
        return company;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
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
