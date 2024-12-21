public class GrossSalaryMethod {
    void GrossSalaryCalculator(double BasicSalary) {


        double DearestAllowance = 0.40 * BasicSalary;
        double HouseRentAllowance = 0.20 * BasicSalary;

        double grossSalary = BasicSalary + DearestAllowance + HouseRentAllowance;

        System.out.println("Gross Salary is: " + grossSalary);
    }

}
