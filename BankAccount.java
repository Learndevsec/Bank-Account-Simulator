// Encapsulation: Private balance, controlled access through methods
public class BankAccount {
    // Attributes
    private String accountHolderName;
    private long accountNumber;
    private double balance;
    
    // Constructor with initial balance
    public BankAccount(String accountHolderName, long accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Constructor without initial balance (defaults to 0)
    public BankAccount(String accountHolderName, long accountNumber) {
        this(accountHolderName, accountNumber, 0.0);
    }
    
    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("\n===== Account Information =====");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
        System.out.println("===============================\n");
    }
}