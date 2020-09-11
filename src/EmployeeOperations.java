public class EmployeeOperations implements EmployeeDetails {

    public void empIsPresent(EmployeeWage employeeWage) {
        int empIsPresent = (int) employeeWage.getEmpIsPresent();
        if (empIsPresent == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public void fullTimeOrPartTime(int fullTimeOrPartTime, EmployeeWage employeeWage) {

        int empWagePerDay = 0;
        int empWagePerMonth = 0;

        switch (fullTimeOrPartTime) {
            case 1 -> {
                employeeWage.setNoOfHrsPerDay(8);
                empWagePerDay = employeeWage.getDailyWage();
                empWagePerMonth = employeeWage.getTotalWorkingDaysPerMonth() * employeeWage.getDailyWage();
                System.out.println("Employee is Full Time and His Working hours Per Day is " + employeeWage.getNoOfHrsPerDay());
            }
            case 2 -> {
                employeeWage.setNoOfHrsPerDay(4);
                empWagePerDay = employeeWage.getDailyWage();
                empWagePerMonth = employeeWage.getTotalWorkingDaysPerMonth() * employeeWage.getDailyWage();
                System.out.println("Employee is Part Time and His Working hours Per Day is " + employeeWage.getNoOfHrsPerDay());
            }
            default -> employeeWage.setNoOfHrsPerDay(0);
        }
        System.out.println("Employee Wage Per Day is : " + empWagePerDay);
        System.out.println("Employee total wage per month = " + empWagePerMonth);
        int totalWage = calculateWage(employeeWage);
        System.out.println("Employee total wage for 20 days or for 100 hrs is = " + totalWage);
    }

    public int calculateWage(EmployeeWage employeeWage) {
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;
        while (totalHours < 100 && totalDays < 20) {
            totalWage +=  employeeWage.getWagePerHr();
            totalHours += 1;
            if (totalHours % 8 == 0) {
                totalDays += 1;
            }
        }
        return totalWage;
    }
}
