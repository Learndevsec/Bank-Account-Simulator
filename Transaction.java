// Helper class to record transaction details
public class Transaction {
    // Attributes
    private String type; // "Deposit" or "Withdraw"
    private double amount;
    private double balanceAfter;
    
    // Constructor
    public Transaction(String type, double amount, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }
    
    // Method to display transaction
    public void displayTransaction() {
        System.out.println(type + ": $" + amount + " | Balance: $" + balanceAfter);
    }
}