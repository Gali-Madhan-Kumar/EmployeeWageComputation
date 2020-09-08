public class Main {
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        int empIsPresent = (int) employeeWage.getEmpIsPresent();
        int empIsFullTimeOrPartTime = (int) employeeWage.getEmpIsFullTimeOrPartTime();
        int empWagePerDay = employeeWage.getDailyWage();
        if (empIsPresent == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage Per Day is : " + empWagePerDay);
        switch (empIsFullTimeOrPartTime) {
            case 1:
                employeeWage.setNoOfHrsPerDay(10);
                System.out.println("Employee is Full Time and His Working hours Per Day is " +employeeWage.getNoOfHrsPerDay());
                break;
            case 2:
                employeeWage.setNoOfHrsPerDay(8);
                System.out.println("Employee is Part Time and His Working hours Per Day is " +employeeWage.getNoOfHrsPerDay());
                break;
            default:
                employeeWage.setNoOfHrsPerDay(0);
        }
    }
}
