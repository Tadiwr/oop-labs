package com.tadiwa.payments;

public class MobileMoneyPayment extends Payment {
    public String phoneNumber;

    public MobileMoneyPayment(double amount, String merchant, String phoneNumber) {
        super(amount, merchant);
        this.phoneNumber = phoneNumber;
    }
}
