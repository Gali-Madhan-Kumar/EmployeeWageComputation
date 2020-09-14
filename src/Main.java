public class Main {
    public static void main(String[] args) {

        EmployeeOperations employeeOperations = new EmployeeOperations();
        employeeOperations.addCompanyEmpWage(20, 20, "Reliance");
        employeeOperations.addCompanyEmpWage(25, 22, "DMart");
        employeeOperations.computeWage();

    }
}
