package com.example.bank.wallets.models;

import com.example.bank.currencies.models.Currency;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="wallet_transfers")
public class WalletTransfer {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private double quantity;

    @Column
    private int status;

    @Column
    private Date createdAt;

    @Column
    private String comment;

    @Column
    private String errorMessage;

    @ManyToOne
    @JoinColumn(name="sender_uuid", referencedColumnName = "uuid")
    private Wallet sender;

    @ManyToOne
    @JoinColumn(name="consumer_uuid", referencedColumnName = "uuid")
    private Wallet consumer;

    @ManyToOne
    @JoinColumn(name="currency_id", referencedColumnName = "id")
    private Currency currency;

    public Wallet getConsumer() {
        return consumer;
    }

    public Wallet getSender() {
        return sender;
    }

    public double getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getComment() {
        return comment;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setSender(Wallet sender) {
        this.sender = sender;
    }

    public void setConsumer(Wallet consumer) {
        this.consumer = consumer;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
