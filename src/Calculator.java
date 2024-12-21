import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CalculatorMethod calculatorMethod = new CalculatorMethod();

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Entered 1st no is: " + num1);
        System.out.println("Entered 2nd no is: " + num2);

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = calculatorMethod.add(num1, num2);
                break;
            case '-':
                result = calculatorMethod.subtract(num1, num2);
                break;
            case '*':
                result = calculatorMethod.multiply(num1, num2);
                break;
            case '/':
                result = calculatorMethod.divide(num1, num2);
//                else {
//                    System.out.println("Error: Division by zero.");
//                    validOperation = false;
//                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}


