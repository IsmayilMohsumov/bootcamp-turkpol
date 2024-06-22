package turkpol.org.pl.bootcamp_turkpol.lesson8;

public class BankAccount {
    private double balance; // private field to store the account balance

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        functionality(amount);
    }

    private void functionality(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount to deposit.");
        }
    }
}
