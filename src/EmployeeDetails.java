public interface EmployeeDetails {

    void empIsPresent(EmployeeWage employeeWage);

    void fullTimeOrPartTime(int fullTimeOrPartTime, EmployeeWage employeeWage);

    int calculateWage(EmployeeWage employeeWage);
}
