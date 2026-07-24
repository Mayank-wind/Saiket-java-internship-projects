# Temperature Converter

A command-line temperature conversion utility that converts values between Celsius and Fahrenheit.

## Features

- Converts Celsius to Fahrenheit.
- Converts Fahrenheit to Celsius.
- Uses separate reusable methods for both formulas.
- Accepts uppercase or lowercase scale selection.
- Validates the entered temperature.

## Conversion Formulas

```text
Fahrenheit = Celsius × 9/5 + 32
Celsius = (Fahrenheit - 32) × 5/9
```

## Concepts Demonstrated

- Java methods
- Mathematical expressions
- `Scanner` input handling
- String normalization with `trim` and `toUpperCase`
- Numeric exception handling

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder in IntelliJ IDEA.
2. Open `src/TemperatureConverterApplication.java`.
3. Run the `main` method.
4. Select `C` or `F`, then enter a temperature.

## Run from the Terminal

```bash
javac -d out src/TemperatureConverterApplication.java
java -cp out TemperatureConverterApplication
```

## Example

```text
Enter C for Celsius to Fahrenheit or F for Fahrenheit to Celsius: C
Temperature: 25
Result: 77.00 F
```

## Possible Enhancements

- Add Kelvin conversion.
- Support repeated conversions in one session.
- Add rounding configuration.
- Add unit tests for freezing and boiling point conversions.
