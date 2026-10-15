package com.tadiwa;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    // EXPLAIN: private -> no code outside this class can touch these directly
    private final String accountNumber;
    private String ownerName;
    private double balance;

    private List<String> transactionHistory = new ArrayList<>();

    public BankAccount(String accountNumber, String ownerName, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        setOwnerName(ownerName);          // reuse validation in the setter
        this.balance = openingBalance;
    }

    // Getters: read-only access
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName()     { return ownerName; }
    public double getBalance()       { return balance; }

    // Setter with validation
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name required");
        }
        this.ownerName = ownerName.trim();
    }

    // EXPLAIN: no setBalance() on purpose -> balance changes only via deposit/withdraw
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }

        balance += amount;
        this.transactionHistory.add("Deposited " + amount + ", Balance After: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            return false;                  // insufficient funds, state unchanged
        }
        balance -= amount;

        this.transactionHistory.add("Withdrew " + amount + ", Balance After: " + balance);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s [%s] balance: %.2f", accountNumber, ownerName, balance);
    }

    public List<String> getTransactionHistory() {return this.transactionHistory;}

    public static void main(String[] args) {
        BankAccount tadiwaAccount = new BankAccount("4532453", "Tadiwanashe Shangwa", 100.0);

        tadiwaAccount.deposit(34);
        tadiwaAccount.deposit(13);

        tadiwaAccount.withdraw(15);
        tadiwaAccount.withdraw(67);

        tadiwaAccount.deposit(16);

        System.out.println("------------------- Tadiwa Transaction History -------------------");
        tadiwaAccount.getTransactionHistory()
                .forEach(System.out::println);
    }
}