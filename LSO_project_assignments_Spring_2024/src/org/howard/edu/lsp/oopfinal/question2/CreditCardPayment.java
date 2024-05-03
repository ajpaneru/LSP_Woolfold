package org.howard.edu.lsp.oopfinal.question2;

public class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.1f using credit card %s%n", amount, creditCardNumber);
    }
}
