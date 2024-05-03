package org.howard.edu.lsp.oopfinal.question2;

public class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.1f using PayPal account %s%n", amount, emailAddress);
    }
}