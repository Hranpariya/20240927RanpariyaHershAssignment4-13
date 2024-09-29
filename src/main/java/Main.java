import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine().trim();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println(input + " is an invalid input");
        } else {
            char letter = Character.toLowerCase(input.charAt(0));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is a consonant");
            }
        }

        scanner.close();
    }
}