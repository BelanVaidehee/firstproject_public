import java.util.Scanner;

public class CharVowel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        CharVowelMethod charVowelMethod = new CharVowelMethod();

        System.out.print("Enter character: ");
        char letter = scanner.next().charAt(0);

        charVowelMethod.charCheckMethod(letter);
    }
}
