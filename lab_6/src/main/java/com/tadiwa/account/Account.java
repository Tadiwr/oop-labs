package com.tadiwa.account;

public abstract class Account {

    public String name;
    public double balance;

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount can't be negative");
        }

        this.balance = amount;
    }

    public abstract void monthlyFee();

}
