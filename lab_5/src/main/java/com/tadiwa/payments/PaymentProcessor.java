package com.tadiwa.payments;

public class PaymentProcessor {

    /** pay method using instanceof checks is going to be harder to test as it's a single
     * method handling multiple different types of payments so if a new payment method
     * like CashPayment was to be added then another if block would have to be used */
    public void pay(Payment p) {
        if (p instanceof MobileMoneyPayment mobilePayment) {
            System.out.println("Mobile Payment to " + mobilePayment.merchant + " from phone number " + mobilePayment.phoneNumber);
        }

        if (p instanceof CardPayment cardPayment) {
            System.out.println("Card Payment to " + cardPayment.merchant + " with card with number " + cardPayment.cardNumber);
        }

        System.out.println("Unkown payment");
    }

    /** Using compile time polymorphism is easier to test each function and adding a new payment is as
     * simple as just adding another process(CashPayment) method */
    public void process(CardPayment cardPayment) {
        System.out.println("Card Payment to " + cardPayment.merchant + " with card with number " + cardPayment.cardNumber);
    }

    public void process(MobileMoneyPayment mobilePayment) {
        System.out.println("Mobile Payment to " + mobilePayment.merchant + " from phone number " + mobilePayment.phoneNumber);
    }

    public static void main(String[] args) {
        MobileMoneyPayment mobilePayment = new MobileMoneyPayment(150, "Pick'N Pay", "0782925928");
        CardPayment cardPayment = new CardPayment(1_500, "Chicken Inn", "4478 9839 2453");

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.process(mobilePayment);
        paymentProcessor.process(cardPayment);
    }
}
