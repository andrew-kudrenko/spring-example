package com.example.bank.wallets.models;

public class WalletTransfer {
    private final Wallet sender;
    private final Wallet consumer;
    private final double quantity;

    public WalletTransfer(Wallet sender, Wallet consumer, double quantity) throws Exception {
        this.sender = sender;
        this.consumer = consumer;

        if (quantity <= 0) {
            throw new Exception("[Wallet Transfer] quantity cannot be lower than zero");
        }

        this.quantity = quantity;
    }

    public Wallet getConsumer() {
        return consumer;
    }

    public Wallet getSender() {
        return sender;
    }

    public double getQuantity() {
        return quantity;
    }
}
