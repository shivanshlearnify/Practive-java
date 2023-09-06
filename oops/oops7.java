package oops;
import java.util.*;

public class oops7 {
    static class Bank{
        String name;
        String accountNumber;
        double balance;

    public Bank(String name, String AccountNumber, double balance){
        this.name=name;
        this.accountNumber= accountNumber;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String AccountNumber){
        this.accountNumber=AccountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void deposit(double ammount){
        balance += ammount;
    }
    public void withdrawl(double ammount){
        balance -= ammount;
    }
    public String accountInfo(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
    }

    static class Account{
        
    }
}
