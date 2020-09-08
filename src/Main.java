public class Main {

    private static final EmployeeWage employeeWage = new EmployeeWage();

    public static void main(String[] args) {
        int empIsPresent = (int) employeeWage.getEmpIsPresent();
        int empIsFullTimeOrPartTime = (int) employeeWage.getEmpIsFullTimeOrPartTime();
        int empWagePerDay = employeeWage.getDailyWage();
        int empWagePerMonth = 0;
        if (empIsPresent == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage Per Day is : " + empWagePerDay);
        switch (empIsFullTimeOrPartTime) {
            case 1:
                employeeWage.setNoOfHrsPerDay(10);
                empWagePerMonth = employeeWage.getTotalWorkingDaysPerMonth() * employeeWage.getDailyWage();
                System.out.println("Employee is Full Time and His Working hours Per Day is " +employeeWage.getNoOfHrsPerDay());
                break;
            case 2:
                employeeWage.setNoOfHrsPerDay(8);
                empWagePerMonth = employeeWage.getTotalWorkingDaysPerMonth() * employeeWage.getDailyWage();
                System.out.println("Employee is Part Time and His Working hours Per Day is " +employeeWage.getNoOfHrsPerDay());
                break;
            default:
                employeeWage.setNoOfHrsPerDay(0);
        }
        System.out.println("Employee total wage per month = " + empWagePerMonth);
        int totalWage = calculateWages();
        System.out.println("Employee total wage for 20 days or for 100 hrs is = " +totalWage);
    }

    private static int calculateWages() {
        int totalHours = 1;
        int totalDays = 1;
        int totalWage = 0;
        while (totalHours <= 100 && totalDays <= 20) {
            totalWage = totalHours * employeeWage.getWagePerHr();
            totalHours += 1;
            if (totalHours == 24) {
                totalDays += 1;
            }
        }
        return totalWage;
    }
}
