import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GrossSalaryMethod grossSalaryMethod = new GrossSalaryMethod();

        System.out.println("Enter Ramesh Salary");
        double BasicSalary = scanner.nextDouble();

        grossSalaryMethod.GrossSalaryCalculator(BasicSalary);
        scanner.close();
    }
}
