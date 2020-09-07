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
        if (empIsFullTimeOrPartTime == 1) {
            System.out.println("Employee is Full Time");
        } else {
            System.out.println("Employee is Part Time");
        }
    }
}
