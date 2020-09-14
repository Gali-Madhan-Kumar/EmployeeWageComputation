public class Main {
    public static void main(String[] args) {

        EmployeeOperations employeeOperations = new EmployeeOperations();
        employeeOperations.addCompanyEmpWage("Reliance", 20, 20,100);
        employeeOperations.addCompanyEmpWage("DMart", 25, 22, 80);
        employeeOperations.computeEmpWage();
        System.out.println("Total Wage for Reliance Company is: " + employeeOperations.getTotalWage("Reliance"));
        System.out.println("Total Wage for DMart Company is: " + employeeOperations.getTotalWage("DMart"));

    }
}
