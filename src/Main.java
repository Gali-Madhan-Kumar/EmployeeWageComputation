public class Main {
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        int empIsPresent = (int) employeeWage.getEmpIsPresent();
        if (empIsPresent == 0) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}