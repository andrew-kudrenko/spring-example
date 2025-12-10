package com.example.bank.wallets.repositories;

import com.example.bank.wallets.models.WalletTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransfersRepository extends JpaRepository<WalletTransfer, Long> {
    List<WalletTransfer> findAllBySenderUuid(String senderUuid);
    List<WalletTransfer> findAllBySenderIdAndConsumerUuid(String senderUuid, int consumerUuid);
}
