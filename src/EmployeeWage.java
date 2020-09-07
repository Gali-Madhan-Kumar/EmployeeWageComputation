public class EmployeeWage {

    private final double empIsPresent = Math.floor(Math.random() * 10) % 2;
    private final double empIsFullTimeOrPartTime = Math.floor(Math.random() * 10 + 1) % 3;
    private final int wagePerHr = 20;
    private final int noOfHrsPerDay = 8;
    private final int empIsFullTime = 1;
    private final int empIsPartTime = 2;
    private final int empPartTimeHrs = 8;

    public double getEmpIsPresent() {
        return empIsPresent;
    }

    public int getWagePerHr() {
        return wagePerHr;
    }

    public int getNoOfHrsPerDay() {
        return noOfHrsPerDay;
    }

    public int getEmpIsFullTime() {
        return empIsFullTime;
    }

    public int getEmpIsPartTime() {
        return empIsPartTime;
    }

    public int getEmpPartTimeHrs() {
        return empPartTimeHrs;
    }

    public double getEmpIsFullTimeOrPartTime() {
        return empIsFullTimeOrPartTime;
    }

    public int getDailyWage() {
        return getWagePerHr() * getNoOfHrsPerDay();
    }
}
