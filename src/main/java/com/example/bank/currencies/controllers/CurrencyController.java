package com.example.bank.currencies.controllers;

import com.example.bank.currencies.models.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/currencies")
public class CurrencyController {
    @GetMapping
    public List<Currency> getAllCurrencies() {
            return new ArrayList<Currency>();
    }
}
