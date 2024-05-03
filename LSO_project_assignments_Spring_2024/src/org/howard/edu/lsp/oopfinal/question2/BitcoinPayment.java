package org.howard.edu.lsp.oopfinal.question2;

public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paid %.1f using Bitcoin address %s%n", amount, bitcoinAddress);
    }
}