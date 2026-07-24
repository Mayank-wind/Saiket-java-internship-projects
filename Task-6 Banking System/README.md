# Basic Banking System

A console-based banking demonstration that models account operations such as deposits, withdrawals, balance viewing, and transaction history.

## Features

- Creates a savings account using object-oriented classes.
- Deposits money into an account.
- Withdraws money when sufficient funds are available.
- Prevents zero and negative transaction amounts.
- Displays the current balance and transaction history.
- Uses `BigDecimal` for monetary values.

## Concepts Demonstrated

- Classes and objects
- Inheritance with `SavingsAccount`
- Encapsulation through private state
- Lists for transaction history
- `BigDecimal` monetary calculations
- Input validation and exception handling

## Requirements

- Java 17 or later
- IntelliJ IDEA, or a terminal with `javac` and `java`

## Run from IntelliJ IDEA

1. Open this folder in IntelliJ IDEA.
2. Open `src/BasicBankingSystemApplication.java`.
3. Run the `main` method.
4. Use the menu to perform transactions.

## Run from the Terminal

```bash
javac -d out src/BasicBankingSystemApplication.java
java -cp out BasicBankingSystemApplication
```

## Menu

| Option | Action |
| --- | --- |
| `1` | Deposit money |
| `2` | Withdraw money |
| `3` | View balance and history |
| `0` | Exit |

## Example

```text
1 Deposit  2 Withdraw  3 Balance/History  0 Exit
1
Amount: 500
3
Balance: 500
Deposit +500
```

## Current Limitations

- Account data is stored only in memory.
- The minimum-balance field is declared but not yet enforced.
- Only one account is created per program run.

## Possible Enhancements

- Enforce the savings account minimum-balance rule.
- Add multiple accounts and account numbers.
- Add transfers between accounts.
- Persist account data in a database or file.
- Add transaction timestamps and automated tests.
