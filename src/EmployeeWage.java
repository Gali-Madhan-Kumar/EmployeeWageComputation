public class EmployeeWage {

    private final double empIsPresent = Math.floor(Math.random() * 10) % 2;
    private final int wagePerHr = 20;
    private final int noOfHrsPerDay = 8;

    public double getEmpIsPresent() {
        return empIsPresent;
    }

    public int getWagePerHr() {
        return wagePerHr;
    }

    public int getNoOfHrsPerDay() {
        return noOfHrsPerDay;
    }

    public int getDailyWage() {
        return getWagePerHr() * getNoOfHrsPerDay();
    }
}
