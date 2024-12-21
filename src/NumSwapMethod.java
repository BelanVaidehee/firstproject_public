public class NumSwapMethod {

    public void SwapNumber(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;

        num1 = num1 - num2;

        System.out.println("After swap number 1 is: " + num1);
        System.out.println("After swap number 2 is: " + num2);
    }
}
