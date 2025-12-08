package com.example.bank.exchanges.models;

import com.example.bank.currencies.models.Currency;

public class ExchangeCourse {
    private final Currency baseCurrency;
    private final Currency exchangeableCurrency;

    private int quantityOfExchangeable = 1;
    private double courseOfExchangeable;

    public ExchangeCourse(Currency baseCurrency, Currency exchangableCurrency) {
        this.baseCurrency = baseCurrency;
        this.exchangeableCurrency = exchangableCurrency;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public Currency getExchangeableCurrency() {
        return exchangeableCurrency;
    }

    public int getQuantityOfExchangeable() {
        return quantityOfExchangeable;
    }

    public void setQuantityOfExchangeable(int quantityOfExchangeable) {
        if (quantityOfExchangeable > 0) {
            this.quantityOfExchangeable = quantityOfExchangeable;
        }
    }

    public double getCourseOfExchangeable() {
        return courseOfExchangeable;
    }

    public void setCourseOfExchangeable(double courseOfExchangeable) {
        this.courseOfExchangeable = courseOfExchangeable;
    }
}
