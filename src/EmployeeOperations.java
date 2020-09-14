import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmployeeOperations implements EmployeeDetails {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final LinkedList<EmployeeWage> companyEmpWageList;
    private final Map<String, EmployeeWage> companyWageMap;

    EmployeeOperations() {
        companyEmpWageList = new LinkedList<>();
        companyWageMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        EmployeeWage employeeWage = new EmployeeWage(company, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        companyEmpWageList.add(employeeWage);
        companyWageMap.put(company, employeeWage);
    }

    public void computeEmpWage() {
        for (EmployeeWage employeeWage : companyEmpWageList) {
            employeeWage.setTotalEmpWage(this.computeEmpWage(employeeWage));
        }
    }

    @Override
    public int getTotalWage(String company) {
        return companyWageMap.get(company).totalEmpWage;
    }

    public int computeEmpWage(EmployeeWage employeeWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= employeeWage.maxHoursPerMonth && totalWorkingDays < employeeWage.noOfWorkingDays) {
            totalWorkingDays++;
            int emp = (int) Math.floor(Math.random() * 10) % 3;
            empHrs = switch (emp) {
                case IS_PART_TIME -> 4;
                case IS_FULL_TIME -> 8;
                default -> 0;
            };
            totalEmpHrs += empHrs;
        }
        System.out.println("Days: " + totalWorkingDays + " Emp Hr: " +empHrs);
        return totalEmpHrs * employeeWage.empRatePerHr;
    }
}
