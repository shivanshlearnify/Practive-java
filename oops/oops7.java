package oops;

import java.util.*;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public string getaccountHolderName() {
        return accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double ammount) {
        if (ammount > 0) {
            balance += ammount;
            System.out.println("Deposited " + ammount + " int the account");
        } else {
            System.out.println("Invalid deposit ammount");
        }
    }

    public void withdraw(double ammount) {
        if (ammount > 0 && balance >= ammount) {
            balance -= ammount;
            System.out.println("withdrwal " + ammount + " from Account");
        } else if (ammount <= 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    @Override
    public String toString() {
        return "Account #" + accountNumber + " - Holder: " + accountHolderName + " - Balance: $" + balance;
    }

}

class Bank {
    private List<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account #" + account.getAccountNumber() + " added to the bank.");

    }

    public void removeAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                System.out.println("Account #" + accountNumber + " removed from the bank.");
                return;
            }
        }
        System.out.println("Account #" + accountNumber + " not found.");

    }

    public void displayAllAccounts() {
        System.out.println("Accounts in the bank:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

public class oops7 {
    public static void main(String args[]) {
        Bank bank = new Bank();

        Account account1 = new Account(101, "John Doe", 1000.0);
        Account account2 = new Account(102, "Jane Smith", 1500.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAllAccounts();

        account1.deposit(500.0);
        account2.withdraw(200.0);

        bank.displayAllAccounts();

        bank.removeAccount(102);

        bank.displayAllAccounts();

    }
}
