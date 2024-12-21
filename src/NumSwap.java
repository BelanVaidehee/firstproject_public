import java.util.Scanner;

import java.util.Scanner;

public class NumSwap {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        NumSwapMethod numSwapMethod = new NumSwapMethod();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        numSwapMethod.SwapNumber(num1, num2);


    }
}
