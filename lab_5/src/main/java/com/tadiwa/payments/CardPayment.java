package com.tadiwa.payments;

public class CardPayment extends Payment {
    public String cardNumber;

    public CardPayment(double amount, String merchant, String cardNumber) {
        super(amount, merchant);
        this.cardNumber = cardNumber;
    }
}
