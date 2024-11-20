import java.util.Scanner;

class Account {
    protected String customerName;
    protected String accountNumber;
    protected double balance;

    public Account(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest(int years) {
        double interest = balance * Math.pow((1 + interestRate / 100), years) - balance;
        balance += interest;
        System.out.println("Interest added: " + interest);
        System.out.println("Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

class CurAcct extends Account {
    private double minimumBalance;
    private double penalty;

    public CurAcct(String customerName, String accountNumber, double initialBalance, double minimumBalance, double penalty) {
        super(customerName, accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
        this.penalty = penalty;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            if (balance < minimumBalance) {
                balance -= penalty;
                System.out.println("Penalty imposed: " + penalty);
            }
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavAcct savingsAccount = new SavAcct("Alice", "S123", 1000.0, 5.0);
        CurAcct currentAccount = new CurAcct("Bob", "C123", 2000.0, 500.0, 50.0);

        System.out.println("1. Savings Account\n2. Current Account");
        System.out.print("Select account type: ");
        int accountType = scanner.nextInt();

        if (accountType == 1) {
            System.out.println("Savings Account Selected.");
            savingsAccount.displayBalance();
            savingsAccount.deposit(500);
            savingsAccount.computeAndDepositInterest(2);
            savingsAccount.withdraw(300);
        } else if (accountType == 2) {
            System.out.println("Current Account Selected.");
            currentAccount.displayBalance();
            currentAccount.deposit(1000);
            currentAccount.withdraw(1800);
        } else {
            System.out.println("Invalid account type.");
        }

        scanner.close();
    }
}
