package com.example.bank.currencies.services;

import com.example.bank.currencies.dto.CreateCurrencyDto;
import com.example.bank.currencies.models.Currency;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {
//    @Autowired
//    private CurrencyRepository currencyRepository;

    public List<Currency> getAllCurrencies() {
        var currencies = new ArrayList<Currency>();

        for (var i = 0; i < 9; i++) {
            var currency = new Currency();

            currency.setId(i + 1);
            currency.setTitle("Currency #" + i);
            currency.setNumericCode(i + 100);
            currency.setLetterCode("C" + currency.getNumericCode());

            currencies.add(currency);
        }

        return currencies;
    }

    public Currency create(CreateCurrencyDto source) {
        var currency = new Currency();

        currency.setTitle(source.title());
        currency.setNumericCode(source.numericCode());
        currency.setLetterCode(source.letterCode());

//        currencyRepository.save(currency);

        return currency;
    }
}
