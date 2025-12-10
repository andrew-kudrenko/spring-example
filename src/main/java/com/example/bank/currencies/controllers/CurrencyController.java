package com.example.bank.currencies.controllers;

import com.example.bank.currencies.models.Currency;
import com.example.bank.currencies.models.CurrencyCourse;
import com.example.bank.currencies.services.CurrencyService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/currencies")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public List<Currency> getAllCurrencies() {
          return currencyService.getAllCurrencies();
    }

    @GetMapping("/courses")
    public List<CurrencyCourse> getAllCurrencyCourses(@RequestParam int currencyId) throws Exception {
        if (currencyId == 0) {
            throw new BadRequestException("Некорректный ID валюты");
        }

        return currencyService.getCurrencyCourses(currencyId);
    }
}
