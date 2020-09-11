public class EmployeeWage {

    private final double empIsPresent = Math.floor(Math.random() * 10) % 3;
    private int wagePerHr;
    private int totalWorkingDaysPerMonth;
    private int noOfHrsPerDay;

    EmployeeWage() {

    }

    EmployeeWage(int wagePerHr, int totalWorkingDaysPerMonth) {
        this.wagePerHr = wagePerHr;
        this.totalWorkingDaysPerMonth = totalWorkingDaysPerMonth;
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
}
