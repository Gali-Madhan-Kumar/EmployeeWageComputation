import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeOperations implements EmployeeDetails {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int noOfCompanies = 0;
    private LinkedList<EmployeeWage> companyEmpWageList;
    private Map<String, EmployeeWage> companyWageMap;

    EmployeeOperations() {
        companyEmpWageList = new LinkedList<>();
        companyWageMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {

    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            EmployeeWage employeeWage = companyEmpWageList.get(i);
            employeeWage.setTotalEmpWage(this.computeEmpWage(employeeWage));
            System.out.println(employeeWage);
        }
    }

    @Override
    public int getTotalWage(String company) {
        return companyWageMap.get(company).totalEmpWage;
    }

    public int computeEmpWage(EmployeeWage employeeWage) {

    }
}
