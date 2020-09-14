public interface EmployeeDetails {

    public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);
}
