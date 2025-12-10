package com.example.bank.currencies.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="currency_courses")
public class CurrencyCourse {
    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    @JoinColumn(name="currency_id", referencedColumnName = "id")
    private Currency currency;
    @Column
    private double value;

    @Column
    private int quantity;

    @Column
    private Date createdAt;

    public int getId() {
        return id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
