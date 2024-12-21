
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner scanner = new Scanner(System.in);

        TableMethod tableMethod = new TableMethod();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        tableMethod.printTableMethod(number);

        scanner.close();
    }

}
