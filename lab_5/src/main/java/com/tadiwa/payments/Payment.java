package com.tadiwa.payments;

public class Payment {
    public double amount;
    public String merchant;

    public Payment(double amount, String merchant) {
        this.amount = amount;
        this.merchant = merchant;
    }
}
