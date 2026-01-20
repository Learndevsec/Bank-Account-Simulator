import java.util.Scanner;

public class BankSimulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Bank Account Simulator =====\n");
        
        // Create account
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        
        BankAccount account = new BankAccount(name, accountNumber, initialDeposit);
        account.displayAccountInfo();
        
        // Menu-driven system
        boolean running = true;
        while (running) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Simulator!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        
        scanner.close();
    }
}