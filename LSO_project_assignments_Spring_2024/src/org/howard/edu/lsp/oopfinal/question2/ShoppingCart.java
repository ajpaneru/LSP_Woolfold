package org.howard.edu.lsp.oopfinal.question2;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Setter to change the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to process payment
    public void checkout(double amount) {
        // Ensure a payment strategy is set before proceeding
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("Payment strategy has not been set.");
        }
    }
}