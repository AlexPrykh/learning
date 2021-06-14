package exercise.account;

public class Account {
    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transferToAccount(Account name, double amount) {
        if (this.balance >= amount) {
            name.balance += amount;
            this.balance -= amount;
            System.out.println("Transaction successful!");
        } else {
            System.err.println("Insufficient funds!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.name + "\nBalance: " + this.balance;
    }
}
