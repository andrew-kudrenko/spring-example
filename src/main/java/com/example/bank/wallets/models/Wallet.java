package com.example.bank.wallets.models;

import com.example.bank.currencies.models.Currency;
import com.example.bank.users.models.User;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="wallets")
public class Wallet {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    @JoinColumn(name="owner_id", referencedColumnName = "id")
    private User owner;

    @OneToOne
    @JoinColumn(name="currency_id", referencedColumnName = "id")
    private Currency currency;

    @Column
    private String title;

    @Column
    private double balance;

    @Column
    private String uuid;

    @Column
    private Date createdAt;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void updateBalance(double balance) {
        this.balance += balance;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBalance() {
        return balance;
    }

    public String getUuid() {
        return uuid;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Currency getCurrency() {
        return currency;
    }

    public User getOwner() {
        return owner;
    }
}
