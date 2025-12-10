package com.example.bank.currencies.services;

import com.example.bank.currencies.models.Currency;
import com.example.bank.currencies.models.CurrencyCourse;
import com.example.bank.currencies.repositories.CurrencyCourseRepository;
import com.example.bank.currencies.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyRepository currencyRepository;

    @Autowired
    private CurrencyCourseRepository currencyCourseRepository;

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public List<CurrencyCourse> getCurrencyCourses(int currencyId) {
        return currencyCourseRepository.findByCurrencyId(currencyId);
    }
}
