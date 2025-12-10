package com.example.bank.wallets.repositories;

import com.example.bank.wallets.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletsRepository extends JpaRepository<Wallet, Long> {
    List<Wallet> findAllByOwnerId(int userId);
    Wallet findOneByUuid(String uuid);
}
