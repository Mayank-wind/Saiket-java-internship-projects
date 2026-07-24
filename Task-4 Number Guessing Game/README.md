# Number Guessing Game

A console game in which the player guesses a randomly generated number between 1 and 100. The application provides directional feedback and tracks the number of attempts.

## Features

- Generates a random target number from 1 to 100.
- Accepts repeated guesses until the answer is found.
- Reports whether a guess is too high or too low.
- Counts and displays the total number of attempts.
- Handles non-numeric input with a user-friendly message.

## Concepts Demonstrated

- Random number generation
- `while` loops
- Conditional statements
- User input with `Scanner`
- Exception handling

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder in IntelliJ IDEA.
2. Open `src/NumberGuessingGameApplication.java`.
3. Run the `main` method.
4. Enter guesses until the target number is found.

## Run from the Terminal

```bash
javac -d out src/NumberGuessingGameApplication.java
java -cp out NumberGuessingGameApplication
```

## Example

```text
Guess a number from 1 to 100.
Your guess: 40
Too high.
Your guess: 22
Correct! Attempts: 2
```

## Possible Enhancements

- Add difficulty levels with different ranges.
- Add a maximum number of attempts.
- Add a replay option and a high-score table.
- Add input validation for guesses outside the allowed range.
