import java.util.Scanner;

public class CalculatorApplication {
    public static double calculate(char operation, double first, double second) {
        return switch (operation) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> {
                if (second == 0) throw new ArithmeticException("Cannot divide by zero.");
                yield first / second;
            }
            default -> throw new IllegalArgumentException("Choose +, -, *, or /.");
        };
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Self made Calculator ");
            System.out.print("First number: "); double first = Double.parseDouble(scanner.nextLine());
            System.out.print("Operation (+ - * /): "); char operation = scanner.nextLine().charAt(0);
            System.out.print("Second number: "); double second = Double.parseDouble(scanner.nextLine());
            try { System.out.println("Result: " + calculate(operation, first, second)); }
            catch (IllegalArgumentException | ArithmeticException exception) { System.out.println("Error: " + exception.getMessage()); }
        } catch (NumberFormatException exception) { System.out.println("Please enter valid numbers."); }
    }
}
