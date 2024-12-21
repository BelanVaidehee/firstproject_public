public class MyException {

    public static void main(String[] args) {
        System.out.print("\nResult is: " + divideNumber(6, 0));
    }

    public static int divideNumber(int x, int y) {
        int result = 0;
        try {
            result = x / y;
        } catch (ArithmeticException ae) {
            System.out.print("Exception: " + ae);
//            System.out.print("You cannot divide a number with 0");
        }
        return result;
    }
}