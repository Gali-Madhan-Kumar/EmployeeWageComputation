public class Main {
    public static void main(String[] args) {

        EmployeeWage employeeWageForCompanyOne = new EmployeeWage(20, 20);
        EmployeeWage employeeWageForCompanyTwo = new EmployeeWage(25, 22);
        EmployeeOperations employeeOperations = new EmployeeOperations();

        employeeOperations.empIsPresent(employeeWageForCompanyOne);
        employeeOperations.fullTimeOrPartTime((int)employeeWageForCompanyOne.getEmpIsPresent(), employeeWageForCompanyOne);
        employeeOperations.calculateWage(employeeWageForCompanyOne);
        System.out.println(" ");
        employeeOperations.empIsPresent(employeeWageForCompanyTwo);
        employeeOperations.fullTimeOrPartTime((int)employeeWageForCompanyTwo.getEmpIsPresent(), employeeWageForCompanyTwo);
        employeeOperations.calculateWage(employeeWageForCompanyTwo);

    }
}
