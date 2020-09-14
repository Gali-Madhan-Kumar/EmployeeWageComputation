public class EmployeeWage {

    private final double empIsPresent = Math.floor(Math.random() * 10) % 3;
    private int wagePerHr;
    private int totalWorkingDaysPerMonth;
    private int noOfHrsPerDay;
    private String company;
    private int totalWage;

    EmployeeWage() {

    }

    EmployeeWage(int wagePerHr, int totalWorkingDaysPerMonth, String company) {
        this.wagePerHr = wagePerHr;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
        this.company = company;
    }

    public double getEmpIsPresent() {
        return empIsPresent;
    }

    public int getWagePerHr() {
        return wagePerHr;
    }

    public int getNoOfHrsPerDay() {
        return noOfHrsPerDay;
    }

    public int getTotalWorkingDaysPerMonth() {
        return totalWorkingDaysPerMonth;
    }

    public void setNoOfHrsPerDay(int noOfHours) {
        this.noOfHrsPerDay = noOfHours;
    }

    public int getDailyWage() {
        return this.getWagePerHr() * this.getNoOfHrsPerDay();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
