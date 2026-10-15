package com.tadiwa.account;

public class SavingsAccount extends Account {

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
        this.name = "Savings Account";
    }

    @Override
    public void monthlyFee() {
        double interest = 0.2;
        double interestEarned = this.balance * interest;

        this.balance += interestEarned;
    }
}
