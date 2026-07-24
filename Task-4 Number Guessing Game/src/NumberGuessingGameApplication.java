import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameApplication {
    public static void main(String[] args) {
        int target = new Random().nextInt(100) + 1, attempts = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Guess a number from 1 to 100.");
            while (true) {
                try {
                    System.out.print("Your guess: "); int guess = Integer.parseInt(scanner.nextLine()); attempts++;
                    if (guess < target) System.out.println("Too low.");
                    else if (guess > target) System.out.println("Too high.");
                    else { System.out.println("Correct! Attempts: " + attempts); return; }
                } catch (NumberFormatException exception) { System.out.println("Enter a whole number."); }
            }
        }
    }
}
