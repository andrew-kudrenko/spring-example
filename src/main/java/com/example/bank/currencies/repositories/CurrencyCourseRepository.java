package com.example.bank.currencies.repositories;

import com.example.bank.currencies.models.CurrencyCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CurrencyCourseRepository extends JpaRepository<CurrencyCourse, Long> {
    List<CurrencyCourse> findByCurrencyId(int currencyId);

    List<CurrencyCourse> findByCurrencyIdAndCreatedAtBetween(int currencyId, Date dateFrom, Date dateTo);
}
