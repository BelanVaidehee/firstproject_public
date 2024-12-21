public class TableMethod {
    public void printTableMethod(int number) {
        System.out.println("Table for Number: " + number);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

