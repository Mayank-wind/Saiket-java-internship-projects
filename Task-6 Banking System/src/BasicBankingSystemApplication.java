import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicBankingSystemApplication {
    static class Account {
        private BigDecimal balance = BigDecimal.ZERO;
        private final List<String> history = new ArrayList<>();
        void deposit(BigDecimal amount) { validate(amount); balance = balance.add(amount); history.add("Deposit +" + amount); }
        void withdraw(BigDecimal amount) { validate(amount); if (amount.compareTo(balance) > 0) throw new IllegalArgumentException("Insufficient balance."); balance = balance.subtract(amount); history.add("Withdrawal -" + amount); }
        void show() { System.out.println("Balance: " + balance); history.forEach(System.out::println); }
        private void validate(BigDecimal amount) { if (amount == null || amount.signum() <= 0) throw new IllegalArgumentException("Amount must be positive."); }
    }
    static class SavingsAccount extends Account { private final BigDecimal minimumBalance = new BigDecimal("100"); }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1 Deposit  2 Withdraw  3 Balance/History  0 Exit"); String choice = scanner.nextLine();
                try {
                    if (choice.equals("0")) return;
                    if (choice.equals("1")) { System.out.print("Amount: "); account.deposit(new BigDecimal(scanner.nextLine())); }
                    else if (choice.equals("2")) { System.out.print("Amount: "); account.withdraw(new BigDecimal(scanner.nextLine())); }
                    else if (choice.equals("3")) account.show();
                    else System.out.println("Choose 0, 1, 2, or 3.");
                } catch (IllegalArgumentException exception) { System.out.println("Error: " + exception.getMessage()); }
            }
        }
    }
}
