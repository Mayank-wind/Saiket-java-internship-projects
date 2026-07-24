# Calculator Application

A console-based calculator built with core Java. The application accepts two numbers and performs addition, subtraction, multiplication, or division through a simple interactive flow.

## Features

- Supports `+`, `-`, `*`, and `/` operations.
- Uses a reusable `calculate` method for the arithmetic logic.
- Validates unsupported operators.
- Handles division by zero with a clear error message.
- Handles invalid numeric input without exposing a stack trace to the user.

## Concepts Demonstrated

- Java methods and return values
- `switch` expressions
- User input with `Scanner`
- Exception handling
- Conditional validation

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder as a project.
2. Open `src/CalculatorApplication.java`.
3. Run `CalculatorApplication.main()`.
4. Enter the first number, operator, and second number.

## Run from the Terminal

```bash
javac -d out src/CalculatorApplication.java
java -cp out CalculatorApplication
```

## Example

```text
First number: 20
Operation (+ - * /): /
Second number: 4
Result: 5.0
```

## Edge Cases Handled

- Division by zero
- Invalid numbers such as `abc`
- Unsupported operators

## Possible Enhancements

- Add a loop for multiple calculations.
- Add modulus and exponent operations.
- Add formatted decimal output.
- Add automated unit tests for every operation.
