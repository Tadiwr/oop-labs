package com.tadiwa.account;

public class CurrentAccount extends Account {

    public CurrentAccount(double initialAmount) {
        this.balance = initialAmount;
        this.name = "Current Account";
    }

    @Override
    public void monthlyFee() {
        final double MONTHLY_CHARGE = 5.00;
        this.balance -= MONTHLY_CHARGE;
    }
}
