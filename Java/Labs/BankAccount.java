// Main class having main method
class BankAccount implements Account{
    String accountHolderName;
    String  bankName;
    double accountBalance;

    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    public double getBalance() {
        return accountBalance;
    }
    public void deposit(double amount) {
        if(amount>0){
        accountBalance += amount;
        System.out.println("Deposited $"+amount+" in your account successfully");
        }
    }
    private static void displayAccountBalance(BankAccount account) {
            System.out.println("\nAccount Holder: " + account.accountHolderName);
            System.out.println("Bank Name: " + account.bankName);
            System.out.println("Account Balance: $" + account.getBalance());
        }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        // Create three bank accounts
        BankAccount acc1 = new BankAccount("Darshan S", "Union Bank", 500);
        BankAccount acc2 = new BankAccount("Aadesh S", "Bank of Baroda", 1000);
        BankAccount acc3 = new BankAccount("Amol S", "SBI", 1500);

        // Deposit and withdraw money for each account
        acc1.deposit(500.0);
        acc1.withdraw(200.0);

        acc2.deposit(1000.0);
        acc2.withdraw(500.0);

        acc3.deposit(1500.0);
        acc3.withdraw(1000.0);

        // Display balances
        displayAccountBalance(acc1);
        displayAccountBalance(acc2);
        displayAccountBalance(acc3);

      

    } 
}
interface Account {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
}