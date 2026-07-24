import java.util.Scanner;

public class TemperatureConverterApplication {
    public static double celsiusToFahrenheit(double celsius) { return celsius * 9 / 5 + 32; }
    public static double fahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5 / 9; }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Temperature Converter ");
            System.out.print("Enter C for Celsius to Fahrenheit or F for Fahrenheit to Celsius: ");
            String scale = scanner.nextLine().trim().toUpperCase();
            System.out.print("Temperature: "); double value = Double.parseDouble(scanner.nextLine());
            if (scale.equals("C")) System.out.printf("Result: %.2f F%n", celsiusToFahrenheit(value));
            else if (scale.equals("F")) System.out.printf("Result: %.2f C%n", fahrenheitToCelsius(value));
            else System.out.println("Please choose C or F.");
        } catch (NumberFormatException exception) { System.out.println("Please enter a valid temperature."); }
    }
}
