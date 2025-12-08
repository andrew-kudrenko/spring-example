package com.example.bank.exchanges.services;

import com.example.bank.exchanges.models.ExchangeCourse;

public class ExchangeService {
    public double exchange(ExchangeCourse course, double quantity) {
        return quantity / course.getQuantityOfExchangeable() * course.getCourseOfExchangeable();
    }
}
