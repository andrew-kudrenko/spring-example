package com.example.bank.wallets.models;

import com.example.bank.currencies.models.Currency;
import com.example.bank.users.models.User;

public class Wallet {
    private final User owner;
    private final Currency currency;

    private final int id;
    private double balance;

    public Wallet(int id, User owner, Currency currency) {
        this.id = id;
        this.owner = owner;
        this.currency = currency;
    }

    public boolean equals(Wallet wallet) {
        return wallet != null && wallet.getId() == this.getId();
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void updateBalance(double balance) {
        this.balance += balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getId() {
        return id;
    }
}
